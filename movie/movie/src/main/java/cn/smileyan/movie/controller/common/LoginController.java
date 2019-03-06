package cn.smileyan.movie.controller.common;

import cn.smileyan.movie.service.common.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static cn.smileyan.movie.util.ControllerResult.*;

@RestController
@RequestMapping("/common")
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    private Map<String,String> login(String username,String password) {
        Map<String, String> map = new HashMap<>(1);

        // 为空
        if (username == null || username == "" || username.length() == 0) {
            map.put(RESULT, USERNAME_NULL);
            return map;
        }
        if (password == null || password == "" || password.length() == 0) {
            map.put(RESULT, PASSWORD_NULL);
            return map;
        }
        String result = userService.getUserIdByUsernameAndPassword(username, password);
        if (password == null || password == "" || password.length() == 0) {
            map.put(RESULT, USERNAME_OR_PASSWORD_ERROR);
            return map;
        }
        map.put(RESULT, result);
        return map;
    }
}
