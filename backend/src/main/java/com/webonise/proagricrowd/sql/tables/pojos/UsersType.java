/**
 * This class is generated by jOOQ
 */
package com.webonise.proagricrowd.sql.tables.pojos;

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
public class UsersType implements java.io.Serializable {

	private static final long serialVersionUID = -2012342208;

	private java.lang.Integer usrTypId;
	private java.lang.String  usrTypName;
	private java.lang.String  usrTypDesc;

	public UsersType() {}

	public UsersType(
		java.lang.Integer usrTypId,
		java.lang.String  usrTypName,
		java.lang.String  usrTypDesc
	) {
		this.usrTypId = usrTypId;
		this.usrTypName = usrTypName;
		this.usrTypDesc = usrTypDesc;
	}

	public java.lang.Integer getUsrTypId() {
		return this.usrTypId;
	}

	public void setUsrTypId(java.lang.Integer usrTypId) {
		this.usrTypId = usrTypId;
	}

	public java.lang.String getUsrTypName() {
		return this.usrTypName;
	}

	public void setUsrTypName(java.lang.String usrTypName) {
		this.usrTypName = usrTypName;
	}

	public java.lang.String getUsrTypDesc() {
		return this.usrTypDesc;
	}

	public void setUsrTypDesc(java.lang.String usrTypDesc) {
		this.usrTypDesc = usrTypDesc;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final UsersType other = (UsersType) obj;
		if (usrTypId == null) {
			if (other.usrTypId != null)
				return false;
		}
		else if (!usrTypId.equals(other.usrTypId))
			return false;
		if (usrTypName == null) {
			if (other.usrTypName != null)
				return false;
		}
		else if (!usrTypName.equals(other.usrTypName))
			return false;
		if (usrTypDesc == null) {
			if (other.usrTypDesc != null)
				return false;
		}
		else if (!usrTypDesc.equals(other.usrTypDesc))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((usrTypId == null) ? 0 : usrTypId.hashCode());
		result = prime * result + ((usrTypName == null) ? 0 : usrTypName.hashCode());
		result = prime * result + ((usrTypDesc == null) ? 0 : usrTypDesc.hashCode());
		return result;
	}
}
