package org.usfirst.frc.team2972.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team2972.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
     private static Joystick stick1 = new Joystick(0);
     private static Joystick stick2 = new Joystick(1);
    
     //Button turretRightButton = new JoystickButton(getStick(), RobotMap.turretRightButtonPort);
     //Button turretLeftButton = new JoystickButton(getStick(),RobotMap.turretLeftButtonPort);
     
     Button grabberFirstButton = new JoystickButton(getStick(2), RobotMap.grabberFirstButtonPort);
     Button grabberSecondButton = new JoystickButton(getStick(2),RobotMap.grabberSecondButtonPort);
     
     Button dropperSolenoidButton = new JoystickButton(getStick(2), RobotMap.dropperSolenoidButtonPort);
     Button dropperSolenoidSecondButton = new JoystickButton(getStick(1), RobotMap.dropperSolenoidButtonPort);
     //Button elevatorFirstButton = new JoystickButton(getStick(), RobotMap.elevatorFirstButtonPort);
     //Button elevatorSecondButton = new JoystickButton(getStick(),RobotMap.elevatorSecondButtonPort);
     
     public OI(){
    	 
    	 grabberFirstButton.whileHeld(new GrabberCommand(1));
    	 grabberFirstButton.whenReleased(new GrabberCommand(0));
         
    	 grabberSecondButton.whileHeld(new GrabberCommand(-1));
    	 grabberSecondButton.whenReleased(new GrabberCommand(0));
    	 
    	 dropperSolenoidButton.whenPressed(new UnstoreTote());
    	 dropperSolenoidButton.whenPressed(new GrabberCommand(1));
    	 dropperSolenoidSecondButton.whenPressed(new UnstoreTote());
    	 dropperSolenoidSecondButton.whenPressed(new GrabberCommand(1));
     }

	public static Joystick getStick(int stick) {
		if (stick == 1){
			return stick1;
		} else if (stick == 2){
			return stick2;
		} else {
			return stick1;
		}
	}

	public static void setStick(Joystick stick) {
		OI.stick1 = stick;
	}

     
}

