package entity;

import java.util.List;

public class Employee {
	private String name;
	private String password;
	private String gender;
	private List<String> dep;
	private List<String> rol;
	private String desc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getDep() {
		return dep;
	}
	public void setDep(List<String> dep) {
		this.dep = dep;
	}
	public List<String> getRol() {
		return rol;
	}
	public void setRol(List<String> rol) {
		this.rol = rol;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", password=" + password + ", gender=" + gender + ", dep=" + dep + ", rol="
				+ rol + ", desc=" + desc + "]";
	}
	
	
}
