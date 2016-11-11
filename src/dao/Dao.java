package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Department;
import entity.Role;

/**
 * @author k570
 * 
 *
 */
public class Dao {
	
	//获取部门的集合
	public List<Department> getDepartment(){
		List<Department> dList = new ArrayList<Department>();
		dList.add( new Department(1001,"劳务部"));
		dList.add( new Department(1002,"技术部"));
		dList.add( new Department(1003,"研发部"));
		dList.add( new Department(1004,"资源部"));
		dList.add( new Department(1005,"市场部"));
		
		
		return dList;
	}
	
	//以获取角色的集合
	public List<Role> getRole(){
		List<Role> rList = new ArrayList<Role>();
		rList.add(new Role(2001,"技术人员"));
		rList.add(new Role(2002,"营销人员"));
		rList.add(new Role(2003,"管理人员"));
		rList.add(new Role(2004,"XX人员"));
		rList.add(new Role(2005,"YY人员"));
		
		return rList;
	}
}
