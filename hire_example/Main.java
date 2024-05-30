/*Create a class named 'Member' having the following members:

Data members

1 - Name

2 - Age

3- Phone number

4 - Address

5 - Salary

It also has a method named 'printSalary' which prints the salary of the members. Two classes 'Employee' and 
'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 
'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an 
employee and a manager by making an object of both of thes
 * 
 */

package hire_example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Employee employee = new Employee("Tom", 25, "555-555-55", "Home", 25631.5, "IT");
	        Manager manager = new Manager("Ron", 30, "555-617-55", "Earth", 69586.5, "IT");
	        employee.printSalary();
	        manager.printSalary();

	}

}
