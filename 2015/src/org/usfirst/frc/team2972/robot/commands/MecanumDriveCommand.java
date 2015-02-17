package org.usfirst.frc.team2972.robot.commands;

import org.usfirst.frc.team2972.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MecanumDriveCommand extends CommandBase {

    public MecanumDriveCommand() {
    	super("MecanumDrive");
        requires(mecanumDrive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() { // 0 , 1 
    	double[] axes = {OI.getStick(1).getRawAxis(0), OI.
    	
    	mecanumDrive.drive(Math.pow(OI.getStick(1).getRawAxis(0),2), Math.pow(OI.getStick(1).getRawAxis(1),2), (OI.getStick(1).getRawAxis(3) - OI.getStick(1).getRawAxis(2)));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
