package mybatis.ad.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdHostExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public AdHostExample() {
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

        public Criteria andBackupDirIsNull() {
            addCriterion("backup_dir is null");
            return (Criteria) this;
        }

        public Criteria andBackupDirIsNotNull() {
            addCriterion("backup_dir is not null");
            return (Criteria) this;
        }

        public Criteria andBackupDirEqualTo(String value) {
            addCriterion("backup_dir =", value, "backupDir");
            return (Criteria) this;
        }

        public Criteria andBackupDirNotEqualTo(String value) {
            addCriterion("backup_dir <>", value, "backupDir");
            return (Criteria) this;
        }

        public Criteria andBackupDirGreaterThan(String value) {
            addCriterion("backup_dir >", value, "backupDir");
            return (Criteria) this;
        }

        public Criteria andBackupDirGreaterThanOrEqualTo(String value) {
            addCriterion("backup_dir >=", value, "backupDir");
            return (Criteria) this;
        }

        public Criteria andBackupDirLessThan(String value) {
            addCriterion("backup_dir <", value, "backupDir");
            return (Criteria) this;
        }

        public Criteria andBackupDirLessThanOrEqualTo(String value) {
            addCriterion("backup_dir <=", value, "backupDir");
            return (Criteria) this;
        }

        public Criteria andBackupDirLike(String value) {
            addCriterion("backup_dir like", value, "backupDir");
            return (Criteria) this;
        }

        public Criteria andBackupDirNotLike(String value) {
            addCriterion("backup_dir not like", value, "backupDir");
            return (Criteria) this;
        }

        public Criteria andBackupDirIn(List<String> values) {
            addCriterion("backup_dir in", values, "backupDir");
            return (Criteria) this;
        }

        public Criteria andBackupDirNotIn(List<String> values) {
            addCriterion("backup_dir not in", values, "backupDir");
            return (Criteria) this;
        }

        public Criteria andBackupDirBetween(String value1, String value2) {
            addCriterion("backup_dir between", value1, value2, "backupDir");
            return (Criteria) this;
        }

        public Criteria andBackupDirNotBetween(String value1, String value2) {
            addCriterion("backup_dir not between", value1, value2, "backupDir");
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

        public Criteria andHostNameIsNull() {
            addCriterion("host_name is null");
            return (Criteria) this;
        }

        public Criteria andHostNameIsNotNull() {
            addCriterion("host_name is not null");
            return (Criteria) this;
        }

        public Criteria andHostNameEqualTo(String value) {
            addCriterion("host_name =", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotEqualTo(String value) {
            addCriterion("host_name <>", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThan(String value) {
            addCriterion("host_name >", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThanOrEqualTo(String value) {
            addCriterion("host_name >=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThan(String value) {
            addCriterion("host_name <", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThanOrEqualTo(String value) {
            addCriterion("host_name <=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLike(String value) {
            addCriterion("host_name like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotLike(String value) {
            addCriterion("host_name not like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameIn(List<String> values) {
            addCriterion("host_name in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotIn(List<String> values) {
            addCriterion("host_name not in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameBetween(String value1, String value2) {
            addCriterion("host_name between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotBetween(String value1, String value2) {
            addCriterion("host_name not between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andOsTypeIsNull() {
            addCriterion("os_type is null");
            return (Criteria) this;
        }

        public Criteria andOsTypeIsNotNull() {
            addCriterion("os_type is not null");
            return (Criteria) this;
        }

        public Criteria andOsTypeEqualTo(Integer value) {
            addCriterion("os_type =", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeNotEqualTo(Integer value) {
            addCriterion("os_type <>", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeGreaterThan(Integer value) {
            addCriterion("os_type >", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("os_type >=", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeLessThan(Integer value) {
            addCriterion("os_type <", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("os_type <=", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeIn(List<Integer> values) {
            addCriterion("os_type in", values, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeNotIn(List<Integer> values) {
            addCriterion("os_type not in", values, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeBetween(Integer value1, Integer value2) {
            addCriterion("os_type between", value1, value2, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("os_type not between", value1, value2, "osType");
            return (Criteria) this;
        }

        public Criteria andProtectedDirIsNull() {
            addCriterion("protected_dir is null");
            return (Criteria) this;
        }

        public Criteria andProtectedDirIsNotNull() {
            addCriterion("protected_dir is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedDirEqualTo(String value) {
            addCriterion("protected_dir =", value, "protectedDir");
            return (Criteria) this;
        }

        public Criteria andProtectedDirNotEqualTo(String value) {
            addCriterion("protected_dir <>", value, "protectedDir");
            return (Criteria) this;
        }

        public Criteria andProtectedDirGreaterThan(String value) {
            addCriterion("protected_dir >", value, "protectedDir");
            return (Criteria) this;
        }

        public Criteria andProtectedDirGreaterThanOrEqualTo(String value) {
            addCriterion("protected_dir >=", value, "protectedDir");
            return (Criteria) this;
        }

        public Criteria andProtectedDirLessThan(String value) {
            addCriterion("protected_dir <", value, "protectedDir");
            return (Criteria) this;
        }

        public Criteria andProtectedDirLessThanOrEqualTo(String value) {
            addCriterion("protected_dir <=", value, "protectedDir");
            return (Criteria) this;
        }

        public Criteria andProtectedDirLike(String value) {
            addCriterion("protected_dir like", value, "protectedDir");
            return (Criteria) this;
        }

        public Criteria andProtectedDirNotLike(String value) {
            addCriterion("protected_dir not like", value, "protectedDir");
            return (Criteria) this;
        }

        public Criteria andProtectedDirIn(List<String> values) {
            addCriterion("protected_dir in", values, "protectedDir");
            return (Criteria) this;
        }

        public Criteria andProtectedDirNotIn(List<String> values) {
            addCriterion("protected_dir not in", values, "protectedDir");
            return (Criteria) this;
        }

        public Criteria andProtectedDirBetween(String value1, String value2) {
            addCriterion("protected_dir between", value1, value2, "protectedDir");
            return (Criteria) this;
        }

        public Criteria andProtectedDirNotBetween(String value1, String value2) {
            addCriterion("protected_dir not between", value1, value2, "protectedDir");
            return (Criteria) this;
        }

        public Criteria andSshUsernameIsNull() {
            addCriterion("ssh_username is null");
            return (Criteria) this;
        }

        public Criteria andSshUsernameIsNotNull() {
            addCriterion("ssh_username is not null");
            return (Criteria) this;
        }

        public Criteria andSshUsernameEqualTo(String value) {
            addCriterion("ssh_username =", value, "sshUsername");
            return (Criteria) this;
        }

        public Criteria andSshUsernameNotEqualTo(String value) {
            addCriterion("ssh_username <>", value, "sshUsername");
            return (Criteria) this;
        }

        public Criteria andSshUsernameGreaterThan(String value) {
            addCriterion("ssh_username >", value, "sshUsername");
            return (Criteria) this;
        }

        public Criteria andSshUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("ssh_username >=", value, "sshUsername");
            return (Criteria) this;
        }

        public Criteria andSshUsernameLessThan(String value) {
            addCriterion("ssh_username <", value, "sshUsername");
            return (Criteria) this;
        }

        public Criteria andSshUsernameLessThanOrEqualTo(String value) {
            addCriterion("ssh_username <=", value, "sshUsername");
            return (Criteria) this;
        }

        public Criteria andSshUsernameLike(String value) {
            addCriterion("ssh_username like", value, "sshUsername");
            return (Criteria) this;
        }

        public Criteria andSshUsernameNotLike(String value) {
            addCriterion("ssh_username not like", value, "sshUsername");
            return (Criteria) this;
        }

        public Criteria andSshUsernameIn(List<String> values) {
            addCriterion("ssh_username in", values, "sshUsername");
            return (Criteria) this;
        }

        public Criteria andSshUsernameNotIn(List<String> values) {
            addCriterion("ssh_username not in", values, "sshUsername");
            return (Criteria) this;
        }

        public Criteria andSshUsernameBetween(String value1, String value2) {
            addCriterion("ssh_username between", value1, value2, "sshUsername");
            return (Criteria) this;
        }

        public Criteria andSshUsernameNotBetween(String value1, String value2) {
            addCriterion("ssh_username not between", value1, value2, "sshUsername");
            return (Criteria) this;
        }

        public Criteria andSshPasswordIsNull() {
            addCriterion("ssh_password is null");
            return (Criteria) this;
        }

        public Criteria andSshPasswordIsNotNull() {
            addCriterion("ssh_password is not null");
            return (Criteria) this;
        }

        public Criteria andSshPasswordEqualTo(String value) {
            addCriterion("ssh_password =", value, "sshPassword");
            return (Criteria) this;
        }

        public Criteria andSshPasswordNotEqualTo(String value) {
            addCriterion("ssh_password <>", value, "sshPassword");
            return (Criteria) this;
        }

        public Criteria andSshPasswordGreaterThan(String value) {
            addCriterion("ssh_password >", value, "sshPassword");
            return (Criteria) this;
        }

        public Criteria andSshPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ssh_password >=", value, "sshPassword");
            return (Criteria) this;
        }

        public Criteria andSshPasswordLessThan(String value) {
            addCriterion("ssh_password <", value, "sshPassword");
            return (Criteria) this;
        }

        public Criteria andSshPasswordLessThanOrEqualTo(String value) {
            addCriterion("ssh_password <=", value, "sshPassword");
            return (Criteria) this;
        }

        public Criteria andSshPasswordLike(String value) {
            addCriterion("ssh_password like", value, "sshPassword");
            return (Criteria) this;
        }

        public Criteria andSshPasswordNotLike(String value) {
            addCriterion("ssh_password not like", value, "sshPassword");
            return (Criteria) this;
        }

        public Criteria andSshPasswordIn(List<String> values) {
            addCriterion("ssh_password in", values, "sshPassword");
            return (Criteria) this;
        }

        public Criteria andSshPasswordNotIn(List<String> values) {
            addCriterion("ssh_password not in", values, "sshPassword");
            return (Criteria) this;
        }

        public Criteria andSshPasswordBetween(String value1, String value2) {
            addCriterion("ssh_password between", value1, value2, "sshPassword");
            return (Criteria) this;
        }

        public Criteria andSshPasswordNotBetween(String value1, String value2) {
            addCriterion("ssh_password not between", value1, value2, "sshPassword");
            return (Criteria) this;
        }

        public Criteria andSshPortIsNull() {
            addCriterion("ssh_port is null");
            return (Criteria) this;
        }

        public Criteria andSshPortIsNotNull() {
            addCriterion("ssh_port is not null");
            return (Criteria) this;
        }

        public Criteria andSshPortEqualTo(String value) {
            addCriterion("ssh_port =", value, "sshPort");
            return (Criteria) this;
        }

        public Criteria andSshPortNotEqualTo(String value) {
            addCriterion("ssh_port <>", value, "sshPort");
            return (Criteria) this;
        }

        public Criteria andSshPortGreaterThan(String value) {
            addCriterion("ssh_port >", value, "sshPort");
            return (Criteria) this;
        }

        public Criteria andSshPortGreaterThanOrEqualTo(String value) {
            addCriterion("ssh_port >=", value, "sshPort");
            return (Criteria) this;
        }

        public Criteria andSshPortLessThan(String value) {
            addCriterion("ssh_port <", value, "sshPort");
            return (Criteria) this;
        }

        public Criteria andSshPortLessThanOrEqualTo(String value) {
            addCriterion("ssh_port <=", value, "sshPort");
            return (Criteria) this;
        }

        public Criteria andSshPortLike(String value) {
            addCriterion("ssh_port like", value, "sshPort");
            return (Criteria) this;
        }

        public Criteria andSshPortNotLike(String value) {
            addCriterion("ssh_port not like", value, "sshPort");
            return (Criteria) this;
        }

        public Criteria andSshPortIn(List<String> values) {
            addCriterion("ssh_port in", values, "sshPort");
            return (Criteria) this;
        }

        public Criteria andSshPortNotIn(List<String> values) {
            addCriterion("ssh_port not in", values, "sshPort");
            return (Criteria) this;
        }

        public Criteria andSshPortBetween(String value1, String value2) {
            addCriterion("ssh_port between", value1, value2, "sshPort");
            return (Criteria) this;
        }

        public Criteria andSshPortNotBetween(String value1, String value2) {
            addCriterion("ssh_port not between", value1, value2, "sshPort");
            return (Criteria) this;
        }

        public Criteria andIdcIdIsNull() {
            addCriterion("idc_id is null");
            return (Criteria) this;
        }

        public Criteria andIdcIdIsNotNull() {
            addCriterion("idc_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdcIdEqualTo(Long value) {
            addCriterion("idc_id =", value, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdNotEqualTo(Long value) {
            addCriterion("idc_id <>", value, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdGreaterThan(Long value) {
            addCriterion("idc_id >", value, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdGreaterThanOrEqualTo(Long value) {
            addCriterion("idc_id >=", value, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdLessThan(Long value) {
            addCriterion("idc_id <", value, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdLessThanOrEqualTo(Long value) {
            addCriterion("idc_id <=", value, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdIn(List<Long> values) {
            addCriterion("idc_id in", values, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdNotIn(List<Long> values) {
            addCriterion("idc_id not in", values, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdBetween(Long value1, Long value2) {
            addCriterion("idc_id between", value1, value2, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdNotBetween(Long value1, Long value2) {
            addCriterion("idc_id not between", value1, value2, "idcId");
            return (Criteria) this;
        }

        public Criteria andHostTagIsNull() {
            addCriterion("host_tag is null");
            return (Criteria) this;
        }

        public Criteria andHostTagIsNotNull() {
            addCriterion("host_tag is not null");
            return (Criteria) this;
        }

        public Criteria andHostTagEqualTo(Long value) {
            addCriterion("host_tag =", value, "hostTag");
            return (Criteria) this;
        }

        public Criteria andHostTagNotEqualTo(Long value) {
            addCriterion("host_tag <>", value, "hostTag");
            return (Criteria) this;
        }

        public Criteria andHostTagGreaterThan(Long value) {
            addCriterion("host_tag >", value, "hostTag");
            return (Criteria) this;
        }

        public Criteria andHostTagGreaterThanOrEqualTo(Long value) {
            addCriterion("host_tag >=", value, "hostTag");
            return (Criteria) this;
        }

        public Criteria andHostTagLessThan(Long value) {
            addCriterion("host_tag <", value, "hostTag");
            return (Criteria) this;
        }

        public Criteria andHostTagLessThanOrEqualTo(Long value) {
            addCriterion("host_tag <=", value, "hostTag");
            return (Criteria) this;
        }

        public Criteria andHostTagIn(List<Long> values) {
            addCriterion("host_tag in", values, "hostTag");
            return (Criteria) this;
        }

        public Criteria andHostTagNotIn(List<Long> values) {
            addCriterion("host_tag not in", values, "hostTag");
            return (Criteria) this;
        }

        public Criteria andHostTagBetween(Long value1, Long value2) {
            addCriterion("host_tag between", value1, value2, "hostTag");
            return (Criteria) this;
        }

        public Criteria andHostTagNotBetween(Long value1, Long value2) {
            addCriterion("host_tag not between", value1, value2, "hostTag");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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