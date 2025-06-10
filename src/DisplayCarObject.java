
public class DisplayCarObject extends MyFrame {
   public void run()
   {   
	   int x=50;
	   int y=70;
	   int z=1;
	   
	   car cars[]=new car[5];
	   
	    cars[0]=new car(x,y,z,5);
		
		cars[1]=new car(x+70,y+140,z+1,5);
		
		cars[2]=new car(x+100,y+290,z+2,0);
		
		cars[3]=new car(x+200,y+410,z+3,0);
		
		cars[4]=new car(x+300,y+540,z+4,0);
		
		
		for(int i=0; i<50; i++)
		{
			clear();
			
			for(int j=0; j<cars.length; j++)
			{
				cars[j].draw(this);
				cars[j].move();
			}
			
			sleep(0.1);
		}
      
		
   }
}
