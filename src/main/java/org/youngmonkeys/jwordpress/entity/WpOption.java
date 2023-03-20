package org.youngmonkeys.jwordpress.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

import static org.youngmonkeys.jwordpress.constant.WpTableNames.WP_OPTIONS;

@Getter
@Setter
@ToString
@Entity
@Table(name = WP_OPTIONS)
@AllArgsConstructor
@NoArgsConstructor
public class WpOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "option_id")
    private BigInteger optionId;

    @Column(name = "option_name")
    private String optionName;

    @Column(name = "option_value")
    private String optionValue;

    private String autoload;
}
