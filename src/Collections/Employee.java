package Collections;

public class Employee {
	
	public int Eid;
	String Ename;

	public Employee(int Eid, String Ename)
	{
		this.Eid=Eid;
		this.Ename=Ename;
	}
	
	public void show()
	{
	System.out.println("Employee id is: "+Eid);
	System.out.println("Employee name is: "+Ename);
	}
	
	public String toString()
	{
		return "Employee Id is: "+Eid+ " and Employee Name is " +Ename;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee str=new Employee(101,"Kiran");
System.out.println(str);
	}

}
