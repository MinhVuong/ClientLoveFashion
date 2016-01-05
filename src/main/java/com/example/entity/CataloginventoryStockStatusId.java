package com.example.entity;
// Generated Dec 19, 2015 11:20:12 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CataloginventoryStockStatusId generated by hbm2java
 */
@Embeddable
public class CataloginventoryStockStatusId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int productId;
	private short stockId;

	public CataloginventoryStockStatusId() {
	}

	public CataloginventoryStockStatusId(int productId, short stockId) {
		this.productId = productId;
		this.stockId = stockId;
	}

	@Column(name = "product_id", nullable = false)
	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Column(name = "stock_id", nullable = false)
	public short getStockId() {
		return this.stockId;
	}

	public void setStockId(short stockId) {
		this.stockId = stockId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CataloginventoryStockStatusId))
			return false;
		CataloginventoryStockStatusId castOther = (CataloginventoryStockStatusId) other;

		return (this.getProductId() == castOther.getProductId()) && (this.getStockId() == castOther.getStockId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getProductId();
		result = 37 * result + this.getStockId();
		return result;
	}

}