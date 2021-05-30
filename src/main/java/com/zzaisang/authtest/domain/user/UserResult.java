package com.zzaisang.authtest.domain.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 21. 5. 30.
 */
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserResult {

    private Long id;

    private String name;

    private String desc;

    public UserResult(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.desc = user.getDesc();
    }
}
