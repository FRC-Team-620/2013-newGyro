/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.SimpleRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends SimpleRobot {
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    Gyro g= new Gyro(new AnalogChannel(1)); 
    public void autonomous() {
        
       g.reset();
          while(isEnabled() && isAutonomous()){
        //      System.out.println("LOLOL");
              System.out.println(g.getAngle());
        }
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {

    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
    
    }
}
