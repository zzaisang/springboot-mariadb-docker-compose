package com.zzaisang.authtest.domain.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 21. 5. 29.
 */
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "`desc`",nullable = false)
    private String desc;

    @Column(columnDefinition = "timestamp")
    private LocalDateTime createdAt;
}
