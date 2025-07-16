public class Car{
	
String name;
String color;

Door[] d = new Door[4];
Tyre[] t = new Tyre[4];

Steering st;


	public Car(){
		
	String[]names = new String[]{"fRight","fLfet","bRight","bLeft"};	
	for (int i =0;i<4;i++){
    d[i]= new Door(names[i]);
	
	
	}
	
	for (int i =0;i<4;i++){
    t[i]= new Tyre("MRF",15);
	
	
	}
	
	
	st = new Steering();
    st.name="Power Steering";
    st.size=15;	
	
	name="BMW";
	color="RED";
	
	}


public void carDetails(){
	
	
	System.out.println("Car name :"+ name+ "\n" +"Car color:"+color);
	
	for(int i=0;i<4;i++){
	System.out.println("Door :"+d[i].name );
	}
    for (int i=0;i<6;i++){
	System.out.println("Tyre :"+t[i].brand);
	System.out.println("Tyre :"+t[i].size);
	 }
	
	
	System.out.println("Steering :"+st.name);
	System.out.println("Steering :"+st.size);

	
	System.out.println("Car is assembled Successfully ");
	
	
}



}