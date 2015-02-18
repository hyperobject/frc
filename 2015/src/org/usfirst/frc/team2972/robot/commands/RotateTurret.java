package org.usfirst.frc.team2972.robot.commands;

import org.usfirst.frc.team2972.robot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RotateTurret extends CommandBase {
	private boolean isDone;
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
    	double secondsPerDegree = 0.007;
        if (direction > 0){
        	turret.turnRight();
        	Timer.delay(Math.abs(direction*secondsPerDegree));
        	turret.stop();
        	isDone = true;
        }else{
        	turret.turnLeft();
        	Timer.delay(Math.abs(direction*secondsPerDegree));
        	turret.stop();
        	isDone = true;
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return isDone;
    }
    // Called once after isFinished returns true
    protected void end() {
        if (direction > 0){
        	turret.turnLeft();
        }else{
        	turret.turnRight();
        }
    	turret.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
