package mybatis.ad.dao.model;

import java.io.Serializable;
import java.util.Date;

public class AdHost implements Serializable {
    /**
     * id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * 备份地址
     *
     * @mbg.generated
     */
    private String backupDir;

    /**
     * host_ip
     *
     * @mbg.generated
     */
    private String hostIp;

    /**
     * host_name
     *
     * @mbg.generated
     */
    private String hostName;

    /**
     * os_type
     *
     * @mbg.generated
     */
    private Integer osType;

    /**
     * 受保护地址
     *
     * @mbg.generated
     */
    private String protectedDir;

    /**
     * ssh_username
     *
     * @mbg.generated
     */
    private String sshUsername;

    /**
     * ssh_password
     *
     * @mbg.generated
     */
    private String sshPassword;

    /**
     * ssh_port
     *
     * @mbg.generated
     */
    private String sshPort;

    /**
     * idc_id
     *
     * @mbg.generated
     */
    private Long idcId;

    /**
     * host_tag
     *
     * @mbg.generated
     */
    private Long hostTag;

    /**
     * 状态
     *
     * @mbg.generated
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getBackupDir() {
        return backupDir;
    }

    public void setBackupDir(String backupDir) {
        this.backupDir = backupDir;
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public Integer getOsType() {
        return osType;
    }

    public void setOsType(Integer osType) {
        this.osType = osType;
    }

    public String getProtectedDir() {
        return protectedDir;
    }

    public void setProtectedDir(String protectedDir) {
        this.protectedDir = protectedDir;
    }

    public String getSshUsername() {
        return sshUsername;
    }

    public void setSshUsername(String sshUsername) {
        this.sshUsername = sshUsername;
    }

    public String getSshPassword() {
        return sshPassword;
    }

    public void setSshPassword(String sshPassword) {
        this.sshPassword = sshPassword;
    }

    public String getSshPort() {
        return sshPort;
    }

    public void setSshPort(String sshPort) {
        this.sshPort = sshPort;
    }

    public Long getIdcId() {
        return idcId;
    }

    public void setIdcId(Long idcId) {
        this.idcId = idcId;
    }

    public Long getHostTag() {
        return hostTag;
    }

    public void setHostTag(Long hostTag) {
        this.hostTag = hostTag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", backupDir=").append(backupDir);
        sb.append(", hostIp=").append(hostIp);
        sb.append(", hostName=").append(hostName);
        sb.append(", osType=").append(osType);
        sb.append(", protectedDir=").append(protectedDir);
        sb.append(", sshUsername=").append(sshUsername);
        sb.append(", sshPassword=").append(sshPassword);
        sb.append(", sshPort=").append(sshPort);
        sb.append(", idcId=").append(idcId);
        sb.append(", hostTag=").append(hostTag);
        sb.append(", status=").append(status);
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
        AdHost other = (AdHost) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getBackupDir() == null ? other.getBackupDir() == null : this.getBackupDir().equals(other.getBackupDir()))
            && (this.getHostIp() == null ? other.getHostIp() == null : this.getHostIp().equals(other.getHostIp()))
            && (this.getHostName() == null ? other.getHostName() == null : this.getHostName().equals(other.getHostName()))
            && (this.getOsType() == null ? other.getOsType() == null : this.getOsType().equals(other.getOsType()))
            && (this.getProtectedDir() == null ? other.getProtectedDir() == null : this.getProtectedDir().equals(other.getProtectedDir()))
            && (this.getSshUsername() == null ? other.getSshUsername() == null : this.getSshUsername().equals(other.getSshUsername()))
            && (this.getSshPassword() == null ? other.getSshPassword() == null : this.getSshPassword().equals(other.getSshPassword()))
            && (this.getSshPort() == null ? other.getSshPort() == null : this.getSshPort().equals(other.getSshPort()))
            && (this.getIdcId() == null ? other.getIdcId() == null : this.getIdcId().equals(other.getIdcId()))
            && (this.getHostTag() == null ? other.getHostTag() == null : this.getHostTag().equals(other.getHostTag()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getBackupDir() == null) ? 0 : getBackupDir().hashCode());
        result = prime * result + ((getHostIp() == null) ? 0 : getHostIp().hashCode());
        result = prime * result + ((getHostName() == null) ? 0 : getHostName().hashCode());
        result = prime * result + ((getOsType() == null) ? 0 : getOsType().hashCode());
        result = prime * result + ((getProtectedDir() == null) ? 0 : getProtectedDir().hashCode());
        result = prime * result + ((getSshUsername() == null) ? 0 : getSshUsername().hashCode());
        result = prime * result + ((getSshPassword() == null) ? 0 : getSshPassword().hashCode());
        result = prime * result + ((getSshPort() == null) ? 0 : getSshPort().hashCode());
        result = prime * result + ((getIdcId() == null) ? 0 : getIdcId().hashCode());
        result = prime * result + ((getHostTag() == null) ? 0 : getHostTag().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}