package org.usfirst.frc.team2972.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class UnstoreToteManual extends CommandBase {
	private int direction;
	
    public UnstoreToteManual(int dir) {
    	super("UnstoreToteManual");
        requires(dropper);
        int direction = dir;
    }
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (direction == 1) {
        	dropper.out();
        	} else if (direction == -1) {
        	dropper.in();
        	} else {
        	dropper.stop();
        	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }
    
    protected void interrupted() {
    	
    }
}
