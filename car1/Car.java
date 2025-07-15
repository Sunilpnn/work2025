public class Car{
	
String name;
String color;

Door[] d = new Door[4];
Tyre[] t = new Tyre[4];

Steering st;


	public Car(){
	
    d[0]= new Door();
	d[0].name= "fRight";
	
    d[1]= new Door();
	d[1].name= "fLeft";
	
	d[2]= new Door();
	d[2].name= "bLeft";
	
	d[3] = new Door();
	d[3].name= "bRight";
	
	
	
	t[0] = new Tyre();
	t[0].brand="MRF";
	t[0].size=20;
	
	t[1] = new Tyre();
	t[1].brand="MRF";
	t[1].size=20;
	
	t[2] = new Tyre();
	t[2].brand="MRF";
	t[2].size=20;
	
	t[3] = new Tyre();
	t[3].brand="MRF";
	t[3].size=20;
	
	
	
	st = new Steering();
    st.name="Power Steering";
    st.size=15;	
	
	
	name="BMW";
	color="RED";
	
	}


public void carDetails(){
	
	
	System.out.println("Car name :"+name);
	System.out.println("Car color:"+color);
	
	System.out.println("Door :"+d[0].name + "\n" + "Door :"+ d[1].name + "\n" + "Door :"+ d[2].name + "\n" +"Door :"+ d[3].name + "\n");
     
	System.out.println("Tyre 1 :"+t[0].brand);
	System.out.println("Tyre 1:"+t[0].size);
	
	System.out.println("Tyre 2:"+t[1].brand);
	System.out.println("Tyre 2:"+t[1].size);
	
	System.out.println("Tyre 3:"+t[2].brand);
	System.out.println("Tyre 3:"+t[2].size);
	
	System.out.println("Tyre 4:"+t[3].brand);
	System.out.println("Tyre 4:"+t[3].size);
	
	
	System.out.println("Steering :"+st.name);
	System.out.println("Steering :"+st.size);

	
	System.out.println("Car is assembled Successfully ");
	
	
}

}