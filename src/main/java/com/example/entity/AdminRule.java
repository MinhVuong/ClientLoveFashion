package com.example.entity;
// Generated Dec 19, 2015 11:20:12 PM by Hibernate Tools 4.3.1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AdminRule generated by hbm2java
 */
@Entity
@Table(name = "admin_rule", catalog = "lovefashion")
public class AdminRule implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer ruleId;
	private AdminRole adminRole;
	private String resourceId;
	private String privileges;
	private String permission;

	public AdminRule() {
	}

	public AdminRule(AdminRole adminRole, String resourceId) {
		this.adminRole = adminRole;
		this.resourceId = resourceId;
	}

	public AdminRule(AdminRole adminRole, String resourceId, String privileges, String permission) {
		this.adminRole = adminRole;
		this.resourceId = resourceId;
		this.privileges = privileges;
		this.permission = permission;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "rule_id", unique = true, nullable = false)
	public Integer getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Integer ruleId) {
		this.ruleId = ruleId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", nullable = false)
	public AdminRole getAdminRole() {
		return this.adminRole;
	}

	public void setAdminRole(AdminRole adminRole) {
		this.adminRole = adminRole;
	}

	@Column(name = "resource_id", nullable = false)
	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	@Column(name = "privileges", length = 20)
	public String getPrivileges() {
		return this.privileges;
	}

	public void setPrivileges(String privileges) {
		this.privileges = privileges;
	}

	@Column(name = "permission", length = 10)
	public String getPermission() {
		return this.permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

}
