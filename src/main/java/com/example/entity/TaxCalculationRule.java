package com.example.entity;
// Generated Dec 19, 2015 11:20:12 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TaxCalculationRule generated by hbm2java
 */
@Entity
@Table(name = "tax_calculation_rule", catalog = "lovefashion")
public class TaxCalculationRule implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer taxCalculationRuleId;
	private String code;
	private int priority;
	private Set<TaxCalculation> taxCalculations = new HashSet<TaxCalculation>(0);

	public TaxCalculationRule() {
	}

	public TaxCalculationRule(String code, int priority) {
		this.code = code;
		this.priority = priority;
	}

	public TaxCalculationRule(String code, int priority, Set<TaxCalculation> taxCalculations) {
		this.code = code;
		this.priority = priority;
		this.taxCalculations = taxCalculations;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "tax_calculation_rule_id", unique = true, nullable = false)
	public Integer getTaxCalculationRuleId() {
		return this.taxCalculationRuleId;
	}

	public void setTaxCalculationRuleId(Integer taxCalculationRuleId) {
		this.taxCalculationRuleId = taxCalculationRuleId;
	}

	@Column(name = "code", nullable = false)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "priority", nullable = false)
	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "taxCalculationRule")
	public Set<TaxCalculation> getTaxCalculations() {
		return this.taxCalculations;
	}

	public void setTaxCalculations(Set<TaxCalculation> taxCalculations) {
		this.taxCalculations = taxCalculations;
	}

}
