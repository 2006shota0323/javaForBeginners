
public class Animation extends MyFrame{
	public void run()
	{
		
		int x=30;
		int y=100;
//		5-1
//		while(y>=40)
//		{
//			clear();
//			setColor(0,128,0);
//			fillOval(x,y,100,100);
//			y-=5;
//			sleep(0.1);
//		}
//		while(x<=200)
//		{
//			clear();
//			setColor(0,128,0);
//			fillOval(x,y,100,100);
//			x+=5;
//			sleep(0.1);
//		}
//		
//	    5-2
//		 while(x<=150)
//		 {
//			 clear();
//			 setColor(0,128,0);
//			 fillOval(x,y,100,100);
//			 x+=5;
//			 y+=5;
//			 sleep(0.1);
//		 }
//		 while(x>=30)
//		 {
//			 clear();
//			 setColor(0,128,0);
//			 fillOval(x,y,100,100);
//			 x-=5;
//			 sleep(0.1);
//		 }
//		 while(x<=150)
//		 {
//			 clear();
//			 setColor(0,128,0);
//			 fillOval(x,y,100,100);
//			 x+=5;
//			 y-=5;
//			 sleep(0.1);
//		 }
		
		
		
		for(int i=1; i<=3; i++)
		{
			while(x<=200)
			{
				clear();
				setColor(0,128,0);
				fillOval(x,y,100,100);
				x+=5;
				sleep(0.1);
			}
			while(x>=30)
			{
				clear();
				setColor(0,128,0);
				fillOval(x,y,100,100);
				x-=5;
				sleep(0.1);
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
