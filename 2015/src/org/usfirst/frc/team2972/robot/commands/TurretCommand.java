package org.usfirst.frc.team2972.robot.commands;

import org.usfirst.frc.team2972.robot.OI;
import org.usfirst.frc.team2972.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class TurretCommand extends CommandBase {
	
    public TurretCommand() {
    	super("TurretCommand");
        requires(turret);
    }
    
    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	SmartDashboard.putNumber("Potentiometer: ", turret.getPotentiometerValue());
    	SmartDashboard.putNumber("Potentiometer Degrees: ", turret.getPotentiometerDegrees());
    	
    	if (turret.getPotentiometerValue() < RobotMap.turretMax - 30 && turret.getPotentiometerValue() > RobotMap.turretMin + 30){
    	turret.turn(-1*OI.getStick(2).getRawAxis(4));
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
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
