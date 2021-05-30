package com.zzaisang.authtest.service.user;

import com.zzaisang.authtest.domain.user.UserResult;
import com.zzaisang.authtest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 21. 5. 30.
 */
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;

    public UserResult getUserById(Long userId){
        return this.userRepository.findById(userId).map(UserResult::new).orElse(null);
    }
}
