import java.awt.*;
import javax.swing.*;

public class MainFrameMan2{
  	public static void main(String[] args){
		FrameMan fm=new FrameMan();
	}
}
	class FrameMan{
	JFrame frame;
	JPanel panel;
	JLabel label;
	ImageIcon icon;

	public FrameMan(){
	System.out.println("aloha");
	openWindow();

}
private void openWindow(){
	frame=new JFrame();
	frame.setLocation(200,200);
	frame.setSize(1000,1000);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	icon=new ImageIcon("THAPAPRADIP_icons/1_Desktop_Icons/icon_256.png");
	panel=new JPanel();
	label=new JLabel(icon);
	panel.add(label);
	frame.add (panel);
	frame.setVisible(true);
}
}