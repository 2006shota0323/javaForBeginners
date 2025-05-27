
public class RectIf extends MyFrame{
	public void run()
	{        
		//setColor(0,128,0);
		
		int x=40; 
		
		int z=0;
		
		for(int i=0; i<20;i++)
		{
			if(i<=10) 
			{
				fillRect(x,50,10,80);
				setColor(z,z,z);
				
				z+=20;
			}
			else if(i>=11)
			{
				fillRect(x,50,10,80);
				setColor(z,z,z);
				
				z-=20;
			}
			
			x+=20;
			
			
			
		}
	}

}
