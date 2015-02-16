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
	
	public static Talon elevatorMotor = new Talon(RobotMap.elevatorMotorPort1);
	public static Talon elevatorMotor2 = new Talon(RobotMap.elevatorMotorPort2);
	public static DigitalInput elevatorUpSwitch = new DigitalInput(RobotMap.elevatorUpSwitchPort);
	public static DigitalInput elevatorDownSwitch = new DigitalInput(RobotMap.elevatorDownSwitchPort);
	double defaultSpeed = 1;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new ElevatorMoveCommand());
    }
    
    public void lift() {
    	elevatorMotor.set(1*defaultSpeed);
    	elevatorMotor2.set(1*defaultSpeed);
    }
    
    public void lower() {
    	elevatorMotor.set(-1*defaultSpeed);
    	elevatorMotor2.set(-1*defaultSpeed);
    }
    
    public void control(double val) {
    	elevatorMotor.set(val*defaultSpeed);
    	elevatorMotor2.set(val*defaultSpeed);
    }
    
    
    public void stop() {
    	elevatorMotor.set(0);
    	elevatorMotor2.set(0);
    }
    
    public boolean up() {
    	return elevatorUpSwitch.get();
    }
    
    public boolean down() {
    	return elevatorDownSwitch.get();
    }
}

