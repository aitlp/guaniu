package com.aitlp.poet.data;

import java.util.ArrayList;
import java.util.List;

public class PoetExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table poet
     *
     * @mbg.generated Wed Aug 21 22:20:36 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table poet
     *
     * @mbg.generated Wed Aug 21 22:20:36 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table poet
     *
     * @mbg.generated Wed Aug 21 22:20:36 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poet
     *
     * @mbg.generated Wed Aug 21 22:20:36 CST 2019
     */
    public PoetExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poet
     *
     * @mbg.generated Wed Aug 21 22:20:36 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poet
     *
     * @mbg.generated Wed Aug 21 22:20:36 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poet
     *
     * @mbg.generated Wed Aug 21 22:20:36 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poet
     *
     * @mbg.generated Wed Aug 21 22:20:36 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poet
     *
     * @mbg.generated Wed Aug 21 22:20:36 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poet
     *
     * @mbg.generated Wed Aug 21 22:20:36 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poet
     *
     * @mbg.generated Wed Aug 21 22:20:36 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poet
     *
     * @mbg.generated Wed Aug 21 22:20:36 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poet
     *
     * @mbg.generated Wed Aug 21 22:20:36 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poet
     *
     * @mbg.generated Wed Aug 21 22:20:36 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table poet
     *
     * @mbg.generated Wed Aug 21 22:20:36 CST 2019
     */
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIsNull() {
            addCriterion("AUTHOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIsNotNull() {
            addCriterion("AUTHOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameEqualTo(String value) {
            addCriterion("AUTHOR_NAME =", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotEqualTo(String value) {
            addCriterion("AUTHOR_NAME <>", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThan(String value) {
            addCriterion("AUTHOR_NAME >", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHOR_NAME >=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThan(String value) {
            addCriterion("AUTHOR_NAME <", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThanOrEqualTo(String value) {
            addCriterion("AUTHOR_NAME <=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLike(String value) {
            addCriterion("AUTHOR_NAME like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotLike(String value) {
            addCriterion("AUTHOR_NAME not like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIn(List<String> values) {
            addCriterion("AUTHOR_NAME in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotIn(List<String> values) {
            addCriterion("AUTHOR_NAME not in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameBetween(String value1, String value2) {
            addCriterion("AUTHOR_NAME between", value1, value2, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotBetween(String value1, String value2) {
            addCriterion("AUTHOR_NAME not between", value1, value2, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNull() {
            addCriterion("AUTHOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("AUTHOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(String value) {
            addCriterion("AUTHOR_ID =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(String value) {
            addCriterion("AUTHOR_ID <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(String value) {
            addCriterion("AUTHOR_ID >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHOR_ID >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(String value) {
            addCriterion("AUTHOR_ID <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(String value) {
            addCriterion("AUTHOR_ID <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLike(String value) {
            addCriterion("AUTHOR_ID like", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotLike(String value) {
            addCriterion("AUTHOR_ID not like", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<String> values) {
            addCriterion("AUTHOR_ID in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<String> values) {
            addCriterion("AUTHOR_ID not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(String value1, String value2) {
            addCriterion("AUTHOR_ID between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(String value1, String value2) {
            addCriterion("AUTHOR_ID not between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDynastyIsNull() {
            addCriterion("DYNASTY is null");
            return (Criteria) this;
        }

        public Criteria andDynastyIsNotNull() {
            addCriterion("DYNASTY is not null");
            return (Criteria) this;
        }

        public Criteria andDynastyEqualTo(String value) {
            addCriterion("DYNASTY =", value, "dynasty");
            return (Criteria) this;
        }

        public Criteria andDynastyNotEqualTo(String value) {
            addCriterion("DYNASTY <>", value, "dynasty");
            return (Criteria) this;
        }

        public Criteria andDynastyGreaterThan(String value) {
            addCriterion("DYNASTY >", value, "dynasty");
            return (Criteria) this;
        }

        public Criteria andDynastyGreaterThanOrEqualTo(String value) {
            addCriterion("DYNASTY >=", value, "dynasty");
            return (Criteria) this;
        }

        public Criteria andDynastyLessThan(String value) {
            addCriterion("DYNASTY <", value, "dynasty");
            return (Criteria) this;
        }

        public Criteria andDynastyLessThanOrEqualTo(String value) {
            addCriterion("DYNASTY <=", value, "dynasty");
            return (Criteria) this;
        }

        public Criteria andDynastyLike(String value) {
            addCriterion("DYNASTY like", value, "dynasty");
            return (Criteria) this;
        }

        public Criteria andDynastyNotLike(String value) {
            addCriterion("DYNASTY not like", value, "dynasty");
            return (Criteria) this;
        }

        public Criteria andDynastyIn(List<String> values) {
            addCriterion("DYNASTY in", values, "dynasty");
            return (Criteria) this;
        }

        public Criteria andDynastyNotIn(List<String> values) {
            addCriterion("DYNASTY not in", values, "dynasty");
            return (Criteria) this;
        }

        public Criteria andDynastyBetween(String value1, String value2) {
            addCriterion("DYNASTY between", value1, value2, "dynasty");
            return (Criteria) this;
        }

        public Criteria andDynastyNotBetween(String value1, String value2) {
            addCriterion("DYNASTY not between", value1, value2, "dynasty");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table poet
     *
     * @mbg.generated do_not_delete_during_merge Wed Aug 21 22:20:36 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table poet
     *
     * @mbg.generated Wed Aug 21 22:20:36 CST 2019
     */
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