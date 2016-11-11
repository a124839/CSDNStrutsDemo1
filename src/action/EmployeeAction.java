package action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.Dao;
import entity.Employee;

public class EmployeeAction extends ActionSupport implements RequestAware,ModelDriven<Employee>,SessionAware{

	private static final long serialVersionUID = 1L;
	private Map<String, Object> requestMap;
	private Dao dao = new Dao();
	private Employee employee;
	private Map<String, Object> sessionMap;
	
	public String input() {
		requestMap.put("department", dao.getDepartment());
		requestMap.put("role", dao.getRole());
		
		return "input";
	}
	
	public String save() {
		
		System.out.println("save" + this);
		return "save";
	}
	
	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.requestMap = arg0;
		
	}

	@Override
	public Employee getModel() {
		
		return employee;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.sessionMap = arg0;
		
	}
	
	
}
