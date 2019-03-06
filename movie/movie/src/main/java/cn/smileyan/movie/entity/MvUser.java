package cn.smileyan.movie.entity;

import java.util.Date;

/**
 * @author Smileyan
 */
public class MvUser {
    /**
     * userId：用户编号
     * oaId：权限编号
     * userName：用户登录账户
     * password：用户密码
     * nickname：用户昵称
     * money：用户余额
     * portraitUrl：用户头像
     * openId：用户微信编号
     * dateCreate：创建日期
     * dateLastChange：最后修改日期
     * urlLastLogin：最近登录URL
     * sex：性别
     * city：城市
     */
    private String userId;
    private String oaId;
    private String username;
    private String password;
    private String nickname;
    private double  money;
    private  String portraitUrl;
    private  String openid;
    private Date dateCreate;
    private Date dateLastChange;
    private String urlLastLogin;
    private  String sex;
    private String city;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOaId() {
        return oaId;
    }

    public void setOaId(String oaId) {
        this.oaId = oaId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateLastChange() {
        return dateLastChange;
    }

    public void setDateLastChange(Date dateLastChange) {
        this.dateLastChange = dateLastChange;
    }

    public String getUrlLastLogin() {
        return urlLastLogin;
    }

    public void setUrlLastLogin(String urlLastLogin) {
        this.urlLastLogin = urlLastLogin;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
