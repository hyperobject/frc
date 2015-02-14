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
    
     private static Joystick stick = new Joystick(1);
    
     Button turretRightButton = new JoystickButton(getStick(), RobotMap.turretRightButtonPort);
     Button turretLeftButton = new JoystickButton(getStick(),RobotMap.turretLeftButtonPort);
     
     Button grabberFirstButton = new JoystickButton(getStick(), RobotMap.grabberFirstButtonPort);
     Button grabberSecondButton = new JoystickButton(getStick(),RobotMap.grabberSecondButtonPort);
     
     public OI(){
    	 turretRightButton.whileHeld(new TurretCommand(1));
    	 turretRightButton.whenReleased(new TurretStopCommand());
         
    	 turretLeftButton.whileHeld(new TurretCommand(-1));
    	 turretLeftButton.whenReleased(new TurretStopCommand());
    	 
    	 grabberFirstButton.whileHeld(new GrabberCommandOpen(1));
    	 grabberFirstButton.whenReleased(new GrabberCommandOpen(0));
         
    	 grabberSecondButton.whileHeld(new GrabberCommandOpen(-1));
    	 grabberSecondButton.whenReleased(new GrabberCommandOpen(0));
     }

	public static Joystick getStick() {
		return stick;
	}

	public static void setStick(Joystick stick) {
		OI.stick = stick;
	}

     
     
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    //button.whileHeld(new TurretCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

