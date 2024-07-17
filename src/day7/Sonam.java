package day7;
class StudentFee {
    // value for final var can be assigned at the time of delc or using constructor
    private final int minFee=50;
    private final int minage=5;
    public StudentFee() {
    //this.minFee = 2000;
    }
    public int getMinage() {
        return minage;
    }
    public StudentFee(int num) { 
    //   this.minFee = num;
    }
    public int getMinFee() {
        return minFee;
    }
}

class School extends StudentFee{
    private int studentAge;
    
    public School(int studentAge) {
        this.studentAge = studentAge;
    }
    public double calculateFee() {
        double fee=0.0;
        if(studentAge>=this.getMinage()) {
            if(studentAge>=5 && studentAge<10 ) {
                fee=this.getMinFee()+ 4000;
            }else {
                fee=this.getMinFee()+ 6600;
            }
        }
        return fee;
    }
}

public class Sonam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentFee d=new StudentFee();
        School s=new School(3);
        System.out.println(s.calculateFee());
        School s1=new School(5);
        System.out.println("****************");
        System.out.println(s1.calculateFee());
    

	}

}
