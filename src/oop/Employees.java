package oop;

public class Employees {
	int id;
	int salary;
	static String dep;

	public void show() {
		System.out.println(id + " : " + salary + " : " + dep );
	}

	public void randomMethod() {
		int a = 2;
		int b = 3;
		System.out.println("c=" + a + b);
	}

	public static void main(String[] args) {
		Employees erik = new Employees();
		erik.id = 1;
		erik.salary = 3000;
		erik.dep = "it";

		Employees navin = new Employees();
		navin.id = 2;
		navin.salary = 4000;
		navin.dep = "it";

		Employees.dep = "dev";

		erik.show();
		navin.show();
	}

}
