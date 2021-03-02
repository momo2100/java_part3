package ctf.java.part3;

public class Day10 {
	public static void main(String[] args) {
	//1.
	Employee emp1 = new Employee("Ayee", "Nomoto", 12000);
	CEO emp2 = new CEO("Bunma", "NaDee", 12000000);
	//2. create class Programmer
	Programmer pgm1 = new Programmer("Pat","Tot",56000);
	//3.
	System.out.println(pgm1.getSalary()); 
	
	//4. Constructor Overloading
	Programmer pgm2 = new Programmer("Deva","Nato");
	System.out.println(pgm2.getSalary()); 
	}
}
