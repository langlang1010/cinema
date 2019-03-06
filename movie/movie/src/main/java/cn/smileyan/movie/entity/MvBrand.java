package cn.smileyan.movie.entity;

/**
 * 品牌表（总商家）
 * @author Smileyan
 */
public class MvBrand {
    /**
     * brandId: 商家编号
     * brandName: 商家名称
     * brandLogo: 商家图标URL
     */
    private String brandId;
    private String brandName;
    private String brandLogo;

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }
}
