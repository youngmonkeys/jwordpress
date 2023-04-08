package org.youngmonkeys.jwordpress.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WpTermRelationshipId implements Serializable {
    private static final long serialVersionUID = 4946663731360969083L;

    @Column(name = "object_id")
    private BigInteger objectId;

    @Column(name = "term_taxonomy_id")
    private BigInteger termTaxonomyId;
}
