import java.awt.*;
import javax.swing.*;

public class MainFrameMan{
  	public static void main(String[] args){
		FrameMan fm=new FrameMan();
	}
}
	class FrameMan{
	JFrame frame;
	public FrameMan(){
	System.out.println("aloha");
	frame=new JFrame();
	frame.setLocation(200,200);
	frame.setSize(300,300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}
}