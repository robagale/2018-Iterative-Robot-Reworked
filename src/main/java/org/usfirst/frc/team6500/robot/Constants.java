package org.usfirst.frc.team6500.robot;

import org.usfirst.frc.team6500.trc.util.TRCTypes.*;

public class Constants
{
    // Input Constants
    public static final int INPUT_DRIVER_PORT = 0;
    public static final int INPUT_GUNNER_PORT = 1;
    public static final int INPUT_PORTS[] = {INPUT_DRIVER_PORT, INPUT_GUNNER_PORT};

    public static final int INPUT_GRAB_PULL_BUTTON = 3;
    public static final int INPUT_GRAB_RELEASE_BUTTON = 5;
    public static final int INPUT_GRAB_BUTTONS[] = {INPUT_GRAB_PULL_BUTTON, INPUT_GRAB_RELEASE_BUTTON};

    public static final int INPUT_LIFT_ELEVATE_BUTTON = 6;
    public static final int INPUT_LIFT_DESCEND_BUTTON = 4;
    public static final int INPUT_LIFT_BUTTONS[] = {INPUT_LIFT_ELEVATE_BUTTON, INPUT_LIFT_DESCEND_BUTTON};


    // Speed Constants
    public static final double SPEED_BASE = 0.85;
    public static final double SPEED_BOOST = 0.95;
    public static final double SPEED_AUTO = 0.65;


    // Options Constants
    public static final int OPTIONS_POSITION_LEFT = 0;
    public static final int OPTIONS_POSITION_MIDDLE = 1;
    public static final int OPTIONS_POSITION_RIGHT = 2;
    public static final String OPTIONS_POSITIONS[] = {"Left", "Middle", "Right"};
    public static final int OPTIONS_TARGET_SWITCH = 0;
    public static final int OPTIONS_TARGET_SCALE = 1;
    public static final int OPTIONS_TARGET_BASELINE = 2;
    public static final String OPTIONS_TARGETS[] = {"Switch", "Scale", "Baseline"};


    // Drive Constants
    public final static int DRIVE_WHEEL_FRONTLEFT = 3;
    public final static int DRIVE_WHEEL_REARLEFT = 1;
	public final static int DRIVE_WHEEL_FRONTRIGHT = 4;
    public final static int DRIVE_WHEEL_REARRIGHT = 2;
    public final static int DRIVE_WHEEL_PORTS[] = {DRIVE_WHEEL_FRONTLEFT, DRIVE_WHEEL_REARLEFT, DRIVE_WHEEL_FRONTRIGHT, DRIVE_WHEEL_REARRIGHT};
    public final static SpeedControllerType DRIVE_WHEEL_TYPES[] = {SpeedControllerType.CANTalonSRX, SpeedControllerType.CANTalonSRX, SpeedControllerType.CANTalonSRX, SpeedControllerType.CANTalonSRX};
    

    // Directional System (Grabber/Lift) Constants
    public final static int LIFT_MOTOR_LEFT = 0;
    public final static int LIFT_MOTOR_RIGHT = 1;
    public final static int LIFT_MOTORS[] = {LIFT_MOTOR_LEFT, LIFT_MOTOR_RIGHT};
    public final static SpeedControllerType LIFT_MOTOR_TYPES[] = {SpeedControllerType.Spark, SpeedControllerType.Spark};
    public final static double LIFT_TIME_SCALE_UP = 2.75;
    public final static double LIFT_TIME_SCALE_DOWN = 3.0;
    public final static double LIFT_TIME_SWITCH_UP = 0.78;
    
    public final static int GRABBER_MOTOR_LEFT = 4;
    public final static int GRABBER_MOTOR_RIGHT = 5;
    public final static int GRABBER_MOTORS[] = {GRABBER_MOTOR_LEFT, GRABBER_MOTOR_RIGHT};
    public final static SpeedControllerType GRABBER_MOTOR_TYPES[] = {SpeedControllerType.Spark, SpeedControllerType.Spark};
    public final static double GRABBER_TIME_EJECT = 1.0;


    // Encoder Constants
    // public final static int ENCODER_INPUT_FL_A = 4;
	// public final static int ENCODER_INPUT_FL_B = 5;
	// public final static int ENCODER_INPUT_FR_A = 6;
	// public final static int ENCODER_INPUT_FR_B = 7;
	// public final static int ENCODER_INPUT_RL_A = 2;
	// public final static int ENCODER_INPUT_RL_B = 3; 
	// public final static int ENCODER_INPUT_RR_A = 0;
    // public final static int ENCODER_INPUT_RR_B = 1;
    public final static int ENCODER_INPUTS[] = {DRIVE_WHEEL_REARRIGHT, 0, DRIVE_WHEEL_FRONTRIGHT, 0, DRIVE_WHEEL_REARLEFT, 0, DRIVE_WHEEL_FRONTLEFT, 0};
    public final static EncoderType ENCODER_TYPES[] = {EncoderType.Talon, EncoderType.Talon, EncoderType.Talon, EncoderType.Talon};

    public final static double[] ENCODER_DISTANCES_PER_PULSE = {0.53, 0.0240, 0.02832, 0.02542};
}