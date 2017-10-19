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
import business.organization.PhysioOrganization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.marketingpersonrole.MarketingPersonWorkAreaJPanel;
import userinterface.physiorole.PhysioWorkAreaJPanel;

/**
 *
 * @author mwhai_000
 */
public class PhysioRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PhysioWorkAreaJPanel(userProcessContainer, account, (PhysioOrganization)organization, enterprise, business);
    }
}
