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
	
	//��ȡ���ŵļ���
	public List<Department> getDepartment(){
		List<Department> dList = new ArrayList<Department>();
		dList.add( new Department(1001,"����"));
		dList.add( new Department(1002,"������"));
		dList.add( new Department(1003,"�з���"));
		dList.add( new Department(1004,"��Դ��"));
		dList.add( new Department(1005,"�г���"));
		
		
		return dList;
	}
	
	//�Ի�ȡ��ɫ�ļ���
	public List<Role> getRole(){
		List<Role> rList = new ArrayList<Role>();
		rList.add(new Role(2001,"������Ա"));
		rList.add(new Role(2002,"Ӫ����Ա"));
		rList.add(new Role(2003,"������Ա"));
		rList.add(new Role(2004,"XX��Ա"));
		rList.add(new Role(2005,"YY��Ա"));
		
		return rList;
	}
}
