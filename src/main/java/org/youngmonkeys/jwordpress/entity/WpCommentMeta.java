package org.youngmonkeys.jwordpress.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

import static org.youngmonkeys.jwordpress.constant.WpTableNames.WP_COMMENT_META;

@Getter
@Setter
@ToString
@Entity
@Table(name = WP_COMMENT_META)
@AllArgsConstructor
@NoArgsConstructor
public class WpCommentMeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meta_id")
    private BigInteger metaId;

    @Column(name = "comment_id")
    private BigInteger commentId;

    @Column(name = "meta_key")
    private String metaKey;

    @Column(name = "meta_value")
    private String metaValue;
}
