package mybatis.ad.dao.model;

import java.io.Serializable;
import java.util.Date;

public class AdBusiness implements Serializable {
    /**
     * id
     *
     * @mbg.generated
     */
    private Long id;

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
     * 业务显示名称
     *
     * @mbg.generated
     */
    private String displayName;

    /**
     * 业务名称
     *
     * @mbg.generated
     */
    private String businessName;

    /**
     * 描述
     *
     * @mbg.generated
     */
    private String description;

    /**
     * businessLineId
     *
     * @mbg.generated
     */
    private Long businessLineId;

    /**
     * business_group_id
     *
     * @mbg.generated
     */
    private Long businessGroupId;

    /**
     * svn,git地址
     *
     * @mbg.generated
     */
    private String sourcePath;

    /**
     * 当前申请版本号
     *
     * @mbg.generated
     */
    private String publishSvnVersion;

    /**
     * 打包时pom.xml的地址
     *
     * @mbg.generated
     */
    private String projectStructure;

    /**
     * MAVEN打包编译额外参数
     *
     * @mbg.generated
     */
    private String mvnArgs;

    /**
     * 启动jar地址
     *
     * @mbg.generated
     */
    private String packageRepository;

    /**
     * 关联nginx的配置名称
     *
     * @mbg.generated
     */
    private String nginxConfigName;

    /**
     * 负载ID
     *
     * @mbg.generated
     */
    private Long ngDeviceId;

    /**
     * 构建类型[1,ssh拉取 2.手动上传 3.jenkins]
     *
     * @mbg.generated
     */
    private Integer constructType;

    /**
     * 发布流程id
     *
     * @mbg.generated
     */
    private String publishProcessId;

    /**
     * 发布时间
     *
     * @mbg.generated
     */
    private Date publishStartTime;

    /**
     * 发布状态
     *
     * @mbg.generated
     */
    private Integer publishStatus;

    /**
     * 最近发布时间
     *
     * @mbg.generated
     */
    private Date lastPublish;

    /**
     * 发布上次次数
     *
     * @mbg.generated
     */
    private Integer publishCount;

    /**
     * 项目负责人ID
     *
     * @mbg.generated
     */
    private Long ownerId;

    /**
     * 业务设计
     *
     * @mbg.generated
     */
    private Long designerId;

    /**
     * 产品经理id
     *
     * @mbg.generated
     */
    private Long pmId;

    /**
     * 发布者
     *
     * @mbg.generated
     */
    private String publisher;

    /**
     * 技术总监审核
     *
     * @mbg.generated
     */
    private String chiefAudit;

    /**
     * 设计审核
     *
     * @mbg.generated
     */
    private String designAudit;

    /**
     * 开发审核
     *
     * @mbg.generated
     */
    private String devlopAudit;

    /**
     * 紧急上线审核人
     *
     * @mbg.generated
     */
    private String emergencyAudit;

    /**
     * 信息中心审核
     *
     * @mbg.generated
     */
    private String informationCenterAudit;

    /**
     * 运营审核
     *
     * @mbg.generated
     */
    private String operateAudit;

    /**
     * 测试审核
     *
     * @mbg.generated
     */
    private String testAudit;

    /**
     * 是否支持预发
     *
     * @mbg.generated
     */
    private Boolean prerunningSupport;

    /**
     * 预发布测试人员
     *
     * @mbg.generated
     */
    private String prepubTester;

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

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getBusinessLineId() {
        return businessLineId;
    }

    public void setBusinessLineId(Long businessLineId) {
        this.businessLineId = businessLineId;
    }

    public Long getBusinessGroupId() {
        return businessGroupId;
    }

    public void setBusinessGroupId(Long businessGroupId) {
        this.businessGroupId = businessGroupId;
    }

    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    public String getPublishSvnVersion() {
        return publishSvnVersion;
    }

    public void setPublishSvnVersion(String publishSvnVersion) {
        this.publishSvnVersion = publishSvnVersion;
    }

    public String getProjectStructure() {
        return projectStructure;
    }

    public void setProjectStructure(String projectStructure) {
        this.projectStructure = projectStructure;
    }

    public String getMvnArgs() {
        return mvnArgs;
    }

    public void setMvnArgs(String mvnArgs) {
        this.mvnArgs = mvnArgs;
    }

    public String getPackageRepository() {
        return packageRepository;
    }

    public void setPackageRepository(String packageRepository) {
        this.packageRepository = packageRepository;
    }

    public String getNginxConfigName() {
        return nginxConfigName;
    }

    public void setNginxConfigName(String nginxConfigName) {
        this.nginxConfigName = nginxConfigName;
    }

    public Long getNgDeviceId() {
        return ngDeviceId;
    }

    public void setNgDeviceId(Long ngDeviceId) {
        this.ngDeviceId = ngDeviceId;
    }

    public Integer getConstructType() {
        return constructType;
    }

    public void setConstructType(Integer constructType) {
        this.constructType = constructType;
    }

    public String getPublishProcessId() {
        return publishProcessId;
    }

    public void setPublishProcessId(String publishProcessId) {
        this.publishProcessId = publishProcessId;
    }

    public Date getPublishStartTime() {
        return publishStartTime;
    }

    public void setPublishStartTime(Date publishStartTime) {
        this.publishStartTime = publishStartTime;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Date getLastPublish() {
        return lastPublish;
    }

    public void setLastPublish(Date lastPublish) {
        this.lastPublish = lastPublish;
    }

    public Integer getPublishCount() {
        return publishCount;
    }

    public void setPublishCount(Integer publishCount) {
        this.publishCount = publishCount;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getDesignerId() {
        return designerId;
    }

    public void setDesignerId(Long designerId) {
        this.designerId = designerId;
    }

    public Long getPmId() {
        return pmId;
    }

    public void setPmId(Long pmId) {
        this.pmId = pmId;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getChiefAudit() {
        return chiefAudit;
    }

    public void setChiefAudit(String chiefAudit) {
        this.chiefAudit = chiefAudit;
    }

    public String getDesignAudit() {
        return designAudit;
    }

    public void setDesignAudit(String designAudit) {
        this.designAudit = designAudit;
    }

    public String getDevlopAudit() {
        return devlopAudit;
    }

    public void setDevlopAudit(String devlopAudit) {
        this.devlopAudit = devlopAudit;
    }

    public String getEmergencyAudit() {
        return emergencyAudit;
    }

    public void setEmergencyAudit(String emergencyAudit) {
        this.emergencyAudit = emergencyAudit;
    }

    public String getInformationCenterAudit() {
        return informationCenterAudit;
    }

    public void setInformationCenterAudit(String informationCenterAudit) {
        this.informationCenterAudit = informationCenterAudit;
    }

    public String getOperateAudit() {
        return operateAudit;
    }

    public void setOperateAudit(String operateAudit) {
        this.operateAudit = operateAudit;
    }

    public String getTestAudit() {
        return testAudit;
    }

    public void setTestAudit(String testAudit) {
        this.testAudit = testAudit;
    }

    public Boolean getPrerunningSupport() {
        return prerunningSupport;
    }

    public void setPrerunningSupport(Boolean prerunningSupport) {
        this.prerunningSupport = prerunningSupport;
    }

    public String getPrepubTester() {
        return prepubTester;
    }

    public void setPrepubTester(String prepubTester) {
        this.prepubTester = prepubTester;
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
        sb.append(", displayName=").append(displayName);
        sb.append(", businessName=").append(businessName);
        sb.append(", description=").append(description);
        sb.append(", businessLineId=").append(businessLineId);
        sb.append(", businessGroupId=").append(businessGroupId);
        sb.append(", sourcePath=").append(sourcePath);
        sb.append(", publishSvnVersion=").append(publishSvnVersion);
        sb.append(", projectStructure=").append(projectStructure);
        sb.append(", mvnArgs=").append(mvnArgs);
        sb.append(", packageRepository=").append(packageRepository);
        sb.append(", nginxConfigName=").append(nginxConfigName);
        sb.append(", ngDeviceId=").append(ngDeviceId);
        sb.append(", constructType=").append(constructType);
        sb.append(", publishProcessId=").append(publishProcessId);
        sb.append(", publishStartTime=").append(publishStartTime);
        sb.append(", publishStatus=").append(publishStatus);
        sb.append(", lastPublish=").append(lastPublish);
        sb.append(", publishCount=").append(publishCount);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", designerId=").append(designerId);
        sb.append(", pmId=").append(pmId);
        sb.append(", publisher=").append(publisher);
        sb.append(", chiefAudit=").append(chiefAudit);
        sb.append(", designAudit=").append(designAudit);
        sb.append(", devlopAudit=").append(devlopAudit);
        sb.append(", emergencyAudit=").append(emergencyAudit);
        sb.append(", informationCenterAudit=").append(informationCenterAudit);
        sb.append(", operateAudit=").append(operateAudit);
        sb.append(", testAudit=").append(testAudit);
        sb.append(", prerunningSupport=").append(prerunningSupport);
        sb.append(", prepubTester=").append(prepubTester);
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
        AdBusiness other = (AdBusiness) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDisplayName() == null ? other.getDisplayName() == null : this.getDisplayName().equals(other.getDisplayName()))
            && (this.getBusinessName() == null ? other.getBusinessName() == null : this.getBusinessName().equals(other.getBusinessName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getBusinessLineId() == null ? other.getBusinessLineId() == null : this.getBusinessLineId().equals(other.getBusinessLineId()))
            && (this.getBusinessGroupId() == null ? other.getBusinessGroupId() == null : this.getBusinessGroupId().equals(other.getBusinessGroupId()))
            && (this.getSourcePath() == null ? other.getSourcePath() == null : this.getSourcePath().equals(other.getSourcePath()))
            && (this.getPublishSvnVersion() == null ? other.getPublishSvnVersion() == null : this.getPublishSvnVersion().equals(other.getPublishSvnVersion()))
            && (this.getProjectStructure() == null ? other.getProjectStructure() == null : this.getProjectStructure().equals(other.getProjectStructure()))
            && (this.getMvnArgs() == null ? other.getMvnArgs() == null : this.getMvnArgs().equals(other.getMvnArgs()))
            && (this.getPackageRepository() == null ? other.getPackageRepository() == null : this.getPackageRepository().equals(other.getPackageRepository()))
            && (this.getNginxConfigName() == null ? other.getNginxConfigName() == null : this.getNginxConfigName().equals(other.getNginxConfigName()))
            && (this.getNgDeviceId() == null ? other.getNgDeviceId() == null : this.getNgDeviceId().equals(other.getNgDeviceId()))
            && (this.getConstructType() == null ? other.getConstructType() == null : this.getConstructType().equals(other.getConstructType()))
            && (this.getPublishProcessId() == null ? other.getPublishProcessId() == null : this.getPublishProcessId().equals(other.getPublishProcessId()))
            && (this.getPublishStartTime() == null ? other.getPublishStartTime() == null : this.getPublishStartTime().equals(other.getPublishStartTime()))
            && (this.getPublishStatus() == null ? other.getPublishStatus() == null : this.getPublishStatus().equals(other.getPublishStatus()))
            && (this.getLastPublish() == null ? other.getLastPublish() == null : this.getLastPublish().equals(other.getLastPublish()))
            && (this.getPublishCount() == null ? other.getPublishCount() == null : this.getPublishCount().equals(other.getPublishCount()))
            && (this.getOwnerId() == null ? other.getOwnerId() == null : this.getOwnerId().equals(other.getOwnerId()))
            && (this.getDesignerId() == null ? other.getDesignerId() == null : this.getDesignerId().equals(other.getDesignerId()))
            && (this.getPmId() == null ? other.getPmId() == null : this.getPmId().equals(other.getPmId()))
            && (this.getPublisher() == null ? other.getPublisher() == null : this.getPublisher().equals(other.getPublisher()))
            && (this.getChiefAudit() == null ? other.getChiefAudit() == null : this.getChiefAudit().equals(other.getChiefAudit()))
            && (this.getDesignAudit() == null ? other.getDesignAudit() == null : this.getDesignAudit().equals(other.getDesignAudit()))
            && (this.getDevlopAudit() == null ? other.getDevlopAudit() == null : this.getDevlopAudit().equals(other.getDevlopAudit()))
            && (this.getEmergencyAudit() == null ? other.getEmergencyAudit() == null : this.getEmergencyAudit().equals(other.getEmergencyAudit()))
            && (this.getInformationCenterAudit() == null ? other.getInformationCenterAudit() == null : this.getInformationCenterAudit().equals(other.getInformationCenterAudit()))
            && (this.getOperateAudit() == null ? other.getOperateAudit() == null : this.getOperateAudit().equals(other.getOperateAudit()))
            && (this.getTestAudit() == null ? other.getTestAudit() == null : this.getTestAudit().equals(other.getTestAudit()))
            && (this.getPrerunningSupport() == null ? other.getPrerunningSupport() == null : this.getPrerunningSupport().equals(other.getPrerunningSupport()))
            && (this.getPrepubTester() == null ? other.getPrepubTester() == null : this.getPrepubTester().equals(other.getPrepubTester()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        result = prime * result + ((getBusinessName() == null) ? 0 : getBusinessName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getBusinessLineId() == null) ? 0 : getBusinessLineId().hashCode());
        result = prime * result + ((getBusinessGroupId() == null) ? 0 : getBusinessGroupId().hashCode());
        result = prime * result + ((getSourcePath() == null) ? 0 : getSourcePath().hashCode());
        result = prime * result + ((getPublishSvnVersion() == null) ? 0 : getPublishSvnVersion().hashCode());
        result = prime * result + ((getProjectStructure() == null) ? 0 : getProjectStructure().hashCode());
        result = prime * result + ((getMvnArgs() == null) ? 0 : getMvnArgs().hashCode());
        result = prime * result + ((getPackageRepository() == null) ? 0 : getPackageRepository().hashCode());
        result = prime * result + ((getNginxConfigName() == null) ? 0 : getNginxConfigName().hashCode());
        result = prime * result + ((getNgDeviceId() == null) ? 0 : getNgDeviceId().hashCode());
        result = prime * result + ((getConstructType() == null) ? 0 : getConstructType().hashCode());
        result = prime * result + ((getPublishProcessId() == null) ? 0 : getPublishProcessId().hashCode());
        result = prime * result + ((getPublishStartTime() == null) ? 0 : getPublishStartTime().hashCode());
        result = prime * result + ((getPublishStatus() == null) ? 0 : getPublishStatus().hashCode());
        result = prime * result + ((getLastPublish() == null) ? 0 : getLastPublish().hashCode());
        result = prime * result + ((getPublishCount() == null) ? 0 : getPublishCount().hashCode());
        result = prime * result + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        result = prime * result + ((getDesignerId() == null) ? 0 : getDesignerId().hashCode());
        result = prime * result + ((getPmId() == null) ? 0 : getPmId().hashCode());
        result = prime * result + ((getPublisher() == null) ? 0 : getPublisher().hashCode());
        result = prime * result + ((getChiefAudit() == null) ? 0 : getChiefAudit().hashCode());
        result = prime * result + ((getDesignAudit() == null) ? 0 : getDesignAudit().hashCode());
        result = prime * result + ((getDevlopAudit() == null) ? 0 : getDevlopAudit().hashCode());
        result = prime * result + ((getEmergencyAudit() == null) ? 0 : getEmergencyAudit().hashCode());
        result = prime * result + ((getInformationCenterAudit() == null) ? 0 : getInformationCenterAudit().hashCode());
        result = prime * result + ((getOperateAudit() == null) ? 0 : getOperateAudit().hashCode());
        result = prime * result + ((getTestAudit() == null) ? 0 : getTestAudit().hashCode());
        result = prime * result + ((getPrerunningSupport() == null) ? 0 : getPrerunningSupport().hashCode());
        result = prime * result + ((getPrepubTester() == null) ? 0 : getPrepubTester().hashCode());
        return result;
    }
}