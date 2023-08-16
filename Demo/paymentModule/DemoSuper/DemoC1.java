package DemoSuper;

public class DemoC1 extends DemoP1 {

	
	String color="black";  
	
	
	
	void printColor(){  
		System.out.println(color);//prints color of Dog class  
		System.out.println(super.color);//prints color of Animal class  
		}  
	
	public static void main(String[] args) {
		DemoC1 dc = new DemoC1();
		dc.printColor();
	}
}
