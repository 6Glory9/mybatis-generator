package mybatis.ad.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdApplicationServerExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public AdApplicationServerExample() {
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

        public Criteria andServerNameIsNull() {
            addCriterion("server_name is null");
            return (Criteria) this;
        }

        public Criteria andServerNameIsNotNull() {
            addCriterion("server_name is not null");
            return (Criteria) this;
        }

        public Criteria andServerNameEqualTo(String value) {
            addCriterion("server_name =", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotEqualTo(String value) {
            addCriterion("server_name <>", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameGreaterThan(String value) {
            addCriterion("server_name >", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameGreaterThanOrEqualTo(String value) {
            addCriterion("server_name >=", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLessThan(String value) {
            addCriterion("server_name <", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLessThanOrEqualTo(String value) {
            addCriterion("server_name <=", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLike(String value) {
            addCriterion("server_name like", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotLike(String value) {
            addCriterion("server_name not like", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameIn(List<String> values) {
            addCriterion("server_name in", values, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotIn(List<String> values) {
            addCriterion("server_name not in", values, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameBetween(String value1, String value2) {
            addCriterion("server_name between", value1, value2, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotBetween(String value1, String value2) {
            addCriterion("server_name not between", value1, value2, "serverName");
            return (Criteria) this;
        }

        public Criteria andEnvironmentTypeIsNull() {
            addCriterion("environment_type is null");
            return (Criteria) this;
        }

        public Criteria andEnvironmentTypeIsNotNull() {
            addCriterion("environment_type is not null");
            return (Criteria) this;
        }

        public Criteria andEnvironmentTypeEqualTo(Integer value) {
            addCriterion("environment_type =", value, "environmentType");
            return (Criteria) this;
        }

        public Criteria andEnvironmentTypeNotEqualTo(Integer value) {
            addCriterion("environment_type <>", value, "environmentType");
            return (Criteria) this;
        }

        public Criteria andEnvironmentTypeGreaterThan(Integer value) {
            addCriterion("environment_type >", value, "environmentType");
            return (Criteria) this;
        }

        public Criteria andEnvironmentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("environment_type >=", value, "environmentType");
            return (Criteria) this;
        }

        public Criteria andEnvironmentTypeLessThan(Integer value) {
            addCriterion("environment_type <", value, "environmentType");
            return (Criteria) this;
        }

        public Criteria andEnvironmentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("environment_type <=", value, "environmentType");
            return (Criteria) this;
        }

        public Criteria andEnvironmentTypeIn(List<Integer> values) {
            addCriterion("environment_type in", values, "environmentType");
            return (Criteria) this;
        }

        public Criteria andEnvironmentTypeNotIn(List<Integer> values) {
            addCriterion("environment_type not in", values, "environmentType");
            return (Criteria) this;
        }

        public Criteria andEnvironmentTypeBetween(Integer value1, Integer value2) {
            addCriterion("environment_type between", value1, value2, "environmentType");
            return (Criteria) this;
        }

        public Criteria andEnvironmentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("environment_type not between", value1, value2, "environmentType");
            return (Criteria) this;
        }

        public Criteria andIsStandbyIsNull() {
            addCriterion("is_standby is null");
            return (Criteria) this;
        }

        public Criteria andIsStandbyIsNotNull() {
            addCriterion("is_standby is not null");
            return (Criteria) this;
        }

        public Criteria andIsStandbyEqualTo(Boolean value) {
            addCriterion("is_standby =", value, "isStandby");
            return (Criteria) this;
        }

        public Criteria andIsStandbyNotEqualTo(Boolean value) {
            addCriterion("is_standby <>", value, "isStandby");
            return (Criteria) this;
        }

        public Criteria andIsStandbyGreaterThan(Boolean value) {
            addCriterion("is_standby >", value, "isStandby");
            return (Criteria) this;
        }

        public Criteria andIsStandbyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_standby >=", value, "isStandby");
            return (Criteria) this;
        }

        public Criteria andIsStandbyLessThan(Boolean value) {
            addCriterion("is_standby <", value, "isStandby");
            return (Criteria) this;
        }

        public Criteria andIsStandbyLessThanOrEqualTo(Boolean value) {
            addCriterion("is_standby <=", value, "isStandby");
            return (Criteria) this;
        }

        public Criteria andIsStandbyIn(List<Boolean> values) {
            addCriterion("is_standby in", values, "isStandby");
            return (Criteria) this;
        }

        public Criteria andIsStandbyNotIn(List<Boolean> values) {
            addCriterion("is_standby not in", values, "isStandby");
            return (Criteria) this;
        }

        public Criteria andIsStandbyBetween(Boolean value1, Boolean value2) {
            addCriterion("is_standby between", value1, value2, "isStandby");
            return (Criteria) this;
        }

        public Criteria andIsStandbyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_standby not between", value1, value2, "isStandby");
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

        public Criteria andHomeDirIsNull() {
            addCriterion("home_dir is null");
            return (Criteria) this;
        }

        public Criteria andHomeDirIsNotNull() {
            addCriterion("home_dir is not null");
            return (Criteria) this;
        }

        public Criteria andHomeDirEqualTo(String value) {
            addCriterion("home_dir =", value, "homeDir");
            return (Criteria) this;
        }

        public Criteria andHomeDirNotEqualTo(String value) {
            addCriterion("home_dir <>", value, "homeDir");
            return (Criteria) this;
        }

        public Criteria andHomeDirGreaterThan(String value) {
            addCriterion("home_dir >", value, "homeDir");
            return (Criteria) this;
        }

        public Criteria andHomeDirGreaterThanOrEqualTo(String value) {
            addCriterion("home_dir >=", value, "homeDir");
            return (Criteria) this;
        }

        public Criteria andHomeDirLessThan(String value) {
            addCriterion("home_dir <", value, "homeDir");
            return (Criteria) this;
        }

        public Criteria andHomeDirLessThanOrEqualTo(String value) {
            addCriterion("home_dir <=", value, "homeDir");
            return (Criteria) this;
        }

        public Criteria andHomeDirLike(String value) {
            addCriterion("home_dir like", value, "homeDir");
            return (Criteria) this;
        }

        public Criteria andHomeDirNotLike(String value) {
            addCriterion("home_dir not like", value, "homeDir");
            return (Criteria) this;
        }

        public Criteria andHomeDirIn(List<String> values) {
            addCriterion("home_dir in", values, "homeDir");
            return (Criteria) this;
        }

        public Criteria andHomeDirNotIn(List<String> values) {
            addCriterion("home_dir not in", values, "homeDir");
            return (Criteria) this;
        }

        public Criteria andHomeDirBetween(String value1, String value2) {
            addCriterion("home_dir between", value1, value2, "homeDir");
            return (Criteria) this;
        }

        public Criteria andHomeDirNotBetween(String value1, String value2) {
            addCriterion("home_dir not between", value1, value2, "homeDir");
            return (Criteria) this;
        }

        public Criteria andAccessLogIsNull() {
            addCriterion("access_log is null");
            return (Criteria) this;
        }

        public Criteria andAccessLogIsNotNull() {
            addCriterion("access_log is not null");
            return (Criteria) this;
        }

        public Criteria andAccessLogEqualTo(String value) {
            addCriterion("access_log =", value, "accessLog");
            return (Criteria) this;
        }

        public Criteria andAccessLogNotEqualTo(String value) {
            addCriterion("access_log <>", value, "accessLog");
            return (Criteria) this;
        }

        public Criteria andAccessLogGreaterThan(String value) {
            addCriterion("access_log >", value, "accessLog");
            return (Criteria) this;
        }

        public Criteria andAccessLogGreaterThanOrEqualTo(String value) {
            addCriterion("access_log >=", value, "accessLog");
            return (Criteria) this;
        }

        public Criteria andAccessLogLessThan(String value) {
            addCriterion("access_log <", value, "accessLog");
            return (Criteria) this;
        }

        public Criteria andAccessLogLessThanOrEqualTo(String value) {
            addCriterion("access_log <=", value, "accessLog");
            return (Criteria) this;
        }

        public Criteria andAccessLogLike(String value) {
            addCriterion("access_log like", value, "accessLog");
            return (Criteria) this;
        }

        public Criteria andAccessLogNotLike(String value) {
            addCriterion("access_log not like", value, "accessLog");
            return (Criteria) this;
        }

        public Criteria andAccessLogIn(List<String> values) {
            addCriterion("access_log in", values, "accessLog");
            return (Criteria) this;
        }

        public Criteria andAccessLogNotIn(List<String> values) {
            addCriterion("access_log not in", values, "accessLog");
            return (Criteria) this;
        }

        public Criteria andAccessLogBetween(String value1, String value2) {
            addCriterion("access_log between", value1, value2, "accessLog");
            return (Criteria) this;
        }

        public Criteria andAccessLogNotBetween(String value1, String value2) {
            addCriterion("access_log not between", value1, value2, "accessLog");
            return (Criteria) this;
        }

        public Criteria andLogDirPathIsNull() {
            addCriterion("log_dir_path is null");
            return (Criteria) this;
        }

        public Criteria andLogDirPathIsNotNull() {
            addCriterion("log_dir_path is not null");
            return (Criteria) this;
        }

        public Criteria andLogDirPathEqualTo(String value) {
            addCriterion("log_dir_path =", value, "logDirPath");
            return (Criteria) this;
        }

        public Criteria andLogDirPathNotEqualTo(String value) {
            addCriterion("log_dir_path <>", value, "logDirPath");
            return (Criteria) this;
        }

        public Criteria andLogDirPathGreaterThan(String value) {
            addCriterion("log_dir_path >", value, "logDirPath");
            return (Criteria) this;
        }

        public Criteria andLogDirPathGreaterThanOrEqualTo(String value) {
            addCriterion("log_dir_path >=", value, "logDirPath");
            return (Criteria) this;
        }

        public Criteria andLogDirPathLessThan(String value) {
            addCriterion("log_dir_path <", value, "logDirPath");
            return (Criteria) this;
        }

        public Criteria andLogDirPathLessThanOrEqualTo(String value) {
            addCriterion("log_dir_path <=", value, "logDirPath");
            return (Criteria) this;
        }

        public Criteria andLogDirPathLike(String value) {
            addCriterion("log_dir_path like", value, "logDirPath");
            return (Criteria) this;
        }

        public Criteria andLogDirPathNotLike(String value) {
            addCriterion("log_dir_path not like", value, "logDirPath");
            return (Criteria) this;
        }

        public Criteria andLogDirPathIn(List<String> values) {
            addCriterion("log_dir_path in", values, "logDirPath");
            return (Criteria) this;
        }

        public Criteria andLogDirPathNotIn(List<String> values) {
            addCriterion("log_dir_path not in", values, "logDirPath");
            return (Criteria) this;
        }

        public Criteria andLogDirPathBetween(String value1, String value2) {
            addCriterion("log_dir_path between", value1, value2, "logDirPath");
            return (Criteria) this;
        }

        public Criteria andLogDirPathNotBetween(String value1, String value2) {
            addCriterion("log_dir_path not between", value1, value2, "logDirPath");
            return (Criteria) this;
        }

        public Criteria andAppsDirPathIsNull() {
            addCriterion("apps_dir_path is null");
            return (Criteria) this;
        }

        public Criteria andAppsDirPathIsNotNull() {
            addCriterion("apps_dir_path is not null");
            return (Criteria) this;
        }

        public Criteria andAppsDirPathEqualTo(String value) {
            addCriterion("apps_dir_path =", value, "appsDirPath");
            return (Criteria) this;
        }

        public Criteria andAppsDirPathNotEqualTo(String value) {
            addCriterion("apps_dir_path <>", value, "appsDirPath");
            return (Criteria) this;
        }

        public Criteria andAppsDirPathGreaterThan(String value) {
            addCriterion("apps_dir_path >", value, "appsDirPath");
            return (Criteria) this;
        }

        public Criteria andAppsDirPathGreaterThanOrEqualTo(String value) {
            addCriterion("apps_dir_path >=", value, "appsDirPath");
            return (Criteria) this;
        }

        public Criteria andAppsDirPathLessThan(String value) {
            addCriterion("apps_dir_path <", value, "appsDirPath");
            return (Criteria) this;
        }

        public Criteria andAppsDirPathLessThanOrEqualTo(String value) {
            addCriterion("apps_dir_path <=", value, "appsDirPath");
            return (Criteria) this;
        }

        public Criteria andAppsDirPathLike(String value) {
            addCriterion("apps_dir_path like", value, "appsDirPath");
            return (Criteria) this;
        }

        public Criteria andAppsDirPathNotLike(String value) {
            addCriterion("apps_dir_path not like", value, "appsDirPath");
            return (Criteria) this;
        }

        public Criteria andAppsDirPathIn(List<String> values) {
            addCriterion("apps_dir_path in", values, "appsDirPath");
            return (Criteria) this;
        }

        public Criteria andAppsDirPathNotIn(List<String> values) {
            addCriterion("apps_dir_path not in", values, "appsDirPath");
            return (Criteria) this;
        }

        public Criteria andAppsDirPathBetween(String value1, String value2) {
            addCriterion("apps_dir_path between", value1, value2, "appsDirPath");
            return (Criteria) this;
        }

        public Criteria andAppsDirPathNotBetween(String value1, String value2) {
            addCriterion("apps_dir_path not between", value1, value2, "appsDirPath");
            return (Criteria) this;
        }

        public Criteria andConfigDirPathIsNull() {
            addCriterion("config_dir_path is null");
            return (Criteria) this;
        }

        public Criteria andConfigDirPathIsNotNull() {
            addCriterion("config_dir_path is not null");
            return (Criteria) this;
        }

        public Criteria andConfigDirPathEqualTo(String value) {
            addCriterion("config_dir_path =", value, "configDirPath");
            return (Criteria) this;
        }

        public Criteria andConfigDirPathNotEqualTo(String value) {
            addCriterion("config_dir_path <>", value, "configDirPath");
            return (Criteria) this;
        }

        public Criteria andConfigDirPathGreaterThan(String value) {
            addCriterion("config_dir_path >", value, "configDirPath");
            return (Criteria) this;
        }

        public Criteria andConfigDirPathGreaterThanOrEqualTo(String value) {
            addCriterion("config_dir_path >=", value, "configDirPath");
            return (Criteria) this;
        }

        public Criteria andConfigDirPathLessThan(String value) {
            addCriterion("config_dir_path <", value, "configDirPath");
            return (Criteria) this;
        }

        public Criteria andConfigDirPathLessThanOrEqualTo(String value) {
            addCriterion("config_dir_path <=", value, "configDirPath");
            return (Criteria) this;
        }

        public Criteria andConfigDirPathLike(String value) {
            addCriterion("config_dir_path like", value, "configDirPath");
            return (Criteria) this;
        }

        public Criteria andConfigDirPathNotLike(String value) {
            addCriterion("config_dir_path not like", value, "configDirPath");
            return (Criteria) this;
        }

        public Criteria andConfigDirPathIn(List<String> values) {
            addCriterion("config_dir_path in", values, "configDirPath");
            return (Criteria) this;
        }

        public Criteria andConfigDirPathNotIn(List<String> values) {
            addCriterion("config_dir_path not in", values, "configDirPath");
            return (Criteria) this;
        }

        public Criteria andConfigDirPathBetween(String value1, String value2) {
            addCriterion("config_dir_path between", value1, value2, "configDirPath");
            return (Criteria) this;
        }

        public Criteria andConfigDirPathNotBetween(String value1, String value2) {
            addCriterion("config_dir_path not between", value1, value2, "configDirPath");
            return (Criteria) this;
        }

        public Criteria andCustomerStartScriptIsNull() {
            addCriterion("customer_start_script is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStartScriptIsNotNull() {
            addCriterion("customer_start_script is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStartScriptEqualTo(String value) {
            addCriterion("customer_start_script =", value, "customerStartScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStartScriptNotEqualTo(String value) {
            addCriterion("customer_start_script <>", value, "customerStartScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStartScriptGreaterThan(String value) {
            addCriterion("customer_start_script >", value, "customerStartScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStartScriptGreaterThanOrEqualTo(String value) {
            addCriterion("customer_start_script >=", value, "customerStartScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStartScriptLessThan(String value) {
            addCriterion("customer_start_script <", value, "customerStartScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStartScriptLessThanOrEqualTo(String value) {
            addCriterion("customer_start_script <=", value, "customerStartScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStartScriptLike(String value) {
            addCriterion("customer_start_script like", value, "customerStartScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStartScriptNotLike(String value) {
            addCriterion("customer_start_script not like", value, "customerStartScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStartScriptIn(List<String> values) {
            addCriterion("customer_start_script in", values, "customerStartScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStartScriptNotIn(List<String> values) {
            addCriterion("customer_start_script not in", values, "customerStartScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStartScriptBetween(String value1, String value2) {
            addCriterion("customer_start_script between", value1, value2, "customerStartScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStartScriptNotBetween(String value1, String value2) {
            addCriterion("customer_start_script not between", value1, value2, "customerStartScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStopScriptIsNull() {
            addCriterion("customer_stop_script is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStopScriptIsNotNull() {
            addCriterion("customer_stop_script is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStopScriptEqualTo(String value) {
            addCriterion("customer_stop_script =", value, "customerStopScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStopScriptNotEqualTo(String value) {
            addCriterion("customer_stop_script <>", value, "customerStopScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStopScriptGreaterThan(String value) {
            addCriterion("customer_stop_script >", value, "customerStopScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStopScriptGreaterThanOrEqualTo(String value) {
            addCriterion("customer_stop_script >=", value, "customerStopScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStopScriptLessThan(String value) {
            addCriterion("customer_stop_script <", value, "customerStopScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStopScriptLessThanOrEqualTo(String value) {
            addCriterion("customer_stop_script <=", value, "customerStopScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStopScriptLike(String value) {
            addCriterion("customer_stop_script like", value, "customerStopScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStopScriptNotLike(String value) {
            addCriterion("customer_stop_script not like", value, "customerStopScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStopScriptIn(List<String> values) {
            addCriterion("customer_stop_script in", values, "customerStopScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStopScriptNotIn(List<String> values) {
            addCriterion("customer_stop_script not in", values, "customerStopScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStopScriptBetween(String value1, String value2) {
            addCriterion("customer_stop_script between", value1, value2, "customerStopScript");
            return (Criteria) this;
        }

        public Criteria andCustomerStopScriptNotBetween(String value1, String value2) {
            addCriterion("customer_stop_script not between", value1, value2, "customerStopScript");
            return (Criteria) this;
        }

        public Criteria andCustomerDumpScriptIsNull() {
            addCriterion("customer_dump_script is null");
            return (Criteria) this;
        }

        public Criteria andCustomerDumpScriptIsNotNull() {
            addCriterion("customer_dump_script is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerDumpScriptEqualTo(String value) {
            addCriterion("customer_dump_script =", value, "customerDumpScript");
            return (Criteria) this;
        }

        public Criteria andCustomerDumpScriptNotEqualTo(String value) {
            addCriterion("customer_dump_script <>", value, "customerDumpScript");
            return (Criteria) this;
        }

        public Criteria andCustomerDumpScriptGreaterThan(String value) {
            addCriterion("customer_dump_script >", value, "customerDumpScript");
            return (Criteria) this;
        }

        public Criteria andCustomerDumpScriptGreaterThanOrEqualTo(String value) {
            addCriterion("customer_dump_script >=", value, "customerDumpScript");
            return (Criteria) this;
        }

        public Criteria andCustomerDumpScriptLessThan(String value) {
            addCriterion("customer_dump_script <", value, "customerDumpScript");
            return (Criteria) this;
        }

        public Criteria andCustomerDumpScriptLessThanOrEqualTo(String value) {
            addCriterion("customer_dump_script <=", value, "customerDumpScript");
            return (Criteria) this;
        }

        public Criteria andCustomerDumpScriptLike(String value) {
            addCriterion("customer_dump_script like", value, "customerDumpScript");
            return (Criteria) this;
        }

        public Criteria andCustomerDumpScriptNotLike(String value) {
            addCriterion("customer_dump_script not like", value, "customerDumpScript");
            return (Criteria) this;
        }

        public Criteria andCustomerDumpScriptIn(List<String> values) {
            addCriterion("customer_dump_script in", values, "customerDumpScript");
            return (Criteria) this;
        }

        public Criteria andCustomerDumpScriptNotIn(List<String> values) {
            addCriterion("customer_dump_script not in", values, "customerDumpScript");
            return (Criteria) this;
        }

        public Criteria andCustomerDumpScriptBetween(String value1, String value2) {
            addCriterion("customer_dump_script between", value1, value2, "customerDumpScript");
            return (Criteria) this;
        }

        public Criteria andCustomerDumpScriptNotBetween(String value1, String value2) {
            addCriterion("customer_dump_script not between", value1, value2, "customerDumpScript");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andServerTypeIsNull() {
            addCriterion("server_type is null");
            return (Criteria) this;
        }

        public Criteria andServerTypeIsNotNull() {
            addCriterion("server_type is not null");
            return (Criteria) this;
        }

        public Criteria andServerTypeEqualTo(Integer value) {
            addCriterion("server_type =", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotEqualTo(Integer value) {
            addCriterion("server_type <>", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeGreaterThan(Integer value) {
            addCriterion("server_type >", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("server_type >=", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLessThan(Integer value) {
            addCriterion("server_type <", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("server_type <=", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeIn(List<Integer> values) {
            addCriterion("server_type in", values, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotIn(List<Integer> values) {
            addCriterion("server_type not in", values, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeBetween(Integer value1, Integer value2) {
            addCriterion("server_type between", value1, value2, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("server_type not between", value1, value2, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerVersionIsNull() {
            addCriterion("server_version is null");
            return (Criteria) this;
        }

        public Criteria andServerVersionIsNotNull() {
            addCriterion("server_version is not null");
            return (Criteria) this;
        }

        public Criteria andServerVersionEqualTo(String value) {
            addCriterion("server_version =", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionNotEqualTo(String value) {
            addCriterion("server_version <>", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionGreaterThan(String value) {
            addCriterion("server_version >", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionGreaterThanOrEqualTo(String value) {
            addCriterion("server_version >=", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionLessThan(String value) {
            addCriterion("server_version <", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionLessThanOrEqualTo(String value) {
            addCriterion("server_version <=", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionLike(String value) {
            addCriterion("server_version like", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionNotLike(String value) {
            addCriterion("server_version not like", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionIn(List<String> values) {
            addCriterion("server_version in", values, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionNotIn(List<String> values) {
            addCriterion("server_version not in", values, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionBetween(String value1, String value2) {
            addCriterion("server_version between", value1, value2, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionNotBetween(String value1, String value2) {
            addCriterion("server_version not between", value1, value2, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andHttpPortIsNull() {
            addCriterion("http_port is null");
            return (Criteria) this;
        }

        public Criteria andHttpPortIsNotNull() {
            addCriterion("http_port is not null");
            return (Criteria) this;
        }

        public Criteria andHttpPortEqualTo(Integer value) {
            addCriterion("http_port =", value, "httpPort");
            return (Criteria) this;
        }

        public Criteria andHttpPortNotEqualTo(Integer value) {
            addCriterion("http_port <>", value, "httpPort");
            return (Criteria) this;
        }

        public Criteria andHttpPortGreaterThan(Integer value) {
            addCriterion("http_port >", value, "httpPort");
            return (Criteria) this;
        }

        public Criteria andHttpPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("http_port >=", value, "httpPort");
            return (Criteria) this;
        }

        public Criteria andHttpPortLessThan(Integer value) {
            addCriterion("http_port <", value, "httpPort");
            return (Criteria) this;
        }

        public Criteria andHttpPortLessThanOrEqualTo(Integer value) {
            addCriterion("http_port <=", value, "httpPort");
            return (Criteria) this;
        }

        public Criteria andHttpPortIn(List<Integer> values) {
            addCriterion("http_port in", values, "httpPort");
            return (Criteria) this;
        }

        public Criteria andHttpPortNotIn(List<Integer> values) {
            addCriterion("http_port not in", values, "httpPort");
            return (Criteria) this;
        }

        public Criteria andHttpPortBetween(Integer value1, Integer value2) {
            addCriterion("http_port between", value1, value2, "httpPort");
            return (Criteria) this;
        }

        public Criteria andHttpPortNotBetween(Integer value1, Integer value2) {
            addCriterion("http_port not between", value1, value2, "httpPort");
            return (Criteria) this;
        }

        public Criteria andHttpsportIsNull() {
            addCriterion("httpsPort is null");
            return (Criteria) this;
        }

        public Criteria andHttpsportIsNotNull() {
            addCriterion("httpsPort is not null");
            return (Criteria) this;
        }

        public Criteria andHttpsportEqualTo(Integer value) {
            addCriterion("httpsPort =", value, "httpsport");
            return (Criteria) this;
        }

        public Criteria andHttpsportNotEqualTo(Integer value) {
            addCriterion("httpsPort <>", value, "httpsport");
            return (Criteria) this;
        }

        public Criteria andHttpsportGreaterThan(Integer value) {
            addCriterion("httpsPort >", value, "httpsport");
            return (Criteria) this;
        }

        public Criteria andHttpsportGreaterThanOrEqualTo(Integer value) {
            addCriterion("httpsPort >=", value, "httpsport");
            return (Criteria) this;
        }

        public Criteria andHttpsportLessThan(Integer value) {
            addCriterion("httpsPort <", value, "httpsport");
            return (Criteria) this;
        }

        public Criteria andHttpsportLessThanOrEqualTo(Integer value) {
            addCriterion("httpsPort <=", value, "httpsport");
            return (Criteria) this;
        }

        public Criteria andHttpsportIn(List<Integer> values) {
            addCriterion("httpsPort in", values, "httpsport");
            return (Criteria) this;
        }

        public Criteria andHttpsportNotIn(List<Integer> values) {
            addCriterion("httpsPort not in", values, "httpsport");
            return (Criteria) this;
        }

        public Criteria andHttpsportBetween(Integer value1, Integer value2) {
            addCriterion("httpsPort between", value1, value2, "httpsport");
            return (Criteria) this;
        }

        public Criteria andHttpsportNotBetween(Integer value1, Integer value2) {
            addCriterion("httpsPort not between", value1, value2, "httpsport");
            return (Criteria) this;
        }

        public Criteria andAjpPortIsNull() {
            addCriterion("ajp_port is null");
            return (Criteria) this;
        }

        public Criteria andAjpPortIsNotNull() {
            addCriterion("ajp_port is not null");
            return (Criteria) this;
        }

        public Criteria andAjpPortEqualTo(Integer value) {
            addCriterion("ajp_port =", value, "ajpPort");
            return (Criteria) this;
        }

        public Criteria andAjpPortNotEqualTo(Integer value) {
            addCriterion("ajp_port <>", value, "ajpPort");
            return (Criteria) this;
        }

        public Criteria andAjpPortGreaterThan(Integer value) {
            addCriterion("ajp_port >", value, "ajpPort");
            return (Criteria) this;
        }

        public Criteria andAjpPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("ajp_port >=", value, "ajpPort");
            return (Criteria) this;
        }

        public Criteria andAjpPortLessThan(Integer value) {
            addCriterion("ajp_port <", value, "ajpPort");
            return (Criteria) this;
        }

        public Criteria andAjpPortLessThanOrEqualTo(Integer value) {
            addCriterion("ajp_port <=", value, "ajpPort");
            return (Criteria) this;
        }

        public Criteria andAjpPortIn(List<Integer> values) {
            addCriterion("ajp_port in", values, "ajpPort");
            return (Criteria) this;
        }

        public Criteria andAjpPortNotIn(List<Integer> values) {
            addCriterion("ajp_port not in", values, "ajpPort");
            return (Criteria) this;
        }

        public Criteria andAjpPortBetween(Integer value1, Integer value2) {
            addCriterion("ajp_port between", value1, value2, "ajpPort");
            return (Criteria) this;
        }

        public Criteria andAjpPortNotBetween(Integer value1, Integer value2) {
            addCriterion("ajp_port not between", value1, value2, "ajpPort");
            return (Criteria) this;
        }

        public Criteria andJmxPortIsNull() {
            addCriterion("jmx_port is null");
            return (Criteria) this;
        }

        public Criteria andJmxPortIsNotNull() {
            addCriterion("jmx_port is not null");
            return (Criteria) this;
        }

        public Criteria andJmxPortEqualTo(Integer value) {
            addCriterion("jmx_port =", value, "jmxPort");
            return (Criteria) this;
        }

        public Criteria andJmxPortNotEqualTo(Integer value) {
            addCriterion("jmx_port <>", value, "jmxPort");
            return (Criteria) this;
        }

        public Criteria andJmxPortGreaterThan(Integer value) {
            addCriterion("jmx_port >", value, "jmxPort");
            return (Criteria) this;
        }

        public Criteria andJmxPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("jmx_port >=", value, "jmxPort");
            return (Criteria) this;
        }

        public Criteria andJmxPortLessThan(Integer value) {
            addCriterion("jmx_port <", value, "jmxPort");
            return (Criteria) this;
        }

        public Criteria andJmxPortLessThanOrEqualTo(Integer value) {
            addCriterion("jmx_port <=", value, "jmxPort");
            return (Criteria) this;
        }

        public Criteria andJmxPortIn(List<Integer> values) {
            addCriterion("jmx_port in", values, "jmxPort");
            return (Criteria) this;
        }

        public Criteria andJmxPortNotIn(List<Integer> values) {
            addCriterion("jmx_port not in", values, "jmxPort");
            return (Criteria) this;
        }

        public Criteria andJmxPortBetween(Integer value1, Integer value2) {
            addCriterion("jmx_port between", value1, value2, "jmxPort");
            return (Criteria) this;
        }

        public Criteria andJmxPortNotBetween(Integer value1, Integer value2) {
            addCriterion("jmx_port not between", value1, value2, "jmxPort");
            return (Criteria) this;
        }

        public Criteria andShutdownPortIsNull() {
            addCriterion("shutdown_port is null");
            return (Criteria) this;
        }

        public Criteria andShutdownPortIsNotNull() {
            addCriterion("shutdown_port is not null");
            return (Criteria) this;
        }

        public Criteria andShutdownPortEqualTo(Integer value) {
            addCriterion("shutdown_port =", value, "shutdownPort");
            return (Criteria) this;
        }

        public Criteria andShutdownPortNotEqualTo(Integer value) {
            addCriterion("shutdown_port <>", value, "shutdownPort");
            return (Criteria) this;
        }

        public Criteria andShutdownPortGreaterThan(Integer value) {
            addCriterion("shutdown_port >", value, "shutdownPort");
            return (Criteria) this;
        }

        public Criteria andShutdownPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("shutdown_port >=", value, "shutdownPort");
            return (Criteria) this;
        }

        public Criteria andShutdownPortLessThan(Integer value) {
            addCriterion("shutdown_port <", value, "shutdownPort");
            return (Criteria) this;
        }

        public Criteria andShutdownPortLessThanOrEqualTo(Integer value) {
            addCriterion("shutdown_port <=", value, "shutdownPort");
            return (Criteria) this;
        }

        public Criteria andShutdownPortIn(List<Integer> values) {
            addCriterion("shutdown_port in", values, "shutdownPort");
            return (Criteria) this;
        }

        public Criteria andShutdownPortNotIn(List<Integer> values) {
            addCriterion("shutdown_port not in", values, "shutdownPort");
            return (Criteria) this;
        }

        public Criteria andShutdownPortBetween(Integer value1, Integer value2) {
            addCriterion("shutdown_port between", value1, value2, "shutdownPort");
            return (Criteria) this;
        }

        public Criteria andShutdownPortNotBetween(Integer value1, Integer value2) {
            addCriterion("shutdown_port not between", value1, value2, "shutdownPort");
            return (Criteria) this;
        }

        public Criteria andDubboPortIsNull() {
            addCriterion("dubbo_port is null");
            return (Criteria) this;
        }

        public Criteria andDubboPortIsNotNull() {
            addCriterion("dubbo_port is not null");
            return (Criteria) this;
        }

        public Criteria andDubboPortEqualTo(Integer value) {
            addCriterion("dubbo_port =", value, "dubboPort");
            return (Criteria) this;
        }

        public Criteria andDubboPortNotEqualTo(Integer value) {
            addCriterion("dubbo_port <>", value, "dubboPort");
            return (Criteria) this;
        }

        public Criteria andDubboPortGreaterThan(Integer value) {
            addCriterion("dubbo_port >", value, "dubboPort");
            return (Criteria) this;
        }

        public Criteria andDubboPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("dubbo_port >=", value, "dubboPort");
            return (Criteria) this;
        }

        public Criteria andDubboPortLessThan(Integer value) {
            addCriterion("dubbo_port <", value, "dubboPort");
            return (Criteria) this;
        }

        public Criteria andDubboPortLessThanOrEqualTo(Integer value) {
            addCriterion("dubbo_port <=", value, "dubboPort");
            return (Criteria) this;
        }

        public Criteria andDubboPortIn(List<Integer> values) {
            addCriterion("dubbo_port in", values, "dubboPort");
            return (Criteria) this;
        }

        public Criteria andDubboPortNotIn(List<Integer> values) {
            addCriterion("dubbo_port not in", values, "dubboPort");
            return (Criteria) this;
        }

        public Criteria andDubboPortBetween(Integer value1, Integer value2) {
            addCriterion("dubbo_port between", value1, value2, "dubboPort");
            return (Criteria) this;
        }

        public Criteria andDubboPortNotBetween(Integer value1, Integer value2) {
            addCriterion("dubbo_port not between", value1, value2, "dubboPort");
            return (Criteria) this;
        }

        public Criteria andJavaHeapSizeIsNull() {
            addCriterion("java_heap_size is null");
            return (Criteria) this;
        }

        public Criteria andJavaHeapSizeIsNotNull() {
            addCriterion("java_heap_size is not null");
            return (Criteria) this;
        }

        public Criteria andJavaHeapSizeEqualTo(Integer value) {
            addCriterion("java_heap_size =", value, "javaHeapSize");
            return (Criteria) this;
        }

        public Criteria andJavaHeapSizeNotEqualTo(Integer value) {
            addCriterion("java_heap_size <>", value, "javaHeapSize");
            return (Criteria) this;
        }

        public Criteria andJavaHeapSizeGreaterThan(Integer value) {
            addCriterion("java_heap_size >", value, "javaHeapSize");
            return (Criteria) this;
        }

        public Criteria andJavaHeapSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("java_heap_size >=", value, "javaHeapSize");
            return (Criteria) this;
        }

        public Criteria andJavaHeapSizeLessThan(Integer value) {
            addCriterion("java_heap_size <", value, "javaHeapSize");
            return (Criteria) this;
        }

        public Criteria andJavaHeapSizeLessThanOrEqualTo(Integer value) {
            addCriterion("java_heap_size <=", value, "javaHeapSize");
            return (Criteria) this;
        }

        public Criteria andJavaHeapSizeIn(List<Integer> values) {
            addCriterion("java_heap_size in", values, "javaHeapSize");
            return (Criteria) this;
        }

        public Criteria andJavaHeapSizeNotIn(List<Integer> values) {
            addCriterion("java_heap_size not in", values, "javaHeapSize");
            return (Criteria) this;
        }

        public Criteria andJavaHeapSizeBetween(Integer value1, Integer value2) {
            addCriterion("java_heap_size between", value1, value2, "javaHeapSize");
            return (Criteria) this;
        }

        public Criteria andJavaHeapSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("java_heap_size not between", value1, value2, "javaHeapSize");
            return (Criteria) this;
        }

        public Criteria andEnvIsNull() {
            addCriterion("env is null");
            return (Criteria) this;
        }

        public Criteria andEnvIsNotNull() {
            addCriterion("env is not null");
            return (Criteria) this;
        }

        public Criteria andEnvEqualTo(String value) {
            addCriterion("env =", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotEqualTo(String value) {
            addCriterion("env <>", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvGreaterThan(String value) {
            addCriterion("env >", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvGreaterThanOrEqualTo(String value) {
            addCriterion("env >=", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvLessThan(String value) {
            addCriterion("env <", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvLessThanOrEqualTo(String value) {
            addCriterion("env <=", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvLike(String value) {
            addCriterion("env like", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotLike(String value) {
            addCriterion("env not like", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvIn(List<String> values) {
            addCriterion("env in", values, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotIn(List<String> values) {
            addCriterion("env not in", values, "env");
            return (Criteria) this;
        }

        public Criteria andEnvBetween(String value1, String value2) {
            addCriterion("env between", value1, value2, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotBetween(String value1, String value2) {
            addCriterion("env not between", value1, value2, "env");
            return (Criteria) this;
        }

        public Criteria andHostIdIsNull() {
            addCriterion("host_id is null");
            return (Criteria) this;
        }

        public Criteria andHostIdIsNotNull() {
            addCriterion("host_id is not null");
            return (Criteria) this;
        }

        public Criteria andHostIdEqualTo(Long value) {
            addCriterion("host_id =", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotEqualTo(Long value) {
            addCriterion("host_id <>", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdGreaterThan(Long value) {
            addCriterion("host_id >", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdGreaterThanOrEqualTo(Long value) {
            addCriterion("host_id >=", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdLessThan(Long value) {
            addCriterion("host_id <", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdLessThanOrEqualTo(Long value) {
            addCriterion("host_id <=", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdIn(List<Long> values) {
            addCriterion("host_id in", values, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotIn(List<Long> values) {
            addCriterion("host_id not in", values, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdBetween(Long value1, Long value2) {
            addCriterion("host_id between", value1, value2, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotBetween(Long value1, Long value2) {
            addCriterion("host_id not between", value1, value2, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIpIsNull() {
            addCriterion("host_ip is null");
            return (Criteria) this;
        }

        public Criteria andHostIpIsNotNull() {
            addCriterion("host_ip is not null");
            return (Criteria) this;
        }

        public Criteria andHostIpEqualTo(String value) {
            addCriterion("host_ip =", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotEqualTo(String value) {
            addCriterion("host_ip <>", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpGreaterThan(String value) {
            addCriterion("host_ip >", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpGreaterThanOrEqualTo(String value) {
            addCriterion("host_ip >=", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLessThan(String value) {
            addCriterion("host_ip <", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLessThanOrEqualTo(String value) {
            addCriterion("host_ip <=", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLike(String value) {
            addCriterion("host_ip like", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotLike(String value) {
            addCriterion("host_ip not like", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpIn(List<String> values) {
            addCriterion("host_ip in", values, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotIn(List<String> values) {
            addCriterion("host_ip not in", values, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpBetween(String value1, String value2) {
            addCriterion("host_ip between", value1, value2, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotBetween(String value1, String value2) {
            addCriterion("host_ip not between", value1, value2, "hostIp");
            return (Criteria) this;
        }

        public Criteria andRunningVersionIsNull() {
            addCriterion("running_version is null");
            return (Criteria) this;
        }

        public Criteria andRunningVersionIsNotNull() {
            addCriterion("running_version is not null");
            return (Criteria) this;
        }

        public Criteria andRunningVersionEqualTo(String value) {
            addCriterion("running_version =", value, "runningVersion");
            return (Criteria) this;
        }

        public Criteria andRunningVersionNotEqualTo(String value) {
            addCriterion("running_version <>", value, "runningVersion");
            return (Criteria) this;
        }

        public Criteria andRunningVersionGreaterThan(String value) {
            addCriterion("running_version >", value, "runningVersion");
            return (Criteria) this;
        }

        public Criteria andRunningVersionGreaterThanOrEqualTo(String value) {
            addCriterion("running_version >=", value, "runningVersion");
            return (Criteria) this;
        }

        public Criteria andRunningVersionLessThan(String value) {
            addCriterion("running_version <", value, "runningVersion");
            return (Criteria) this;
        }

        public Criteria andRunningVersionLessThanOrEqualTo(String value) {
            addCriterion("running_version <=", value, "runningVersion");
            return (Criteria) this;
        }

        public Criteria andRunningVersionLike(String value) {
            addCriterion("running_version like", value, "runningVersion");
            return (Criteria) this;
        }

        public Criteria andRunningVersionNotLike(String value) {
            addCriterion("running_version not like", value, "runningVersion");
            return (Criteria) this;
        }

        public Criteria andRunningVersionIn(List<String> values) {
            addCriterion("running_version in", values, "runningVersion");
            return (Criteria) this;
        }

        public Criteria andRunningVersionNotIn(List<String> values) {
            addCriterion("running_version not in", values, "runningVersion");
            return (Criteria) this;
        }

        public Criteria andRunningVersionBetween(String value1, String value2) {
            addCriterion("running_version between", value1, value2, "runningVersion");
            return (Criteria) this;
        }

        public Criteria andRunningVersionNotBetween(String value1, String value2) {
            addCriterion("running_version not between", value1, value2, "runningVersion");
            return (Criteria) this;
        }

        public Criteria andAppFileUpdateTimeIsNull() {
            addCriterion("app_file_update_time is null");
            return (Criteria) this;
        }

        public Criteria andAppFileUpdateTimeIsNotNull() {
            addCriterion("app_file_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppFileUpdateTimeEqualTo(Date value) {
            addCriterion("app_file_update_time =", value, "appFileUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAppFileUpdateTimeNotEqualTo(Date value) {
            addCriterion("app_file_update_time <>", value, "appFileUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAppFileUpdateTimeGreaterThan(Date value) {
            addCriterion("app_file_update_time >", value, "appFileUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAppFileUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("app_file_update_time >=", value, "appFileUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAppFileUpdateTimeLessThan(Date value) {
            addCriterion("app_file_update_time <", value, "appFileUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAppFileUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("app_file_update_time <=", value, "appFileUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAppFileUpdateTimeIn(List<Date> values) {
            addCriterion("app_file_update_time in", values, "appFileUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAppFileUpdateTimeNotIn(List<Date> values) {
            addCriterion("app_file_update_time not in", values, "appFileUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAppFileUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("app_file_update_time between", value1, value2, "appFileUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAppFileUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("app_file_update_time not between", value1, value2, "appFileUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusIsNull() {
            addCriterion("synchronize_status is null");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusIsNotNull() {
            addCriterion("synchronize_status is not null");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusEqualTo(Integer value) {
            addCriterion("synchronize_status =", value, "synchronizeStatus");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusNotEqualTo(Integer value) {
            addCriterion("synchronize_status <>", value, "synchronizeStatus");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusGreaterThan(Integer value) {
            addCriterion("synchronize_status >", value, "synchronizeStatus");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("synchronize_status >=", value, "synchronizeStatus");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusLessThan(Integer value) {
            addCriterion("synchronize_status <", value, "synchronizeStatus");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("synchronize_status <=", value, "synchronizeStatus");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusIn(List<Integer> values) {
            addCriterion("synchronize_status in", values, "synchronizeStatus");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusNotIn(List<Integer> values) {
            addCriterion("synchronize_status not in", values, "synchronizeStatus");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusBetween(Integer value1, Integer value2) {
            addCriterion("synchronize_status between", value1, value2, "synchronizeStatus");
            return (Criteria) this;
        }

        public Criteria andSynchronizeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("synchronize_status not between", value1, value2, "synchronizeStatus");
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