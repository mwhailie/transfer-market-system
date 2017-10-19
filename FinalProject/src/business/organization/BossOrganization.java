/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.BossRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author mwhai_000
 */
public class BossOrganization extends Organization{
    
    public BossOrganization() {
        super(Organization.Type.Boss.getValue());
    }
        @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BossRole());
        return roles;
    }
}
