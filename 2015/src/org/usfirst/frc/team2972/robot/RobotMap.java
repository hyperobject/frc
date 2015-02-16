package org.usfirst.frc.team2972.robot;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//motors
	public static final int turretMotorPort = 4;
	public static final int elevatorMotorPort1 = 5;
	public static final int elevatorMotorPort2 = 6;
	public static final int frontLeftPort	= 0;
	public static final int rearLeftPort	= 1;
	public static final int frontRightPort	= 2;
	public static final int rearRightPort	= 3;
	
	//buttons
	public static final int grabberFirstButtonPort = 6;
	public static final int grabberSecondButtonPort = 5;
	public static final int dropperSolenoidButtonPort = 9;
	
	//Double Solenoid
	public static final int grabberSolenoidPort = 2;
	public static final int grabberSolenoidPort2 = 3;
	public static final int dropperSolenoidPort = 0;
	public static final int dropperSolenoidPort2 = 1;
	public static final double dropTime = 0.6;
	
	//sensors
	public static final int arduinoPort = 0;
	public static final int elevatorUpSwitchPort = 1; //TODO find the real ports for these
	public static final int elevatorDownSwitchPort = 2;
	public static final int turretBack = 4000;
	public static final int turretForward = 0;
}
