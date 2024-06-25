
public class EnemyBase extends Enemy {

	public EnemyBase(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
		life=20;
	}
	public void draw(MyFrame f) {
		 f.setColor(0, 128, 0); 
		 f.fillOval(x, y, 32, 32);
		 f.setColor(200, 200, 200);
		 f.fillOval(x-16, y+8, 64, 16);
	}
	
	public void  move() {
		super.move();
		if(x>300)vx=-1;
		if(x<100)vx=1;
		if(Math.random()<0.04) {
			GameWorld.enemies.add(new StraightEnemy(x,y,0,2));
		}
		if(Math.random()<0.02) {
			GameWorld.enemies.add(new RandomEnemy(x,y,0,1));
		}
		if(Math.random()<0.03) {
			GameWorld.enemies.add(new DropEnemy(x,y,0,1));
		}
		if(Math.random()<0.03) {
			GameWorld.enemies.add(new CurveEnemy(x,y,0,1));
		}
	}

}