package org.usfirst.frc.team2972.robot.subsystems;

import org.usfirst.frc.team2972.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Turret extends Subsystem {
    
	public static Talon turretMotor = new Talon(RobotMap.turrentMotorPort);
	
    double speed = .5;
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void turnRight(){
    	turretMotor.set(1*speed);
    }
    
    public void turnLeft(){
    	turretMotor.set(-1*speed);
    }
    
    public void stop(){
    	turretMotor.set(0);
    }
    
    public void turn(int dir){
    	turretMotor.set(dir*speed);
    }
}

