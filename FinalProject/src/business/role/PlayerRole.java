/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.organization.PlayerOrganization;
import business.player.Contract;
import business.player.ContractHistory;
import business.player.VitalSign;
import business.player.Vote;
import business.useraccount.UserAccount;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import javax.swing.JPanel;
import userinterface.playerrole.PlayerWorkAreaJPanel;

/**
 *
 * @author mwhai_000
 */
public class PlayerRole extends Role implements Comparable {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PlayerWorkAreaJPanel(userProcessContainer, account, (PlayerOrganization) organization, enterprise);
    }

    private String nationality;
    private Date birthDate;
    private String currentClubName;
    private String position;
    private int commercialValue;
    
    ;
    private ArrayList<Vote> voteList;
    private ArrayList<Contract> contractList;
    private ArrayList<VitalSign> vitalSignList;
   
    private int defence;
    private int passing;
    private int physical;
    private int speed;
    private int shoot;
    private int dribbble;

    public PlayerRole() {
        voteList = new ArrayList<>();
        contractList = new ArrayList<>();
        vitalSignList = new ArrayList<>();

    }
    
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        Calendar now = Calendar.getInstance();
        Calendar dob = Calendar.getInstance();
        dob.setTime(birthDate);
        return (now.get(Calendar.YEAR) - dob.get(Calendar.YEAR));
    }
    
    
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

    public int getCommercialValue() {
        return commercialValue;
    }

    public void setCommercialValue(int commercialValue) {
        this.commercialValue = commercialValue;
    }

    public ArrayList<Vote> getVoteList() {
        return voteList;
    }

    public void setVoteList(ArrayList<Vote> voteList) {
        this.voteList = voteList;
    }

    public Vote addVote() {
        Vote v = new Vote();//create a new obj of vitalsigh
        voteList.add(v);// add the vitalsigh to arraylist
        return v;//obj is return when method called
    }

    public ArrayList<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(ArrayList<Contract> contractList) {
        this.contractList = contractList;
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
    public VitalSign addVitalSign() {
        VitalSign vs = new VitalSign();//create a new obj of vitalsigh
        vitalSignList.add(vs);// add the vitalsigh to arraylist
        return vs;//obj is return when method called
    }
    
    public Contract addContract() {
        Contract c = new Contract();//create a new obj of vitalsigh
        contractList.add(c);// add the vitalsigh to arraylist
        return c;//obj is return when method called
    }

    public int getVoteNumber(){
    return voteList.size();
}
    
    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getShoot() {
        return shoot;
    }

    public void setShoot(int shoot) {
        this.shoot = shoot;
    }

    public int getDribbble() {
        return dribbble;
    }

    public void setDribbble(int dribbble) {
        this.dribbble = dribbble;
    }

    public int getVoteFromFans(){
        int count = 0;
        for(Vote v: voteList){
            if(v.getFromClub().getName().equals(this.currentClubName)){
                count++;
            }
        }
        return count;
    }
    
    
    
    public int getVoteFromOtherClub(){
        return voteList.size()-getVoteFromFans();
    }
    
    public Contract getLastestContract() {
        Contract c = new Contract();
        Collections.sort(contractList);
        c = contractList.get(0);
        return c;
    }
    
    public VitalSign getLastestVitalSign() {
        VitalSign vs = new VitalSign();
        Collections.sort(vitalSignList);
        vs = vitalSignList.get(0);// add the vitalsigh to arraylist
        return vs;//obj is return when method called
    }
    
    public double getSkill(){
        double skill = 0;
        skill = (defence+passing+physical+speed+shoot+dribbble)/6;
        return skill;
    }
    
    public double getHealthRisk(){
        double score = 0;
        
        score = getLastestVitalSign().getHealthScore()+10;
        if(getAge()>40){
            score -= 1;
        }else if(getAge()>35){
            score +=0;
        }else if(getAge()>30){
            score +=1;
        }else if(getAge()>25){
            score +=2;
        }else {
            score +=3;
        }
        return score;
    }
    

    
    @Override
    public int compareTo(Object o) {
        int price = ((PlayerRole) o).getCommercialValue();
        return this.commercialValue - price;
    }

}
