package org.irods.jargon.core.pub.domain;

import java.util.Date;

import org.irods.jargon.core.protovalues.AuditActionEnum;

/**
 * Represents an entry in the iRODS audit system, reflecting an event within the
 * grid.
 * 
 * @author Mike Conway - DICE (www.irods.org)
 * 
 */
public class AuditedAction extends IRODSDomainObject {

	private int objectId = 0;
	private String domainObjectUniqueName = "";
	private int userId = 0;
	private String userName = "";
	private String comment = "";
	private AuditActionEnum auditActionEnum;
	private Date createdAt = new Date();
	private Date updatedAt = new Date();

	/**
	 * @return the objectId
	 */
	public int getObjectId() {
		return objectId;
	}

	/**
	 * @param objectId
	 *            the objectId to set
	 */
	public void setObjectId(final int objectId) {
		this.objectId = objectId;
	}

	/**
	 * @return the domainObjectUniqueName
	 */
	public String getDomainObjectUniqueName() {
		return domainObjectUniqueName;
	}

	/**
	 * @param domainObjectUniqueName
	 *            the domainObjectUniqueName to set
	 */
	public void setDomainObjectUniqueName(final String domainObjectUniqueName) {
		this.domainObjectUniqueName = domainObjectUniqueName;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(final int userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(final String userName) {
		this.userName = userName;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment
	 *            the comment to set
	 */
	public void setComment(final String comment) {
		this.comment = comment;
	}

	/**
	 * @return the auditActionEnum
	 */
	public AuditActionEnum getAuditActionEnum() {
		return auditActionEnum;
	}

	/**
	 * @param auditActionEnum
	 *            the auditActionEnum to set
	 */
	public void setAuditActionEnum(final AuditActionEnum auditActionEnum) {
		this.auditActionEnum = auditActionEnum;
	}

	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt
	 *            the createdAt to set
	 */
	public void setCreatedAt(final Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the updatedAt
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * @param updatedAt
	 *            the updatedAt to set
	 */
	public void setUpdatedAt(final Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}