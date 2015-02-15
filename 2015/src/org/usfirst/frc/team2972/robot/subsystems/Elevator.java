package org.usfirst.frc.team2972.robot.subsystems;

import org.usfirst.frc.team2972.robot.RobotMap;
import org.usfirst.frc.team2972.robot.commands.ElevatorMoveCommand;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
public static Talon elevatorMotor = new Talon(RobotMap.elevatorMotorPort);
public static DigitalInput elevatorUpSwitch = new DigitalInput(RobotMap.elevatorUpSwitchPort);
public static DigitalInput elevatorDownSwitch = new DigitalInput(RobotMap.elevatorDownSwitchPort);
	double defaultSpeed = .5;
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new ElevatorMoveCommand());
    }
    
    public void lift() {
    	elevatorMotor.set(1*defaultSpeed);
    }
    
    public void lower() {
    	elevatorMotor.set(-1*defaultSpeed);
    }
    
    public void control(double val) {
    	elevatorMotor.set(val);
    }
    
    public void stop() {
    	elevatorMotor.set(0);
    }
    
    public boolean up() {
    	return elevatorUpSwitch.get();
    }
    
    public boolean down() {
    	return elevatorDownSwitch.get();
    }
}

