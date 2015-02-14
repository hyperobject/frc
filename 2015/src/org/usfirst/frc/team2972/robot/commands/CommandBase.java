package org.usfirst.frc.team2972.robot.commands;

import org.usfirst.frc.team2972.robot.OI;
import org.usfirst.frc.team2972.robot.subsystems.Dropper;
import org.usfirst.frc.team2972.robot.subsystems.Elevator;
import org.usfirst.frc.team2972.robot.subsystems.Grabber;
import org.usfirst.frc.team2972.robot.subsystems.Kinect;
import org.usfirst.frc.team2972.robot.subsystems.MecanumDrive;
import org.usfirst.frc.team2972.robot.subsystems.Turret;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class CommandBase extends Command {
	public static Turret turret = new Turret();
	public static MecanumDrive mecanumDrive = new MecanumDrive();
	public static Elevator elevator = new Elevator();
	public static Grabber grabber = new Grabber();
	public static Dropper dropper = new Dropper();
	public static Kinect kinect = new Kinect();
	
	public static OI oi;
	
	
	public static void init() {
		// This MUST be here. If the OI creates Commands (which it very likely
		// will), constructing it during the construction of CommandBase (from
		// which commands extend), subsystems are not guaranteed to be
		// yet. Thus, their requires() statements may grab null pointers. Bad
		// news. Don't move it.
		oi = new OI();
		// Show what command your subsystem is running on the SmartDashboard
		SmartDashboard.putData("SchedulerData", Scheduler.getInstance());

	}
	
    public CommandBase() {
        super();
    }
    
    public CommandBase(String name){
    	super(name);
    }
    
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
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
