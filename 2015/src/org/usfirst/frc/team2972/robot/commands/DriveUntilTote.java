package org.usfirst.frc.team2972.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveUntilTote extends CommandBase {
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
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false; //TODO: ultrasonic depth less than something
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
