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
public class AddressesRecord extends org.jooq.impl.UpdatableRecordImpl<com.webonise.proagricrowd.sql.tables.records.AddressesRecord> implements org.jooq.Record9<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.sql.Timestamp> {

	private static final long serialVersionUID = -1316641232;

	/**
	 * Setter for <code>proagricrowd.ADDRESSES.ADDR_ID</code>.
	 */
	public void setAddrId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>proagricrowd.ADDRESSES.ADDR_ID</code>.
	 */
	public java.lang.Integer getAddrId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>proagricrowd.ADDRESSES.ADDR_LINE1</code>.
	 */
	public void setAddrLine1(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>proagricrowd.ADDRESSES.ADDR_LINE1</code>.
	 */
	public java.lang.String getAddrLine1() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>proagricrowd.ADDRESSES.ADDR_LINE2</code>.
	 */
	public void setAddrLine2(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>proagricrowd.ADDRESSES.ADDR_LINE2</code>.
	 */
	public java.lang.String getAddrLine2() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>proagricrowd.ADDRESSES.ADDR_AREA</code>.
	 */
	public void setAddrArea(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>proagricrowd.ADDRESSES.ADDR_AREA</code>.
	 */
	public java.lang.String getAddrArea() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>proagricrowd.ADDRESSES.ADDR_CITY</code>.
	 */
	public void setAddrCity(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>proagricrowd.ADDRESSES.ADDR_CITY</code>.
	 */
	public java.lang.String getAddrCity() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>proagricrowd.ADDRESSES.ADDR_STATE</code>.
	 */
	public void setAddrState(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>proagricrowd.ADDRESSES.ADDR_STATE</code>.
	 */
	public java.lang.String getAddrState() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>proagricrowd.ADDRESSES.ADDR_COUNTRY</code>.
	 */
	public void setAddrCountry(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>proagricrowd.ADDRESSES.ADDR_COUNTRY</code>.
	 */
	public java.lang.String getAddrCountry() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>proagricrowd.ADDRESSES.ADDR_PINCODE</code>.
	 */
	public void setAddrPincode(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>proagricrowd.ADDRESSES.ADDR_PINCODE</code>.
	 */
	public java.lang.Integer getAddrPincode() {
		return (java.lang.Integer) getValue(7);
	}

	/**
	 * Setter for <code>proagricrowd.ADDRESSES.ADDR_CREATION_DATE</code>.
	 */
	public void setAddrCreationDate(java.sql.Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>proagricrowd.ADDRESSES.ADDR_CREATION_DATE</code>.
	 */
	public java.sql.Timestamp getAddrCreationDate() {
		return (java.sql.Timestamp) getValue(8);
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
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.webonise.proagricrowd.sql.tables.Addresses.ADDRESSES.ADDR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.webonise.proagricrowd.sql.tables.Addresses.ADDRESSES.ADDR_LINE1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.webonise.proagricrowd.sql.tables.Addresses.ADDRESSES.ADDR_LINE2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.webonise.proagricrowd.sql.tables.Addresses.ADDRESSES.ADDR_AREA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.webonise.proagricrowd.sql.tables.Addresses.ADDRESSES.ADDR_CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.webonise.proagricrowd.sql.tables.Addresses.ADDRESSES.ADDR_STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.webonise.proagricrowd.sql.tables.Addresses.ADDRESSES.ADDR_COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return com.webonise.proagricrowd.sql.tables.Addresses.ADDRESSES.ADDR_PINCODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field9() {
		return com.webonise.proagricrowd.sql.tables.Addresses.ADDRESSES.ADDR_CREATION_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getAddrId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getAddrLine1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getAddrLine2();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getAddrArea();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getAddrCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getAddrState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getAddrCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getAddrPincode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value9() {
		return getAddrCreationDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value1(java.lang.Integer value) {
		setAddrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value2(java.lang.String value) {
		setAddrLine1(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value3(java.lang.String value) {
		setAddrLine2(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value4(java.lang.String value) {
		setAddrArea(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value5(java.lang.String value) {
		setAddrCity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value6(java.lang.String value) {
		setAddrState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value7(java.lang.String value) {
		setAddrCountry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value8(java.lang.Integer value) {
		setAddrPincode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord value9(java.sql.Timestamp value) {
		setAddrCreationDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressesRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.Integer value8, java.sql.Timestamp value9) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AddressesRecord
	 */
	public AddressesRecord() {
		super(com.webonise.proagricrowd.sql.tables.Addresses.ADDRESSES);
	}

	/**
	 * Create a detached, initialised AddressesRecord
	 */
	public AddressesRecord(java.lang.Integer addrId, java.lang.String addrLine1, java.lang.String addrLine2, java.lang.String addrArea, java.lang.String addrCity, java.lang.String addrState, java.lang.String addrCountry, java.lang.Integer addrPincode, java.sql.Timestamp addrCreationDate) {
		super(com.webonise.proagricrowd.sql.tables.Addresses.ADDRESSES);

		setValue(0, addrId);
		setValue(1, addrLine1);
		setValue(2, addrLine2);
		setValue(3, addrArea);
		setValue(4, addrCity);
		setValue(5, addrState);
		setValue(6, addrCountry);
		setValue(7, addrPincode);
		setValue(8, addrCreationDate);
	}
}
