package org.usfirst.frc.team2972.robot.subsystems;

import org.usfirst.frc.team2972.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Dropper extends Subsystem {
    
	public static DoubleSolenoid dropperSolenoid = new DoubleSolenoid(RobotMap.dropperSolenoidPort, RobotMap.dropperSolenoidPort2);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
	public void out() {
    	dropperSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    public void in() {
        dropperSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
     public void stop() {
    	dropperSolenoid.set(DoubleSolenoid.Value.kOff);
    }
}


