/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.order.MasterOrderCatalog;
import business.order.Order;
import business.organization.Organization;
import business.organization.OrganizationDirectory;
import business.organization.PlayerOrganization;
import business.player.Contract;
import business.product.ProductCatalog;
import business.role.PlayerRole;
import business.useraccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author mwhai_000
 */
public abstract class Enterprise extends Organization {

    private OrganizationDirectory organizationDirectory;
    private EnterpriseType enterpriseType;
    private int clubCash;
    private ProductCatalog productCatalog;
    private MasterOrderCatalog masterOrderCatalog;
    private ArrayList<Contract> buyingContractList;
    private ArrayList<Contract> sellingContractList;

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        productCatalog = new ProductCatalog();
        masterOrderCatalog = new MasterOrderCatalog();
        buyingContractList = new ArrayList<Contract>();
        sellingContractList = new ArrayList<Contract>();
    }

    public enum EnterpriseType {
        PrimerLeague("PrimerLeague"),
        PrimerLeagueOne("PrimerLeagueOne"),
        PrimerLeagueTwo("PrimerLeagueTwo"),
        NationLeague("NationLeague");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public int getClubCash() {
        return clubCash;
    }

    public void setClubCash(int clubCash) {
        this.clubCash = clubCash;
    }

    public ArrayList<UserAccount> getPlayerFromEnterprise() {
        ArrayList<UserAccount> playerList = new ArrayList<UserAccount>();

        for (Organization o : getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof PlayerOrganization) {
                for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                    playerList.add(ua);
                }
            }
        }
        return playerList;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    public ArrayList<Contract> getBuyingContractList() {
        return buyingContractList;
    }

    public void setBuyingContractList(ArrayList<Contract> buyingContractList) {
        this.buyingContractList = buyingContractList;
    }

    public ArrayList<Contract> getSellingContractList() {
        return sellingContractList;
    }

    public void setSellingContractList(ArrayList<Contract> sellingContractList) {
        this.sellingContractList = sellingContractList;
    }

    public double getAverageVoteOfPlayer() {
        double vote = 0;
        int count = 0;
        for (Organization o : getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof PlayerOrganization) {
                for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                    count++;
                    PlayerRole playerRole = (PlayerRole) ua.getRole();
                    vote += playerRole.getVoteFromFans() * 100;
                }
            }
        }
        return vote / count;
    }

    public double getAverageSkillOfPlayer() {
        double skillScore = 0;
        int count = 0;
        for (Organization o : getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof PlayerOrganization) {
                for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                    count++;
                    PlayerRole playerRole = (PlayerRole) ua.getRole();
                    skillScore += playerRole.getSkill();
                }
            }
        }
        return skillScore / count;
    }

    public double getPopularity(PlayerRole playerRole) {
        double score = 0;
        if (playerRole.getVoteFromFans() != 0) {
            score = playerRole.getVoteFromFans() / getAverageVoteOfPlayer();
        }
        return score;
    }

    public double getSkillScoreOfPlayer(PlayerRole playerRole) {
        double score = 0;
        score = playerRole.getSkill() / getAverageVoteOfPlayer();
        return score;
    }

    public double getRemainValue(PlayerRole playerRole) {
        double remainValue = 0;
        double index = 0;

        index = (getSkillScoreOfPlayer(playerRole) + getPopularity(playerRole)) * playerRole.getHealthRisk();

        remainValue = playerRole.getCommercialValue() * index;

        return remainValue;
    }

    public double getTotalProductIncome() {
        double totalIncome = 0;

        for (Order o : getMasterOrderCatalog().getOrderCatalog()) {
            totalIncome += o.getTotalCost();
        }
        return totalIncome;
    }

    public double getTotalTransferIncome() {
        double totalIncome = 0;
        for (Contract c : sellingContractList) {

            totalIncome += c.getSignOnFee();
        }
        return totalIncome;
    }

    public double getTotalTransferOutcome() {
        double totalOutcome = 0;

//        try {

            for (Contract c : buyingContractList) {
                totalOutcome += c.getSignOnFee();
            }
//        }catch(Exception e){
//            
//        }
        return totalOutcome;
    }

    public double getTotalWageOutcomeAnnual() {
        double totalOutcome = 0;
        for (Contract c : buyingContractList) {
            totalOutcome += c.getWage() * 52;
        }
        return totalOutcome;
    }

    public double getTotalTransferFee() {
        double totalOutcome = 0;
        for (Contract c : sellingContractList) {
            totalOutcome += c.getSignOnFee();
        }
        for (Contract c : buyingContractList) {
            totalOutcome += c.getSignOnFee();
        }
        return totalOutcome;
    }

    public int getIncomingTransferNumber() {
        int num = 0;
        for (Contract c : buyingContractList) {
            num++;
        }
        return num;
    }

    public int getOutgoingTransferNumber() {
        int num = 0;
        for (Contract c : sellingContractList) {
            num++;
        }
        return num;
    }

    public double getAverageTransferFee() {
        double avg = 0;
        avg = getTotalTransferFee() / (buyingContractList.size() + sellingContractList.size());
        return avg;
    }
}
