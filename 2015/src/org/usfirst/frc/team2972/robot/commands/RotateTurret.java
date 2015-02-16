package org.usfirst.frc.team2972.robot.commands;

import org.usfirst.frc.team2972.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RotateTurret extends CommandBase {
    private int direction;
    public RotateTurret(int dir) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	super("RotateTurret ");
    	requires(turret);
    	direction = dir;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(direction == 1) {
    	turret.snap90();
    	} else if (direction == 2) {
    	turret.snap180();
    	} else if (direction == 3) {
    	turret.snap270();
    	} else if (direction == 4) {
    	turret.snap360();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (turret.getPotentiometerDegrees() == 90 && direction == 1){
    		return true;
    	} else if (turret.getPotentiometerDegrees() == 180 && direction == 2){
    		return true;
    	} else if (turret.getPotentiometerDegrees() == 270 && direction == 3){
    		return true;
    	} else if (turret.getPotentiometerDegrees() == 360 && direction == 4){
    		return true;
    	} else {
    		return false;
    	}
    }
    // Called once after isFinished returns true
    protected void end() {
    	turret.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
