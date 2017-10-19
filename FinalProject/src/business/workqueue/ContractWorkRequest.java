/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import business.enterprise.Enterprise;
import business.useraccount.UserAccount;
import java.util.Date;

/**
 *
 * @author mwhai_000
 */
public class ContractWorkRequest extends WorkRequest{
    private Enterprise buyer;
    private Enterprise seller;
    private UserAccount player;
    private int wage;
    private int signOnFee;
    private int bonus;

    private Date contractStartDate;
    private Date contractEndDate;
    public Enterprise getBuyer() {
        return buyer;
    }

    public void setBuyer(Enterprise buyer) {
        this.buyer = buyer;
    }

    public Enterprise getSeller() {
        return seller;
    }

    public void setSeller(Enterprise seller) {
        this.seller = seller;
    }

    public UserAccount getPlayer() {
        return player;
    }

    public void setPlayer(UserAccount player) {
        this.player = player;
    }

    
    
    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getSignOnFee() {
        return signOnFee;
    }

    public void setSignOnFee(int signOnFee) {
        this.signOnFee = signOnFee;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }
    
    @Override
    public String toString(){
        return this.player.getEmployee().getName();
    }
}
