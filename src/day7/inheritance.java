package day7;
class Employee{  //Base Class
    private int id;
    private String name;
    private double salary;
    private String designation;
    
    public Employee(int id, String name, double salary, String designation) {// parametrized constructor
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }
    
    public void displayDetails() {
        System.out.println("Employee Id: "+this.id);
        System.out.println("Employee name: "+this.name);
        System.out.println("Designation: "+this.designation);
    }    
    
    public void employeeData() {
        System.out.println("Hello I am  employee");
    }
}
class ContractEmployee extends Employee { // Sub class
    private int noOfHrsWorked;
    private int contractDuration;
    private double consolidatedSal;
    public ContractEmployee(int id, String name, double salary, String designation, int noOfHrsWorked,
            int contractDuration) {
        super(id, name, salary, designation);
        this.noOfHrsWorked = noOfHrsWorked;
        this.contractDuration = contractDuration;
    }
    @Override // Annotation
    public void displayDetails() {// child class inherits display method from parent class 
    	//and do some change that's why called it override method
        System.out.println("No of Hrs Worked: " + this.noOfHrsWorked);// this means jo object call krega
                                                                      //uske according noofHrWorked ka value  hoga
        System.out.println("Contract Duration: " + this.contractDuration);
        System.out.println("Consolidated Salary: " + this.noOfHrsWorked * 30);
    }
}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee employee = new Employee(1000, "John", 25000.0, "SSE"); // Parent class Object
	        employee.displayDetails();
	        System.out.println("*************************************\n");
	        ContractEmployee contract = new ContractEmployee(1001, "Alex", 30000.0, "SE", 30, 6);
	        contract.displayDetails(); // It invokes child class method
	        System.out.println("****************************\n");
	        Employee obj = new ContractEmployee(1002, "Liam", 450000.0, "Senior-Associate", 45, 1);
	        // Parent reference with child class object
	        obj.displayDetails();
	        obj.employeeData(); // Cannot be invoked

	}

}
