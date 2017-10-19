/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.Role;
import business.role.ScoutRole;
import java.util.ArrayList;

/**
 *
 * @author mwhai_000
 */
public class ScoutOrganization extends Organization{
    
    public ScoutOrganization() {
        super(Organization.Type.Scout.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ScoutRole());
        return roles;
    }
    

    
}
