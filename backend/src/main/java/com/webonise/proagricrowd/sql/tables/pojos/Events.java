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
public class Events implements java.io.Serializable {

	private static final long serialVersionUID = -798119931;

	private java.lang.Integer  eventId;
	private java.lang.String   eventTitle;
	private java.lang.String   eventDesc;
	private java.lang.String   eventLocation;
	private java.lang.Integer  eventUsrId;
	private java.lang.Integer  eventOrganiser;
	private java.lang.String   eventExpert;
	private java.lang.Integer  eventEstimatedCost;
	private java.lang.Integer  eventFunds;
	private java.sql.Timestamp eventDate;
	private java.lang.Boolean  eventIscomplete;
	private java.sql.Timestamp eventCompletionDate;
	private java.sql.Timestamp eventCreationDate;

	public Events() {}

	public Events(
		java.lang.Integer  eventId,
		java.lang.String   eventTitle,
		java.lang.String   eventDesc,
		java.lang.String   eventLocation,
		java.lang.Integer  eventUsrId,
		java.lang.Integer  eventOrganiser,
		java.lang.String   eventExpert,
		java.lang.Integer  eventEstimatedCost,
		java.lang.Integer  eventFunds,
		java.sql.Timestamp eventDate,
		java.lang.Boolean  eventIscomplete,
		java.sql.Timestamp eventCompletionDate,
		java.sql.Timestamp eventCreationDate
	) {
		this.eventId = eventId;
		this.eventTitle = eventTitle;
		this.eventDesc = eventDesc;
		this.eventLocation = eventLocation;
		this.eventUsrId = eventUsrId;
		this.eventOrganiser = eventOrganiser;
		this.eventExpert = eventExpert;
		this.eventEstimatedCost = eventEstimatedCost;
		this.eventFunds = eventFunds;
		this.eventDate = eventDate;
		this.eventIscomplete = eventIscomplete;
		this.eventCompletionDate = eventCompletionDate;
		this.eventCreationDate = eventCreationDate;
	}

	public java.lang.Integer getEventId() {
		return this.eventId;
	}

	public void setEventId(java.lang.Integer eventId) {
		this.eventId = eventId;
	}

	public java.lang.String getEventTitle() {
		return this.eventTitle;
	}

	public void setEventTitle(java.lang.String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public java.lang.String getEventDesc() {
		return this.eventDesc;
	}

	public void setEventDesc(java.lang.String eventDesc) {
		this.eventDesc = eventDesc;
	}

	public java.lang.String getEventLocation() {
		return this.eventLocation;
	}

	public void setEventLocation(java.lang.String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public java.lang.Integer getEventUsrId() {
		return this.eventUsrId;
	}

	public void setEventUsrId(java.lang.Integer eventUsrId) {
		this.eventUsrId = eventUsrId;
	}

	public java.lang.Integer getEventOrganiser() {
		return this.eventOrganiser;
	}

	public void setEventOrganiser(java.lang.Integer eventOrganiser) {
		this.eventOrganiser = eventOrganiser;
	}

	public java.lang.String getEventExpert() {
		return this.eventExpert;
	}

	public void setEventExpert(java.lang.String eventExpert) {
		this.eventExpert = eventExpert;
	}

	public java.lang.Integer getEventEstimatedCost() {
		return this.eventEstimatedCost;
	}

	public void setEventEstimatedCost(java.lang.Integer eventEstimatedCost) {
		this.eventEstimatedCost = eventEstimatedCost;
	}

	public java.lang.Integer getEventFunds() {
		return this.eventFunds;
	}

	public void setEventFunds(java.lang.Integer eventFunds) {
		this.eventFunds = eventFunds;
	}

	public java.sql.Timestamp getEventDate() {
		return this.eventDate;
	}

	public void setEventDate(java.sql.Timestamp eventDate) {
		this.eventDate = eventDate;
	}

	public java.lang.Boolean getEventIscomplete() {
		return this.eventIscomplete;
	}

	public void setEventIscomplete(java.lang.Boolean eventIscomplete) {
		this.eventIscomplete = eventIscomplete;
	}

	public java.sql.Timestamp getEventCompletionDate() {
		return this.eventCompletionDate;
	}

	public void setEventCompletionDate(java.sql.Timestamp eventCompletionDate) {
		this.eventCompletionDate = eventCompletionDate;
	}

	public java.sql.Timestamp getEventCreationDate() {
		return this.eventCreationDate;
	}

	public void setEventCreationDate(java.sql.Timestamp eventCreationDate) {
		this.eventCreationDate = eventCreationDate;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Events other = (Events) obj;
		if (eventId == null) {
			if (other.eventId != null)
				return false;
		}
		else if (!eventId.equals(other.eventId))
			return false;
		if (eventTitle == null) {
			if (other.eventTitle != null)
				return false;
		}
		else if (!eventTitle.equals(other.eventTitle))
			return false;
		if (eventDesc == null) {
			if (other.eventDesc != null)
				return false;
		}
		else if (!eventDesc.equals(other.eventDesc))
			return false;
		if (eventLocation == null) {
			if (other.eventLocation != null)
				return false;
		}
		else if (!eventLocation.equals(other.eventLocation))
			return false;
		if (eventUsrId == null) {
			if (other.eventUsrId != null)
				return false;
		}
		else if (!eventUsrId.equals(other.eventUsrId))
			return false;
		if (eventOrganiser == null) {
			if (other.eventOrganiser != null)
				return false;
		}
		else if (!eventOrganiser.equals(other.eventOrganiser))
			return false;
		if (eventExpert == null) {
			if (other.eventExpert != null)
				return false;
		}
		else if (!eventExpert.equals(other.eventExpert))
			return false;
		if (eventEstimatedCost == null) {
			if (other.eventEstimatedCost != null)
				return false;
		}
		else if (!eventEstimatedCost.equals(other.eventEstimatedCost))
			return false;
		if (eventFunds == null) {
			if (other.eventFunds != null)
				return false;
		}
		else if (!eventFunds.equals(other.eventFunds))
			return false;
		if (eventDate == null) {
			if (other.eventDate != null)
				return false;
		}
		else if (!eventDate.equals(other.eventDate))
			return false;
		if (eventIscomplete == null) {
			if (other.eventIscomplete != null)
				return false;
		}
		else if (!eventIscomplete.equals(other.eventIscomplete))
			return false;
		if (eventCompletionDate == null) {
			if (other.eventCompletionDate != null)
				return false;
		}
		else if (!eventCompletionDate.equals(other.eventCompletionDate))
			return false;
		if (eventCreationDate == null) {
			if (other.eventCreationDate != null)
				return false;
		}
		else if (!eventCreationDate.equals(other.eventCreationDate))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result + ((eventTitle == null) ? 0 : eventTitle.hashCode());
		result = prime * result + ((eventDesc == null) ? 0 : eventDesc.hashCode());
		result = prime * result + ((eventLocation == null) ? 0 : eventLocation.hashCode());
		result = prime * result + ((eventUsrId == null) ? 0 : eventUsrId.hashCode());
		result = prime * result + ((eventOrganiser == null) ? 0 : eventOrganiser.hashCode());
		result = prime * result + ((eventExpert == null) ? 0 : eventExpert.hashCode());
		result = prime * result + ((eventEstimatedCost == null) ? 0 : eventEstimatedCost.hashCode());
		result = prime * result + ((eventFunds == null) ? 0 : eventFunds.hashCode());
		result = prime * result + ((eventDate == null) ? 0 : eventDate.hashCode());
		result = prime * result + ((eventIscomplete == null) ? 0 : eventIscomplete.hashCode());
		result = prime * result + ((eventCompletionDate == null) ? 0 : eventCompletionDate.hashCode());
		result = prime * result + ((eventCreationDate == null) ? 0 : eventCreationDate.hashCode());
		return result;
	}
}
