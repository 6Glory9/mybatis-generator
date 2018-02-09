package mybatis.ad.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdOperationLogExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public AdOperationLogExample() {
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

        public Criteria andOperateKeyIsNull() {
            addCriterion("operate_key is null");
            return (Criteria) this;
        }

        public Criteria andOperateKeyIsNotNull() {
            addCriterion("operate_key is not null");
            return (Criteria) this;
        }

        public Criteria andOperateKeyEqualTo(String value) {
            addCriterion("operate_key =", value, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyNotEqualTo(String value) {
            addCriterion("operate_key <>", value, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyGreaterThan(String value) {
            addCriterion("operate_key >", value, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyGreaterThanOrEqualTo(String value) {
            addCriterion("operate_key >=", value, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyLessThan(String value) {
            addCriterion("operate_key <", value, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyLessThanOrEqualTo(String value) {
            addCriterion("operate_key <=", value, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyLike(String value) {
            addCriterion("operate_key like", value, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyNotLike(String value) {
            addCriterion("operate_key not like", value, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyIn(List<String> values) {
            addCriterion("operate_key in", values, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyNotIn(List<String> values) {
            addCriterion("operate_key not in", values, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyBetween(String value1, String value2) {
            addCriterion("operate_key between", value1, value2, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyNotBetween(String value1, String value2) {
            addCriterion("operate_key not between", value1, value2, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateDescIsNull() {
            addCriterion("operate_desc is null");
            return (Criteria) this;
        }

        public Criteria andOperateDescIsNotNull() {
            addCriterion("operate_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOperateDescEqualTo(String value) {
            addCriterion("operate_desc =", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescNotEqualTo(String value) {
            addCriterion("operate_desc <>", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescGreaterThan(String value) {
            addCriterion("operate_desc >", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescGreaterThanOrEqualTo(String value) {
            addCriterion("operate_desc >=", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescLessThan(String value) {
            addCriterion("operate_desc <", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescLessThanOrEqualTo(String value) {
            addCriterion("operate_desc <=", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescLike(String value) {
            addCriterion("operate_desc like", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescNotLike(String value) {
            addCriterion("operate_desc not like", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescIn(List<String> values) {
            addCriterion("operate_desc in", values, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescNotIn(List<String> values) {
            addCriterion("operate_desc not in", values, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescBetween(String value1, String value2) {
            addCriterion("operate_desc between", value1, value2, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescNotBetween(String value1, String value2) {
            addCriterion("operate_desc not between", value1, value2, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNull() {
            addCriterion("operator_name is null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNotNull() {
            addCriterion("operator_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameEqualTo(String value) {
            addCriterion("operator_name =", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotEqualTo(String value) {
            addCriterion("operator_name <>", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThan(String value) {
            addCriterion("operator_name >", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("operator_name >=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThan(String value) {
            addCriterion("operator_name <", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThanOrEqualTo(String value) {
            addCriterion("operator_name <=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLike(String value) {
            addCriterion("operator_name like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotLike(String value) {
            addCriterion("operator_name not like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIn(List<String> values) {
            addCriterion("operator_name in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotIn(List<String> values) {
            addCriterion("operator_name not in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameBetween(String value1, String value2) {
            addCriterion("operator_name between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotBetween(String value1, String value2) {
            addCriterion("operator_name not between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperateIpIsNull() {
            addCriterion("operate_ip is null");
            return (Criteria) this;
        }

        public Criteria andOperateIpIsNotNull() {
            addCriterion("operate_ip is not null");
            return (Criteria) this;
        }

        public Criteria andOperateIpEqualTo(String value) {
            addCriterion("operate_ip =", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpNotEqualTo(String value) {
            addCriterion("operate_ip <>", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpGreaterThan(String value) {
            addCriterion("operate_ip >", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpGreaterThanOrEqualTo(String value) {
            addCriterion("operate_ip >=", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpLessThan(String value) {
            addCriterion("operate_ip <", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpLessThanOrEqualTo(String value) {
            addCriterion("operate_ip <=", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpLike(String value) {
            addCriterion("operate_ip like", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpNotLike(String value) {
            addCriterion("operate_ip not like", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpIn(List<String> values) {
            addCriterion("operate_ip in", values, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpNotIn(List<String> values) {
            addCriterion("operate_ip not in", values, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpBetween(String value1, String value2) {
            addCriterion("operate_ip between", value1, value2, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpNotBetween(String value1, String value2) {
            addCriterion("operate_ip not between", value1, value2, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateSessionIdIsNull() {
            addCriterion("operate_session_id is null");
            return (Criteria) this;
        }

        public Criteria andOperateSessionIdIsNotNull() {
            addCriterion("operate_session_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperateSessionIdEqualTo(String value) {
            addCriterion("operate_session_id =", value, "operateSessionId");
            return (Criteria) this;
        }

        public Criteria andOperateSessionIdNotEqualTo(String value) {
            addCriterion("operate_session_id <>", value, "operateSessionId");
            return (Criteria) this;
        }

        public Criteria andOperateSessionIdGreaterThan(String value) {
            addCriterion("operate_session_id >", value, "operateSessionId");
            return (Criteria) this;
        }

        public Criteria andOperateSessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("operate_session_id >=", value, "operateSessionId");
            return (Criteria) this;
        }

        public Criteria andOperateSessionIdLessThan(String value) {
            addCriterion("operate_session_id <", value, "operateSessionId");
            return (Criteria) this;
        }

        public Criteria andOperateSessionIdLessThanOrEqualTo(String value) {
            addCriterion("operate_session_id <=", value, "operateSessionId");
            return (Criteria) this;
        }

        public Criteria andOperateSessionIdLike(String value) {
            addCriterion("operate_session_id like", value, "operateSessionId");
            return (Criteria) this;
        }

        public Criteria andOperateSessionIdNotLike(String value) {
            addCriterion("operate_session_id not like", value, "operateSessionId");
            return (Criteria) this;
        }

        public Criteria andOperateSessionIdIn(List<String> values) {
            addCriterion("operate_session_id in", values, "operateSessionId");
            return (Criteria) this;
        }

        public Criteria andOperateSessionIdNotIn(List<String> values) {
            addCriterion("operate_session_id not in", values, "operateSessionId");
            return (Criteria) this;
        }

        public Criteria andOperateSessionIdBetween(String value1, String value2) {
            addCriterion("operate_session_id between", value1, value2, "operateSessionId");
            return (Criteria) this;
        }

        public Criteria andOperateSessionIdNotBetween(String value1, String value2) {
            addCriterion("operate_session_id not between", value1, value2, "operateSessionId");
            return (Criteria) this;
        }

        public Criteria andOperateCostIsNull() {
            addCriterion("operate_cost is null");
            return (Criteria) this;
        }

        public Criteria andOperateCostIsNotNull() {
            addCriterion("operate_cost is not null");
            return (Criteria) this;
        }

        public Criteria andOperateCostEqualTo(Long value) {
            addCriterion("operate_cost =", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostNotEqualTo(Long value) {
            addCriterion("operate_cost <>", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostGreaterThan(Long value) {
            addCriterion("operate_cost >", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostGreaterThanOrEqualTo(Long value) {
            addCriterion("operate_cost >=", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostLessThan(Long value) {
            addCriterion("operate_cost <", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostLessThanOrEqualTo(Long value) {
            addCriterion("operate_cost <=", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostIn(List<Long> values) {
            addCriterion("operate_cost in", values, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostNotIn(List<Long> values) {
            addCriterion("operate_cost not in", values, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostBetween(Long value1, Long value2) {
            addCriterion("operate_cost between", value1, value2, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostNotBetween(Long value1, Long value2) {
            addCriterion("operate_cost not between", value1, value2, "operateCost");
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