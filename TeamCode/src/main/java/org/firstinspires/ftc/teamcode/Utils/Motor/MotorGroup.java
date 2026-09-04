package org.firstinspires.ftc.teamcode.Utils.Motor;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class MotorGroup {

    // defines the motors that we use locally and are instated when we call the class.
    private final DcMotorEx Leader;
    private final DcMotorEx Follower;

    public MotorGroup(
            DcMotorEx leader,
            DcMotorEx follower,
            DcMotorEx.Direction leaderDirection,
            DcMotorSimple.Direction followerDirection
    ) {
        this.Leader = leader;
        this.Follower = follower;
        leader.setDirection(leaderDirection);
        follower.setDirection(followerDirection);
    }

    public void setPower(double power) {
        Leader.setPower(power);
        Follower.setPower(power);
    }
    public double getPower() { return Leader.getPower(); }
    public void setMode(DcMotor.RunMode mode) {
        Leader.setMode(mode);
        Follower.setMode(mode);
    }
}
