package mybatis.ad.dao.model;

import java.io.Serializable;
import java.util.Date;

public class AdSubject implements Serializable {
    /**
     * id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 登陆名
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * 显示的名称
     *
     * @mbg.generated
     */
    private String displayName;

    /**
     * 密码
     *
     * @mbg.generated
     */
    private String passwd;

    /**
     * 用户锁的标示
     *
     * @mbg.generated
     */
    private Boolean locked;

    /**
     * 登陆错误次数
     *
     * @mbg.generated
     */
    private Integer loginFailedTime;

    /**
     * email
     *
     * @mbg.generated
     */
    private String email;

    /**
     * 部门
     *
     * @mbg.generated
     */
    private String department;

    /**
     * 职位
     *
     * @mbg.generated
     */
    private String position;

    /**
     * 手机号
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * 最后登陆时间
     *
     * @mbg.generated
     */
    private Date lastLoginDate;

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
     * 二次验证标示
     *
     * @mbg.generated
     */
    private Boolean twiceCheckEnabled;

    /**
     * 二次验证类型
     *
     * @mbg.generated
     */
    private Integer twiceCheckType;

    /**
     * 二次验证码
     *
     * @mbg.generated
     */
    private String twiceCheckCode;

    /**
     * 二次验证标签
     *
     * @mbg.generated
     */
    private String twiceCheckLabel;

    /**
     * 二次验证有效期
     *
     * @mbg.generated
     */
    private Date twiceCheckExpireTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Integer getLoginFailedTime() {
        return loginFailedTime;
    }

    public void setLoginFailedTime(Integer loginFailedTime) {
        this.loginFailedTime = loginFailedTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
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

    public Boolean getTwiceCheckEnabled() {
        return twiceCheckEnabled;
    }

    public void setTwiceCheckEnabled(Boolean twiceCheckEnabled) {
        this.twiceCheckEnabled = twiceCheckEnabled;
    }

    public Integer getTwiceCheckType() {
        return twiceCheckType;
    }

    public void setTwiceCheckType(Integer twiceCheckType) {
        this.twiceCheckType = twiceCheckType;
    }

    public String getTwiceCheckCode() {
        return twiceCheckCode;
    }

    public void setTwiceCheckCode(String twiceCheckCode) {
        this.twiceCheckCode = twiceCheckCode;
    }

    public String getTwiceCheckLabel() {
        return twiceCheckLabel;
    }

    public void setTwiceCheckLabel(String twiceCheckLabel) {
        this.twiceCheckLabel = twiceCheckLabel;
    }

    public Date getTwiceCheckExpireTime() {
        return twiceCheckExpireTime;
    }

    public void setTwiceCheckExpireTime(Date twiceCheckExpireTime) {
        this.twiceCheckExpireTime = twiceCheckExpireTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", displayName=").append(displayName);
        sb.append(", passwd=").append(passwd);
        sb.append(", locked=").append(locked);
        sb.append(", loginFailedTime=").append(loginFailedTime);
        sb.append(", email=").append(email);
        sb.append(", department=").append(department);
        sb.append(", position=").append(position);
        sb.append(", mobile=").append(mobile);
        sb.append(", lastLoginDate=").append(lastLoginDate);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", twiceCheckEnabled=").append(twiceCheckEnabled);
        sb.append(", twiceCheckType=").append(twiceCheckType);
        sb.append(", twiceCheckCode=").append(twiceCheckCode);
        sb.append(", twiceCheckLabel=").append(twiceCheckLabel);
        sb.append(", twiceCheckExpireTime=").append(twiceCheckExpireTime);
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
        AdSubject other = (AdSubject) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getDisplayName() == null ? other.getDisplayName() == null : this.getDisplayName().equals(other.getDisplayName()))
            && (this.getPasswd() == null ? other.getPasswd() == null : this.getPasswd().equals(other.getPasswd()))
            && (this.getLocked() == null ? other.getLocked() == null : this.getLocked().equals(other.getLocked()))
            && (this.getLoginFailedTime() == null ? other.getLoginFailedTime() == null : this.getLoginFailedTime().equals(other.getLoginFailedTime()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getLastLoginDate() == null ? other.getLastLoginDate() == null : this.getLastLoginDate().equals(other.getLastLoginDate()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getTwiceCheckEnabled() == null ? other.getTwiceCheckEnabled() == null : this.getTwiceCheckEnabled().equals(other.getTwiceCheckEnabled()))
            && (this.getTwiceCheckType() == null ? other.getTwiceCheckType() == null : this.getTwiceCheckType().equals(other.getTwiceCheckType()))
            && (this.getTwiceCheckCode() == null ? other.getTwiceCheckCode() == null : this.getTwiceCheckCode().equals(other.getTwiceCheckCode()))
            && (this.getTwiceCheckLabel() == null ? other.getTwiceCheckLabel() == null : this.getTwiceCheckLabel().equals(other.getTwiceCheckLabel()))
            && (this.getTwiceCheckExpireTime() == null ? other.getTwiceCheckExpireTime() == null : this.getTwiceCheckExpireTime().equals(other.getTwiceCheckExpireTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        result = prime * result + ((getPasswd() == null) ? 0 : getPasswd().hashCode());
        result = prime * result + ((getLocked() == null) ? 0 : getLocked().hashCode());
        result = prime * result + ((getLoginFailedTime() == null) ? 0 : getLoginFailedTime().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getLastLoginDate() == null) ? 0 : getLastLoginDate().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getTwiceCheckEnabled() == null) ? 0 : getTwiceCheckEnabled().hashCode());
        result = prime * result + ((getTwiceCheckType() == null) ? 0 : getTwiceCheckType().hashCode());
        result = prime * result + ((getTwiceCheckCode() == null) ? 0 : getTwiceCheckCode().hashCode());
        result = prime * result + ((getTwiceCheckLabel() == null) ? 0 : getTwiceCheckLabel().hashCode());
        result = prime * result + ((getTwiceCheckExpireTime() == null) ? 0 : getTwiceCheckExpireTime().hashCode());
        return result;
    }
}