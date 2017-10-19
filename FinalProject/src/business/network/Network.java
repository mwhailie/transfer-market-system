/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import business.enterprise.Enterprise;
import business.enterprise.EnterpriseDirectory;
import business.player.Contract;

/**
 *
 * @author mwhai_000
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    public double getTotalTransferOutcome( ) {
        double totalOutcome = 0;
          for(Enterprise e : enterpriseDirectory.getEnterpriseList()){
            totalOutcome += e.getTotalTransferOutcome();
        }
        return totalOutcome;
    }
    
    public double getTotalTransferIncome( ) {
        double totalOutcome = 0;
        for(Enterprise e : enterpriseDirectory.getEnterpriseList()){
            totalOutcome += e.getTotalTransferIncome();
        }
        return totalOutcome;
    }
    
    public int getIncomingTransferNumber( ) {
        int num = 0;
        for(Enterprise e : enterpriseDirectory.getEnterpriseList()){
            num += e.getIncomingTransferNumber();
        }
        return num;
    }
    
    public int getOutgoingTransferNumber( ) {
        int num = 0;
        for(Enterprise e : enterpriseDirectory.getEnterpriseList()){
            num += e.getOutgoingTransferNumber();
        }
        return num;
    }
    
    public double getAverageTransferFee( ) {
        double avg = 0;
        int num = 0;
        for(Enterprise e : enterpriseDirectory.getEnterpriseList()){
            avg += e.getTotalTransferFee();
            num += (e.getIncomingTransferNumber()+e.getOutgoingTransferNumber());
        }
        return avg/num;
    }

    @Override
    public String toString(){
        return name;
    }
}
