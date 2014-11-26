package net.javaw.example.model;

import java.util.ArrayList;
import java.util.List;
import net.javaw.example.model.enums.HostType;
import net.javaw.example.model.enums.IcpStatus;
import net.javaw.example.model.enums.OpResult;
import net.javaw.mybatis.generator.Page;

public class DomainHostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public DomainHostExample() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> hostTypeCriteria;

        protected List<Criterion> icpStatusCriteria;

        protected List<Criterion> opStatusCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            hostTypeCriteria = new ArrayList<Criterion>();
            icpStatusCriteria = new ArrayList<Criterion>();
            opStatusCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getHostTypeCriteria() {
            return hostTypeCriteria;
        }

        protected void addHostTypeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            hostTypeCriteria.add(new Criterion(condition, value, "net.javaw.example.model.enums.handler.HostTypeHandler"));
            allCriteria = null;
        }

        protected void addHostTypeCriterion(String condition, HostType value1, HostType value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            hostTypeCriteria.add(new Criterion(condition, value1, value2, "net.javaw.example.model.enums.handler.HostTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getIcpStatusCriteria() {
            return icpStatusCriteria;
        }

        protected void addIcpStatusCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            icpStatusCriteria.add(new Criterion(condition, value, "net.javaw.example.model.enums.handler.IcpStatusTypeHandler"));
            allCriteria = null;
        }

        protected void addIcpStatusCriterion(String condition, IcpStatus value1, IcpStatus value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            icpStatusCriteria.add(new Criterion(condition, value1, value2, "net.javaw.example.model.enums.handler.IcpStatusTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getOpStatusCriteria() {
            return opStatusCriteria;
        }

        protected void addOpStatusCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            opStatusCriteria.add(new Criterion(condition, value, "net.javaw.example.model.enums.handler.OpResultTypeHandler"));
            allCriteria = null;
        }

        protected void addOpStatusCriterion(String condition, OpResult value1, OpResult value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            opStatusCriteria.add(new Criterion(condition, value1, value2, "net.javaw.example.model.enums.handler.OpResultTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || hostTypeCriteria.size() > 0
                || icpStatusCriteria.size() > 0
                || opStatusCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(hostTypeCriteria);
                allCriteria.addAll(icpStatusCriteria);
                allCriteria.addAll(opStatusCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHostTypeIsNull() {
            addCriterion("host_type is null");
            return (Criteria) this;
        }

        public Criteria andHostTypeIsNotNull() {
            addCriterion("host_type is not null");
            return (Criteria) this;
        }

        public Criteria andHostTypeEqualTo(HostType value) {
            addHostTypeCriterion("host_type =", value, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeNotEqualTo(HostType value) {
            addHostTypeCriterion("host_type <>", value, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeGreaterThan(HostType value) {
            addHostTypeCriterion("host_type >", value, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeGreaterThanOrEqualTo(HostType value) {
            addHostTypeCriterion("host_type >=", value, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeLessThan(HostType value) {
            addHostTypeCriterion("host_type <", value, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeLessThanOrEqualTo(HostType value) {
            addHostTypeCriterion("host_type <=", value, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeLike(HostType value) {
            addHostTypeCriterion("host_type like", value, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeNotLike(HostType value) {
            addHostTypeCriterion("host_type not like", value, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeIn(List<HostType> values) {
            addHostTypeCriterion("host_type in", values, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeNotIn(List<HostType> values) {
            addHostTypeCriterion("host_type not in", values, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeBetween(HostType value1, HostType value2) {
            addHostTypeCriterion("host_type between", value1, value2, "hostType");
            return (Criteria) this;
        }

        public Criteria andHostTypeNotBetween(HostType value1, HostType value2) {
            addHostTypeCriterion("host_type not between", value1, value2, "hostType");
            return (Criteria) this;
        }

        public Criteria andIcpStatusIsNull() {
            addCriterion("icp_status is null");
            return (Criteria) this;
        }

        public Criteria andIcpStatusIsNotNull() {
            addCriterion("icp_status is not null");
            return (Criteria) this;
        }

        public Criteria andIcpStatusEqualTo(IcpStatus value) {
            addIcpStatusCriterion("icp_status =", value, "icpStatus");
            return (Criteria) this;
        }

        public Criteria andIcpStatusNotEqualTo(IcpStatus value) {
            addIcpStatusCriterion("icp_status <>", value, "icpStatus");
            return (Criteria) this;
        }

        public Criteria andIcpStatusGreaterThan(IcpStatus value) {
            addIcpStatusCriterion("icp_status >", value, "icpStatus");
            return (Criteria) this;
        }

        public Criteria andIcpStatusGreaterThanOrEqualTo(IcpStatus value) {
            addIcpStatusCriterion("icp_status >=", value, "icpStatus");
            return (Criteria) this;
        }

        public Criteria andIcpStatusLessThan(IcpStatus value) {
            addIcpStatusCriterion("icp_status <", value, "icpStatus");
            return (Criteria) this;
        }

        public Criteria andIcpStatusLessThanOrEqualTo(IcpStatus value) {
            addIcpStatusCriterion("icp_status <=", value, "icpStatus");
            return (Criteria) this;
        }

        public Criteria andIcpStatusIn(List<IcpStatus> values) {
            addIcpStatusCriterion("icp_status in", values, "icpStatus");
            return (Criteria) this;
        }

        public Criteria andIcpStatusNotIn(List<IcpStatus> values) {
            addIcpStatusCriterion("icp_status not in", values, "icpStatus");
            return (Criteria) this;
        }

        public Criteria andIcpStatusBetween(IcpStatus value1, IcpStatus value2) {
            addIcpStatusCriterion("icp_status between", value1, value2, "icpStatus");
            return (Criteria) this;
        }

        public Criteria andIcpStatusNotBetween(IcpStatus value1, IcpStatus value2) {
            addIcpStatusCriterion("icp_status not between", value1, value2, "icpStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusIsNull() {
            addCriterion("op_status is null");
            return (Criteria) this;
        }

        public Criteria andOpStatusIsNotNull() {
            addCriterion("op_status is not null");
            return (Criteria) this;
        }

        public Criteria andOpStatusEqualTo(OpResult value) {
            addOpStatusCriterion("op_status =", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusNotEqualTo(OpResult value) {
            addOpStatusCriterion("op_status <>", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusGreaterThan(OpResult value) {
            addOpStatusCriterion("op_status >", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusGreaterThanOrEqualTo(OpResult value) {
            addOpStatusCriterion("op_status >=", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusLessThan(OpResult value) {
            addOpStatusCriterion("op_status <", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusLessThanOrEqualTo(OpResult value) {
            addOpStatusCriterion("op_status <=", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusLike(OpResult value) {
            addOpStatusCriterion("op_status like", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusNotLike(OpResult value) {
            addOpStatusCriterion("op_status not like", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusIn(List<OpResult> values) {
            addOpStatusCriterion("op_status in", values, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusNotIn(List<OpResult> values) {
            addOpStatusCriterion("op_status not in", values, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusBetween(OpResult value1, OpResult value2) {
            addOpStatusCriterion("op_status between", value1, value2, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusNotBetween(OpResult value1, OpResult value2) {
            addOpStatusCriterion("op_status not between", value1, value2, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOtherfieldIsNull() {
            addCriterion("otherField is null");
            return (Criteria) this;
        }

        public Criteria andOtherfieldIsNotNull() {
            addCriterion("otherField is not null");
            return (Criteria) this;
        }

        public Criteria andOtherfieldEqualTo(String value) {
            addCriterion("otherField =", value, "otherfield");
            return (Criteria) this;
        }

        public Criteria andOtherfieldNotEqualTo(String value) {
            addCriterion("otherField <>", value, "otherfield");
            return (Criteria) this;
        }

        public Criteria andOtherfieldGreaterThan(String value) {
            addCriterion("otherField >", value, "otherfield");
            return (Criteria) this;
        }

        public Criteria andOtherfieldGreaterThanOrEqualTo(String value) {
            addCriterion("otherField >=", value, "otherfield");
            return (Criteria) this;
        }

        public Criteria andOtherfieldLessThan(String value) {
            addCriterion("otherField <", value, "otherfield");
            return (Criteria) this;
        }

        public Criteria andOtherfieldLessThanOrEqualTo(String value) {
            addCriterion("otherField <=", value, "otherfield");
            return (Criteria) this;
        }

        public Criteria andOtherfieldLike(String value) {
            addCriterion("otherField like", value, "otherfield");
            return (Criteria) this;
        }

        public Criteria andOtherfieldNotLike(String value) {
            addCriterion("otherField not like", value, "otherfield");
            return (Criteria) this;
        }

        public Criteria andOtherfieldIn(List<String> values) {
            addCriterion("otherField in", values, "otherfield");
            return (Criteria) this;
        }

        public Criteria andOtherfieldNotIn(List<String> values) {
            addCriterion("otherField not in", values, "otherfield");
            return (Criteria) this;
        }

        public Criteria andOtherfieldBetween(String value1, String value2) {
            addCriterion("otherField between", value1, value2, "otherfield");
            return (Criteria) this;
        }

        public Criteria andOtherfieldNotBetween(String value1, String value2) {
            addCriterion("otherField not between", value1, value2, "otherfield");
            return (Criteria) this;
        }

        public Criteria andTestFieldIsNull() {
            addCriterion("test_field is null");
            return (Criteria) this;
        }

        public Criteria andTestFieldIsNotNull() {
            addCriterion("test_field is not null");
            return (Criteria) this;
        }

        public Criteria andTestFieldEqualTo(String value) {
            addCriterion("test_field =", value, "testField");
            return (Criteria) this;
        }

        public Criteria andTestFieldNotEqualTo(String value) {
            addCriterion("test_field <>", value, "testField");
            return (Criteria) this;
        }

        public Criteria andTestFieldGreaterThan(String value) {
            addCriterion("test_field >", value, "testField");
            return (Criteria) this;
        }

        public Criteria andTestFieldGreaterThanOrEqualTo(String value) {
            addCriterion("test_field >=", value, "testField");
            return (Criteria) this;
        }

        public Criteria andTestFieldLessThan(String value) {
            addCriterion("test_field <", value, "testField");
            return (Criteria) this;
        }

        public Criteria andTestFieldLessThanOrEqualTo(String value) {
            addCriterion("test_field <=", value, "testField");
            return (Criteria) this;
        }

        public Criteria andTestFieldLike(String value) {
            addCriterion("test_field like", value, "testField");
            return (Criteria) this;
        }

        public Criteria andTestFieldNotLike(String value) {
            addCriterion("test_field not like", value, "testField");
            return (Criteria) this;
        }

        public Criteria andTestFieldIn(List<String> values) {
            addCriterion("test_field in", values, "testField");
            return (Criteria) this;
        }

        public Criteria andTestFieldNotIn(List<String> values) {
            addCriterion("test_field not in", values, "testField");
            return (Criteria) this;
        }

        public Criteria andTestFieldBetween(String value1, String value2) {
            addCriterion("test_field between", value1, value2, "testField");
            return (Criteria) this;
        }

        public Criteria andTestFieldNotBetween(String value1, String value2) {
            addCriterion("test_field not between", value1, value2, "testField");
            return (Criteria) this;
        }

        public Criteria andOneFieldIsNull() {
            addCriterion("one_Field is null");
            return (Criteria) this;
        }

        public Criteria andOneFieldIsNotNull() {
            addCriterion("one_Field is not null");
            return (Criteria) this;
        }

        public Criteria andOneFieldEqualTo(String value) {
            addCriterion("one_Field =", value, "oneField");
            return (Criteria) this;
        }

        public Criteria andOneFieldNotEqualTo(String value) {
            addCriterion("one_Field <>", value, "oneField");
            return (Criteria) this;
        }

        public Criteria andOneFieldGreaterThan(String value) {
            addCriterion("one_Field >", value, "oneField");
            return (Criteria) this;
        }

        public Criteria andOneFieldGreaterThanOrEqualTo(String value) {
            addCriterion("one_Field >=", value, "oneField");
            return (Criteria) this;
        }

        public Criteria andOneFieldLessThan(String value) {
            addCriterion("one_Field <", value, "oneField");
            return (Criteria) this;
        }

        public Criteria andOneFieldLessThanOrEqualTo(String value) {
            addCriterion("one_Field <=", value, "oneField");
            return (Criteria) this;
        }

        public Criteria andOneFieldLike(String value) {
            addCriterion("one_Field like", value, "oneField");
            return (Criteria) this;
        }

        public Criteria andOneFieldNotLike(String value) {
            addCriterion("one_Field not like", value, "oneField");
            return (Criteria) this;
        }

        public Criteria andOneFieldIn(List<String> values) {
            addCriterion("one_Field in", values, "oneField");
            return (Criteria) this;
        }

        public Criteria andOneFieldNotIn(List<String> values) {
            addCriterion("one_Field not in", values, "oneField");
            return (Criteria) this;
        }

        public Criteria andOneFieldBetween(String value1, String value2) {
            addCriterion("one_Field between", value1, value2, "oneField");
            return (Criteria) this;
        }

        public Criteria andOneFieldNotBetween(String value1, String value2) {
            addCriterion("one_Field not between", value1, value2, "oneField");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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