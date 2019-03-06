package cn.smileyan.movie.controller.root;

import cn.smileyan.movie.entity.MvUser;
import cn.smileyan.movie.service.common.UserService;
import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static cn.smileyan.movie.util.ControllerResult.*;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/root/user")
public class UserManagementController {

    @Autowired
    private UserService userService;

    /**
     * 添加用户
     * @param username
     * @param password
     * @param oaId
     * @param nickname
     * @return 成功与否
     */
    @RequestMapping("/add")
    private Map<String,String> addUser(String username, String password,String oaId, String nickname) {
        Map<String,String> map = new HashMap<>(1);
        // 为空
        if(username == null || username == "" || username.length() == 0) {
            map.put(RESULT,USERNAME_NULL);
            return map;
        }else if(username.length() < 6) {
            map.put(RESULT,USERNAME_TOO_SHORT);
            return map;
        }

        if(password == null || password == "" || password.length() == 0) {
            map.put(RESULT,PASSWORD_NULL);
            return map;
        }
        if(nickname == null || nickname == "" || nickname.length() == 0) {
            map.put(RESULT,NICKNAME_NULL);
            return map;
        }

        // 1.查找username是否已经存在
        String str = userService.getUserIdByUsername(username);
        if(str == null || str == "" || str.length() == 0) {
            // 如果用户名不存在
        } else{
            map.put("result",EXISTED);
            return map;
        }

        // 2.生成id
        MvUser user = new MvUser();
        String uuid = UUID.randomUUID().toString().replace("-","");
        user.setUserId(uuid);
        user.setUsername(username);
        user.setOaId(oaId);
        user.setPassword(password);
        user.setNickname(nickname);

        // 3.获得创建时间
        Date date=new Date();
        user.setDateLastChange(date);
        user.setDateCreate(date);

        // 4.添加用户
        int result = userService.addUser(user);

        if(result>0) {
            map.put("result",SUCCESS);
            return map;
        }
        map.put("result",FAILURE);
        return map;
    }

    /**
     * 删除
     * @param userId
     * @return
     */
    @RequestMapping("/delete")
    private Map<String,String> deleteById(String userId) {
        Map<String,String> map = new HashMap<>(1);
        userService.deleteUserById(userId);
        map.put(RESULT,SUCCESS_DELETE);
        return map;
    }

    @RequestMapping("/info")
    private Map<String,Object> getUserInfo(String userId) {
        Map<String,Object> map = new HashMap<>(1);
        MvUser mvUser = userService.getUserInfoById(userId);
        map.put(SUCCESS,mvUser);
        return map;
    }

    @RequestMapping("/user")
    private String hello(){
        MvUser mvUser=new MvUser();
        mvUser.setUserId("123");
        mvUser.setUsername("dfsdfg");
        mvUser.setOaId("R1");
        mvUser.setDateCreate(new Date());
        mvUser.setUrlLastLogin("new Date()");
        mvUser.setPassword("new Date()");
        mvUser.setNickname("nickname");
        mvUser.setDateLastChange(new Date());
        userService.addUser(mvUser);
        return "HELLO";
    }
}
