public class EmpWageBuilder{
	public static void main(String [] args) {
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;

		int empHours = 0;
		int employeeWage = 0;

		double empCheck = Math.floor(Math.random() * 10) % 2;

		if(empCheck==IS_FULL_TIME){
			System.out.println("Employee is Present");
			empHours=8;
		}
		else{
			System.out.println("Employee is Absent");
			empHours=0;
		}

		employeeWage = empHours * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage is : "+ employeeWage);
	}
}
