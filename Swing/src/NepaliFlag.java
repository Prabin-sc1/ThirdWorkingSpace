import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class NepaliFlag {
   public static void main(String []args) {
	   JFrame frame = new JFrame("NEPALI FLAG");
	   Nepal n = new Nepal();
	   frame.add(n);
	   frame.setSize(500,500);
	   frame.setLocationRelativeTo(null);
	   frame.setVisible(true);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

}
 class Nepal extends JPanel{
	 public void paint(Graphics g) {
		 g.setColor(Color.BLACK);
		 g.fillRect(10,20,10,400);
		 
		 int x[] = {20,200,100,240,20,20};
		 int y[] = {20,150,150,300,300,20};
		 g.setColor(Color.BLUE);
		 g.fillPolygon(x,y,6);
		 
		 int xx[] = {30,170,75,215,30,30};
		 int yy[] = {40,140,140,290,290,35}; 
		 
		 g.setColor(Color.RED);
		 g.fillPolygon(xx,yy,6);
		 
		 g.setColor(Color.WHITE);
		 g.fillArc(50, 80, 40, 40, 0, -180);
		 
		 g.fillOval(50, 200, 50, 50);
		 
		 Font f1 = new Font("Times New Roman",Font.BOLD,30);
		 g.setFont(f1);
		 g.setColor(Color.BLACK);
		 g.drawString("NEPALI FLAG", 150, 400);

	 }
 	
}
