import javax.swing.*;
import java.awt.*;
public class Button1
{
	public static void main(String[] args) {
		Button1 gui=new Button1();
		gui.go();
	}
	public void go()
	{
		JFrame frame=new JFrame();
		JButton button=new JButton("click me");
		frame.getContentPane().add(BorderLayout.WEST, button);
		frame.setSize(400,400);
		frame.setVisible(true);
	}
}