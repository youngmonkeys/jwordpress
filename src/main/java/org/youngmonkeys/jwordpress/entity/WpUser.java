package org.youngmonkeys.jwordpress.entity;

import java.time.LocalDateTime;
import javax.persistence.*;
import javax.persistence.Column;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "wp_users")
@AllArgsConstructor
@NoArgsConstructor
public class WpUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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
