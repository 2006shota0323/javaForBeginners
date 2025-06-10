
public class DisplayCarTrain extends MyFrame {
	public void run()
	{
		car car1=new car(10,50,3,0);
		car1.draw(this);
		
		Train train1 =new Train(30,150,3,0);
		train1.draw(this);
		
		Truck truck1 =new Truck(50,180,3,0);
		truck1.draw(this);
		
	}

}
