
public class StraightEnemy extends Enemy{

	public StraightEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
		life=5+GameWorld.stage;
	}
	public void draw(MyFrame f) {
		 f.setColor(255, 255, 255); 
		 f.fillRect(x, y, 30, 30);
		 f.setColor(0, 0, 0);
		 f.fillRect(x+8, y, 14, 14);
		 f.setColor(0, 0, 0);
		 f.fillRect(x+10, y+15, 10, 15);
	}
}
