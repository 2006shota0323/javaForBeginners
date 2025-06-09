
public class DisplayCarsTrains extends MyFrame{
	public void run()
	{
		car[] cars = new car[2];
		cars[0]=new car(10,70,3,0);
		cars[1]=new car(10,130,5,0);
		
		for(int i=0; i<30; i++)
		{
			clear();
			
			for(int j=0; j<cars.length; j++ ) 
			{
				cars[j].draw(this);
				cars[j].move();
			}
			
			sleep(0.01);
			
		}
	}

}
