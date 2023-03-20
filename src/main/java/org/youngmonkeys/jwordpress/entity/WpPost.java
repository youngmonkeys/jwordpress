package org.youngmonkeys.jwordpress.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

import static org.youngmonkeys.jwordpress.constant.WpTableNames.WP_POSTS;

@Getter
@Setter
@ToString
@Entity
@Table(name = WP_POSTS)
@AllArgsConstructor
@NoArgsConstructor
public class WpPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(name = "post_author")
    private BigInteger postAuthor;

    @Column(name = "post_date")
    private LocalDateTime postDate;

    @Column(name = "post_date_gmt")
    private LocalDateTime postDateGmt;

    @Column(name = "post_content")
    private String postContent;

    @Column(name = "post_title")
    private String postTitle;

    @Column(name = "post_excerpt")
    private String postExcerpt;

    @Column(name = "post_status")
    private String postStatus;

    @Column(name = "comment_status")
    private String commentStatus;

    @Column(name = "ping_status")
    private String pingStatus;

    @Column(name = "post_password")
    private String postPassword;

    @Column(name = "post_name")
    private String postName;

    @Column(name = "to_ping")
    private String toPing;

    private String pinged;

    @Column(name = "post_modified")
    private LocalDateTime postModified;

    @Column(name = "post_modified_gmt")
    private LocalDateTime postModifiedGmt;

    @Column(name = "post_content_filtered")
    private String postContentFiltered;

    @Column(name = "post_parent")
    private BigInteger postParent;

    private String guid;

    @Column(name = "menu_order")
    private int menuOrder;

    @Column(name = "post_type")
    private String postType;

    @Column(name = "post_mime_type")
    private String postMimeType;

    @Column(name = "comment_count")
    private BigInteger commentCount;
}
