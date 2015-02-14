package org.usfirst.frc.team2972.robot.subsystems;

import org.usfirst.frc.team2972.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Kinect extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    AnalogInput duino = new AnalogInput(RobotMap.arduinoPort);
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public String adjust() {
    	double val = duino.getAverageVoltage();
    	if (val >= 0 && val <= 1) {
    		return "L";
    	} else if (val <= 5 && val >= 4) {
    		return "R";
    	} else {
    		return "C";
    	}
    }
}

