package business;

import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
//import business.player.PlayerDirectory;
import business.organization.PlayerOrganization;
import business.player.Contract;
import business.role.Role;
import business.role.SystemAdminRole;
import business.useraccount.UserAccount;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mwhai_000
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
//    private PlayerDirectory playerDirectory;

    private EcoSystem() {

        //private: singleton
        super(null);
        networkList = new ArrayList();

    }

//    public PlayerDirectory getPlayerDirectory() {
//        return playerDirectory;
//    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;

    }

    public ArrayList<UserAccount> getPlayerByEnterprise(Enterprise enterprise) {
        ArrayList<UserAccount> playerList = new ArrayList<UserAccount>();

        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof PlayerOrganization) {
                for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                    playerList.add(ua);
                }
            }
        }
        return playerList;
    }

    public ArrayList<UserAccount> getAllPlayer() {
        ArrayList<UserAccount> playerList = new ArrayList<UserAccount>();
        for (Network n : business.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    if (o instanceof PlayerOrganization) {
                        for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                            playerList.add(ua);
                        }
                    }
                }
            }
        }
        return playerList;
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
}
