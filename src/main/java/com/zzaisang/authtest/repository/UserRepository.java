package com.zzaisang.authtest.repository;

import com.zzaisang.authtest.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 21. 5. 30.
 */
public interface UserRepository extends JpaRepository<User,Long> {


}
