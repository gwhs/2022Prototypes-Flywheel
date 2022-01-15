// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.XboxController;
/**
 * This is a demo program showing the use of the RobotDrive class, specifically it contains the code
 * necessary to operate a robot with tank drive.
 */
public class Robot extends TimedRobot {
  private DifferentialDrive m_myRobot;
  private XboxController xbox;
  private TalonFX m_blue;
  private TalonFX m_white;


  @Override
  public void robotInit() {
    xbox = new XboxController(0);
    m_blue = new TalonFX(7);
    m_white = new TalonFX(6);
  //  m_myRobot = new DifferentialDrive(m_blue, m_white);
  JoystickButton buttonA = new JoystickButton(xbox, XboxController.Button.kA.value);

   buttonA.whenPressed(new commands(m_blue, m_white, 1.0));
    
  }

  @Override
  public void teleopPeriodic() {
  }
}