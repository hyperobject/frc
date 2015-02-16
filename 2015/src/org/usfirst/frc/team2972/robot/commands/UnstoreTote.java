package org.usfirst.frc.team2972.robot.commands;

import org.usfirst.frc.team2972.robot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class UnstoreTote extends CommandBase {
	private boolean isDone;
    public UnstoreTote() {
    	super("UnstoreToteManual");
        requires(dropper);
        isDone = false;
    }
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        	dropper.out();
        	Timer.delay(RobotMap.dropTime);
        	dropper.in();
        	isDone = true;
        	}


    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isDone;
    }

    // Called once after isFinished returns true
    protected void end() {
    }
    
    protected void interrupted() {
    	
    }
}
