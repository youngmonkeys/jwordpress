package org.youngmonkeys.jwordpress.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

import static org.youngmonkeys.jwordpress.constant.WpTableNames.WP_USERS;

@Getter
@Setter
@ToString
@Entity
@Table(name = WP_USERS)
@AllArgsConstructor
@NoArgsConstructor
public class WpUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(name = "user_login")
    private String userLogin;

    @Column(name = "user_pass")
    private String userPass;

    @Column(name = "user_nicename")
    private String userNicename;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_url")
    private String userUrl;

    @Column(name = "user_registered")
    private LocalDateTime userRegistered;

    @Column(name = "user_activation_key")
    private String userActivationKey;

    @Column(name = "user_status")
    private int userStatus;

    @Column(name = "display_name")
    private String displayName;
}
