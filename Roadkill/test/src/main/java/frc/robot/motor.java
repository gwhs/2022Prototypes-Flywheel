// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.SpinMotor;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.sensors.CANCoder;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Motor extends SubsystemBase {
  private TalonFX motor;

  /** Creates a new motor. */
  public Motor(int id) {
    motor = new TalonFX(id);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler 

    }

  public void setMotorPercent(double speed){
    motor.set(ControlMode.PercentOutput, speed);

  }

  public double getPosition(){
    motor.getSelectedSensorPosition();
    return motor.getSelectedSensorPosition();
  }

  public TalonFX getMotor(){
    return motor;
  }

  public void setSelectedSensorPosition() {
    motor.setSelectedSensorPosition(0);
  }
  }
