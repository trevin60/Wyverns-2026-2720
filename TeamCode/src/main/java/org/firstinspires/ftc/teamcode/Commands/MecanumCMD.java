package org.firstinspires.ftc.teamcode.Commands;

import static java.lang.Thread.sleep;

import org.firstinspires.ftc.teamcode.Subsystems.Drivetrain;

public class MecanumCMD {

    Drivetrain drivetrain;

    public void setMotors(double frontLeft, double frontRight, double backLeft, double backRight) {
        drivetrain.frontLeft.setPower(frontLeft);
        drivetrain.frontRight.setPower(frontRight);
        drivetrain.backLeft.setPower(backLeft);
        drivetrain.backRight.setPower(backRight);
    }
    public void moveAtAngle(double power, double degrees, long time) throws InterruptedException {
        double rad = Math.toRadians(degrees); // convert to rad cause math likes them

        double x = Math.cos(rad);
        double y = Math.sin(rad);
        // see https://www.desmos.com/calculator/5ojthrrdf7

        setMotors(
            (y + x) * power,
            (y - x) * power,
            (y - x) * power,
            (y + x) * power
        );

        sleep(time);

        setMotors(0, 0, 0, 0);
    }
}
