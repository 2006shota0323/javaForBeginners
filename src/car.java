
public class car extends Vehicle {
	
	
	
	public car(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void draw(MyFrame frame)
	{
		frame.fillOval(x+10, y+20, 25,25);
		frame.fillOval(x+60, y+20, 25, 25);
		frame.fillRect(x,y,100,25);
		frame.fillRect(x+25,y-20,50,30);
	}
	
	
	
	

}
