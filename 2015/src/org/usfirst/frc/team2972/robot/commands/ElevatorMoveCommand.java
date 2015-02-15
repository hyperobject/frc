package org.usfirst.frc.team2972.robot.commands;

import org.usfirst.frc.team2972.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorMoveCommand extends CommandBase {

    public ElevatorMoveCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	super("ElevatorMoveCommand");
    	requires(elevator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	elevator.control(OI.getStick().getRawAxis(5));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (OI.getStick() == null);
    }

    // Called once after isFinished returns true
    protected void end() {
    	elevator.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
