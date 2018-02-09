package mybatis.ad.dao.model;

import java.io.Serializable;
import java.util.Date;

public class AdBusinessApplicationServer implements Serializable {
    /**
     * id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * business_id
     *
     * @mbg.generated
     */
    private Long businessId;

    /**
     * application_server_id
     *
     * @mbg.generated
     */
    private Long applicationServerId;

    /**
     * create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * date_time
     *
     * @mbg.generated
     */
    private Date dateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public Long getApplicationServerId() {
        return applicationServerId;
    }

    public void setApplicationServerId(Long applicationServerId) {
        this.applicationServerId = applicationServerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", businessId=").append(businessId);
        sb.append(", applicationServerId=").append(applicationServerId);
        sb.append(", createTime=").append(createTime);
        sb.append(", dateTime=").append(dateTime);
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
        AdBusinessApplicationServer other = (AdBusinessApplicationServer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBusinessId() == null ? other.getBusinessId() == null : this.getBusinessId().equals(other.getBusinessId()))
            && (this.getApplicationServerId() == null ? other.getApplicationServerId() == null : this.getApplicationServerId().equals(other.getApplicationServerId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getDateTime() == null ? other.getDateTime() == null : this.getDateTime().equals(other.getDateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBusinessId() == null) ? 0 : getBusinessId().hashCode());
        result = prime * result + ((getApplicationServerId() == null) ? 0 : getApplicationServerId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getDateTime() == null) ? 0 : getDateTime().hashCode());
        return result;
    }
}