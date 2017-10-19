/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;


import business.useraccount.UserAccount;

/**
 *
 * @author mwhai_000
 */
public class ReportWorkRequest extends WorkRequest{
    private UserAccount player;
//    private Player playerPerson;
    private int defence;
    private int passing;
    private int physical;
    private int speed;
    private int shoot;
    private int dribbble;

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

    public UserAccount getPlayer() {
        return player;
    }

    public void setPlayer(UserAccount player) {
        this.player = player;
    }

//    public Player getPlayerPerson() {
//        return playerPerson;
//    }
//
//    public void setPlayerPerson(Player playerPerson) {
//        this.playerPerson = playerPerson;
//    }
//    
    
    
    @Override
    public String toString(){
        return this.player.getEmployee().getName();
    }
}
