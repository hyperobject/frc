package org.usfirst.frc.team2972.robot.subsystems;

import org.usfirst.frc.team2972.robot.RobotMap;
import org.usfirst.frc.team2972.robot.commands.ElevatorMoveCommand;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
	
	public static int cnt = 0;
	double defaultSpeed = 1;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new ElevatorMoveCommand());
    }
    
    public void lift() {
    	if (!isUp()){
    		elevatorMotor.set(-.5*defaultSpeed);
    		elevatorMotor2.set(-.5*defaultSpeed);
    	}
    }
    
    public void lower() {
    	if (!isDown()){
    		elevatorMotor.set(.6*defaultSpeed);
    		elevatorMotor2.set(.6*defaultSpeed);
    	}
    }
    

    
    public void control(double val) {
    	cnt = cnt + 1;
    	SmartDashboard.putNumber("Elevator Controll", val);
    	SmartDashboard.putNumber("Upper Switch", elevatorUpSwitch.get()?1:0);
    	SmartDashboard.putBoolean("Lower Switch", elevatorDownSwitch.get());
    	SmartDashboard.putNumber("Elevator Count: ", cnt);
    	if (val < 0){
        	if (!isUp()){
        		elevatorMotor.set(val*defaultSpeed);
        		elevatorMotor2.set(val*defaultSpeed);
        	}
    	}else if (val > 0){
    		if (!isDown()){
        		elevatorMotor.set(val*defaultSpeed);
        		elevatorMotor2.set(val*defaultSpeed);
        	}
    	}else{
    		stop();
    	}
    }
    
    
    public void stop() {
    	elevatorMotor.set(0);
    	elevatorMotor2.set(0);
    }
    
    public boolean isUp() {
    	return !elevatorUpSwitch.get();
    }
    
    public boolean isDown() {
    	return !elevatorDownSwitch.get();
    }
}

