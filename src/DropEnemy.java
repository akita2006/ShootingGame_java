
public class DropEnemy extends Enemy{

	public DropEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public void draw(MyFrame f) {
		 f.setColor(255, 255, 255); 
		 f.fillRect(x, y, 30, 30);
		 f.setColor(0, 128, 0);
		 f.fillRect(x, y, 30, 10);
		 f.setColor(0, 128, 0);
		 f.fillRect(x+10, y+10, 10, 20);
	}
	public void move() {
		super.move();
		vy=vy+0.1;
	}
}