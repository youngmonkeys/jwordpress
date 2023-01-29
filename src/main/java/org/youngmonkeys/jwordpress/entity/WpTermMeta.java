package org.youngmonkeys.jwordpress.entity;

import java.math.BigInteger;
import javax.persistence.*;
import javax.persistence.Column;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "wp_termmeta")
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
