package org.youngmonkeys.jwordpress.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

import static org.youngmonkeys.jwordpress.constant.WpTableNames.WP_TERMS;

@Getter
@Setter
@ToString
@Entity
@Table(name = WP_TERMS)
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
