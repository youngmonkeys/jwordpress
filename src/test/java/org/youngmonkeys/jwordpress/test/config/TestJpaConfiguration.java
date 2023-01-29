package org.youngmonkeys.jwordpress.test.config;

import com.tvd12.ezydata.database.EzyDatabaseContext;
import com.tvd12.ezydata.jpa.EzyJpaDatabaseContextBuilder;
import com.tvd12.ezydata.jpa.loader.EzyJpaDataSourceLoader;
import com.tvd12.ezydata.jpa.loader.EzyJpaEntityManagerFactoryLoader;
import com.tvd12.ezyfox.bean.EzyBeanAutoConfig;
import com.tvd12.ezyfox.bean.EzyPackagesToScanAware;
import com.tvd12.ezyfox.bean.EzySingletonFactory;
import com.tvd12.ezyfox.bean.EzySingletonFactoryAware;
import com.tvd12.ezyfox.bean.annotation.EzyAutoBind;
import com.tvd12.ezyfox.bean.annotation.EzyConfigurationBefore;
import com.tvd12.ezyfox.util.EzyPropertiesAware;
import lombok.Setter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;
import java.util.Set;

import static com.tvd12.ezyfox.bean.impl.EzyBeanNameParser.getBeanName;

@Setter
@EzyConfigurationBefore
public class TestJpaConfiguration implements
        EzyBeanAutoConfig,
        EzyPropertiesAware,
        EzySingletonFactoryAware,
        EzyPackagesToScanAware {

    private Properties properties;

    private Set<String> packagesToScan;

    @EzyAutoBind
    private EzySingletonFactory singletonFactory;

    @Override
    public void autoConfig() {
        addRepositoriesFromDatabaseContextToSingletonFactory(
                databaseContext(),
                singletonFactory
        );
    }

    private EzyDatabaseContext databaseContext() {
        return new EzyJpaDatabaseContextBuilder()
                .properties(properties)
                .entityManagerFactory(entityManagerFactory())
                .scan(packagesToScan)
                .build();
    }

    private EntityManagerFactory entityManagerFactory() {
        return new EzyJpaEntityManagerFactoryLoader()
                .entityPackages(packagesToScan)
                .dataSource(dataSource())
                .properties(properties)
                .load("Default");
    }

    private DataSource dataSource() {
        return new EzyJpaDataSourceLoader()
                .properties(properties, "datasource")
                .load();
    }

    public static void addRepositoriesFromDatabaseContextToSingletonFactory(
            EzyDatabaseContext databaseContext,
            EzySingletonFactory singletonFactory
    ) {
        databaseContext
                .getRepositories()
                .forEach((repoType, repo) ->
                        singletonFactory.addSingleton(getBeanName(repoType), repo)
                );
    }
}
