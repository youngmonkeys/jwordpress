package org.youngmonkeys.jwordpress.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

import static org.youngmonkeys.jwordpress.constant.WpTableNames.WP_TERM_RELATIONSHIPS;

@Getter
@Setter
@ToString
@Entity
@Table(name = WP_TERM_RELATIONSHIPS)
@AllArgsConstructor
@NoArgsConstructor
public class WpTermRelationship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "object_id")
    private BigInteger objectId;

    @Column(name = "term_taxonomy_id")
    private BigInteger termTaxonomyId;

    @Column(name = "term_order")
    private int termOrder;
}
