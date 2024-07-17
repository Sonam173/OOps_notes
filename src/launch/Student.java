package launch;

public class Student {
	 private int rollNum;
	    private String name;
	    private String branch;
	    private long contactNum;
	    public Student(int rollNum, String name, String branch, long contactNum) {
	        this.rollNum = rollNum;
	        this.name = name;
	        this.branch = branch;
	        this.contactNum = contactNum;
	    }
	    @Override
	    public String toString() {
	        return "Student (rollNum= " + this.rollNum + ", Name= " + this.name + ", Branch= " + this.branch
	                + ", Contact Number= " + this.contactNum + ")";
	    }
	    @Override
	    public boolean equals(Object object) {
	        Student student = (Student) object; // stud2 object
	        if (this.rollNum == student.rollNum) { // this.rollNum indicates rollNum of stud1
	            if (this.name.equals(student.name)) { // this.name indicates the name of stud1
	                return true;
	            }
	        }
	        return false;
	    }
	    @Override
	    public int hashCode() {
	        int number = 1;
	        number += (this.name.hashCode()); // number=number+this.name.hashCode()
	        return number;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud1 = new Student(1, "Mark", "CSE", 987654L);
        System.out.println(stud1.toString()); // retirevs the textual info about the class
        String str1 = "John";
        String str2 = "John";
        String str3 = new String("John");
        String str4 = new String("John");
        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str3.equals(str4)); // true
        Student stud2 = new Student(1, "Mark", "CSE", 987654L);
        System.out.println("***************************************");
        if (stud1.equals(stud2)) {
            System.out.println("Both Students are same");
        } else {
            System.out.println("Both students are different");
        }
        System.out.println();
        System.out.println("Student 1= " + stud1.hashCode()); // previous hashCode value=1651191114
        System.out.println("Student 2= " + stud2.hashCode());

} 
}


