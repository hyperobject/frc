package org.usfirst.frc.team2972.robot.subsystems;

import org.usfirst.frc.team2972.robot.RobotMap;
import org.usfirst.frc.team2972.robot.commands.MecanumDriveCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.command.Subsystem;

import java.lang.*;
/**
 *
 */
public class MecanumDrive extends Subsystem {
	RobotDrive robotDrive;
	
	public MecanumDrive(){
		super();
    	robotDrive = new RobotDrive(RobotMap.frontLeftPort, RobotMap.rearLeftPort, RobotMap.frontRightPort, RobotMap.rearRightPort);
    	robotDrive.setInvertedMotor(MotorType.kFrontRight, true);
    	robotDrive.setInvertedMotor(MotorType.kRearRight, true);
	}
	
	public void drive(double x, double y, double z){
		//robotDrive.mecanumDrive_Cartesian(x,y,z,0);
		if (Math.abs(z) > .05){
			robotDrive.mecanumDrive_Cartesian(0,0,z,0);
		}else{
			robotDrive.tankDrive(x,y);
		}
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new MecanumDriveCommand());
    }
}

