package org.usfirst.frc.team2972.robot;

import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//motors
	public static final int elevatorMotorPort = 4;
	public static final int turretMotorPort1 = 5;
	public static final int turretMotorPort2 = 6;
	public static final int frontLeftPort	= 0;
	public static final int rearLeftPort	= 1;
	public static final int frontRightPort	= 2;
	public static final int rearRightPort	= 3;
	
	//buttons
	//public static final int turretRightButtonPort = 6;
	//public static final int turretLeftButtonPort  = 5;
	public static final int grabberFirstButtonPort = 2;
	public static final int grabberSecondButtonPort = 4;
	//public static final int elevatorFirstButtonPort = 1;
	//public static final int elevatorSecondButtonPort = 3;
	
	//Double Solenoid
	public static final int grabberSolenoidPort = 7;
	public static final int grabberSolenoidPort2 = 8;
	public static final int dropperSolenoidPort = 5;
	public static final int dropperSolenoidPort2 = 6;
	
	//sensors
	public static final int arduinoPort = 0;
}
