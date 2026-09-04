package org.firstinspires.ftc.teamcode.DriverControl;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Commands.SixWheelCMD;
import org.firstinspires.ftc.teamcode.Subsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.Subsystems.Imu;
import org.firstinspires.ftc.teamcode.Subsystems.Tools;


@TeleOp
public class SixWheelDrive extends OpMode {
    Drivetrain drivetrain;
    SixWheelCMD cmd;
    Tools tools;
    Imu imu;

    public void init() { // called once when INIT is pressed
        //hardware mapping from driver hub
        drivetrain = new Drivetrain(hardwareMap);
        tools = new Tools(hardwareMap);
        imu = new Imu(hardwareMap);

        telemetry.addData("Status", "Initialized"); // Displays this on Driver Station
        telemetry.update(); // updates the telemetry on the screen
    }

    public void start() {
    } // called once after ▶ is pressed

    public void loop() { // loops after ▶ is pressed
        telemetry.addData("Status", "Started");
        double y = -gamepad1.left_stick_y; //NOT AN ERROR This is just getting reversed because its input is actually supposed to be reversed, but that would be through trial and error
        double x = gamepad1.right_stick_x;
        double leftPower = y + x;
        double rightPower = y - x;
        imu.resetHeading();

        cmd.setMotors(leftPower, rightPower);
        if (gamepad2.a) {
            tools.intakeMotor.setPower(1);
        }else {
            tools.intakeMotor.setPower(0);
        }
        if (gamepad2.b) {
            tools.intakeMotor.setPower(1);
        }else {
            tools.intakeMotor.setPower(0);
        }
    }
}
