package com.psdcd.caaircraftservice.model;

import java.util.ArrayList;
import java.util.List;

public class AdmiinfoTblExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdmiinfoTblExample() {
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

    protected abstract static class GeneratedCriteria {
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

        public Criteria andAdmiIdIsNull() {
            addCriterion("admi_id is null");
            return (Criteria) this;
        }

        public Criteria andAdmiIdIsNotNull() {
            addCriterion("admi_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdmiIdEqualTo(Integer value) {
            addCriterion("admi_id =", value, "admiId");
            return (Criteria) this;
        }

        public Criteria andAdmiIdNotEqualTo(Integer value) {
            addCriterion("admi_id <>", value, "admiId");
            return (Criteria) this;
        }

        public Criteria andAdmiIdGreaterThan(Integer value) {
            addCriterion("admi_id >", value, "admiId");
            return (Criteria) this;
        }

        public Criteria andAdmiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admi_id >=", value, "admiId");
            return (Criteria) this;
        }

        public Criteria andAdmiIdLessThan(Integer value) {
            addCriterion("admi_id <", value, "admiId");
            return (Criteria) this;
        }

        public Criteria andAdmiIdLessThanOrEqualTo(Integer value) {
            addCriterion("admi_id <=", value, "admiId");
            return (Criteria) this;
        }

        public Criteria andAdmiIdIn(List<Integer> values) {
            addCriterion("admi_id in", values, "admiId");
            return (Criteria) this;
        }

        public Criteria andAdmiIdNotIn(List<Integer> values) {
            addCriterion("admi_id not in", values, "admiId");
            return (Criteria) this;
        }

        public Criteria andAdmiIdBetween(Integer value1, Integer value2) {
            addCriterion("admi_id between", value1, value2, "admiId");
            return (Criteria) this;
        }

        public Criteria andAdmiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admi_id not between", value1, value2, "admiId");
            return (Criteria) this;
        }

        public Criteria andAdmirNameIsNull() {
            addCriterion("admir_name is null");
            return (Criteria) this;
        }

        public Criteria andAdmirNameIsNotNull() {
            addCriterion("admir_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdmirNameEqualTo(String value) {
            addCriterion("admir_name =", value, "admirName");
            return (Criteria) this;
        }

        public Criteria andAdmirNameNotEqualTo(String value) {
            addCriterion("admir_name <>", value, "admirName");
            return (Criteria) this;
        }

        public Criteria andAdmirNameGreaterThan(String value) {
            addCriterion("admir_name >", value, "admirName");
            return (Criteria) this;
        }

        public Criteria andAdmirNameGreaterThanOrEqualTo(String value) {
            addCriterion("admir_name >=", value, "admirName");
            return (Criteria) this;
        }

        public Criteria andAdmirNameLessThan(String value) {
            addCriterion("admir_name <", value, "admirName");
            return (Criteria) this;
        }

        public Criteria andAdmirNameLessThanOrEqualTo(String value) {
            addCriterion("admir_name <=", value, "admirName");
            return (Criteria) this;
        }

        public Criteria andAdmirNameLike(String value) {
            addCriterion("admir_name like", value, "admirName");
            return (Criteria) this;
        }

        public Criteria andAdmirNameNotLike(String value) {
            addCriterion("admir_name not like", value, "admirName");
            return (Criteria) this;
        }

        public Criteria andAdmirNameIn(List<String> values) {
            addCriterion("admir_name in", values, "admirName");
            return (Criteria) this;
        }

        public Criteria andAdmirNameNotIn(List<String> values) {
            addCriterion("admir_name not in", values, "admirName");
            return (Criteria) this;
        }

        public Criteria andAdmirNameBetween(String value1, String value2) {
            addCriterion("admir_name between", value1, value2, "admirName");
            return (Criteria) this;
        }

        public Criteria andAdmirNameNotBetween(String value1, String value2) {
            addCriterion("admir_name not between", value1, value2, "admirName");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNull() {
            addCriterion("pass_word is null");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNotNull() {
            addCriterion("pass_word is not null");
            return (Criteria) this;
        }

        public Criteria andPassWordEqualTo(String value) {
            addCriterion("pass_word =", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotEqualTo(String value) {
            addCriterion("pass_word <>", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThan(String value) {
            addCriterion("pass_word >", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThanOrEqualTo(String value) {
            addCriterion("pass_word >=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThan(String value) {
            addCriterion("pass_word <", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThanOrEqualTo(String value) {
            addCriterion("pass_word <=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLike(String value) {
            addCriterion("pass_word like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotLike(String value) {
            addCriterion("pass_word not like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordIn(List<String> values) {
            addCriterion("pass_word in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotIn(List<String> values) {
            addCriterion("pass_word not in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordBetween(String value1, String value2) {
            addCriterion("pass_word between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotBetween(String value1, String value2) {
            addCriterion("pass_word not between", value1, value2, "passWord");
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