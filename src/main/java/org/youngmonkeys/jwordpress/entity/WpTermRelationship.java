package org.youngmonkeys.jwordpress.entity;

import java.math.BigInteger;
import javax.persistence.*;
import javax.persistence.Column;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "wp_term_relationships")
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
