package org.usfirst.frc.team2972.robot.subsystems;

import org.usfirst.frc.team2972.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Turret extends Subsystem {
    
	public static Talon turretMotor = new Talon(RobotMap.turretMotorPort1);
	public static Talon turretMotor2 = new Talon(RobotMap.turretMotorPort2);
	
    double speed = .5;
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void turnRight(){
    	turretMotor.set(1*speed);
    	turretMotor2.set(-1*speed);
    }
    
    public void turnLeft(){
    	turretMotor.set(-1*speed);
    	turretMotor2.set(1*speed);
    }
    
    public void stop(){
    	turretMotor.set(0);
    	turretMotor2.set(0);
    }
    
    public void turn(int dir){
    	turretMotor.set(dir*speed);
    	turretMotor2.set(dir*speed);
    }
}

