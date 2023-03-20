package org.youngmonkeys.jwordpress.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

import static org.youngmonkeys.jwordpress.constant.WpTableNames.WP_POST_META;

@Getter
@Setter
@ToString
@Entity
@Table(name = WP_POST_META)
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
