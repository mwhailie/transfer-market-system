/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.CoachOrganization;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.coachrole.CoachWorkAreaJPanel;

/**
 *
 * @author mwhai_000
 */
public class CoachRole extends Role{
    
 @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CoachWorkAreaJPanel(userProcessContainer, account, (CoachOrganization)organization, enterprise);
    }
    
}
