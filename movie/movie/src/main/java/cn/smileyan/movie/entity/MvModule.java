package cn.smileyan.movie.entity;

/**
 * @author Smileyan
 */
public class MvModule {
    /**
     * moduleId：模块编号
     * moduleName：模块名称
     * faModuleId：父级模块编号
     * moduleUrl：模块URL
     */
    private String moduleId;
    private String moduleName;
    private String faModuleId;
    private String moduleUrl;

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getFaModuleId() {
        return faModuleId;
    }

    public void setFaModuleId(String faModuleId) {
        this.faModuleId = faModuleId;
    }

    public String getModuleUrl() {
        return moduleUrl;
    }

    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl;
    }
}
