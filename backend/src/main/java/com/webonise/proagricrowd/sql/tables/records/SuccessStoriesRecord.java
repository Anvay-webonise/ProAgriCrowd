/**
 * This class is generated by jOOQ
 */
package com.webonise.proagricrowd.sql.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SuccessStoriesRecord extends org.jooq.impl.UpdatableRecordImpl<com.webonise.proagricrowd.sql.tables.records.SuccessStoriesRecord> implements org.jooq.Record7<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.sql.Timestamp> {

	private static final long serialVersionUID = 1354700421;

	/**
	 * Setter for <code>proagricrowd.SUCCESS_STORIES.SS_ID</code>.
	 */
	public void setSsId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>proagricrowd.SUCCESS_STORIES.SS_ID</code>.
	 */
	public java.lang.Integer getSsId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>proagricrowd.SUCCESS_STORIES.SS_EVENT_ID</code>.
	 */
	public void setSsEventId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>proagricrowd.SUCCESS_STORIES.SS_EVENT_ID</code>.
	 */
	public java.lang.Integer getSsEventId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>proagricrowd.SUCCESS_STORIES.SS_DESC</code>.
	 */
	public void setSsDesc(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>proagricrowd.SUCCESS_STORIES.SS_DESC</code>.
	 */
	public java.lang.String getSsDesc() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>proagricrowd.SUCCESS_STORIES.SS_VIDEO_LINK</code>.
	 */
	public void setSsVideoLink(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>proagricrowd.SUCCESS_STORIES.SS_VIDEO_LINK</code>.
	 */
	public java.lang.String getSsVideoLink() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>proagricrowd.SUCCESS_STORIES.SS_POTHOS_LINK</code>.
	 */
	public void setSsPothosLink(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>proagricrowd.SUCCESS_STORIES.SS_POTHOS_LINK</code>.
	 */
	public java.lang.String getSsPothosLink() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>proagricrowd.SUCCESS_STORIES.SS_RATING</code>.
	 */
	public void setSsRating(java.math.BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>proagricrowd.SUCCESS_STORIES.SS_RATING</code>.
	 */
	public java.math.BigDecimal getSsRating() {
		return (java.math.BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>proagricrowd.SUCCESS_STORIES.SS_CREATION_DATE</code>.
	 */
	public void setSsCreationDate(java.sql.Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>proagricrowd.SUCCESS_STORIES.SS_CREATION_DATE</code>.
	 */
	public java.sql.Timestamp getSsCreationDate() {
		return (java.sql.Timestamp) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.webonise.proagricrowd.sql.tables.SuccessStories.SUCCESS_STORIES.SS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return com.webonise.proagricrowd.sql.tables.SuccessStories.SUCCESS_STORIES.SS_EVENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.webonise.proagricrowd.sql.tables.SuccessStories.SUCCESS_STORIES.SS_DESC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.webonise.proagricrowd.sql.tables.SuccessStories.SUCCESS_STORIES.SS_VIDEO_LINK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.webonise.proagricrowd.sql.tables.SuccessStories.SUCCESS_STORIES.SS_POTHOS_LINK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field6() {
		return com.webonise.proagricrowd.sql.tables.SuccessStories.SUCCESS_STORIES.SS_RATING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return com.webonise.proagricrowd.sql.tables.SuccessStories.SUCCESS_STORIES.SS_CREATION_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getSsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getSsEventId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getSsDesc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getSsVideoLink();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getSsPothosLink();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value6() {
		return getSsRating();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value7() {
		return getSsCreationDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuccessStoriesRecord value1(java.lang.Integer value) {
		setSsId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuccessStoriesRecord value2(java.lang.Integer value) {
		setSsEventId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuccessStoriesRecord value3(java.lang.String value) {
		setSsDesc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuccessStoriesRecord value4(java.lang.String value) {
		setSsVideoLink(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuccessStoriesRecord value5(java.lang.String value) {
		setSsPothosLink(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuccessStoriesRecord value6(java.math.BigDecimal value) {
		setSsRating(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuccessStoriesRecord value7(java.sql.Timestamp value) {
		setSsCreationDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuccessStoriesRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.math.BigDecimal value6, java.sql.Timestamp value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SuccessStoriesRecord
	 */
	public SuccessStoriesRecord() {
		super(com.webonise.proagricrowd.sql.tables.SuccessStories.SUCCESS_STORIES);
	}

	/**
	 * Create a detached, initialised SuccessStoriesRecord
	 */
	public SuccessStoriesRecord(java.lang.Integer ssId, java.lang.Integer ssEventId, java.lang.String ssDesc, java.lang.String ssVideoLink, java.lang.String ssPothosLink, java.math.BigDecimal ssRating, java.sql.Timestamp ssCreationDate) {
		super(com.webonise.proagricrowd.sql.tables.SuccessStories.SUCCESS_STORIES);

		setValue(0, ssId);
		setValue(1, ssEventId);
		setValue(2, ssDesc);
		setValue(3, ssVideoLink);
		setValue(4, ssPothosLink);
		setValue(5, ssRating);
		setValue(6, ssCreationDate);
	}
}
