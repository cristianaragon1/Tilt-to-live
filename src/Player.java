import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


public class Player
{
	int yPos;
	int xPos;
	private Ellipse2D.Double playerShape;

	public Player(int xPos, int yPos)//constructor
	{
		setPlayerShape(new Ellipse2D.Double());
		getPlayerShape().x = xPos;
		getPlayerShape().y = yPos;
		getPlayerShape().height = 50;
		getPlayerShape().width = 50;
	}

	public void paintSelf(Graphics2D g2)
	{
		g2.setColor(Color.blue);
		g2.fill(getPlayerShape());
	}

	Ellipse2D.Double getPlayerShape()
	{
		return playerShape;
	}

	void setPlayerShape(Ellipse2D.Double playerShape)
	{
		this.playerShape = playerShape;
	}

}

