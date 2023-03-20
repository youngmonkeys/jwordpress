package org.youngmonkeys.jwordpress.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

import static org.youngmonkeys.jwordpress.constant.WpTableNames.WP_TERM_META;

@Getter
@Setter
@ToString
@Entity
@Table(name = WP_TERM_META)
@AllArgsConstructor
@NoArgsConstructor
public class WpTermMeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meta_id")
    private BigInteger metaId;

    @Column(name = "term_id")
    private BigInteger termId;

    @Column(name = "meta_key")
    private String metaKey;

    @Column(name = "meta_value")
    private String metaValue;
}
