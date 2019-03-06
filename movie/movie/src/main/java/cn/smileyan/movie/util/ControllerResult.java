package cn.smileyan.movie.util;

/**
 * @author Administrator
 */
public interface ControllerResult {
    String RESULT = "result";
    String SUCCESS = "SUCCESS";
    String FAILURE = "FAILURE";
    String EXISTED = "用户名已存在！";
    String USERNAME_NULL = "用户名不能为空";
    String PASSWORD_NULL = "密码不能为空";
    String NICKNAME_NULL = "昵称不能为空";
    String USERNAME_TOO_SHORT = "用户名长度太短，请至少输入6位字符";
    String USERNAME_OR_PASSWORD_ERROR = "用户名或密码错误！";
    String SUCCESS_DELETE ="删除成功！";
}
