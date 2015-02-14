package org.usfirst.frc.team2972.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class UnstoreTote extends CommandBase {
    private boolean isDone = false;
    public UnstoreTote() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(dropper);
    }

    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	dropper.out();
    	Timer.delay(2);
    	dropper.stop();
    	isDone = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isDone;
    }

    // Called once after isFinished returns true
    protected void end() {
    	dropper.in();
    	Timer.delay(2);
    	dropper.stop();
    }
    
    protected void interrupted() {
    	
    }
}
