import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Enemy
{
	int yPos;
	int xPos;
	Ellipse2D.Double enemyShape;

	public Enemy(int xPos, int yPos)//constructor
	{
		enemyShape = new Ellipse2D.Double();
		enemyShape.x = xPos;
		enemyShape.y = yPos;
		enemyShape.height = 50;
		enemyShape.width = 50;
	}

	public void paintSelf(Graphics2D g2)
	{
		g2.setColor(Color.BLACK);
		g2.fill(enemyShape);
	}

}