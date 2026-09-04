package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Commands.SixWheelCMD;
import org.firstinspires.ftc.teamcode.Utils.Motor.MotorGroup;


public class Tools {
    public DcMotorEx Flywheel, intakeMotor ;

    public Tools(HardwareMap hMap) {
        Flywheel = hMap.get(DcMotorEx.class, "Flywheel");
        intakeMotor = hMap.get(DcMotorEx.class, "intakeMotor");

    }
}