package mybatis.ad.dao.model;

import java.io.Serializable;
import java.util.Date;

public class AdOperationLog implements Serializable {
    /**
     * id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 操作关键字
     *
     * @mbg.generated
     */
    private String operateKey;

    /**
     * 操作描述
     *
     * @mbg.generated
     */
    private String operateDesc;

    /**
     * 操作员名称
     *
     * @mbg.generated
     */
    private String operatorName;

    /**
     * 操作员IP
     *
     * @mbg.generated
     */
    private String operateIp;

    /**
     * 操作员sessionId
     *
     * @mbg.generated
     */
    private String operateSessionId;

    /**
     * 花费时间
     *
     * @mbg.generated
     */
    private Long operateCost;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * 请求参数
     *
     * @mbg.generated
     */
    private String operateParams;

    /**
     * 返回值
     *
     * @mbg.generated
     */
    private String operateResult;

    /**
     * ext
     *
     * @mbg.generated
     */
    private String ext;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperateKey() {
        return operateKey;
    }

    public void setOperateKey(String operateKey) {
        this.operateKey = operateKey;
    }

    public String getOperateDesc() {
        return operateDesc;
    }

    public void setOperateDesc(String operateDesc) {
        this.operateDesc = operateDesc;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperateIp() {
        return operateIp;
    }

    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp;
    }

    public String getOperateSessionId() {
        return operateSessionId;
    }

    public void setOperateSessionId(String operateSessionId) {
        this.operateSessionId = operateSessionId;
    }

    public Long getOperateCost() {
        return operateCost;
    }

    public void setOperateCost(Long operateCost) {
        this.operateCost = operateCost;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOperateParams() {
        return operateParams;
    }

    public void setOperateParams(String operateParams) {
        this.operateParams = operateParams;
    }

    public String getOperateResult() {
        return operateResult;
    }

    public void setOperateResult(String operateResult) {
        this.operateResult = operateResult;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", operateKey=").append(operateKey);
        sb.append(", operateDesc=").append(operateDesc);
        sb.append(", operatorName=").append(operatorName);
        sb.append(", operateIp=").append(operateIp);
        sb.append(", operateSessionId=").append(operateSessionId);
        sb.append(", operateCost=").append(operateCost);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", operateParams=").append(operateParams);
        sb.append(", operateResult=").append(operateResult);
        sb.append(", ext=").append(ext);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AdOperationLog other = (AdOperationLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOperateKey() == null ? other.getOperateKey() == null : this.getOperateKey().equals(other.getOperateKey()))
            && (this.getOperateDesc() == null ? other.getOperateDesc() == null : this.getOperateDesc().equals(other.getOperateDesc()))
            && (this.getOperatorName() == null ? other.getOperatorName() == null : this.getOperatorName().equals(other.getOperatorName()))
            && (this.getOperateIp() == null ? other.getOperateIp() == null : this.getOperateIp().equals(other.getOperateIp()))
            && (this.getOperateSessionId() == null ? other.getOperateSessionId() == null : this.getOperateSessionId().equals(other.getOperateSessionId()))
            && (this.getOperateCost() == null ? other.getOperateCost() == null : this.getOperateCost().equals(other.getOperateCost()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getOperateParams() == null ? other.getOperateParams() == null : this.getOperateParams().equals(other.getOperateParams()))
            && (this.getOperateResult() == null ? other.getOperateResult() == null : this.getOperateResult().equals(other.getOperateResult()))
            && (this.getExt() == null ? other.getExt() == null : this.getExt().equals(other.getExt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOperateKey() == null) ? 0 : getOperateKey().hashCode());
        result = prime * result + ((getOperateDesc() == null) ? 0 : getOperateDesc().hashCode());
        result = prime * result + ((getOperatorName() == null) ? 0 : getOperatorName().hashCode());
        result = prime * result + ((getOperateIp() == null) ? 0 : getOperateIp().hashCode());
        result = prime * result + ((getOperateSessionId() == null) ? 0 : getOperateSessionId().hashCode());
        result = prime * result + ((getOperateCost() == null) ? 0 : getOperateCost().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getOperateParams() == null) ? 0 : getOperateParams().hashCode());
        result = prime * result + ((getOperateResult() == null) ? 0 : getOperateResult().hashCode());
        result = prime * result + ((getExt() == null) ? 0 : getExt().hashCode());
        return result;
    }
}