package org.youngmonkeys.jwordpress.entity;

import java.math.BigInteger;
import javax.persistence.*;
import javax.persistence.Column;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "wp_postmeta")
@AllArgsConstructor
@NoArgsConstructor
public class WpPostMeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meta_id")
    private BigInteger metaId;

    @Column(name = "post_id")
    private BigInteger postId;

    @Column(name = "meta_key")
    private String metaKey;

    @Column(name = "meta_value")
    private String metaValue;
}
