    public class Tdd {

    public static void main (String[]args){
	
	Car car = new Car();
	
	
	
	car.door1 = new Door();
	car.door1.name = "fRight";
	
	car.door2 = new Door();
	car.door2.name = "fLeft";
	car.door3 = new Door();
	car.door3.name = "bRight";
	car.door4 = new Door();
	car.door4.name ="bleft";
	
	car.tyre1 = new Tyre();
	car.tyre1.brand="MRF";
	car.tyre1.size=20;
	
	car.tyre2 = new Tyre();
	car.tyre2.brand="MRF";
	car.tyre2.size=20;
	
	car.tyre3 = new Tyre();
	car.tyre3.brand="MRF";
	car.tyre3.size=20;
	
	car.tyre4 = new Tyre();
	car.tyre4.brand="MRF";
	car.tyre4.size=20;
	
	
	car.st = new Steering();
    car.st.name="Power Steering";
    car.st.size=15;	
	
	
	car.name="BMW";
	car.color="RED";
	
	System.out.println("Car name :"+car.name);
	System.out.println("Car color:"+car.color);
	
	System.out.println("Door :"+car.door1.name + "\n" + "Door :"+ car.door2.name + "\n" + "Door :"+ car.door3.name + "\n" +"Door :"+ car.door4.name + "\n");
     
	System.out.println("Tyre 1 :"+car.tyre1.brand);
	System.out.println("Tyre 1:"+car.tyre1.size);
	
	System.out.println("Tyre 2:"+car.tyre2.brand);
	System.out.println("Tyre 2:"+car.tyre2.size);
	
	System.out.println("Tyre 3:"+car.tyre3.brand);
	System.out.println("Tyre 3:"+car.tyre3.size);
	
	System.out.println("Tyre 4:"+car.tyre4.brand);
	System.out.println("Tyre 4:"+car.tyre4.size);
	
	
	System.out.println("Steering :"+car.st.name);
	System.out.println("Steering :"+car.st.size);

	
	System.out.println("Car is assembled Successfully ");
	
	}
    

}