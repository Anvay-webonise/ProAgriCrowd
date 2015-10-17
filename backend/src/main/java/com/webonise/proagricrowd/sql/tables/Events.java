/**
 * This class is generated by jOOQ
 */
package com.webonise.proagricrowd.sql.tables;

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
public class Events extends org.jooq.impl.TableImpl<com.webonise.proagricrowd.sql.tables.records.EventsRecord> {

	private static final long serialVersionUID = -1625451251;

	/**
	 * The reference instance of <code>proagricrowd.EVENTS</code>
	 */
	public static final com.webonise.proagricrowd.sql.tables.Events EVENTS = new com.webonise.proagricrowd.sql.tables.Events();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.webonise.proagricrowd.sql.tables.records.EventsRecord> getRecordType() {
		return com.webonise.proagricrowd.sql.tables.records.EventsRecord.class;
	}

	/**
	 * The column <code>proagricrowd.EVENTS.EVENT_ID</code>.
	 */
	public final org.jooq.TableField<com.webonise.proagricrowd.sql.tables.records.EventsRecord, java.lang.Integer> EVENT_ID = createField("EVENT_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>proagricrowd.EVENTS.EVENT_TITLE</code>.
	 */
	public final org.jooq.TableField<com.webonise.proagricrowd.sql.tables.records.EventsRecord, java.lang.String> EVENT_TITLE = createField("EVENT_TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>proagricrowd.EVENTS.EVENT_DESC</code>.
	 */
	public final org.jooq.TableField<com.webonise.proagricrowd.sql.tables.records.EventsRecord, java.lang.String> EVENT_DESC = createField("EVENT_DESC", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>proagricrowd.EVENTS.EVENT_LOCATION</code>.
	 */
	public final org.jooq.TableField<com.webonise.proagricrowd.sql.tables.records.EventsRecord, java.lang.String> EVENT_LOCATION = createField("EVENT_LOCATION", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>proagricrowd.EVENTS.EVENT_USR_ID</code>.
	 */
	public final org.jooq.TableField<com.webonise.proagricrowd.sql.tables.records.EventsRecord, java.lang.Integer> EVENT_USR_ID = createField("EVENT_USR_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>proagricrowd.EVENTS.EVENT_ORGANISER</code>.
	 */
	public final org.jooq.TableField<com.webonise.proagricrowd.sql.tables.records.EventsRecord, java.lang.Integer> EVENT_ORGANISER = createField("EVENT_ORGANISER", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>proagricrowd.EVENTS.EVENT_EXPERT</code>.
	 */
	public final org.jooq.TableField<com.webonise.proagricrowd.sql.tables.records.EventsRecord, java.lang.String> EVENT_EXPERT = createField("EVENT_EXPERT", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>proagricrowd.EVENTS.EVENT_ESTIMATED_COST</code>.
	 */
	public final org.jooq.TableField<com.webonise.proagricrowd.sql.tables.records.EventsRecord, java.lang.Integer> EVENT_ESTIMATED_COST = createField("EVENT_ESTIMATED_COST", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>proagricrowd.EVENTS.EVENT_FUNDS</code>.
	 */
	public final org.jooq.TableField<com.webonise.proagricrowd.sql.tables.records.EventsRecord, java.lang.Integer> EVENT_FUNDS = createField("EVENT_FUNDS", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>proagricrowd.EVENTS.EVENT_DATE</code>.
	 */
	public final org.jooq.TableField<com.webonise.proagricrowd.sql.tables.records.EventsRecord, java.sql.Timestamp> EVENT_DATE = createField("EVENT_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>proagricrowd.EVENTS.EVENT_ISCOMPLETE</code>.
	 */
	public final org.jooq.TableField<com.webonise.proagricrowd.sql.tables.records.EventsRecord, java.lang.Boolean> EVENT_ISCOMPLETE = createField("EVENT_ISCOMPLETE", org.jooq.impl.SQLDataType.BIT, this, "");

	/**
	 * The column <code>proagricrowd.EVENTS.EVENT_COMPLETION_DATE</code>.
	 */
	public final org.jooq.TableField<com.webonise.proagricrowd.sql.tables.records.EventsRecord, java.sql.Timestamp> EVENT_COMPLETION_DATE = createField("EVENT_COMPLETION_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>proagricrowd.EVENTS.EVENT_CREATION_DATE</code>.
	 */
	public final org.jooq.TableField<com.webonise.proagricrowd.sql.tables.records.EventsRecord, java.sql.Timestamp> EVENT_CREATION_DATE = createField("EVENT_CREATION_DATE", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>proagricrowd.EVENTS</code> table reference
	 */
	public Events() {
		this("EVENTS", null);
	}

	/**
	 * Create an aliased <code>proagricrowd.EVENTS</code> table reference
	 */
	public Events(java.lang.String alias) {
		this(alias, com.webonise.proagricrowd.sql.tables.Events.EVENTS);
	}

	private Events(java.lang.String alias, org.jooq.Table<com.webonise.proagricrowd.sql.tables.records.EventsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Events(java.lang.String alias, org.jooq.Table<com.webonise.proagricrowd.sql.tables.records.EventsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.webonise.proagricrowd.sql.Proagricrowd.PROAGRICROWD, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.webonise.proagricrowd.sql.tables.records.EventsRecord, java.lang.Integer> getIdentity() {
		return com.webonise.proagricrowd.sql.Keys.IDENTITY_EVENTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.webonise.proagricrowd.sql.tables.records.EventsRecord> getPrimaryKey() {
		return com.webonise.proagricrowd.sql.Keys.KEY_EVENTS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.webonise.proagricrowd.sql.tables.records.EventsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.webonise.proagricrowd.sql.tables.records.EventsRecord>>asList(com.webonise.proagricrowd.sql.Keys.KEY_EVENTS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.webonise.proagricrowd.sql.tables.records.EventsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.webonise.proagricrowd.sql.tables.records.EventsRecord, ?>>asList(com.webonise.proagricrowd.sql.Keys.FK_USER_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.webonise.proagricrowd.sql.tables.Events as(java.lang.String alias) {
		return new com.webonise.proagricrowd.sql.tables.Events(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.webonise.proagricrowd.sql.tables.Events rename(java.lang.String name) {
		return new com.webonise.proagricrowd.sql.tables.Events(name, null);
	}
}
