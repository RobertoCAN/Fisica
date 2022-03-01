package hrapp;

public class HRApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(230, "Jerry", 333998);
		Employee e2 = new Employee(420, "Gracie", 3392823);
			
		Departament dept = new Departament("Education");
		System.out.println(e1.j=20);
		
		
		dept.addEmp(e2);
		dept.addEmp(e1);
		dept.addEmp(e2);
		dept.addEmp(e1);
		dept.addEmp(e2);
		dept.addEmp(e1);
		dept.addEmp(e2);
		dept.addEmp(new Employee(772, "jack", 2998));
		
		Employee[] emps = dept.getEmplyees();
		
		for (Employee emp : emps) {
			System.out.println("Emp " + emp);
			
		}
		System.out.println("Total " + dept.getTotalSalary());
		System.out.println("Avg " + dept.getAverageSalary());
		System.out.println("Emp " + dept.getEmployeeByID(230));
	}

}
