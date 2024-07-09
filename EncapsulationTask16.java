//	Write a program to demonstrate encapsulation using private variables and public getter/setter methods.
package Java_Exercise;
    

class Employee{
	
	private int id;
	private String name;
	private int age;
	private double salary;

public  Employee(int id,String name,int age,double salary)
{
	super();
	this.id=id;
	this.name=name;
	this.age=age;
	this.salary=salary;
}
	

 public int getId() {
	 return id;
 }
 public void setId(int id) {
	 this.id=id;
	 
	 
 }
 public String getname() {
	 return name;
 }
 public void setName(String name) {
	 this.name=name;
	 
	 
 }
 public int getAge() {
	 return age;
 }
 public void setAge(int age) {
	 this.age=age;
	 
	 
 }
 public double getSalary() {
	 return salary;
 }
 public void setSalary(double salary) {
	 this.salary=salary;
	 
	 
 }
}
public class EncapsulationTask16 {

	public static void main(String[] args) {
		Employee e=new Employee(101,"Ram",30,30000);
		System.out.println("ID:"+ e.getId());
		System.out.println("NAME:"+ e.getname());
		System.out.println("AGE:"+ e.getAge());
		System.out.println("SALARY:"+ e.getSalary());
		
		

	}

}

