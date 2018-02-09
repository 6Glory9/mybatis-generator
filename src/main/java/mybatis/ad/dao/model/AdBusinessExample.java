package mybatis.ad.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdBusinessExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public AdBusinessExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNull() {
            addCriterion("display_name is null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNotNull() {
            addCriterion("display_name is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameEqualTo(String value) {
            addCriterion("display_name =", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotEqualTo(String value) {
            addCriterion("display_name <>", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThan(String value) {
            addCriterion("display_name >", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThanOrEqualTo(String value) {
            addCriterion("display_name >=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThan(String value) {
            addCriterion("display_name <", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThanOrEqualTo(String value) {
            addCriterion("display_name <=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLike(String value) {
            addCriterion("display_name like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotLike(String value) {
            addCriterion("display_name not like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIn(List<String> values) {
            addCriterion("display_name in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotIn(List<String> values) {
            addCriterion("display_name not in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameBetween(String value1, String value2) {
            addCriterion("display_name between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotBetween(String value1, String value2) {
            addCriterion("display_name not between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNull() {
            addCriterion("business_name is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNotNull() {
            addCriterion("business_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameEqualTo(String value) {
            addCriterion("business_name =", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotEqualTo(String value) {
            addCriterion("business_name <>", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThan(String value) {
            addCriterion("business_name >", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThanOrEqualTo(String value) {
            addCriterion("business_name >=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThan(String value) {
            addCriterion("business_name <", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThanOrEqualTo(String value) {
            addCriterion("business_name <=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLike(String value) {
            addCriterion("business_name like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotLike(String value) {
            addCriterion("business_name not like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIn(List<String> values) {
            addCriterion("business_name in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotIn(List<String> values) {
            addCriterion("business_name not in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameBetween(String value1, String value2) {
            addCriterion("business_name between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotBetween(String value1, String value2) {
            addCriterion("business_name not between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andBusinessLineIdIsNull() {
            addCriterion("business_line_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLineIdIsNotNull() {
            addCriterion("business_line_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLineIdEqualTo(Long value) {
            addCriterion("business_line_id =", value, "businessLineId");
            return (Criteria) this;
        }

        public Criteria andBusinessLineIdNotEqualTo(Long value) {
            addCriterion("business_line_id <>", value, "businessLineId");
            return (Criteria) this;
        }

        public Criteria andBusinessLineIdGreaterThan(Long value) {
            addCriterion("business_line_id >", value, "businessLineId");
            return (Criteria) this;
        }

        public Criteria andBusinessLineIdGreaterThanOrEqualTo(Long value) {
            addCriterion("business_line_id >=", value, "businessLineId");
            return (Criteria) this;
        }

        public Criteria andBusinessLineIdLessThan(Long value) {
            addCriterion("business_line_id <", value, "businessLineId");
            return (Criteria) this;
        }

        public Criteria andBusinessLineIdLessThanOrEqualTo(Long value) {
            addCriterion("business_line_id <=", value, "businessLineId");
            return (Criteria) this;
        }

        public Criteria andBusinessLineIdIn(List<Long> values) {
            addCriterion("business_line_id in", values, "businessLineId");
            return (Criteria) this;
        }

        public Criteria andBusinessLineIdNotIn(List<Long> values) {
            addCriterion("business_line_id not in", values, "businessLineId");
            return (Criteria) this;
        }

        public Criteria andBusinessLineIdBetween(Long value1, Long value2) {
            addCriterion("business_line_id between", value1, value2, "businessLineId");
            return (Criteria) this;
        }

        public Criteria andBusinessLineIdNotBetween(Long value1, Long value2) {
            addCriterion("business_line_id not between", value1, value2, "businessLineId");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupIdIsNull() {
            addCriterion("business_group_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupIdIsNotNull() {
            addCriterion("business_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupIdEqualTo(Long value) {
            addCriterion("business_group_id =", value, "businessGroupId");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupIdNotEqualTo(Long value) {
            addCriterion("business_group_id <>", value, "businessGroupId");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupIdGreaterThan(Long value) {
            addCriterion("business_group_id >", value, "businessGroupId");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("business_group_id >=", value, "businessGroupId");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupIdLessThan(Long value) {
            addCriterion("business_group_id <", value, "businessGroupId");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("business_group_id <=", value, "businessGroupId");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupIdIn(List<Long> values) {
            addCriterion("business_group_id in", values, "businessGroupId");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupIdNotIn(List<Long> values) {
            addCriterion("business_group_id not in", values, "businessGroupId");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupIdBetween(Long value1, Long value2) {
            addCriterion("business_group_id between", value1, value2, "businessGroupId");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("business_group_id not between", value1, value2, "businessGroupId");
            return (Criteria) this;
        }

        public Criteria andSourcePathIsNull() {
            addCriterion("source_path is null");
            return (Criteria) this;
        }

        public Criteria andSourcePathIsNotNull() {
            addCriterion("source_path is not null");
            return (Criteria) this;
        }

        public Criteria andSourcePathEqualTo(String value) {
            addCriterion("source_path =", value, "sourcePath");
            return (Criteria) this;
        }

        public Criteria andSourcePathNotEqualTo(String value) {
            addCriterion("source_path <>", value, "sourcePath");
            return (Criteria) this;
        }

        public Criteria andSourcePathGreaterThan(String value) {
            addCriterion("source_path >", value, "sourcePath");
            return (Criteria) this;
        }

        public Criteria andSourcePathGreaterThanOrEqualTo(String value) {
            addCriterion("source_path >=", value, "sourcePath");
            return (Criteria) this;
        }

        public Criteria andSourcePathLessThan(String value) {
            addCriterion("source_path <", value, "sourcePath");
            return (Criteria) this;
        }

        public Criteria andSourcePathLessThanOrEqualTo(String value) {
            addCriterion("source_path <=", value, "sourcePath");
            return (Criteria) this;
        }

        public Criteria andSourcePathLike(String value) {
            addCriterion("source_path like", value, "sourcePath");
            return (Criteria) this;
        }

        public Criteria andSourcePathNotLike(String value) {
            addCriterion("source_path not like", value, "sourcePath");
            return (Criteria) this;
        }

        public Criteria andSourcePathIn(List<String> values) {
            addCriterion("source_path in", values, "sourcePath");
            return (Criteria) this;
        }

        public Criteria andSourcePathNotIn(List<String> values) {
            addCriterion("source_path not in", values, "sourcePath");
            return (Criteria) this;
        }

        public Criteria andSourcePathBetween(String value1, String value2) {
            addCriterion("source_path between", value1, value2, "sourcePath");
            return (Criteria) this;
        }

        public Criteria andSourcePathNotBetween(String value1, String value2) {
            addCriterion("source_path not between", value1, value2, "sourcePath");
            return (Criteria) this;
        }

        public Criteria andPublishSvnVersionIsNull() {
            addCriterion("publish_svn_version is null");
            return (Criteria) this;
        }

        public Criteria andPublishSvnVersionIsNotNull() {
            addCriterion("publish_svn_version is not null");
            return (Criteria) this;
        }

        public Criteria andPublishSvnVersionEqualTo(String value) {
            addCriterion("publish_svn_version =", value, "publishSvnVersion");
            return (Criteria) this;
        }

        public Criteria andPublishSvnVersionNotEqualTo(String value) {
            addCriterion("publish_svn_version <>", value, "publishSvnVersion");
            return (Criteria) this;
        }

        public Criteria andPublishSvnVersionGreaterThan(String value) {
            addCriterion("publish_svn_version >", value, "publishSvnVersion");
            return (Criteria) this;
        }

        public Criteria andPublishSvnVersionGreaterThanOrEqualTo(String value) {
            addCriterion("publish_svn_version >=", value, "publishSvnVersion");
            return (Criteria) this;
        }

        public Criteria andPublishSvnVersionLessThan(String value) {
            addCriterion("publish_svn_version <", value, "publishSvnVersion");
            return (Criteria) this;
        }

        public Criteria andPublishSvnVersionLessThanOrEqualTo(String value) {
            addCriterion("publish_svn_version <=", value, "publishSvnVersion");
            return (Criteria) this;
        }

        public Criteria andPublishSvnVersionLike(String value) {
            addCriterion("publish_svn_version like", value, "publishSvnVersion");
            return (Criteria) this;
        }

        public Criteria andPublishSvnVersionNotLike(String value) {
            addCriterion("publish_svn_version not like", value, "publishSvnVersion");
            return (Criteria) this;
        }

        public Criteria andPublishSvnVersionIn(List<String> values) {
            addCriterion("publish_svn_version in", values, "publishSvnVersion");
            return (Criteria) this;
        }

        public Criteria andPublishSvnVersionNotIn(List<String> values) {
            addCriterion("publish_svn_version not in", values, "publishSvnVersion");
            return (Criteria) this;
        }

        public Criteria andPublishSvnVersionBetween(String value1, String value2) {
            addCriterion("publish_svn_version between", value1, value2, "publishSvnVersion");
            return (Criteria) this;
        }

        public Criteria andPublishSvnVersionNotBetween(String value1, String value2) {
            addCriterion("publish_svn_version not between", value1, value2, "publishSvnVersion");
            return (Criteria) this;
        }

        public Criteria andProjectStructureIsNull() {
            addCriterion("project_structure is null");
            return (Criteria) this;
        }

        public Criteria andProjectStructureIsNotNull() {
            addCriterion("project_structure is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStructureEqualTo(String value) {
            addCriterion("project_structure =", value, "projectStructure");
            return (Criteria) this;
        }

        public Criteria andProjectStructureNotEqualTo(String value) {
            addCriterion("project_structure <>", value, "projectStructure");
            return (Criteria) this;
        }

        public Criteria andProjectStructureGreaterThan(String value) {
            addCriterion("project_structure >", value, "projectStructure");
            return (Criteria) this;
        }

        public Criteria andProjectStructureGreaterThanOrEqualTo(String value) {
            addCriterion("project_structure >=", value, "projectStructure");
            return (Criteria) this;
        }

        public Criteria andProjectStructureLessThan(String value) {
            addCriterion("project_structure <", value, "projectStructure");
            return (Criteria) this;
        }

        public Criteria andProjectStructureLessThanOrEqualTo(String value) {
            addCriterion("project_structure <=", value, "projectStructure");
            return (Criteria) this;
        }

        public Criteria andProjectStructureLike(String value) {
            addCriterion("project_structure like", value, "projectStructure");
            return (Criteria) this;
        }

        public Criteria andProjectStructureNotLike(String value) {
            addCriterion("project_structure not like", value, "projectStructure");
            return (Criteria) this;
        }

        public Criteria andProjectStructureIn(List<String> values) {
            addCriterion("project_structure in", values, "projectStructure");
            return (Criteria) this;
        }

        public Criteria andProjectStructureNotIn(List<String> values) {
            addCriterion("project_structure not in", values, "projectStructure");
            return (Criteria) this;
        }

        public Criteria andProjectStructureBetween(String value1, String value2) {
            addCriterion("project_structure between", value1, value2, "projectStructure");
            return (Criteria) this;
        }

        public Criteria andProjectStructureNotBetween(String value1, String value2) {
            addCriterion("project_structure not between", value1, value2, "projectStructure");
            return (Criteria) this;
        }

        public Criteria andMvnArgsIsNull() {
            addCriterion("mvn_args is null");
            return (Criteria) this;
        }

        public Criteria andMvnArgsIsNotNull() {
            addCriterion("mvn_args is not null");
            return (Criteria) this;
        }

        public Criteria andMvnArgsEqualTo(String value) {
            addCriterion("mvn_args =", value, "mvnArgs");
            return (Criteria) this;
        }

        public Criteria andMvnArgsNotEqualTo(String value) {
            addCriterion("mvn_args <>", value, "mvnArgs");
            return (Criteria) this;
        }

        public Criteria andMvnArgsGreaterThan(String value) {
            addCriterion("mvn_args >", value, "mvnArgs");
            return (Criteria) this;
        }

        public Criteria andMvnArgsGreaterThanOrEqualTo(String value) {
            addCriterion("mvn_args >=", value, "mvnArgs");
            return (Criteria) this;
        }

        public Criteria andMvnArgsLessThan(String value) {
            addCriterion("mvn_args <", value, "mvnArgs");
            return (Criteria) this;
        }

        public Criteria andMvnArgsLessThanOrEqualTo(String value) {
            addCriterion("mvn_args <=", value, "mvnArgs");
            return (Criteria) this;
        }

        public Criteria andMvnArgsLike(String value) {
            addCriterion("mvn_args like", value, "mvnArgs");
            return (Criteria) this;
        }

        public Criteria andMvnArgsNotLike(String value) {
            addCriterion("mvn_args not like", value, "mvnArgs");
            return (Criteria) this;
        }

        public Criteria andMvnArgsIn(List<String> values) {
            addCriterion("mvn_args in", values, "mvnArgs");
            return (Criteria) this;
        }

        public Criteria andMvnArgsNotIn(List<String> values) {
            addCriterion("mvn_args not in", values, "mvnArgs");
            return (Criteria) this;
        }

        public Criteria andMvnArgsBetween(String value1, String value2) {
            addCriterion("mvn_args between", value1, value2, "mvnArgs");
            return (Criteria) this;
        }

        public Criteria andMvnArgsNotBetween(String value1, String value2) {
            addCriterion("mvn_args not between", value1, value2, "mvnArgs");
            return (Criteria) this;
        }

        public Criteria andPackageRepositoryIsNull() {
            addCriterion("package_repository is null");
            return (Criteria) this;
        }

        public Criteria andPackageRepositoryIsNotNull() {
            addCriterion("package_repository is not null");
            return (Criteria) this;
        }

        public Criteria andPackageRepositoryEqualTo(String value) {
            addCriterion("package_repository =", value, "packageRepository");
            return (Criteria) this;
        }

        public Criteria andPackageRepositoryNotEqualTo(String value) {
            addCriterion("package_repository <>", value, "packageRepository");
            return (Criteria) this;
        }

        public Criteria andPackageRepositoryGreaterThan(String value) {
            addCriterion("package_repository >", value, "packageRepository");
            return (Criteria) this;
        }

        public Criteria andPackageRepositoryGreaterThanOrEqualTo(String value) {
            addCriterion("package_repository >=", value, "packageRepository");
            return (Criteria) this;
        }

        public Criteria andPackageRepositoryLessThan(String value) {
            addCriterion("package_repository <", value, "packageRepository");
            return (Criteria) this;
        }

        public Criteria andPackageRepositoryLessThanOrEqualTo(String value) {
            addCriterion("package_repository <=", value, "packageRepository");
            return (Criteria) this;
        }

        public Criteria andPackageRepositoryLike(String value) {
            addCriterion("package_repository like", value, "packageRepository");
            return (Criteria) this;
        }

        public Criteria andPackageRepositoryNotLike(String value) {
            addCriterion("package_repository not like", value, "packageRepository");
            return (Criteria) this;
        }

        public Criteria andPackageRepositoryIn(List<String> values) {
            addCriterion("package_repository in", values, "packageRepository");
            return (Criteria) this;
        }

        public Criteria andPackageRepositoryNotIn(List<String> values) {
            addCriterion("package_repository not in", values, "packageRepository");
            return (Criteria) this;
        }

        public Criteria andPackageRepositoryBetween(String value1, String value2) {
            addCriterion("package_repository between", value1, value2, "packageRepository");
            return (Criteria) this;
        }

        public Criteria andPackageRepositoryNotBetween(String value1, String value2) {
            addCriterion("package_repository not between", value1, value2, "packageRepository");
            return (Criteria) this;
        }

        public Criteria andNginxConfigNameIsNull() {
            addCriterion("nginx_config_name is null");
            return (Criteria) this;
        }

        public Criteria andNginxConfigNameIsNotNull() {
            addCriterion("nginx_config_name is not null");
            return (Criteria) this;
        }

        public Criteria andNginxConfigNameEqualTo(String value) {
            addCriterion("nginx_config_name =", value, "nginxConfigName");
            return (Criteria) this;
        }

        public Criteria andNginxConfigNameNotEqualTo(String value) {
            addCriterion("nginx_config_name <>", value, "nginxConfigName");
            return (Criteria) this;
        }

        public Criteria andNginxConfigNameGreaterThan(String value) {
            addCriterion("nginx_config_name >", value, "nginxConfigName");
            return (Criteria) this;
        }

        public Criteria andNginxConfigNameGreaterThanOrEqualTo(String value) {
            addCriterion("nginx_config_name >=", value, "nginxConfigName");
            return (Criteria) this;
        }

        public Criteria andNginxConfigNameLessThan(String value) {
            addCriterion("nginx_config_name <", value, "nginxConfigName");
            return (Criteria) this;
        }

        public Criteria andNginxConfigNameLessThanOrEqualTo(String value) {
            addCriterion("nginx_config_name <=", value, "nginxConfigName");
            return (Criteria) this;
        }

        public Criteria andNginxConfigNameLike(String value) {
            addCriterion("nginx_config_name like", value, "nginxConfigName");
            return (Criteria) this;
        }

        public Criteria andNginxConfigNameNotLike(String value) {
            addCriterion("nginx_config_name not like", value, "nginxConfigName");
            return (Criteria) this;
        }

        public Criteria andNginxConfigNameIn(List<String> values) {
            addCriterion("nginx_config_name in", values, "nginxConfigName");
            return (Criteria) this;
        }

        public Criteria andNginxConfigNameNotIn(List<String> values) {
            addCriterion("nginx_config_name not in", values, "nginxConfigName");
            return (Criteria) this;
        }

        public Criteria andNginxConfigNameBetween(String value1, String value2) {
            addCriterion("nginx_config_name between", value1, value2, "nginxConfigName");
            return (Criteria) this;
        }

        public Criteria andNginxConfigNameNotBetween(String value1, String value2) {
            addCriterion("nginx_config_name not between", value1, value2, "nginxConfigName");
            return (Criteria) this;
        }

        public Criteria andNgDeviceIdIsNull() {
            addCriterion("ng_device_id is null");
            return (Criteria) this;
        }

        public Criteria andNgDeviceIdIsNotNull() {
            addCriterion("ng_device_id is not null");
            return (Criteria) this;
        }

        public Criteria andNgDeviceIdEqualTo(Long value) {
            addCriterion("ng_device_id =", value, "ngDeviceId");
            return (Criteria) this;
        }

        public Criteria andNgDeviceIdNotEqualTo(Long value) {
            addCriterion("ng_device_id <>", value, "ngDeviceId");
            return (Criteria) this;
        }

        public Criteria andNgDeviceIdGreaterThan(Long value) {
            addCriterion("ng_device_id >", value, "ngDeviceId");
            return (Criteria) this;
        }

        public Criteria andNgDeviceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ng_device_id >=", value, "ngDeviceId");
            return (Criteria) this;
        }

        public Criteria andNgDeviceIdLessThan(Long value) {
            addCriterion("ng_device_id <", value, "ngDeviceId");
            return (Criteria) this;
        }

        public Criteria andNgDeviceIdLessThanOrEqualTo(Long value) {
            addCriterion("ng_device_id <=", value, "ngDeviceId");
            return (Criteria) this;
        }

        public Criteria andNgDeviceIdIn(List<Long> values) {
            addCriterion("ng_device_id in", values, "ngDeviceId");
            return (Criteria) this;
        }

        public Criteria andNgDeviceIdNotIn(List<Long> values) {
            addCriterion("ng_device_id not in", values, "ngDeviceId");
            return (Criteria) this;
        }

        public Criteria andNgDeviceIdBetween(Long value1, Long value2) {
            addCriterion("ng_device_id between", value1, value2, "ngDeviceId");
            return (Criteria) this;
        }

        public Criteria andNgDeviceIdNotBetween(Long value1, Long value2) {
            addCriterion("ng_device_id not between", value1, value2, "ngDeviceId");
            return (Criteria) this;
        }

        public Criteria andConstructTypeIsNull() {
            addCriterion("construct_type is null");
            return (Criteria) this;
        }

        public Criteria andConstructTypeIsNotNull() {
            addCriterion("construct_type is not null");
            return (Criteria) this;
        }

        public Criteria andConstructTypeEqualTo(Integer value) {
            addCriterion("construct_type =", value, "constructType");
            return (Criteria) this;
        }

        public Criteria andConstructTypeNotEqualTo(Integer value) {
            addCriterion("construct_type <>", value, "constructType");
            return (Criteria) this;
        }

        public Criteria andConstructTypeGreaterThan(Integer value) {
            addCriterion("construct_type >", value, "constructType");
            return (Criteria) this;
        }

        public Criteria andConstructTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("construct_type >=", value, "constructType");
            return (Criteria) this;
        }

        public Criteria andConstructTypeLessThan(Integer value) {
            addCriterion("construct_type <", value, "constructType");
            return (Criteria) this;
        }

        public Criteria andConstructTypeLessThanOrEqualTo(Integer value) {
            addCriterion("construct_type <=", value, "constructType");
            return (Criteria) this;
        }

        public Criteria andConstructTypeIn(List<Integer> values) {
            addCriterion("construct_type in", values, "constructType");
            return (Criteria) this;
        }

        public Criteria andConstructTypeNotIn(List<Integer> values) {
            addCriterion("construct_type not in", values, "constructType");
            return (Criteria) this;
        }

        public Criteria andConstructTypeBetween(Integer value1, Integer value2) {
            addCriterion("construct_type between", value1, value2, "constructType");
            return (Criteria) this;
        }

        public Criteria andConstructTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("construct_type not between", value1, value2, "constructType");
            return (Criteria) this;
        }

        public Criteria andPublishProcessIdIsNull() {
            addCriterion("publish_process_id is null");
            return (Criteria) this;
        }

        public Criteria andPublishProcessIdIsNotNull() {
            addCriterion("publish_process_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublishProcessIdEqualTo(String value) {
            addCriterion("publish_process_id =", value, "publishProcessId");
            return (Criteria) this;
        }

        public Criteria andPublishProcessIdNotEqualTo(String value) {
            addCriterion("publish_process_id <>", value, "publishProcessId");
            return (Criteria) this;
        }

        public Criteria andPublishProcessIdGreaterThan(String value) {
            addCriterion("publish_process_id >", value, "publishProcessId");
            return (Criteria) this;
        }

        public Criteria andPublishProcessIdGreaterThanOrEqualTo(String value) {
            addCriterion("publish_process_id >=", value, "publishProcessId");
            return (Criteria) this;
        }

        public Criteria andPublishProcessIdLessThan(String value) {
            addCriterion("publish_process_id <", value, "publishProcessId");
            return (Criteria) this;
        }

        public Criteria andPublishProcessIdLessThanOrEqualTo(String value) {
            addCriterion("publish_process_id <=", value, "publishProcessId");
            return (Criteria) this;
        }

        public Criteria andPublishProcessIdLike(String value) {
            addCriterion("publish_process_id like", value, "publishProcessId");
            return (Criteria) this;
        }

        public Criteria andPublishProcessIdNotLike(String value) {
            addCriterion("publish_process_id not like", value, "publishProcessId");
            return (Criteria) this;
        }

        public Criteria andPublishProcessIdIn(List<String> values) {
            addCriterion("publish_process_id in", values, "publishProcessId");
            return (Criteria) this;
        }

        public Criteria andPublishProcessIdNotIn(List<String> values) {
            addCriterion("publish_process_id not in", values, "publishProcessId");
            return (Criteria) this;
        }

        public Criteria andPublishProcessIdBetween(String value1, String value2) {
            addCriterion("publish_process_id between", value1, value2, "publishProcessId");
            return (Criteria) this;
        }

        public Criteria andPublishProcessIdNotBetween(String value1, String value2) {
            addCriterion("publish_process_id not between", value1, value2, "publishProcessId");
            return (Criteria) this;
        }

        public Criteria andPublishStartTimeIsNull() {
            addCriterion("publish_start_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishStartTimeIsNotNull() {
            addCriterion("publish_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishStartTimeEqualTo(Date value) {
            addCriterion("publish_start_time =", value, "publishStartTime");
            return (Criteria) this;
        }

        public Criteria andPublishStartTimeNotEqualTo(Date value) {
            addCriterion("publish_start_time <>", value, "publishStartTime");
            return (Criteria) this;
        }

        public Criteria andPublishStartTimeGreaterThan(Date value) {
            addCriterion("publish_start_time >", value, "publishStartTime");
            return (Criteria) this;
        }

        public Criteria andPublishStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_start_time >=", value, "publishStartTime");
            return (Criteria) this;
        }

        public Criteria andPublishStartTimeLessThan(Date value) {
            addCriterion("publish_start_time <", value, "publishStartTime");
            return (Criteria) this;
        }

        public Criteria andPublishStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_start_time <=", value, "publishStartTime");
            return (Criteria) this;
        }

        public Criteria andPublishStartTimeIn(List<Date> values) {
            addCriterion("publish_start_time in", values, "publishStartTime");
            return (Criteria) this;
        }

        public Criteria andPublishStartTimeNotIn(List<Date> values) {
            addCriterion("publish_start_time not in", values, "publishStartTime");
            return (Criteria) this;
        }

        public Criteria andPublishStartTimeBetween(Date value1, Date value2) {
            addCriterion("publish_start_time between", value1, value2, "publishStartTime");
            return (Criteria) this;
        }

        public Criteria andPublishStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_start_time not between", value1, value2, "publishStartTime");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIsNull() {
            addCriterion("publish_status is null");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIsNotNull() {
            addCriterion("publish_status is not null");
            return (Criteria) this;
        }

        public Criteria andPublishStatusEqualTo(Integer value) {
            addCriterion("publish_status =", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotEqualTo(Integer value) {
            addCriterion("publish_status <>", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusGreaterThan(Integer value) {
            addCriterion("publish_status >", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_status >=", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusLessThan(Integer value) {
            addCriterion("publish_status <", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusLessThanOrEqualTo(Integer value) {
            addCriterion("publish_status <=", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIn(List<Integer> values) {
            addCriterion("publish_status in", values, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotIn(List<Integer> values) {
            addCriterion("publish_status not in", values, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusBetween(Integer value1, Integer value2) {
            addCriterion("publish_status between", value1, value2, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_status not between", value1, value2, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andLastPublishIsNull() {
            addCriterion("last_publish is null");
            return (Criteria) this;
        }

        public Criteria andLastPublishIsNotNull() {
            addCriterion("last_publish is not null");
            return (Criteria) this;
        }

        public Criteria andLastPublishEqualTo(Date value) {
            addCriterion("last_publish =", value, "lastPublish");
            return (Criteria) this;
        }

        public Criteria andLastPublishNotEqualTo(Date value) {
            addCriterion("last_publish <>", value, "lastPublish");
            return (Criteria) this;
        }

        public Criteria andLastPublishGreaterThan(Date value) {
            addCriterion("last_publish >", value, "lastPublish");
            return (Criteria) this;
        }

        public Criteria andLastPublishGreaterThanOrEqualTo(Date value) {
            addCriterion("last_publish >=", value, "lastPublish");
            return (Criteria) this;
        }

        public Criteria andLastPublishLessThan(Date value) {
            addCriterion("last_publish <", value, "lastPublish");
            return (Criteria) this;
        }

        public Criteria andLastPublishLessThanOrEqualTo(Date value) {
            addCriterion("last_publish <=", value, "lastPublish");
            return (Criteria) this;
        }

        public Criteria andLastPublishIn(List<Date> values) {
            addCriterion("last_publish in", values, "lastPublish");
            return (Criteria) this;
        }

        public Criteria andLastPublishNotIn(List<Date> values) {
            addCriterion("last_publish not in", values, "lastPublish");
            return (Criteria) this;
        }

        public Criteria andLastPublishBetween(Date value1, Date value2) {
            addCriterion("last_publish between", value1, value2, "lastPublish");
            return (Criteria) this;
        }

        public Criteria andLastPublishNotBetween(Date value1, Date value2) {
            addCriterion("last_publish not between", value1, value2, "lastPublish");
            return (Criteria) this;
        }

        public Criteria andPublishCountIsNull() {
            addCriterion("publish_count is null");
            return (Criteria) this;
        }

        public Criteria andPublishCountIsNotNull() {
            addCriterion("publish_count is not null");
            return (Criteria) this;
        }

        public Criteria andPublishCountEqualTo(Integer value) {
            addCriterion("publish_count =", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountNotEqualTo(Integer value) {
            addCriterion("publish_count <>", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountGreaterThan(Integer value) {
            addCriterion("publish_count >", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_count >=", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountLessThan(Integer value) {
            addCriterion("publish_count <", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountLessThanOrEqualTo(Integer value) {
            addCriterion("publish_count <=", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountIn(List<Integer> values) {
            addCriterion("publish_count in", values, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountNotIn(List<Integer> values) {
            addCriterion("publish_count not in", values, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountBetween(Integer value1, Integer value2) {
            addCriterion("publish_count between", value1, value2, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_count not between", value1, value2, "publishCount");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNull() {
            addCriterion("owner_id is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNotNull() {
            addCriterion("owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdEqualTo(Long value) {
            addCriterion("owner_id =", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotEqualTo(Long value) {
            addCriterion("owner_id <>", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThan(Long value) {
            addCriterion("owner_id >", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("owner_id >=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThan(Long value) {
            addCriterion("owner_id <", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThanOrEqualTo(Long value) {
            addCriterion("owner_id <=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIn(List<Long> values) {
            addCriterion("owner_id in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotIn(List<Long> values) {
            addCriterion("owner_id not in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdBetween(Long value1, Long value2) {
            addCriterion("owner_id between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotBetween(Long value1, Long value2) {
            addCriterion("owner_id not between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdIsNull() {
            addCriterion("designer_id is null");
            return (Criteria) this;
        }

        public Criteria andDesignerIdIsNotNull() {
            addCriterion("designer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesignerIdEqualTo(Long value) {
            addCriterion("designer_id =", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdNotEqualTo(Long value) {
            addCriterion("designer_id <>", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdGreaterThan(Long value) {
            addCriterion("designer_id >", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("designer_id >=", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdLessThan(Long value) {
            addCriterion("designer_id <", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdLessThanOrEqualTo(Long value) {
            addCriterion("designer_id <=", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdIn(List<Long> values) {
            addCriterion("designer_id in", values, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdNotIn(List<Long> values) {
            addCriterion("designer_id not in", values, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdBetween(Long value1, Long value2) {
            addCriterion("designer_id between", value1, value2, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdNotBetween(Long value1, Long value2) {
            addCriterion("designer_id not between", value1, value2, "designerId");
            return (Criteria) this;
        }

        public Criteria andPmIdIsNull() {
            addCriterion("pm_id is null");
            return (Criteria) this;
        }

        public Criteria andPmIdIsNotNull() {
            addCriterion("pm_id is not null");
            return (Criteria) this;
        }

        public Criteria andPmIdEqualTo(Long value) {
            addCriterion("pm_id =", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotEqualTo(Long value) {
            addCriterion("pm_id <>", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThan(Long value) {
            addCriterion("pm_id >", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pm_id >=", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThan(Long value) {
            addCriterion("pm_id <", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThanOrEqualTo(Long value) {
            addCriterion("pm_id <=", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdIn(List<Long> values) {
            addCriterion("pm_id in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotIn(List<Long> values) {
            addCriterion("pm_id not in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdBetween(Long value1, Long value2) {
            addCriterion("pm_id between", value1, value2, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotBetween(Long value1, Long value2) {
            addCriterion("pm_id not between", value1, value2, "pmId");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("publisher is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("publisher =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("publisher <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("publisher >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("publisher >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("publisher <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("publisher <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("publisher like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("publisher not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("publisher in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("publisher not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("publisher between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("publisher not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andChiefAuditIsNull() {
            addCriterion("chief_audit is null");
            return (Criteria) this;
        }

        public Criteria andChiefAuditIsNotNull() {
            addCriterion("chief_audit is not null");
            return (Criteria) this;
        }

        public Criteria andChiefAuditEqualTo(String value) {
            addCriterion("chief_audit =", value, "chiefAudit");
            return (Criteria) this;
        }

        public Criteria andChiefAuditNotEqualTo(String value) {
            addCriterion("chief_audit <>", value, "chiefAudit");
            return (Criteria) this;
        }

        public Criteria andChiefAuditGreaterThan(String value) {
            addCriterion("chief_audit >", value, "chiefAudit");
            return (Criteria) this;
        }

        public Criteria andChiefAuditGreaterThanOrEqualTo(String value) {
            addCriterion("chief_audit >=", value, "chiefAudit");
            return (Criteria) this;
        }

        public Criteria andChiefAuditLessThan(String value) {
            addCriterion("chief_audit <", value, "chiefAudit");
            return (Criteria) this;
        }

        public Criteria andChiefAuditLessThanOrEqualTo(String value) {
            addCriterion("chief_audit <=", value, "chiefAudit");
            return (Criteria) this;
        }

        public Criteria andChiefAuditLike(String value) {
            addCriterion("chief_audit like", value, "chiefAudit");
            return (Criteria) this;
        }

        public Criteria andChiefAuditNotLike(String value) {
            addCriterion("chief_audit not like", value, "chiefAudit");
            return (Criteria) this;
        }

        public Criteria andChiefAuditIn(List<String> values) {
            addCriterion("chief_audit in", values, "chiefAudit");
            return (Criteria) this;
        }

        public Criteria andChiefAuditNotIn(List<String> values) {
            addCriterion("chief_audit not in", values, "chiefAudit");
            return (Criteria) this;
        }

        public Criteria andChiefAuditBetween(String value1, String value2) {
            addCriterion("chief_audit between", value1, value2, "chiefAudit");
            return (Criteria) this;
        }

        public Criteria andChiefAuditNotBetween(String value1, String value2) {
            addCriterion("chief_audit not between", value1, value2, "chiefAudit");
            return (Criteria) this;
        }

        public Criteria andDesignAuditIsNull() {
            addCriterion("design_audit is null");
            return (Criteria) this;
        }

        public Criteria andDesignAuditIsNotNull() {
            addCriterion("design_audit is not null");
            return (Criteria) this;
        }

        public Criteria andDesignAuditEqualTo(String value) {
            addCriterion("design_audit =", value, "designAudit");
            return (Criteria) this;
        }

        public Criteria andDesignAuditNotEqualTo(String value) {
            addCriterion("design_audit <>", value, "designAudit");
            return (Criteria) this;
        }

        public Criteria andDesignAuditGreaterThan(String value) {
            addCriterion("design_audit >", value, "designAudit");
            return (Criteria) this;
        }

        public Criteria andDesignAuditGreaterThanOrEqualTo(String value) {
            addCriterion("design_audit >=", value, "designAudit");
            return (Criteria) this;
        }

        public Criteria andDesignAuditLessThan(String value) {
            addCriterion("design_audit <", value, "designAudit");
            return (Criteria) this;
        }

        public Criteria andDesignAuditLessThanOrEqualTo(String value) {
            addCriterion("design_audit <=", value, "designAudit");
            return (Criteria) this;
        }

        public Criteria andDesignAuditLike(String value) {
            addCriterion("design_audit like", value, "designAudit");
            return (Criteria) this;
        }

        public Criteria andDesignAuditNotLike(String value) {
            addCriterion("design_audit not like", value, "designAudit");
            return (Criteria) this;
        }

        public Criteria andDesignAuditIn(List<String> values) {
            addCriterion("design_audit in", values, "designAudit");
            return (Criteria) this;
        }

        public Criteria andDesignAuditNotIn(List<String> values) {
            addCriterion("design_audit not in", values, "designAudit");
            return (Criteria) this;
        }

        public Criteria andDesignAuditBetween(String value1, String value2) {
            addCriterion("design_audit between", value1, value2, "designAudit");
            return (Criteria) this;
        }

        public Criteria andDesignAuditNotBetween(String value1, String value2) {
            addCriterion("design_audit not between", value1, value2, "designAudit");
            return (Criteria) this;
        }

        public Criteria andDevlopAuditIsNull() {
            addCriterion("devlop_audit is null");
            return (Criteria) this;
        }

        public Criteria andDevlopAuditIsNotNull() {
            addCriterion("devlop_audit is not null");
            return (Criteria) this;
        }

        public Criteria andDevlopAuditEqualTo(String value) {
            addCriterion("devlop_audit =", value, "devlopAudit");
            return (Criteria) this;
        }

        public Criteria andDevlopAuditNotEqualTo(String value) {
            addCriterion("devlop_audit <>", value, "devlopAudit");
            return (Criteria) this;
        }

        public Criteria andDevlopAuditGreaterThan(String value) {
            addCriterion("devlop_audit >", value, "devlopAudit");
            return (Criteria) this;
        }

        public Criteria andDevlopAuditGreaterThanOrEqualTo(String value) {
            addCriterion("devlop_audit >=", value, "devlopAudit");
            return (Criteria) this;
        }

        public Criteria andDevlopAuditLessThan(String value) {
            addCriterion("devlop_audit <", value, "devlopAudit");
            return (Criteria) this;
        }

        public Criteria andDevlopAuditLessThanOrEqualTo(String value) {
            addCriterion("devlop_audit <=", value, "devlopAudit");
            return (Criteria) this;
        }

        public Criteria andDevlopAuditLike(String value) {
            addCriterion("devlop_audit like", value, "devlopAudit");
            return (Criteria) this;
        }

        public Criteria andDevlopAuditNotLike(String value) {
            addCriterion("devlop_audit not like", value, "devlopAudit");
            return (Criteria) this;
        }

        public Criteria andDevlopAuditIn(List<String> values) {
            addCriterion("devlop_audit in", values, "devlopAudit");
            return (Criteria) this;
        }

        public Criteria andDevlopAuditNotIn(List<String> values) {
            addCriterion("devlop_audit not in", values, "devlopAudit");
            return (Criteria) this;
        }

        public Criteria andDevlopAuditBetween(String value1, String value2) {
            addCriterion("devlop_audit between", value1, value2, "devlopAudit");
            return (Criteria) this;
        }

        public Criteria andDevlopAuditNotBetween(String value1, String value2) {
            addCriterion("devlop_audit not between", value1, value2, "devlopAudit");
            return (Criteria) this;
        }

        public Criteria andEmergencyAuditIsNull() {
            addCriterion("emergency_audit is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyAuditIsNotNull() {
            addCriterion("emergency_audit is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyAuditEqualTo(String value) {
            addCriterion("emergency_audit =", value, "emergencyAudit");
            return (Criteria) this;
        }

        public Criteria andEmergencyAuditNotEqualTo(String value) {
            addCriterion("emergency_audit <>", value, "emergencyAudit");
            return (Criteria) this;
        }

        public Criteria andEmergencyAuditGreaterThan(String value) {
            addCriterion("emergency_audit >", value, "emergencyAudit");
            return (Criteria) this;
        }

        public Criteria andEmergencyAuditGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_audit >=", value, "emergencyAudit");
            return (Criteria) this;
        }

        public Criteria andEmergencyAuditLessThan(String value) {
            addCriterion("emergency_audit <", value, "emergencyAudit");
            return (Criteria) this;
        }

        public Criteria andEmergencyAuditLessThanOrEqualTo(String value) {
            addCriterion("emergency_audit <=", value, "emergencyAudit");
            return (Criteria) this;
        }

        public Criteria andEmergencyAuditLike(String value) {
            addCriterion("emergency_audit like", value, "emergencyAudit");
            return (Criteria) this;
        }

        public Criteria andEmergencyAuditNotLike(String value) {
            addCriterion("emergency_audit not like", value, "emergencyAudit");
            return (Criteria) this;
        }

        public Criteria andEmergencyAuditIn(List<String> values) {
            addCriterion("emergency_audit in", values, "emergencyAudit");
            return (Criteria) this;
        }

        public Criteria andEmergencyAuditNotIn(List<String> values) {
            addCriterion("emergency_audit not in", values, "emergencyAudit");
            return (Criteria) this;
        }

        public Criteria andEmergencyAuditBetween(String value1, String value2) {
            addCriterion("emergency_audit between", value1, value2, "emergencyAudit");
            return (Criteria) this;
        }

        public Criteria andEmergencyAuditNotBetween(String value1, String value2) {
            addCriterion("emergency_audit not between", value1, value2, "emergencyAudit");
            return (Criteria) this;
        }

        public Criteria andInformationCenterAuditIsNull() {
            addCriterion("information_center_audit is null");
            return (Criteria) this;
        }

        public Criteria andInformationCenterAuditIsNotNull() {
            addCriterion("information_center_audit is not null");
            return (Criteria) this;
        }

        public Criteria andInformationCenterAuditEqualTo(String value) {
            addCriterion("information_center_audit =", value, "informationCenterAudit");
            return (Criteria) this;
        }

        public Criteria andInformationCenterAuditNotEqualTo(String value) {
            addCriterion("information_center_audit <>", value, "informationCenterAudit");
            return (Criteria) this;
        }

        public Criteria andInformationCenterAuditGreaterThan(String value) {
            addCriterion("information_center_audit >", value, "informationCenterAudit");
            return (Criteria) this;
        }

        public Criteria andInformationCenterAuditGreaterThanOrEqualTo(String value) {
            addCriterion("information_center_audit >=", value, "informationCenterAudit");
            return (Criteria) this;
        }

        public Criteria andInformationCenterAuditLessThan(String value) {
            addCriterion("information_center_audit <", value, "informationCenterAudit");
            return (Criteria) this;
        }

        public Criteria andInformationCenterAuditLessThanOrEqualTo(String value) {
            addCriterion("information_center_audit <=", value, "informationCenterAudit");
            return (Criteria) this;
        }

        public Criteria andInformationCenterAuditLike(String value) {
            addCriterion("information_center_audit like", value, "informationCenterAudit");
            return (Criteria) this;
        }

        public Criteria andInformationCenterAuditNotLike(String value) {
            addCriterion("information_center_audit not like", value, "informationCenterAudit");
            return (Criteria) this;
        }

        public Criteria andInformationCenterAuditIn(List<String> values) {
            addCriterion("information_center_audit in", values, "informationCenterAudit");
            return (Criteria) this;
        }

        public Criteria andInformationCenterAuditNotIn(List<String> values) {
            addCriterion("information_center_audit not in", values, "informationCenterAudit");
            return (Criteria) this;
        }

        public Criteria andInformationCenterAuditBetween(String value1, String value2) {
            addCriterion("information_center_audit between", value1, value2, "informationCenterAudit");
            return (Criteria) this;
        }

        public Criteria andInformationCenterAuditNotBetween(String value1, String value2) {
            addCriterion("information_center_audit not between", value1, value2, "informationCenterAudit");
            return (Criteria) this;
        }

        public Criteria andOperateAuditIsNull() {
            addCriterion("operate_audit is null");
            return (Criteria) this;
        }

        public Criteria andOperateAuditIsNotNull() {
            addCriterion("operate_audit is not null");
            return (Criteria) this;
        }

        public Criteria andOperateAuditEqualTo(String value) {
            addCriterion("operate_audit =", value, "operateAudit");
            return (Criteria) this;
        }

        public Criteria andOperateAuditNotEqualTo(String value) {
            addCriterion("operate_audit <>", value, "operateAudit");
            return (Criteria) this;
        }

        public Criteria andOperateAuditGreaterThan(String value) {
            addCriterion("operate_audit >", value, "operateAudit");
            return (Criteria) this;
        }

        public Criteria andOperateAuditGreaterThanOrEqualTo(String value) {
            addCriterion("operate_audit >=", value, "operateAudit");
            return (Criteria) this;
        }

        public Criteria andOperateAuditLessThan(String value) {
            addCriterion("operate_audit <", value, "operateAudit");
            return (Criteria) this;
        }

        public Criteria andOperateAuditLessThanOrEqualTo(String value) {
            addCriterion("operate_audit <=", value, "operateAudit");
            return (Criteria) this;
        }

        public Criteria andOperateAuditLike(String value) {
            addCriterion("operate_audit like", value, "operateAudit");
            return (Criteria) this;
        }

        public Criteria andOperateAuditNotLike(String value) {
            addCriterion("operate_audit not like", value, "operateAudit");
            return (Criteria) this;
        }

        public Criteria andOperateAuditIn(List<String> values) {
            addCriterion("operate_audit in", values, "operateAudit");
            return (Criteria) this;
        }

        public Criteria andOperateAuditNotIn(List<String> values) {
            addCriterion("operate_audit not in", values, "operateAudit");
            return (Criteria) this;
        }

        public Criteria andOperateAuditBetween(String value1, String value2) {
            addCriterion("operate_audit between", value1, value2, "operateAudit");
            return (Criteria) this;
        }

        public Criteria andOperateAuditNotBetween(String value1, String value2) {
            addCriterion("operate_audit not between", value1, value2, "operateAudit");
            return (Criteria) this;
        }

        public Criteria andTestAuditIsNull() {
            addCriterion("test_audit is null");
            return (Criteria) this;
        }

        public Criteria andTestAuditIsNotNull() {
            addCriterion("test_audit is not null");
            return (Criteria) this;
        }

        public Criteria andTestAuditEqualTo(String value) {
            addCriterion("test_audit =", value, "testAudit");
            return (Criteria) this;
        }

        public Criteria andTestAuditNotEqualTo(String value) {
            addCriterion("test_audit <>", value, "testAudit");
            return (Criteria) this;
        }

        public Criteria andTestAuditGreaterThan(String value) {
            addCriterion("test_audit >", value, "testAudit");
            return (Criteria) this;
        }

        public Criteria andTestAuditGreaterThanOrEqualTo(String value) {
            addCriterion("test_audit >=", value, "testAudit");
            return (Criteria) this;
        }

        public Criteria andTestAuditLessThan(String value) {
            addCriterion("test_audit <", value, "testAudit");
            return (Criteria) this;
        }

        public Criteria andTestAuditLessThanOrEqualTo(String value) {
            addCriterion("test_audit <=", value, "testAudit");
            return (Criteria) this;
        }

        public Criteria andTestAuditLike(String value) {
            addCriterion("test_audit like", value, "testAudit");
            return (Criteria) this;
        }

        public Criteria andTestAuditNotLike(String value) {
            addCriterion("test_audit not like", value, "testAudit");
            return (Criteria) this;
        }

        public Criteria andTestAuditIn(List<String> values) {
            addCriterion("test_audit in", values, "testAudit");
            return (Criteria) this;
        }

        public Criteria andTestAuditNotIn(List<String> values) {
            addCriterion("test_audit not in", values, "testAudit");
            return (Criteria) this;
        }

        public Criteria andTestAuditBetween(String value1, String value2) {
            addCriterion("test_audit between", value1, value2, "testAudit");
            return (Criteria) this;
        }

        public Criteria andTestAuditNotBetween(String value1, String value2) {
            addCriterion("test_audit not between", value1, value2, "testAudit");
            return (Criteria) this;
        }

        public Criteria andPrerunningSupportIsNull() {
            addCriterion("prerunning_support is null");
            return (Criteria) this;
        }

        public Criteria andPrerunningSupportIsNotNull() {
            addCriterion("prerunning_support is not null");
            return (Criteria) this;
        }

        public Criteria andPrerunningSupportEqualTo(Boolean value) {
            addCriterion("prerunning_support =", value, "prerunningSupport");
            return (Criteria) this;
        }

        public Criteria andPrerunningSupportNotEqualTo(Boolean value) {
            addCriterion("prerunning_support <>", value, "prerunningSupport");
            return (Criteria) this;
        }

        public Criteria andPrerunningSupportGreaterThan(Boolean value) {
            addCriterion("prerunning_support >", value, "prerunningSupport");
            return (Criteria) this;
        }

        public Criteria andPrerunningSupportGreaterThanOrEqualTo(Boolean value) {
            addCriterion("prerunning_support >=", value, "prerunningSupport");
            return (Criteria) this;
        }

        public Criteria andPrerunningSupportLessThan(Boolean value) {
            addCriterion("prerunning_support <", value, "prerunningSupport");
            return (Criteria) this;
        }

        public Criteria andPrerunningSupportLessThanOrEqualTo(Boolean value) {
            addCriterion("prerunning_support <=", value, "prerunningSupport");
            return (Criteria) this;
        }

        public Criteria andPrerunningSupportIn(List<Boolean> values) {
            addCriterion("prerunning_support in", values, "prerunningSupport");
            return (Criteria) this;
        }

        public Criteria andPrerunningSupportNotIn(List<Boolean> values) {
            addCriterion("prerunning_support not in", values, "prerunningSupport");
            return (Criteria) this;
        }

        public Criteria andPrerunningSupportBetween(Boolean value1, Boolean value2) {
            addCriterion("prerunning_support between", value1, value2, "prerunningSupport");
            return (Criteria) this;
        }

        public Criteria andPrerunningSupportNotBetween(Boolean value1, Boolean value2) {
            addCriterion("prerunning_support not between", value1, value2, "prerunningSupport");
            return (Criteria) this;
        }

        public Criteria andPrepubTesterIsNull() {
            addCriterion("prepub_tester is null");
            return (Criteria) this;
        }

        public Criteria andPrepubTesterIsNotNull() {
            addCriterion("prepub_tester is not null");
            return (Criteria) this;
        }

        public Criteria andPrepubTesterEqualTo(String value) {
            addCriterion("prepub_tester =", value, "prepubTester");
            return (Criteria) this;
        }

        public Criteria andPrepubTesterNotEqualTo(String value) {
            addCriterion("prepub_tester <>", value, "prepubTester");
            return (Criteria) this;
        }

        public Criteria andPrepubTesterGreaterThan(String value) {
            addCriterion("prepub_tester >", value, "prepubTester");
            return (Criteria) this;
        }

        public Criteria andPrepubTesterGreaterThanOrEqualTo(String value) {
            addCriterion("prepub_tester >=", value, "prepubTester");
            return (Criteria) this;
        }

        public Criteria andPrepubTesterLessThan(String value) {
            addCriterion("prepub_tester <", value, "prepubTester");
            return (Criteria) this;
        }

        public Criteria andPrepubTesterLessThanOrEqualTo(String value) {
            addCriterion("prepub_tester <=", value, "prepubTester");
            return (Criteria) this;
        }

        public Criteria andPrepubTesterLike(String value) {
            addCriterion("prepub_tester like", value, "prepubTester");
            return (Criteria) this;
        }

        public Criteria andPrepubTesterNotLike(String value) {
            addCriterion("prepub_tester not like", value, "prepubTester");
            return (Criteria) this;
        }

        public Criteria andPrepubTesterIn(List<String> values) {
            addCriterion("prepub_tester in", values, "prepubTester");
            return (Criteria) this;
        }

        public Criteria andPrepubTesterNotIn(List<String> values) {
            addCriterion("prepub_tester not in", values, "prepubTester");
            return (Criteria) this;
        }

        public Criteria andPrepubTesterBetween(String value1, String value2) {
            addCriterion("prepub_tester between", value1, value2, "prepubTester");
            return (Criteria) this;
        }

        public Criteria andPrepubTesterNotBetween(String value1, String value2) {
            addCriterion("prepub_tester not between", value1, value2, "prepubTester");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}