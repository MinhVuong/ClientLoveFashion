package com.example.entity;
// Generated Dec 19, 2015 11:20:12 PM by Hibernate Tools 4.3.1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * CatalogProductEntityDatetime generated by hbm2java
 */
@Entity
@Table(name = "catalog_product_entity_datetime", catalog = "lovefashion", uniqueConstraints = @UniqueConstraint(columnNames = {
		"entity_id", "attribute_id" }) )
public class CatalogProductEntityDatetime implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer valueId;
	private CatalogProductEntity catalogProductEntity;
	private EavAttribute eavAttribute;
	private Date value;

	public CatalogProductEntityDatetime() {
	}

	public CatalogProductEntityDatetime(CatalogProductEntity catalogProductEntity, EavAttribute eavAttribute) {
		this.catalogProductEntity = catalogProductEntity;
		this.eavAttribute = eavAttribute;
	}

	public CatalogProductEntityDatetime(CatalogProductEntity catalogProductEntity, EavAttribute eavAttribute,
			Date value) {
		this.catalogProductEntity = catalogProductEntity;
		this.eavAttribute = eavAttribute;
		this.value = value;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "value_id", unique = true, nullable = false)
	public Integer getValueId() {
		return this.valueId;
	}

	public void setValueId(Integer valueId) {
		this.valueId = valueId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "entity_id", nullable = false)
	public CatalogProductEntity getCatalogProductEntity() {
		return this.catalogProductEntity;
	}

	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
		this.catalogProductEntity = catalogProductEntity;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "attribute_id", nullable = false)
	public EavAttribute getEavAttribute() {
		return this.eavAttribute;
	}

	public void setEavAttribute(EavAttribute eavAttribute) {
		this.eavAttribute = eavAttribute;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "value", length = 19)
	public Date getValue() {
		return this.value;
	}

	public void setValue(Date value) {
		this.value = value;
	}

}
