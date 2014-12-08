package mainpackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestVehicle {
	
	     public static void main(String[] args){
	    	 
	    	 Person a = new Person();
	    	 a.setFirstName("a");
	    	
	    
	    	 
	    	 MotorCycle new_motorcycle= new MotorCycle();
	    	 new_motorcycle.setHasSideCar(false);
	    	 
	    	 
	    	 Truck new_truck= new Truck();
	    	 new_truck.setOwner(a);
	    	 new_truck.setNumberOfAxels(2);
	    	 System.out.println(new_truck.getOwner().getFirstName());

	    	  Car new_car= new Car();
	    	 new_car.setOwner(a);
	    	 new_car.setNumberOfDoors(4);
	    	 System.out.println(new_car.getOwner().getFirstName());
	 
	    	 
	    	  Person b= new Person();
	    	 b.setFirstName("b");
	    	 new_truck.setOwner(b);
	    	 
	    
	    	 System.out.println(new_truck.getOwner().getFirstName());
	    	 System.out.println(new_car.getNumberOfDoors());
	    	 System.out.println(new_motorcycle.isHasSideCar());

	    	 
	     }
	}
