/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.Principal;

import School.Teacher.TeacherDirectory;
import java.util.ArrayList;

/**
 *
 * @author chinm
 */
public class PrincipalDirectory {
    private ArrayList<Principal> principalList;

    public PrincipalDirectory() {
        principalList = new ArrayList<Principal>();
        
    }

    public ArrayList<Principal> getPrincipalList() {
        return principalList;
    }

    public void setPrincipalList(ArrayList<Principal> principalList) {
        this.principalList = principalList;
    }
    
    public Principal addPrincipal(){
        Principal n = new Principal();
        principalList.add(n);
        return n;
    }
    
    public void deletePrincipal(Principal m){
        principalList.remove(m);
    }
}
