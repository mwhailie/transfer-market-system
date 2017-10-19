/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.player;

import business.enterprise.Enterprise;
import business.useraccount.UserAccount;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author mwhai_000
 */
public class Contract implements Comparable {
    
    
    private Enterprise buyer;
    private Enterprise seller;

    private int wage;
    private int signOnFee;
    private int bonus;

    private Date contractStartDate;
    private Date contractEndDate;
    
    
    private Timestamp timeStamp;

    public Contract() {
        Date now = new Date();
        timeStamp = new Timestamp(now.getTime());
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

    @Override
    public String toString() {
        return "From " + seller.getName() + "to " + buyer.getName();
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
