package com.lcp.model;

import java.io.Serializable;

public class Role implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	/**
	 * 角色ID, 使用序列seq_u_pub_role
	 */
	private Long roleId;
	
	
	/**
	 * 角色名称
	 */
	private String roleName;
	
	
	/**
	 * 当前状态(1,激活，0：禁用)
	 */
	private Boolean roleStatus;
	
	
	/**
	 * 创建的时间
	 */
	private String roleCreateTime;
	
	
	/**
	 * 角色信息
	 */
	private String remark;
	
	/**
	 * 即一个角色对应多个系统
	 */
//	private List<SystemInfo> systemList;
	
	/**
	 * 添加用户  选中的角色id
	 */
	private String roleIds;
	
	/**
	 * 添加用户  选中的角色name
	 */
	private String roleNames;
	
	/**
	 * 分页查询开始条数
	 */
	private int start;
	
	/**
	 * 分页查询数目
	 */
	private int limit;
	
	

	public int getStart() {
		return start;
	}


	public void setStart(int start) {
		this.start = start;
	}


	public Long getRoleId() {
		return roleId;
	}


	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public Boolean getRoleStatus() {
		return roleStatus;
	}


	public void setRoleStatus(Boolean roleStatus) {
		this.roleStatus = roleStatus;
	}


	public String getRoleCreateTime() {
		return roleCreateTime;
	}


	public void setRoleCreateTime(String roleCreateTime) {
		this.roleCreateTime = roleCreateTime;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


//	public List<SystemInfo> getSystemList() {
//		return systemList;
//	}
//
//
//	public void setSystemList(List<SystemInfo> systemList) {
//		this.systemList = systemList;
//	}

	public String getRoleIds() {
		return roleIds;
	}


	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}


	public String getRoleNames() {
		return roleNames;
	}


	public void setRoleNames(String roleNames) {
		this.roleNames = roleNames;
	}


	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName
				+ ", roleStatus=" + roleStatus + ", roleCreateTime="
				+ roleCreateTime + ", remark=" + remark + ", systemList="
				 + ", roleIds=" + roleIds + ", roleNames="
				+ roleNames + "]";
	}


	public int getLimit() {
		return limit;
	}


	public void setLimit(int limit) {
		this.limit = limit;
	}

}
