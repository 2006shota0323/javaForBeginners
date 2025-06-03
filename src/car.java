
public class car {
	int x,y,vx,vy;
	public car(int x,int y, int vx, int vy)
	{
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	
	public void draw(MyFrame frame)
	{
		frame.fillOval(x+40, y+50, 50,50);
		frame.fillOval(x+110, y+50, 50, 50);
		frame.fillRect(x,y,200,50);
		frame.fillRect(x+25,y-25,150,60);
	}
	public void move()
	{
		x+=vx;
		y+=vy;
	}
	
	
	

}
