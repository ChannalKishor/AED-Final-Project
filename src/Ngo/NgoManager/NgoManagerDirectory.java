/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ngo.NgoManager;

import java.util.ArrayList;

/**
 *
 * @author chinm
 */
public class NgoManagerDirectory {
    
    private ArrayList<NgoManager> ngoManagerList;

    public NgoManagerDirectory() {
        ngoManagerList = new ArrayList<NgoManager>();
        
    }

    public ArrayList<NgoManager> getNgoManagerList() {
        return ngoManagerList;
    }

    public void setNgoManagerList(ArrayList<NgoManager> ngoManagerList) {
        this.ngoManagerList = ngoManagerList;
    }
    
    public NgoManager addNgoManager(){
        NgoManager newmanager = new NgoManager();
        ngoManagerList.add(newmanager);
        return newmanager;
    }
    
    public void deleteNgoManager(NgoManager m){
        ngoManagerList.remove(m);
    }
    
    
    
    
    
}
