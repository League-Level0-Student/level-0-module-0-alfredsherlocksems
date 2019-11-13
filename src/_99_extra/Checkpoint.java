package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String color = JOptionPane.showInputDialog("What's your favourite colour?");
		JOptionPane.showMessageDialog(null, color + " is my favourite colour too!");
		Robot bob = new Robot();
		bob.setSpeed(100);
		bob.penDown();
		bob.setRandomPenColor();
		bob.turn(90);
		bob.move(200);
		bob.turn(-120);
		bob.move(200);
		bob.turn(-120);
		bob.move(200);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
