/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.player;

import java.util.ArrayList;

/**
 *
 * @author mwhai_000
 */
public class ContractHistory {
    private ArrayList<Contract> contractList;

    public ContractHistory() {
        contractList = new ArrayList<Contract>();
    }

    public ArrayList<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(ArrayList<Contract> contractList) {
        this.contractList = contractList;
    }
    
    
}
