package org.youngmonkeys.jwordpress.entity;

import java.math.BigInteger;
import javax.persistence.*;
import javax.persistence.Column;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "wp_term_taxonomy")
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
