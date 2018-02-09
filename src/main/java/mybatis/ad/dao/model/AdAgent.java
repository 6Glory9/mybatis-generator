package mybatis.ad.dao.model;

import java.io.Serializable;
import java.util.Date;

public class AdAgent implements Serializable {
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
     * 实例地址
     *
     * @mbg.generated
     */
    private String instanceHome;

    /**
     * ip
     *
     * @mbg.generated
     */
    private String ip;

    /**
     * adgent版本号
     *
     * @mbg.generated
     */
    private String version;

    /**
     * host_id
     *
     * @mbg.generated
     */
    private Long hostId;

    /**
     * 远程类型
     *
     * @mbg.generated
     */
    private Integer rpcType;

    /**
     * uri
     *
     * @mbg.generated
     */
    private String uri;

    /**
     * 相应远程调用port
     *
     * @mbg.generated
     */
    private String port;

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

    public String getInstanceHome() {
        return instanceHome;
    }

    public void setInstanceHome(String instanceHome) {
        this.instanceHome = instanceHome;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getHostId() {
        return hostId;
    }

    public void setHostId(Long hostId) {
        this.hostId = hostId;
    }

    public Integer getRpcType() {
        return rpcType;
    }

    public void setRpcType(Integer rpcType) {
        this.rpcType = rpcType;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
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
        sb.append(", instanceHome=").append(instanceHome);
        sb.append(", ip=").append(ip);
        sb.append(", version=").append(version);
        sb.append(", hostId=").append(hostId);
        sb.append(", rpcType=").append(rpcType);
        sb.append(", uri=").append(uri);
        sb.append(", port=").append(port);
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
        AdAgent other = (AdAgent) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getInstanceHome() == null ? other.getInstanceHome() == null : this.getInstanceHome().equals(other.getInstanceHome()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getHostId() == null ? other.getHostId() == null : this.getHostId().equals(other.getHostId()))
            && (this.getRpcType() == null ? other.getRpcType() == null : this.getRpcType().equals(other.getRpcType()))
            && (this.getUri() == null ? other.getUri() == null : this.getUri().equals(other.getUri()))
            && (this.getPort() == null ? other.getPort() == null : this.getPort().equals(other.getPort()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getInstanceHome() == null) ? 0 : getInstanceHome().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getHostId() == null) ? 0 : getHostId().hashCode());
        result = prime * result + ((getRpcType() == null) ? 0 : getRpcType().hashCode());
        result = prime * result + ((getUri() == null) ? 0 : getUri().hashCode());
        result = prime * result + ((getPort() == null) ? 0 : getPort().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}