package org.youngmonkeys.jwordpress.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

import static org.youngmonkeys.jwordpress.constant.WpTableNames.WP_TERM_TAXONOMY;

@Getter
@Setter
@ToString
@Entity
@Table(name = WP_TERM_TAXONOMY)
@AllArgsConstructor
@NoArgsConstructor
public class WpTermTaxonomy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "term_taxonomy_id")
    private BigInteger termTaxonomyId;

    @Column(name = "term_id")
    private BigInteger termId;

    private String taxonomy;

    private String description;

    private BigInteger parent;

    private BigInteger count;
}
