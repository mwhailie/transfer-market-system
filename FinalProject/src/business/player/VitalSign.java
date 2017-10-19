/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.player;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author mwhai_000
 */
public class VitalSign implements Comparable {

    private int height;
    private int weight;

    private boolean smoker;
    private boolean getInjured;

    private double heartbeat;
    private double bloodPressure;

    private Timestamp timeStamp;

    public VitalSign() {
        Date now = new Date();
        timeStamp = new Timestamp(now.getTime());
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isSmoker() {
        return smoker;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(double heartbeat) {
        this.heartbeat = heartbeat;
    }

    public boolean isGetInjured() {
        return getInjured;
    }

    public void setGetInjured(boolean getInjured) {
        this.getInjured = getInjured;
    }

    public int getHealthScore() {
        int healthScore = 0;
        
        double BP = bloodPressure;
        double HB = heartbeat;
        double heightInDouble = height;
        double heightInMeter = heightInDouble/ 100;
        double bmi = weight / (heightInMeter * heightInMeter);

        if (isGetInjured()) {
            healthScore -= 4;
            if (isSmoker()) {
                healthScore -= 3;
            }

            if (bmi < 18.5) {
                healthScore -= 1;
            } else if (bmi < 20.5) {
                healthScore += 0;
            } else if (bmi < 21.5) {
                healthScore += 1;
            } else if (bmi < 22.5) {
                healthScore += 2;
            } else if (bmi < 25){
                healthScore += 0;
            }  else if (bmi <30){
                healthScore -= 1;
            }else {
                healthScore -= 2;
            }   
        } else{
            
            if (isSmoker()) {
            healthScore -= 4;}
            
            if (bmi < 18.5) {
                healthScore -= 2;
            } else if (bmi < 20.5) {
                healthScore += 0;
            } else if (bmi < 21.5) {
                healthScore += 1;
            } else if (bmi < 22.5) {
                healthScore += 2;
            } else if (bmi < 25){
                healthScore += 0;
            }  else if (bmi <30){
                healthScore -= 1;
            }else {
                healthScore -= 2;
            }
        }        
            if (BP <= 129) {
                healthScore += 3;
            } else if (BP <= 139) {
                healthScore += 2;
            } else if (BP <= 159) {
                healthScore += 1;
            } else {
                healthScore += 0;
            }
            
            if (HB <=  60) {
                healthScore += 4;
            } else if (HB <= 65) {
                healthScore += 5;
            } else if( HB <= 69) {
                healthScore +=4;
            }else if( HB <= 73) {
                healthScore += 3;
            }else if( HB <= 78) {
                healthScore += 2;
            }else if( HB <= 84) {
                healthScore += 1;
            } else {
                healthScore -= 0;
            }
            
        return healthScore;
    }

    @Override
    public String toString() {
        return timeStamp.toString();
    }

    @Override
    public int compareTo(Object o) {
        Timestamp ts = ((VitalSign) o).getTimeStamp();

        if (ts == null || this.timeStamp == null) {
            return 0;
        }

        return ts.compareTo(this.timeStamp);
        //descending
    }

}
