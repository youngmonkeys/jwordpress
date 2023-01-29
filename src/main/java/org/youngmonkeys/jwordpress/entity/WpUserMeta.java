package org.youngmonkeys.jwordpress.entity;

import java.math.BigInteger;
import javax.persistence.*;
import javax.persistence.Column;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "wp_usermeta")
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
