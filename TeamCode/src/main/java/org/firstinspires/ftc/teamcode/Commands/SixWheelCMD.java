package org.firstinspires.ftc.teamcode.Commands;

import static java.lang.Thread.sleep;
import org.firstinspires.ftc.teamcode.Subsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.Subsystems.Tools;
public class SixWheelCMD {

    Drivetrain drivetrain;
    Tools tools;


    public void driveBasic(double left, double right, long time) throws InterruptedException {
        //set all motor powers
        setMotors(left,right);
        sleep(time); //wait for however long
        //stop
        setMotors(0,0);
    }
    public void setMotors(double left, double right) {
        drivetrain.leftSide.setPower(left);
        drivetrain.rightSide.setPower(right);
    }
    public void turnByAngle(double angle) {

    }

}
