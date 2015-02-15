package org.usfirst.frc.team2972.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *@author connor hudson
 */
public class ElevatorCommand extends CommandBase {

	private int direction;
    public ElevatorCommand(int dir) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	super("ElevatorLift");
    	requires(elevator);
    	direction = dir;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (direction == 1){
    		elevator.lift();
    	} else if (direction == -1) {
    		elevator.lower();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if (direction == 1){
        	return elevator.up();
        } else if (direction == -1){
        	return elevator.down();
        } else{
        	return true;
        }
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
