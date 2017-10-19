/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.ManagerRole;
import business.role.MarketingPersonRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author mwhai_000
 */
public class MarketingPersonOrganization extends Organization{
    
    public MarketingPersonOrganization() {
        super(Organization.Type.MarketingPerson.getValue());
    }
        @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MarketingPersonRole());
        return roles;
    }
}
