import java.util.Vector;

public class DisplayCarsTrains extends MyFrame{
	public void run()
	{
		Vector<Vehicle> vehicles = new Vector<Vehicle>();
		vehicles.add(new car(100,60,3,0));
		vehicles.add(new car(200,120,-6,0));
		
		vehicles.add(new Train(10,180,5,0));
		vehicles.add(new Train(200,240,-5,0));
		
    	vehicles.add(new Truck(30,300,7,0));
    	vehicles.add(new Truck(50,360,8,0));
		

		
		while(true)
		{
			clear();
			
			for(int j=0; j<vehicles.size(); j++ ) 
			{
				vehicles.get(j).draw(this);
			    vehicles.get(j).move();
			}
			
			sleep(0.1);
			
		}
	}

}
