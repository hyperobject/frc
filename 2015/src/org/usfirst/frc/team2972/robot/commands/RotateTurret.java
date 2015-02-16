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
    	super("RotateTurret");
    	requires(turret);
    	direction = dir;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	turret.turnLeft();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (turret.getPotentiometerValue() > 3900 && turret.getPotentiometerValue() < 150){
    		return true;
    	} else {
    		return (Math.abs(turret.getPotentiometerValue() - RobotMap.turretDirs[direction/4])<5);
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
