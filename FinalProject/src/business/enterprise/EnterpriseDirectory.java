/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import java.util.ArrayList;

/**
 *
 * @author mwhai_000
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new  ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
       public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.PrimerLeague){
            enterprise = new PrimerLeagueEnterprise(name);
            enterpriseList.add(enterprise);
        }else if (type == Enterprise.EnterpriseType.PrimerLeagueOne){
            enterprise = new PrimerLeagueOne(name);
            enterpriseList.add(enterprise);
        }else if (type == Enterprise.EnterpriseType.PrimerLeagueTwo){
            enterprise = new PrimerLeagueTwo(name);
            enterpriseList.add(enterprise);
        }else if (type == Enterprise.EnterpriseType.NationLeague){
            enterprise = new NationLeague(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
