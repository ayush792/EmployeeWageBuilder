public class EmpWageBuilder{
	public static final int IS_FULL_TIME = 2;		//made final for constants
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int IS_PART_TIME = 1;

	public static int calculate_empWage() {

		int employeeWage = 0;
		int workingDays =20;
		int empWorkingDay =1;
		int totalEmployeeWage=0;
		int maxHourInMonth = 100;
		int totalEmpHours=0;

		while(totalEmpHours < maxHourInMonth && empWorkingDay <= workingDays) {
			int empHours=0;
			empWorkingDay++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch(empCheck) {
				case IS_FULL_TIME :
					empHours =8;
					break;
				case IS_PART_TIME :
					empHours = 4;
					break;
				default:
					empHours = 0;
			}

			employeeWage = empHours * EMP_RATE_PER_HOUR;
			totalEmployeeWage = totalEmployeeWage + employeeWage;
			System.out.println("Employee Wage is :"+employeeWage);
		}
		System.out.println("Total monthly Employee Wage is : "+ totalEmployeeWage);
		return totalEmployeeWage;
	}

	public static void main(String [] args) {
		calculate_empWage();
	}

}
