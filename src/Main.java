import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Toolkit;
import java.io.ObjectInputStream.GetField;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Main extends JComponent
{
	Enemy enemy1; 
	Enemy enemy2; 
	Player player;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int width = (int) screenSize.getWidth();
	int height = (int) screenSize.getHeight();

	public static void main(String[] args)
	{
		 
		new Main().getGoing();
	}

	public void getGoing()
	{
		JFrame pop = new JFrame("Skyline");
		pop.setSize(1920, 1080);
		pop.setVisible(true);
		pop.add(this);
		pop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		enemy1 = new Enemy(500, 500); 
		enemy2 = new Enemy(600, 600); 
		player = new Player(400, 400); 
	}

	public void paint(Graphics g)
	{
		int mousey = MouseInfo.getPointerInfo().getLocation().y;
		int mousex = MouseInfo.getPointerInfo().getLocation().x;
		Graphics2D g2 = (Graphics2D) g;
		player.getPlayerShape().x = mousex; 
		player.getPlayerShape().y = mousey;
		g2.setColor(Color.pink);
		g2.fillRect(0, 0, 1920, 100);
		enemy1.paintSelf(g2);
		enemy2.paintSelf(g2);
		g2.setColor(Color.blue);
		player.paintSelf(g2);
		repaint();
	}
}
