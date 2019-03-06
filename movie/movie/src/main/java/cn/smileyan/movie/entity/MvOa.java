package cn.smileyan.movie.entity;

/**
 * 权限表
 * @author Smileyan
 */
public class MvOa {
    /**
     * oaId：权限编号
     * oaName：权限名称
     */
    private String oaId;
    private String oaName;

    public String getOaId() {
        return oaId;
    }

    public void setOaId(String oaId) {
        this.oaId = oaId;
    }

    public String getOaName() {
        return oaName;
    }

    public void setOaName(String oaName) {
        this.oaName = oaName;
    }
}
