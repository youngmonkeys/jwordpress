package org.youngmonkeys.jwordpress.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

import static org.youngmonkeys.jwordpress.constant.WpTableNames.WP_COMMENTS;

@Getter
@Setter
@ToString
@Entity
@Table(name = WP_COMMENTS)
@AllArgsConstructor
@NoArgsConstructor
public class WpComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private BigInteger commentId;

    @Column(name = "comment_post_id")
    private BigInteger commentPostId;

    @Column(name = "comment_author")
    private String commentAuthor;

    @Column(name = "comment_author_email")
    private String commentAuthorEmail;

    @Column(name = "comment_author_url")
    private String commentAuthorUrl;

    @Column(name = "comment_author_ip")
    private String commentAuthorIp;

    @Column(name = "comment_date")
    private LocalDateTime commentDate;

    @Column(name = "comment_date_gmt")
    private LocalDateTime commentDateGmt;

    @Column(name = "comment_content")
    private String commentContent;

    @Column(name = "comment_karma")
    private int commentKarma;

    @Column(name = "comment_approved")
    private String commentApproved;

    @Column(name = "comment_agent")
    private String commentAgent;

    @Column(name = "comment_type")
    private String commentType;

    @Column(name = "comment_parent")
    private BigInteger commentParent;

    @Column(name = "user_id")
    private BigInteger userId;
}
