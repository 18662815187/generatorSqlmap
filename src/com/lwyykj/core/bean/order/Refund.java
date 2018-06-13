package com.lwyykj.core.bean.order;

import java.io.Serializable;

public class Refund implements Serializable {
    private Integer id;

    /**
     * 小单ID
     */
    private Integer opId;

    /**
     * 退换货快递单号
     */
    private String kdNum;

    /**
     * 0默认状态，1.申请退款 2.退款拒绝3.退款通过 4.退款完成，5申请换货6拒绝换货7允许换货8换货完成,9.取消售后
     */
    private Integer status;

    /**
     * 1.不想要了2.买错了3.实际产品和描述不符
     */
    private Integer style;

    /**
     * 售后图片
     */
    private String img;

    /**
     * 售后原因
     */
    private String note;

    /**
     * 1退款2换货
     */
    private Integer reStyle;

    /**
     * 商家审核备注
     */
    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOpId() {
        return opId;
    }

    public void setOpId(Integer opId) {
        this.opId = opId;
    }

    public String getKdNum() {
        return kdNum;
    }

    public void setKdNum(String kdNum) {
        this.kdNum = kdNum == null ? null : kdNum.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getReStyle() {
        return reStyle;
    }

    public void setReStyle(Integer reStyle) {
        this.reStyle = reStyle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", opId=").append(opId);
        sb.append(", kdNum=").append(kdNum);
        sb.append(", status=").append(status);
        sb.append(", style=").append(style);
        sb.append(", img=").append(img);
        sb.append(", note=").append(note);
        sb.append(", reStyle=").append(reStyle);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}