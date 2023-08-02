package org.tnsf.SuperDemo;
class Student
{
	int empId;
	String Name;
	static String companyName="TNSIF";
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Student.companyName = companyName;
	}
	void display()
	{
		System.out.println("emp ID:"+this.getEmpId()+" "+"emp Name:"+this.getName()+" "+"company Name:"+this.getCompanyName());
	}
	
}

public class StaticKey {

	public static void main(String[] args) {
    Student s=new Student();
    s.setEmpId(1);
    s.setName("snehal");
    s.display();
	}

}
