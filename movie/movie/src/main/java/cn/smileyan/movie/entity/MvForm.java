package cn.smileyan.movie.entity;

import java.util.Date;

/**
 * 订单表
 * @author Smileyan
 */
public class MvForm {
    /**
     * formId：订单编号
     * userId：用户编号
     * formTime：订单生成时间
     * screenId：场次编号
     * formRow：座位行数
     * formColumn：座位列数
     * formCode：取票码
     */
    private String formId;
    private String userId;
    private String screenId;
    private Date formTime;
    private String formRow;
    private String formColumn;
    private String formCode;

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getScreenId() {
        return screenId;
    }

    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    public String getFormRow() {
        return formRow;
    }

    public void setFormRow(String formRow) {
        this.formRow = formRow;
    }

    public String getFormColumn() {
        return formColumn;
    }

    public void setFormColumn(String formColumn) {
        this.formColumn = formColumn;
    }

    public String getFormCode() {
        return formCode;
    }

    public void setFormCode(String formCode) {
        this.formCode = formCode;
    }
}
