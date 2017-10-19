/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.sort;

import business.role.PlayerRole;
import business.useraccount.UserAccount;
import java.util.Comparator;

/**
 *
 * @author mwhai_000
 */
public class SortByValue implements Comparator<UserAccount>{

    @Override
    public int compare(UserAccount o1, UserAccount o2) {
        return ((PlayerRole)(o1.getRole())).getCommercialValue()-(((PlayerRole)(o2.getRole())).getCommercialValue());
    }
    
}
