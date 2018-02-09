package mybatis.ad.dao.model;

import java.io.Serializable;
import java.util.Date;

public class AdApplicationServer implements Serializable {
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
     * 服务名称
     *
     * @mbg.generated
     */
    private String serverName;

    /**
     * 环境类型(正式环境,测试环境)
     *
     * @mbg.generated
     */
    private Integer environmentType;

    /**
     * 灾备标示
     *
     * @mbg.generated
     */
    private Boolean isStandby;

    /**
     * 描述
     *
     * @mbg.generated
     */
    private String description;

    /**
     * 主目录
     *
     * @mbg.generated
     */
    private String homeDir;

    /**
     * 日志访问地址
     *
     * @mbg.generated
     */
    private String accessLog;

    /**
     * 日志地址
     *
     * @mbg.generated
     */
    private String logDirPath;

    /**
     * 应用部署地址
     *
     * @mbg.generated
     */
    private String appsDirPath;

    /**
     * 配置目录
     *
     * @mbg.generated
     */
    private String configDirPath;

    /**
     * 自定义启动脚本
     *
     * @mbg.generated
     */
    private String customerStartScript;

    /**
     * 自定义停止脚本
     *
     * @mbg.generated
     */
    private String customerStopScript;

    /**
     * 自定义dump脚本
     *
     * @mbg.generated
     */
    private String customerDumpScript;

    /**
     * 脚本执行组名
     *
     * @mbg.generated
     */
    private String groupName;

    /**
     * 脚本执行用户名
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * 服务器类型(Tomcat,yijiboot)
     *
     * @mbg.generated
     */
    private Integer serverType;

    /**
     * 服务器版本号
     *
     * @mbg.generated
     */
    private String serverVersion;

    /**
     * http_port
     *
     * @mbg.generated
     */
    private Integer httpPort;

    /**
     * httpsPort
     *
     * @mbg.generated
     */
    private Integer httpsport;

    /**
     * ajp_port
     *
     * @mbg.generated
     */
    private Integer ajpPort;

    /**
     * jmx_port
     *
     * @mbg.generated
     */
    private Integer jmxPort;

    /**
     * shutdown_port
     *
     * @mbg.generated
     */
    private Integer shutdownPort;

    /**
     * dubbo_port
     *
     * @mbg.generated
     */
    private Integer dubboPort;

    /**
     * java_heap_size
     *
     * @mbg.generated
     */
    private Integer javaHeapSize;

    /**
     * env
     *
     * @mbg.generated
     */
    private String env;

    /**
     * host_id
     *
     * @mbg.generated
     */
    private Long hostId;

    /**
     * host_ip
     *
     * @mbg.generated
     */
    private String hostIp;

    /**
     * 当前运行代码版本
     *
     * @mbg.generated
     */
    private String runningVersion;

    /**
     * 应用文件更新时间
     *
     * @mbg.generated
     */
    private Date appFileUpdateTime;

    /**
     * 同步状态
     *
     * @mbg.generated
     */
    private Integer synchronizeStatus;

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

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public Integer getEnvironmentType() {
        return environmentType;
    }

    public void setEnvironmentType(Integer environmentType) {
        this.environmentType = environmentType;
    }

    public Boolean getIsStandby() {
        return isStandby;
    }

    public void setIsStandby(Boolean isStandby) {
        this.isStandby = isStandby;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHomeDir() {
        return homeDir;
    }

    public void setHomeDir(String homeDir) {
        this.homeDir = homeDir;
    }

    public String getAccessLog() {
        return accessLog;
    }

    public void setAccessLog(String accessLog) {
        this.accessLog = accessLog;
    }

    public String getLogDirPath() {
        return logDirPath;
    }

    public void setLogDirPath(String logDirPath) {
        this.logDirPath = logDirPath;
    }

    public String getAppsDirPath() {
        return appsDirPath;
    }

    public void setAppsDirPath(String appsDirPath) {
        this.appsDirPath = appsDirPath;
    }

    public String getConfigDirPath() {
        return configDirPath;
    }

    public void setConfigDirPath(String configDirPath) {
        this.configDirPath = configDirPath;
    }

    public String getCustomerStartScript() {
        return customerStartScript;
    }

    public void setCustomerStartScript(String customerStartScript) {
        this.customerStartScript = customerStartScript;
    }

    public String getCustomerStopScript() {
        return customerStopScript;
    }

    public void setCustomerStopScript(String customerStopScript) {
        this.customerStopScript = customerStopScript;
    }

    public String getCustomerDumpScript() {
        return customerDumpScript;
    }

    public void setCustomerDumpScript(String customerDumpScript) {
        this.customerDumpScript = customerDumpScript;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getServerType() {
        return serverType;
    }

    public void setServerType(Integer serverType) {
        this.serverType = serverType;
    }

    public String getServerVersion() {
        return serverVersion;
    }

    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    public Integer getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
    }

    public Integer getHttpsport() {
        return httpsport;
    }

    public void setHttpsport(Integer httpsport) {
        this.httpsport = httpsport;
    }

    public Integer getAjpPort() {
        return ajpPort;
    }

    public void setAjpPort(Integer ajpPort) {
        this.ajpPort = ajpPort;
    }

    public Integer getJmxPort() {
        return jmxPort;
    }

    public void setJmxPort(Integer jmxPort) {
        this.jmxPort = jmxPort;
    }

    public Integer getShutdownPort() {
        return shutdownPort;
    }

    public void setShutdownPort(Integer shutdownPort) {
        this.shutdownPort = shutdownPort;
    }

    public Integer getDubboPort() {
        return dubboPort;
    }

    public void setDubboPort(Integer dubboPort) {
        this.dubboPort = dubboPort;
    }

    public Integer getJavaHeapSize() {
        return javaHeapSize;
    }

    public void setJavaHeapSize(Integer javaHeapSize) {
        this.javaHeapSize = javaHeapSize;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public Long getHostId() {
        return hostId;
    }

    public void setHostId(Long hostId) {
        this.hostId = hostId;
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public String getRunningVersion() {
        return runningVersion;
    }

    public void setRunningVersion(String runningVersion) {
        this.runningVersion = runningVersion;
    }

    public Date getAppFileUpdateTime() {
        return appFileUpdateTime;
    }

    public void setAppFileUpdateTime(Date appFileUpdateTime) {
        this.appFileUpdateTime = appFileUpdateTime;
    }

    public Integer getSynchronizeStatus() {
        return synchronizeStatus;
    }

    public void setSynchronizeStatus(Integer synchronizeStatus) {
        this.synchronizeStatus = synchronizeStatus;
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
        sb.append(", serverName=").append(serverName);
        sb.append(", environmentType=").append(environmentType);
        sb.append(", isStandby=").append(isStandby);
        sb.append(", description=").append(description);
        sb.append(", homeDir=").append(homeDir);
        sb.append(", accessLog=").append(accessLog);
        sb.append(", logDirPath=").append(logDirPath);
        sb.append(", appsDirPath=").append(appsDirPath);
        sb.append(", configDirPath=").append(configDirPath);
        sb.append(", customerStartScript=").append(customerStartScript);
        sb.append(", customerStopScript=").append(customerStopScript);
        sb.append(", customerDumpScript=").append(customerDumpScript);
        sb.append(", groupName=").append(groupName);
        sb.append(", userName=").append(userName);
        sb.append(", serverType=").append(serverType);
        sb.append(", serverVersion=").append(serverVersion);
        sb.append(", httpPort=").append(httpPort);
        sb.append(", httpsport=").append(httpsport);
        sb.append(", ajpPort=").append(ajpPort);
        sb.append(", jmxPort=").append(jmxPort);
        sb.append(", shutdownPort=").append(shutdownPort);
        sb.append(", dubboPort=").append(dubboPort);
        sb.append(", javaHeapSize=").append(javaHeapSize);
        sb.append(", env=").append(env);
        sb.append(", hostId=").append(hostId);
        sb.append(", hostIp=").append(hostIp);
        sb.append(", runningVersion=").append(runningVersion);
        sb.append(", appFileUpdateTime=").append(appFileUpdateTime);
        sb.append(", synchronizeStatus=").append(synchronizeStatus);
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
        AdApplicationServer other = (AdApplicationServer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getServerName() == null ? other.getServerName() == null : this.getServerName().equals(other.getServerName()))
            && (this.getEnvironmentType() == null ? other.getEnvironmentType() == null : this.getEnvironmentType().equals(other.getEnvironmentType()))
            && (this.getIsStandby() == null ? other.getIsStandby() == null : this.getIsStandby().equals(other.getIsStandby()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getHomeDir() == null ? other.getHomeDir() == null : this.getHomeDir().equals(other.getHomeDir()))
            && (this.getAccessLog() == null ? other.getAccessLog() == null : this.getAccessLog().equals(other.getAccessLog()))
            && (this.getLogDirPath() == null ? other.getLogDirPath() == null : this.getLogDirPath().equals(other.getLogDirPath()))
            && (this.getAppsDirPath() == null ? other.getAppsDirPath() == null : this.getAppsDirPath().equals(other.getAppsDirPath()))
            && (this.getConfigDirPath() == null ? other.getConfigDirPath() == null : this.getConfigDirPath().equals(other.getConfigDirPath()))
            && (this.getCustomerStartScript() == null ? other.getCustomerStartScript() == null : this.getCustomerStartScript().equals(other.getCustomerStartScript()))
            && (this.getCustomerStopScript() == null ? other.getCustomerStopScript() == null : this.getCustomerStopScript().equals(other.getCustomerStopScript()))
            && (this.getCustomerDumpScript() == null ? other.getCustomerDumpScript() == null : this.getCustomerDumpScript().equals(other.getCustomerDumpScript()))
            && (this.getGroupName() == null ? other.getGroupName() == null : this.getGroupName().equals(other.getGroupName()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getServerType() == null ? other.getServerType() == null : this.getServerType().equals(other.getServerType()))
            && (this.getServerVersion() == null ? other.getServerVersion() == null : this.getServerVersion().equals(other.getServerVersion()))
            && (this.getHttpPort() == null ? other.getHttpPort() == null : this.getHttpPort().equals(other.getHttpPort()))
            && (this.getHttpsport() == null ? other.getHttpsport() == null : this.getHttpsport().equals(other.getHttpsport()))
            && (this.getAjpPort() == null ? other.getAjpPort() == null : this.getAjpPort().equals(other.getAjpPort()))
            && (this.getJmxPort() == null ? other.getJmxPort() == null : this.getJmxPort().equals(other.getJmxPort()))
            && (this.getShutdownPort() == null ? other.getShutdownPort() == null : this.getShutdownPort().equals(other.getShutdownPort()))
            && (this.getDubboPort() == null ? other.getDubboPort() == null : this.getDubboPort().equals(other.getDubboPort()))
            && (this.getJavaHeapSize() == null ? other.getJavaHeapSize() == null : this.getJavaHeapSize().equals(other.getJavaHeapSize()))
            && (this.getEnv() == null ? other.getEnv() == null : this.getEnv().equals(other.getEnv()))
            && (this.getHostId() == null ? other.getHostId() == null : this.getHostId().equals(other.getHostId()))
            && (this.getHostIp() == null ? other.getHostIp() == null : this.getHostIp().equals(other.getHostIp()))
            && (this.getRunningVersion() == null ? other.getRunningVersion() == null : this.getRunningVersion().equals(other.getRunningVersion()))
            && (this.getAppFileUpdateTime() == null ? other.getAppFileUpdateTime() == null : this.getAppFileUpdateTime().equals(other.getAppFileUpdateTime()))
            && (this.getSynchronizeStatus() == null ? other.getSynchronizeStatus() == null : this.getSynchronizeStatus().equals(other.getSynchronizeStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getServerName() == null) ? 0 : getServerName().hashCode());
        result = prime * result + ((getEnvironmentType() == null) ? 0 : getEnvironmentType().hashCode());
        result = prime * result + ((getIsStandby() == null) ? 0 : getIsStandby().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getHomeDir() == null) ? 0 : getHomeDir().hashCode());
        result = prime * result + ((getAccessLog() == null) ? 0 : getAccessLog().hashCode());
        result = prime * result + ((getLogDirPath() == null) ? 0 : getLogDirPath().hashCode());
        result = prime * result + ((getAppsDirPath() == null) ? 0 : getAppsDirPath().hashCode());
        result = prime * result + ((getConfigDirPath() == null) ? 0 : getConfigDirPath().hashCode());
        result = prime * result + ((getCustomerStartScript() == null) ? 0 : getCustomerStartScript().hashCode());
        result = prime * result + ((getCustomerStopScript() == null) ? 0 : getCustomerStopScript().hashCode());
        result = prime * result + ((getCustomerDumpScript() == null) ? 0 : getCustomerDumpScript().hashCode());
        result = prime * result + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getServerType() == null) ? 0 : getServerType().hashCode());
        result = prime * result + ((getServerVersion() == null) ? 0 : getServerVersion().hashCode());
        result = prime * result + ((getHttpPort() == null) ? 0 : getHttpPort().hashCode());
        result = prime * result + ((getHttpsport() == null) ? 0 : getHttpsport().hashCode());
        result = prime * result + ((getAjpPort() == null) ? 0 : getAjpPort().hashCode());
        result = prime * result + ((getJmxPort() == null) ? 0 : getJmxPort().hashCode());
        result = prime * result + ((getShutdownPort() == null) ? 0 : getShutdownPort().hashCode());
        result = prime * result + ((getDubboPort() == null) ? 0 : getDubboPort().hashCode());
        result = prime * result + ((getJavaHeapSize() == null) ? 0 : getJavaHeapSize().hashCode());
        result = prime * result + ((getEnv() == null) ? 0 : getEnv().hashCode());
        result = prime * result + ((getHostId() == null) ? 0 : getHostId().hashCode());
        result = prime * result + ((getHostIp() == null) ? 0 : getHostIp().hashCode());
        result = prime * result + ((getRunningVersion() == null) ? 0 : getRunningVersion().hashCode());
        result = prime * result + ((getAppFileUpdateTime() == null) ? 0 : getAppFileUpdateTime().hashCode());
        result = prime * result + ((getSynchronizeStatus() == null) ? 0 : getSynchronizeStatus().hashCode());
        return result;
    }
}