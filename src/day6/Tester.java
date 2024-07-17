package day6;
class Desktop {
    public static double basicCost = 15000;// this value is same for all that why make this variable as static
    private String brand;
    private double cost;
    private int RAM;
    public static float discountperc = 2.5f;//3.4f
    public Desktop(String brand, int RAM) {
        this.brand = brand;//HP
        this.RAM=RAM;//16 
        }
    public String getBrand() {
        return brand;
        }
    public static double getBasicCost() {
        return Desktop.basicCost;
    }
    public int getRAM() {
        return RAM;
    }
    }
class Lab {
      private Desktop desktop;
    public Lab(Desktop desktop) {
        this.desktop = desktop;
    }
    public double calculateAmount() {
        double discount=0.0;
        if(desktop.getBrand()=="HP") {
            Desktop.discountperc=3.4f;
        }
        System.out.println("DisPer:"+Desktop.discountperc);
        discount=(float) (Desktop.basicCost*(1-Desktop.discountperc/100));
        return discount;
    }
}
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		        Desktop d=new Desktop("Dell",16);
		        Desktop d1=new Desktop("Sony",16);
		        Desktop d2=new Desktop("HP",8);
		        Lab lab=new Lab(d);
		        Lab lab1=new Lab(d1);
		        Lab lab2=new Lab(d2);
		        System.out.println(lab.calculateAmount());
		        System.out.println(lab1.calculateAmount());
		        System.out.println(lab2.calculateAmount());		 
		        }

	}


