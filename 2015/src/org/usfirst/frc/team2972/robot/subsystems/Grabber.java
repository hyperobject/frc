package org.usfirst.frc.team2972.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team2972.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;


/**
 *
 */
public class Grabber extends Subsystem {
	
	public static DoubleSolenoid grabberSolenoid;// = new DoubleSolenoid(RobotMap.grabberSolenoidPort, RobotMap.grabberSolenoidPort2);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
	public void open() {
    	grabberSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    public void close() {
        grabberSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
     public void stop() {
    	grabberSolenoid.set(DoubleSolenoid.Value.kOff);
    }
}

