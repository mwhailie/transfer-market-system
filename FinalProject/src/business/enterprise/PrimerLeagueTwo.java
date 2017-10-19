/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author mwhai_000
 */
public class PrimerLeagueTwo extends Enterprise{
    
    public PrimerLeagueTwo(String name) {
        super(name, EnterpriseType.PrimerLeagueTwo);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
