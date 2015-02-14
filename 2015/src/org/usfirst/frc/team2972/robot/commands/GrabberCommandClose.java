package org.usfirst.frc.team2972.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team2972.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 *
 */
public class GrabberCommandClose extends CommandBase {

    public GrabberCommandClose() {
    	super("GrabberCommandClose");
        requires(grabber);
    	// Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	grabber.close();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	grabber.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
