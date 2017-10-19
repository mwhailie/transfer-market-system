/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.MarketingPersonOrganization;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.marketingpersonrole.MarketingPersonWorkAreaJPanel;

/**
 *
 * @author mwhai_000
 */
public class MarketingPersonRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new MarketingPersonWorkAreaJPanel(userProcessContainer, account, (MarketingPersonOrganization)organization, enterprise, business);
    }
}
