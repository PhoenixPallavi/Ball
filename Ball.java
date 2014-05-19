import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class Ball extends Applet
{
	int x=100,w;
	public void init()
	{
		setBackground(Color.cyan);
		addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent ke)
			{
				w=getSize().width;
				int i = ke.getKeyCode();
				if(i==ke.VK_LEFT)
				{
					x-=20;
					if(x<0) x= w-20;
					repaint();
				}
				if(i==ke.VK_RIGHT)
				{
					x+=20;
					x=x%w;
					repaint();
				}
			}
		});
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(x,400,50,50);
	}
}
/*<applet code = "Ball" width = 750 height = 750>
</applet>*/
