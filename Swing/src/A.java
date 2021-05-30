import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.applet.*;
import java.awt.*;

public class A {
	public static void main(String []args) {
		 String name = JOptionPane.showInputDialog("What is your name");
		String message = String.format("Welcome, %s, to Java programming!");
		JOptionPane.showMessageDialog(null, message);
	}

}
