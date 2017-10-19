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
public class BossToManagerWorkRequest extends WorkRequest{
    private UserAccount player;
    private int ceilingPrice;
    private int floorPrice;
    private int targetPrice;

    public UserAccount getPlayer() {
        return player;
    }

    public void setPlayer(UserAccount player) {
        this.player = player;
    }



    public int getCeilingPrice() {
        return ceilingPrice;
    }

    public void setCeilingPrice(int ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    public int getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(int floorPrice) {
        this.floorPrice = floorPrice;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }
    
    @Override
    public String toString(){
        return this.player.getEmployee().getName();
    }
}
