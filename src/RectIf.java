
public class RectIf extends MyFrame{
	public void run()
	{        
		setColor(0,128,0);
		
		int x=40; int y=50;
		
		for(int i=0; i<10;i++)
		{
			if(i!=0) 
			{
				fillRect(x,50,10,y);
			}
			else
			{
				fillRect(x,50,10,50);
			}
			
			x+=20;
			
			y+=20;
			
		}
	}

}
