package mainpackage;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class JunitTesting {

	@Test
	public void test() {
		Person a = new Person();
		
  

   	 Car new_car= new Car();
   	 new_car.setOwner(a);
   	 new_car.setNumberOfDoors(4);
  	
   	 Truck new_truck= new Truck();
   	 new_truck.setOwner(a);
   	 new_truck.setNumberOfAxels(2);
  	
   	 Person b= new Person();
   	 b.setFirstName("b");
   	 new_truck.setOwner(b);
   	
   	 
   	 MotorCycle new_motorcycle= new MotorCycle();
   	 new_motorcycle.setHasSideCar(false);
   
   	 
  	//assertEquals("Car Owner(a) it has four doors",4,new_car.getNumberOfDoors());
  	//assertEquals("Truck Owner (a) it has  two axels",2,new_truck.getNumberOfAxels());

 	assertEquals("No sidecar",false,new_motorcycle.isHasSideCar());

	}


}
