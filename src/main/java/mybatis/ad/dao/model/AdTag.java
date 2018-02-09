package mybatis.ad.dao.model;

import java.io.Serializable;
import java.util.Date;

public class AdTag implements Serializable {
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
     * 标签类型
     *
     * @mbg.generated
     */
    private Integer tagType;

    /**
     * 描述
     *
     * @mbg.generated
     */
    private String description;

    /**
     * 标签开关
     *
     * @mbg.generated
     */
    private Integer tagEnable;

    /**
     * tag_name
     *
     * @mbg.generated
     */
    private String tagName;

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

    public Integer getTagType() {
        return tagType;
    }

    public void setTagType(Integer tagType) {
        this.tagType = tagType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTagEnable() {
        return tagEnable;
    }

    public void setTagEnable(Integer tagEnable) {
        this.tagEnable = tagEnable;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
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
        sb.append(", tagType=").append(tagType);
        sb.append(", description=").append(description);
        sb.append(", tagEnable=").append(tagEnable);
        sb.append(", tagName=").append(tagName);
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
        AdTag other = (AdTag) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getTagType() == null ? other.getTagType() == null : this.getTagType().equals(other.getTagType()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getTagEnable() == null ? other.getTagEnable() == null : this.getTagEnable().equals(other.getTagEnable()))
            && (this.getTagName() == null ? other.getTagName() == null : this.getTagName().equals(other.getTagName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getTagType() == null) ? 0 : getTagType().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getTagEnable() == null) ? 0 : getTagEnable().hashCode());
        result = prime * result + ((getTagName() == null) ? 0 : getTagName().hashCode());
        return result;
    }
}