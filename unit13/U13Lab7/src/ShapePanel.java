//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);


		Shape shape1 = new Shape(100, 100, 50, 50, Color.CYAN);
		shape1.draw(window);

		Shape shape2 = new Shape(300, 100, 25, 50, Color.GREEN);
		shape2.draw(window);

		Shape shape3 = new Shape(200, 350, 50, 50, Color.ORANGE);
		shape3.draw(window);

//		Shape shape4 = new Shape(100, 50, 475, 4, Color.RED);
//		shape4.draw(window);
//
//		Shape shape5 = new Shape(125, 75, 425, 4, Color.RED);
//		shape5.draw(window);
//
//		Shape shape6 = new Shape(150, 100, 375, 4, Color.RED);
//		shape6.draw(window);

		int numPent = 10;
		int dist = 400/numPent;
		for(int i = 0; i < 10; i++) {
			new Shape(100 + i * (dist/2), 50+ i * (dist/2), 475 - (i * dist), 4, Color.RED).draw(window);
		}
	}
}