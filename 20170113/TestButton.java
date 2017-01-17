import java.awt.*;
import javax.swing.*;
public class TestButton{
	public static void main(String[] args) {
		TestButtonMan tbm = new TestButtonMan();
	}	
}
class TestButtonMan {
	
	JFrame frame;
	JButton button;

	public TestButtonMan() {
		
		frame = new JFrame("TestButton");
		frame.setLocation(400, 400);		
		frame.setSize(400, 400);			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		button = new JButton("Click Me!");

		Container con = frame.getContentPane();
		con.add(button);

	frame.setVisible(true);
	}
}