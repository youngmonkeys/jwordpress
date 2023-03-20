package org.youngmonkeys.jwordpress.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

import static org.youngmonkeys.jwordpress.constant.WpTableNames.WP_LINKS;

@Getter
@Setter
@ToString
@Entity
@Table(name = WP_LINKS)
@AllArgsConstructor
@NoArgsConstructor
public class WpLink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "link_id")
    private BigInteger linkId;

    @Column(name = "link_url")
    private String linkUrl;

    @Column(name = "link_name")
    private String linkName;

    @Column(name = "link_image")
    private String linkImage;

    @Column(name = "link_target")
    private String linkTarget;

    @Column(name = "link_description")
    private String linkDescription;

    @Column(name = "link_visible")
    private String linkVisible;

    @Column(name = "link_owner")
    private BigInteger linkOwner;

    @Column(name = "link_rating")
    private int linkRating;

    @Column(name = "link_updated")
    private LocalDateTime linkUpdated;

    @Column(name = "link_rel")
    private String linkRel;

    @Column(name = "link_notes")
    private String linkNotes;

    @Column(name = "link_rss")
    private String linkRss;
}
