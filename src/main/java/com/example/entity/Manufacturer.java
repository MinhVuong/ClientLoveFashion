package com.example.entity;
// Generated Dec 23, 2015 9:57:00 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Manufacturer generated by hbm2java
 */
@Entity
@Table(name = "manufacturer", catalog = "lovefashion")
public class Manufacturer implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer entityId;
	private String manufacturerValue;
	private String metaDescription;
	private String urlKey;
	private String urlPath;
	private Date createdAt;

	public Manufacturer() {
	}

	public Manufacturer(String manufacturerValue, String metaDescription, String urlKey, String urlPath,
			Date createdAt) {
		this.manufacturerValue = manufacturerValue;
		this.metaDescription = metaDescription;
		this.urlKey = urlKey;
		this.urlPath = urlPath;
		this.createdAt = createdAt;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "entity_id", unique = true, nullable = false)
	public Integer getEntityId() {
		return this.entityId;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	@Column(name = "manufacturer_value")
	public String getManufacturerValue() {
		return this.manufacturerValue;
	}

	public void setManufacturerValue(String manufacturerValue) {
		this.manufacturerValue = manufacturerValue;
	}

	@Column(name = "meta_description")
	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	@Column(name = "url_key")
	public String getUrlKey() {
		return this.urlKey;
	}

	public void setUrlKey(String urlKey) {
		this.urlKey = urlKey;
	}

	@Column(name = "url_path")
	public String getUrlPath() {
		return this.urlPath;
	}

	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", length = 19)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
