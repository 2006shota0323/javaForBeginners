import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class car extends Vehicle implements KeyListener {
	
	
	
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

	
	//キーボードから文字が入力された場合
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	//キーが押されたとき
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("キーが押されました");
		vx=5;
	}

	//押されていたキーが離されたとき
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	
	
	

}
