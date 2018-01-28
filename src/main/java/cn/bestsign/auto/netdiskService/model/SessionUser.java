package cn.bestsign.auto.netdiskService.model;

import cn.bestsign.admin.vo.NavVO;

import java.util.*;

/**
 * 用户登录信息封装
 * 
 * @author peng.ning
 * 
 */
public class SessionUser {

	private String userId;

	private String userName;

	private String employeeName;

	private String employeeDeptName;

	private SysUserInfo userInfo;

	private HrmEmployee employeeInfo;

	private HrmDepartment departmentInfo;

	private List<NavVO> systems;//个人子系统

	private List<String> permissionsList = new ArrayList<>(); //个人权限

	private HrmPost mainPost;// 所在主岗位

	private List<HrmPost> partPosts = new ArrayList<HrmPost>();// 所有兼职岗位

	private List<Integer> viewdeptIds = new ArrayList<Integer>();// 所能查看的部门主键集合

	private Set<SysRole> roles = new HashSet<SysRole>();// 角色主键集合

	private Map<String, String> paramMap = new HashMap<String, String>();// 系统运行参数

	private List<SysMenuInfo> userModuleMenus;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDeptName() {
		return employeeDeptName;
	}

	public void setEmployeeDeptName(String employeeDeptName) {
		this.employeeDeptName = employeeDeptName;
	}

	public SysUserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(SysUserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public HrmEmployee getEmployeeInfo() {
		return employeeInfo;
	}

	public void setEmployeeInfo(HrmEmployee employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	public HrmDepartment getDepartmentInfo() {
		return departmentInfo;
	}

	public void setDepartmentInfo(HrmDepartment departmentInfo) {
		this.departmentInfo = departmentInfo;
	}

	public Map<String, String> getParamMap() {
		return paramMap;
	}

	public void setParamMap(Map<String, String> paramMap) {
		this.paramMap = paramMap;
	}

	public HrmPost getMainPost() {
		return mainPost;
	}

	public void setMainPost(HrmPost mainPost) {
		this.mainPost = mainPost;
	}

	public List<HrmPost> getPartPosts() {
		return partPosts;
	}

	public void setPartPosts(List<HrmPost> partPosts) {
		this.partPosts = partPosts;
	}

	public List<Integer> getViewdeptIds() {
		return viewdeptIds;
	}

	public void setViewdeptIds(List<Integer> viewdeptIds) {
		this.viewdeptIds = viewdeptIds;
	}

	public Set<SysRole> getRoles() {
		return roles;
	}

	public void setRoles(Set<SysRole> roles) {
		this.roles = roles;
	}

	public List<String> getPermissionsList() {
		return permissionsList;
	}

	public void setPermissionsList(List<String> permissionsList) {
		this.permissionsList = permissionsList;
	}

	public List<NavVO> getSystems() {
		return systems;
	}

	public void setSystems(List<NavVO> systems) {
		this.systems = systems;
	}

	public List<SysMenuInfo> getUserModuleMenus() {
		return userModuleMenus;
	}

	public void setUserModuleMenus(List<SysMenuInfo> userModuleMenus) {
		this.userModuleMenus = userModuleMenus;
	}
}
