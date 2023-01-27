package org.youngmonkeys.jwordpress.entity;

import java.math.BigInteger;
import javax.persistence.*;
import javax.persistence.Column;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "wp_terms")
@AllArgsConstructor
@NoArgsConstructor
public class WpTerm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "term_id")
    private BigInteger termId;

    private String name;

    private String slug;

    @Column(name = "term_group")
    private BigInteger termGroup;
}
