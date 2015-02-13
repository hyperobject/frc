package org.usfirst.frc.team2972.robot.subsystems;

import org.usfirst.frc.team2972.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Turret extends Subsystem {
    
    Talon turretMotor = RobotMap.turretMotor;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void turnRight(){
    	turretMotor.set(.5);
    }
    
    public void turnLeft(){
    	turretMotor.set(-.5);
    }
    
    public void stop(){
    	turretMotor.set(0);
    }
}

