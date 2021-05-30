package com.zzaisang.authtest.controller.user;

import com.zzaisang.authtest.domain.user.UserResult;
import com.zzaisang.authtest.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 21. 5. 30.
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserResult> getUserList(
            @PathVariable Long userId){
        return ResponseEntity.ok(this.userService.getUserById(userId));
    }

}
