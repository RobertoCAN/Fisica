package hrapp;

public class Departament {

	private String name;
	private Employee[] employess = new Employee[10];
	private int lastAddedEmployeeIndex = -1;

	public Departament(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addEmp(Employee anEmployee) {
		if (lastAddedEmployeeIndex < employess.length) {
			lastAddedEmployeeIndex++;
			employess[lastAddedEmployeeIndex] = anEmployee;
		}
	}

	public Employee[] getEmplyees() {
		Employee[] actualEmployees = new Employee[lastAddedEmployeeIndex + 1];
		for (int j = 0; j < actualEmployees.length; j++) {
			actualEmployees[j] = employess[j];
		}
		return actualEmployees;
	}

	public int getEmployeeCount() {
		return lastAddedEmployeeIndex + 1;
	}

	public Employee getEmployeeByID(int empId) {
		for (Employee emp : employess) {
			if (emp != null) {
				if (emp.getID() == (empId)) {
					return emp;
				}
			}
		}
		return null;
	}

	public double getTotalSalary() {
		double totalSalary = 0.0;
		for (int j = 0; j < lastAddedEmployeeIndex; j++) {
			totalSalary += employess[j].getSalary();
		}
		return totalSalary;
	}

	public double getAverageSalary() {
		if (lastAddedEmployeeIndex > -1) {
			return getTotalSalary() / (lastAddedEmployeeIndex + 1);
		}
		return 0.0;
	}

	public String toString() {
		return name;
	}
}
