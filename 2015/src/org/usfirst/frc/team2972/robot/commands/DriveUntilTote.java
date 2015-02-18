package org.usfirst.frc.team2972.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveUntilTote extends CommandBase {
	private boolean isDone = false;
    private double speed = 0.3;
    public DriveUntilTote() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	super("DriveUntilTote");
    	requires(mecanumDrive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() { 
    	mecanumDrive.drive(speed, 0, 0);
    	Timer.delay(3);
    	isDone = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isDone; //TODO: ultrasonic depth less than something
    }

    // Called once after isFinished returns true
    protected void end() {
    	mecanumDrive.drive(0, 0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
