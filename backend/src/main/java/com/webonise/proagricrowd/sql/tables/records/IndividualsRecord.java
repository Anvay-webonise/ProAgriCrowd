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
public class IndividualsRecord extends org.jooq.impl.UpdatableRecordImpl<com.webonise.proagricrowd.sql.tables.records.IndividualsRecord> implements org.jooq.Record14<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = -1473808539;

	/**
	 * Setter for <code>proagricrowd.INDIVIDUALS.IND_ID</code>.
	 */
	public void setIndId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>proagricrowd.INDIVIDUALS.IND_ID</code>.
	 */
	public java.lang.Integer getIndId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>proagricrowd.INDIVIDUALS.IND_FNAME</code>.
	 */
	public void setIndFname(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>proagricrowd.INDIVIDUALS.IND_FNAME</code>.
	 */
	public java.lang.String getIndFname() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>proagricrowd.INDIVIDUALS.IND_MNAME</code>.
	 */
	public void setIndMname(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>proagricrowd.INDIVIDUALS.IND_MNAME</code>.
	 */
	public java.lang.String getIndMname() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>proagricrowd.INDIVIDUALS.IND_LNAME</code>.
	 */
	public void setIndLname(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>proagricrowd.INDIVIDUALS.IND_LNAME</code>.
	 */
	public java.lang.String getIndLname() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>proagricrowd.INDIVIDUALS.IND_EMAIL</code>.
	 */
	public void setIndEmail(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>proagricrowd.INDIVIDUALS.IND_EMAIL</code>.
	 */
	public java.lang.String getIndEmail() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>proagricrowd.INDIVIDUALS.IND_QUALIFICATION</code>.
	 */
	public void setIndQualification(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>proagricrowd.INDIVIDUALS.IND_QUALIFICATION</code>.
	 */
	public java.lang.String getIndQualification() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>proagricrowd.INDIVIDUALS.IND_AREA_OF_EXPERTIES</code>.
	 */
	public void setIndAreaOfExperties(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>proagricrowd.INDIVIDUALS.IND_AREA_OF_EXPERTIES</code>.
	 */
	public java.lang.String getIndAreaOfExperties() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>proagricrowd.INDIVIDUALS.IND_EXPERINCE_YEARS</code>.
	 */
	public void setIndExperinceYears(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>proagricrowd.INDIVIDUALS.IND_EXPERINCE_YEARS</code>.
	 */
	public java.lang.Integer getIndExperinceYears() {
		return (java.lang.Integer) getValue(7);
	}

	/**
	 * Setter for <code>proagricrowd.INDIVIDUALS.IND_ABOUT_EXPERIENCE</code>.
	 */
	public void setIndAboutExperience(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>proagricrowd.INDIVIDUALS.IND_ABOUT_EXPERIENCE</code>.
	 */
	public java.lang.String getIndAboutExperience() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>proagricrowd.INDIVIDUALS.IND_CELLNO</code>.
	 */
	public void setIndCellno(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>proagricrowd.INDIVIDUALS.IND_CELLNO</code>.
	 */
	public java.lang.Integer getIndCellno() {
		return (java.lang.Integer) getValue(9);
	}

	/**
	 * Setter for <code>proagricrowd.INDIVIDUALS.IND_ADDRESS</code>.
	 */
	public void setIndAddress(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>proagricrowd.INDIVIDUALS.IND_ADDRESS</code>.
	 */
	public java.lang.String getIndAddress() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>proagricrowd.INDIVIDUALS.IND_CITY</code>.
	 */
	public void setIndCity(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>proagricrowd.INDIVIDUALS.IND_CITY</code>.
	 */
	public java.lang.String getIndCity() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>proagricrowd.INDIVIDUALS.IND_STATE</code>.
	 */
	public void setIndState(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>proagricrowd.INDIVIDUALS.IND_STATE</code>.
	 */
	public java.lang.String getIndState() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>proagricrowd.INDIVIDUALS.IND_CREATION_DATE</code>.
	 */
	public void setIndCreationDate(java.sql.Timestamp value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>proagricrowd.INDIVIDUALS.IND_CREATION_DATE</code>.
	 */
	public java.sql.Timestamp getIndCreationDate() {
		return (java.sql.Timestamp) getValue(13);
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
	// Record14 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row14<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row14) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row14<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row14) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.webonise.proagricrowd.sql.tables.Individuals.INDIVIDUALS.IND_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.webonise.proagricrowd.sql.tables.Individuals.INDIVIDUALS.IND_FNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.webonise.proagricrowd.sql.tables.Individuals.INDIVIDUALS.IND_MNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.webonise.proagricrowd.sql.tables.Individuals.INDIVIDUALS.IND_LNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.webonise.proagricrowd.sql.tables.Individuals.INDIVIDUALS.IND_EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.webonise.proagricrowd.sql.tables.Individuals.INDIVIDUALS.IND_QUALIFICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.webonise.proagricrowd.sql.tables.Individuals.INDIVIDUALS.IND_AREA_OF_EXPERTIES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return com.webonise.proagricrowd.sql.tables.Individuals.INDIVIDUALS.IND_EXPERINCE_YEARS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return com.webonise.proagricrowd.sql.tables.Individuals.INDIVIDUALS.IND_ABOUT_EXPERIENCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return com.webonise.proagricrowd.sql.tables.Individuals.INDIVIDUALS.IND_CELLNO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return com.webonise.proagricrowd.sql.tables.Individuals.INDIVIDUALS.IND_ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return com.webonise.proagricrowd.sql.tables.Individuals.INDIVIDUALS.IND_CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return com.webonise.proagricrowd.sql.tables.Individuals.INDIVIDUALS.IND_STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field14() {
		return com.webonise.proagricrowd.sql.tables.Individuals.INDIVIDUALS.IND_CREATION_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIndId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getIndFname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getIndMname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getIndLname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getIndEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getIndQualification();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getIndAreaOfExperties();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getIndExperinceYears();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getIndAboutExperience();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getIndCellno();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getIndAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getIndCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getIndState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value14() {
		return getIndCreationDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value1(java.lang.Integer value) {
		setIndId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value2(java.lang.String value) {
		setIndFname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value3(java.lang.String value) {
		setIndMname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value4(java.lang.String value) {
		setIndLname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value5(java.lang.String value) {
		setIndEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value6(java.lang.String value) {
		setIndQualification(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value7(java.lang.String value) {
		setIndAreaOfExperties(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value8(java.lang.Integer value) {
		setIndExperinceYears(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value9(java.lang.String value) {
		setIndAboutExperience(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value10(java.lang.Integer value) {
		setIndCellno(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value11(java.lang.String value) {
		setIndAddress(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value12(java.lang.String value) {
		setIndCity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value13(java.lang.String value) {
		setIndState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord value14(java.sql.Timestamp value) {
		setIndCreationDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IndividualsRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.Integer value8, java.lang.String value9, java.lang.Integer value10, java.lang.String value11, java.lang.String value12, java.lang.String value13, java.sql.Timestamp value14) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IndividualsRecord
	 */
	public IndividualsRecord() {
		super(com.webonise.proagricrowd.sql.tables.Individuals.INDIVIDUALS);
	}

	/**
	 * Create a detached, initialised IndividualsRecord
	 */
	public IndividualsRecord(java.lang.Integer indId, java.lang.String indFname, java.lang.String indMname, java.lang.String indLname, java.lang.String indEmail, java.lang.String indQualification, java.lang.String indAreaOfExperties, java.lang.Integer indExperinceYears, java.lang.String indAboutExperience, java.lang.Integer indCellno, java.lang.String indAddress, java.lang.String indCity, java.lang.String indState, java.sql.Timestamp indCreationDate) {
		super(com.webonise.proagricrowd.sql.tables.Individuals.INDIVIDUALS);

		setValue(0, indId);
		setValue(1, indFname);
		setValue(2, indMname);
		setValue(3, indLname);
		setValue(4, indEmail);
		setValue(5, indQualification);
		setValue(6, indAreaOfExperties);
		setValue(7, indExperinceYears);
		setValue(8, indAboutExperience);
		setValue(9, indCellno);
		setValue(10, indAddress);
		setValue(11, indCity);
		setValue(12, indState);
		setValue(13, indCreationDate);
	}
}
