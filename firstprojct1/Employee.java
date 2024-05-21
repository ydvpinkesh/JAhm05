package firstprojct1;

public class Employee {
	int emp_id;
	String Emp_name;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	
	@Override
	public String toString() {
		return "Empdata [emp_id=" + emp_id + ", Emp_name=" + Emp_name + "]";
	}
	

}
