package com.aitlp.author.data;

public class Author {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column author.ID
     *
     * @mbg.generated Wed Jul 24 21:29:44 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column author.AUTHOR_NAME
     *
     * @mbg.generated Wed Jul 24 21:29:44 CST 2019
     */
    private String authorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column author.AUTHOR_DESC
     *
     * @mbg.generated Wed Jul 24 21:29:44 CST 2019
     */
    private String authorDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column author.AUTHOR_TYPE
     *
     * @mbg.generated Wed Jul 24 21:29:44 CST 2019
     */
    private String authorType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column author.ID
     *
     * @return the value of author.ID
     *
     * @mbg.generated Wed Jul 24 21:29:44 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column author.ID
     *
     * @param id the value for author.ID
     *
     * @mbg.generated Wed Jul 24 21:29:44 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column author.AUTHOR_NAME
     *
     * @return the value of author.AUTHOR_NAME
     *
     * @mbg.generated Wed Jul 24 21:29:44 CST 2019
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column author.AUTHOR_NAME
     *
     * @param authorName the value for author.AUTHOR_NAME
     *
     * @mbg.generated Wed Jul 24 21:29:44 CST 2019
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column author.AUTHOR_DESC
     *
     * @return the value of author.AUTHOR_DESC
     *
     * @mbg.generated Wed Jul 24 21:29:44 CST 2019
     */
    public String getAuthorDesc() {
        return authorDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column author.AUTHOR_DESC
     *
     * @param authorDesc the value for author.AUTHOR_DESC
     *
     * @mbg.generated Wed Jul 24 21:29:44 CST 2019
     */
    public void setAuthorDesc(String authorDesc) {
        this.authorDesc = authorDesc == null ? null : authorDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column author.AUTHOR_TYPE
     *
     * @return the value of author.AUTHOR_TYPE
     *
     * @mbg.generated Wed Jul 24 21:29:44 CST 2019
     */
    public String getAuthorType() {
        return authorType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column author.AUTHOR_TYPE
     *
     * @param authorType the value for author.AUTHOR_TYPE
     *
     * @mbg.generated Wed Jul 24 21:29:44 CST 2019
     */
    public void setAuthorType(String authorType) {
        this.authorType = authorType == null ? null : authorType.trim();
    }
}