package org.youngmonkeys.jwordpress.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

import static org.youngmonkeys.jwordpress.constant.WpTableNames.WP_USER_META;

@Getter
@Setter
@ToString
@Entity
@Table(name = WP_USER_META)
@AllArgsConstructor
@NoArgsConstructor
public class WpUserMeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "umeta_id")
    private BigInteger umetaId;

    @Column(name = "user_id")
    private BigInteger userId;

    @Column(name = "meta_key")
    private String metaKey;

    @Column(name = "meta_value")
    private String metaValue;
}
