package org.usfirst.frc.team2972.robot.subsystems;

import org.usfirst.frc.team2972.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public static Talon elevatorMotor = new Talon(RobotMap.elevatorMotorPort);
	double speed = .5;
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void lift() {
    	//TODO
    }
    
    public void lower() {
    	//TODO
    }
    
    public void stop() {
    	//TODO
    }
}

