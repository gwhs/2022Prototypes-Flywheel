package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import com.ctre.phoenix.sensors.CANCoder;
import frc.robot.Motor;

public class SpinMotor extends CommandBase {
    private Motor motor;
    private double speed; // perscent output -1 -> 1

    public SpinMotor(Motor moto, double speed) {
        this.motor = moto;
        this.speed = speed;
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        motor.setSelectedSensorPosition();
        motor.setMotorPercent(0.5);
        System.out.println("position is: " + motor.getPosition());
    }

    @Override
    public void end(boolean interrupted) {
        motor.setSelectedSensorPosition();
        motor.setMotorPercent(0);
    System.out.println("Goodbye World");
    }


    @Override
    public boolean isFinished() {
        return false;
    }
}
