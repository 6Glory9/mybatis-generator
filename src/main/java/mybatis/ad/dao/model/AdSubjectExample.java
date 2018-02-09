package mybatis.ad.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdSubjectExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public AdSubjectExample() {
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

        public Criteria andPasswdIsNull() {
            addCriterion("passwd is null");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNotNull() {
            addCriterion("passwd is not null");
            return (Criteria) this;
        }

        public Criteria andPasswdEqualTo(String value) {
            addCriterion("passwd =", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotEqualTo(String value) {
            addCriterion("passwd <>", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThan(String value) {
            addCriterion("passwd >", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("passwd >=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThan(String value) {
            addCriterion("passwd <", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThanOrEqualTo(String value) {
            addCriterion("passwd <=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLike(String value) {
            addCriterion("passwd like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotLike(String value) {
            addCriterion("passwd not like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdIn(List<String> values) {
            addCriterion("passwd in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotIn(List<String> values) {
            addCriterion("passwd not in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdBetween(String value1, String value2) {
            addCriterion("passwd between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotBetween(String value1, String value2) {
            addCriterion("passwd not between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("locked is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("locked is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(Boolean value) {
            addCriterion("locked =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(Boolean value) {
            addCriterion("locked <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(Boolean value) {
            addCriterion("locked >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("locked >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(Boolean value) {
            addCriterion("locked <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("locked <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<Boolean> values) {
            addCriterion("locked in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<Boolean> values) {
            addCriterion("locked not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("locked between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("locked not between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimeIsNull() {
            addCriterion("login_failed_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimeIsNotNull() {
            addCriterion("login_failed_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimeEqualTo(Integer value) {
            addCriterion("login_failed_time =", value, "loginFailedTime");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimeNotEqualTo(Integer value) {
            addCriterion("login_failed_time <>", value, "loginFailedTime");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimeGreaterThan(Integer value) {
            addCriterion("login_failed_time >", value, "loginFailedTime");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_failed_time >=", value, "loginFailedTime");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimeLessThan(Integer value) {
            addCriterion("login_failed_time <", value, "loginFailedTime");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimeLessThanOrEqualTo(Integer value) {
            addCriterion("login_failed_time <=", value, "loginFailedTime");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimeIn(List<Integer> values) {
            addCriterion("login_failed_time in", values, "loginFailedTime");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimeNotIn(List<Integer> values) {
            addCriterion("login_failed_time not in", values, "loginFailedTime");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimeBetween(Integer value1, Integer value2) {
            addCriterion("login_failed_time between", value1, value2, "loginFailedTime");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("login_failed_time not between", value1, value2, "loginFailedTime");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNull() {
            addCriterion("last_login_date is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNotNull() {
            addCriterion("last_login_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateEqualTo(Date value) {
            addCriterion("last_login_date =", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotEqualTo(Date value) {
            addCriterion("last_login_date <>", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThan(Date value) {
            addCriterion("last_login_date >", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_date >=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThan(Date value) {
            addCriterion("last_login_date <", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThanOrEqualTo(Date value) {
            addCriterion("last_login_date <=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIn(List<Date> values) {
            addCriterion("last_login_date in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotIn(List<Date> values) {
            addCriterion("last_login_date not in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateBetween(Date value1, Date value2) {
            addCriterion("last_login_date between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotBetween(Date value1, Date value2) {
            addCriterion("last_login_date not between", value1, value2, "lastLoginDate");
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

        public Criteria andTwiceCheckEnabledIsNull() {
            addCriterion("twice_check_enabled is null");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckEnabledIsNotNull() {
            addCriterion("twice_check_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckEnabledEqualTo(Boolean value) {
            addCriterion("twice_check_enabled =", value, "twiceCheckEnabled");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckEnabledNotEqualTo(Boolean value) {
            addCriterion("twice_check_enabled <>", value, "twiceCheckEnabled");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckEnabledGreaterThan(Boolean value) {
            addCriterion("twice_check_enabled >", value, "twiceCheckEnabled");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("twice_check_enabled >=", value, "twiceCheckEnabled");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckEnabledLessThan(Boolean value) {
            addCriterion("twice_check_enabled <", value, "twiceCheckEnabled");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("twice_check_enabled <=", value, "twiceCheckEnabled");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckEnabledIn(List<Boolean> values) {
            addCriterion("twice_check_enabled in", values, "twiceCheckEnabled");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckEnabledNotIn(List<Boolean> values) {
            addCriterion("twice_check_enabled not in", values, "twiceCheckEnabled");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("twice_check_enabled between", value1, value2, "twiceCheckEnabled");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("twice_check_enabled not between", value1, value2, "twiceCheckEnabled");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckTypeIsNull() {
            addCriterion("twice_check_type is null");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckTypeIsNotNull() {
            addCriterion("twice_check_type is not null");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckTypeEqualTo(Integer value) {
            addCriterion("twice_check_type =", value, "twiceCheckType");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckTypeNotEqualTo(Integer value) {
            addCriterion("twice_check_type <>", value, "twiceCheckType");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckTypeGreaterThan(Integer value) {
            addCriterion("twice_check_type >", value, "twiceCheckType");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("twice_check_type >=", value, "twiceCheckType");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckTypeLessThan(Integer value) {
            addCriterion("twice_check_type <", value, "twiceCheckType");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckTypeLessThanOrEqualTo(Integer value) {
            addCriterion("twice_check_type <=", value, "twiceCheckType");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckTypeIn(List<Integer> values) {
            addCriterion("twice_check_type in", values, "twiceCheckType");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckTypeNotIn(List<Integer> values) {
            addCriterion("twice_check_type not in", values, "twiceCheckType");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckTypeBetween(Integer value1, Integer value2) {
            addCriterion("twice_check_type between", value1, value2, "twiceCheckType");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("twice_check_type not between", value1, value2, "twiceCheckType");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckCodeIsNull() {
            addCriterion("twice_check_code is null");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckCodeIsNotNull() {
            addCriterion("twice_check_code is not null");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckCodeEqualTo(String value) {
            addCriterion("twice_check_code =", value, "twiceCheckCode");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckCodeNotEqualTo(String value) {
            addCriterion("twice_check_code <>", value, "twiceCheckCode");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckCodeGreaterThan(String value) {
            addCriterion("twice_check_code >", value, "twiceCheckCode");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckCodeGreaterThanOrEqualTo(String value) {
            addCriterion("twice_check_code >=", value, "twiceCheckCode");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckCodeLessThan(String value) {
            addCriterion("twice_check_code <", value, "twiceCheckCode");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckCodeLessThanOrEqualTo(String value) {
            addCriterion("twice_check_code <=", value, "twiceCheckCode");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckCodeLike(String value) {
            addCriterion("twice_check_code like", value, "twiceCheckCode");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckCodeNotLike(String value) {
            addCriterion("twice_check_code not like", value, "twiceCheckCode");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckCodeIn(List<String> values) {
            addCriterion("twice_check_code in", values, "twiceCheckCode");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckCodeNotIn(List<String> values) {
            addCriterion("twice_check_code not in", values, "twiceCheckCode");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckCodeBetween(String value1, String value2) {
            addCriterion("twice_check_code between", value1, value2, "twiceCheckCode");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckCodeNotBetween(String value1, String value2) {
            addCriterion("twice_check_code not between", value1, value2, "twiceCheckCode");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckLabelIsNull() {
            addCriterion("twice_check_label is null");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckLabelIsNotNull() {
            addCriterion("twice_check_label is not null");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckLabelEqualTo(String value) {
            addCriterion("twice_check_label =", value, "twiceCheckLabel");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckLabelNotEqualTo(String value) {
            addCriterion("twice_check_label <>", value, "twiceCheckLabel");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckLabelGreaterThan(String value) {
            addCriterion("twice_check_label >", value, "twiceCheckLabel");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckLabelGreaterThanOrEqualTo(String value) {
            addCriterion("twice_check_label >=", value, "twiceCheckLabel");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckLabelLessThan(String value) {
            addCriterion("twice_check_label <", value, "twiceCheckLabel");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckLabelLessThanOrEqualTo(String value) {
            addCriterion("twice_check_label <=", value, "twiceCheckLabel");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckLabelLike(String value) {
            addCriterion("twice_check_label like", value, "twiceCheckLabel");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckLabelNotLike(String value) {
            addCriterion("twice_check_label not like", value, "twiceCheckLabel");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckLabelIn(List<String> values) {
            addCriterion("twice_check_label in", values, "twiceCheckLabel");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckLabelNotIn(List<String> values) {
            addCriterion("twice_check_label not in", values, "twiceCheckLabel");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckLabelBetween(String value1, String value2) {
            addCriterion("twice_check_label between", value1, value2, "twiceCheckLabel");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckLabelNotBetween(String value1, String value2) {
            addCriterion("twice_check_label not between", value1, value2, "twiceCheckLabel");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckExpireTimeIsNull() {
            addCriterion("twice_check_expire_time is null");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckExpireTimeIsNotNull() {
            addCriterion("twice_check_expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckExpireTimeEqualTo(Date value) {
            addCriterion("twice_check_expire_time =", value, "twiceCheckExpireTime");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckExpireTimeNotEqualTo(Date value) {
            addCriterion("twice_check_expire_time <>", value, "twiceCheckExpireTime");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckExpireTimeGreaterThan(Date value) {
            addCriterion("twice_check_expire_time >", value, "twiceCheckExpireTime");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("twice_check_expire_time >=", value, "twiceCheckExpireTime");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckExpireTimeLessThan(Date value) {
            addCriterion("twice_check_expire_time <", value, "twiceCheckExpireTime");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("twice_check_expire_time <=", value, "twiceCheckExpireTime");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckExpireTimeIn(List<Date> values) {
            addCriterion("twice_check_expire_time in", values, "twiceCheckExpireTime");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckExpireTimeNotIn(List<Date> values) {
            addCriterion("twice_check_expire_time not in", values, "twiceCheckExpireTime");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckExpireTimeBetween(Date value1, Date value2) {
            addCriterion("twice_check_expire_time between", value1, value2, "twiceCheckExpireTime");
            return (Criteria) this;
        }

        public Criteria andTwiceCheckExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("twice_check_expire_time not between", value1, value2, "twiceCheckExpireTime");
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