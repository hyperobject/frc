package org.usfirst.frc.team2972.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Timer;

/**
 *
 */
public class PickUp extends CommandBase {

	private boolean isDone = false;
    public PickUp() {
    	super("PickUp");
        requires(grabber);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	grabber.open();
    	Timer.delay(2);
    	grabber.stop();
    	Timer.delay(1);
    	grabber.close();
    	Timer.delay(2);
    	grabber.stop();
    	isDone = true;
   }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	
    	return isDone;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
