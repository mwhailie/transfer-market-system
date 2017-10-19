
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.player;

import business.employee.Employee;
import java.util.Date;

/**
 *
 * @author leslie
 */
public class Player extends Employee{

    private String nationality;
    private Date birthDate;
    private String currentClubName;
    private String position;
    private int commercialValue;


    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCurrentClubName() {
        return currentClubName;
    }

    public void setCurrentClubName(String currentClubName) {
        this.currentClubName = currentClubName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getCommercialValue() {
        return commercialValue;
    }

    public void setCommercialValue(int commercialValue) {
        this.commercialValue = commercialValue;
    }
    
    
}
  

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package business.player;
//
//import business.employee.Employee;
//import java.util.Date;
//
///**
// *
// * @author leslie
// */
//public class Player extends Employee{
//
//    private String nationality;
//    private Date birthDate;
//    private String currentClubName;
//    private String position;
//    private int commercialValue;
//    private VitalSignHistory vsh;
//    private Date contractStartDate;
//    private Date contractEndDate;
//
//    public String getPosition() {
//        return position;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }
//
////    public enum Position{
////        GoalKeeper("Goal Keeper"),
////        Defender("Defender"),
////        Midfielder("Midfielder"),
////        Forward("Forward"),
////        CenterForword("Center Forword"),
////        AttackingMidfielder("AttackingMidfielder"),
////        CenterMidfielder("CenterMidfielder"),
////        SideMidfielder("SideMidfielder"),
////        FullBack("FullBack"),
////        CenterBack("CenterBack"),
////        WingBack("WingBack"),
////        ;
////        
////        private String value;
////        private Position(String value){
////            this.value = value;
////        }
////
////        public String getValue() {
////            return this.value;
////        }
////        
////        @Override
////        public String toString() {
////            return value;
////        }
////    }
//    public String getNationality() {
//        return nationality;
//
//    }
//
//    public void setNationality(String nationality) {
//        this.nationality = nationality;
//    }
//
//    public Date getBirthDate() {
//        return birthDate;
//    }
//
//    public void setBirthDate(Date birthDate) {
//        this.birthDate = birthDate;
//    }
//
//    public String getCurrentClubName() {
//        return currentClubName;
//    }
//
//    public void setCurrentClubName(String currentClubName) {
//        this.currentClubName = currentClubName;
//    }
//
//    public int getCommercialValue() {
//        return commercialValue;
//    }
//
//    public void setCommercialValue(int commercialValue) {
//        this.commercialValue = commercialValue;
//    }
//
//    public VitalSignHistory getVsh() {
//        return vsh;
//    }
//
//    public void setVsh(VitalSignHistory vsh) {
//        this.vsh = vsh;
//
//    }
//
//    public Date getContractStartDate() {
//        return contractStartDate;
//    }
//
//    public void setContractStartDate(Date contractStartDate) {
//        this.contractStartDate = contractStartDate;
//    }
//
//    public Date getContractEndDate() {
//        return contractEndDate;
//    }
//
//    public void setContractEndDate(Date contractEndDate) {
//        this.contractEndDate = contractEndDate;
//    }
//
//
//
//}
