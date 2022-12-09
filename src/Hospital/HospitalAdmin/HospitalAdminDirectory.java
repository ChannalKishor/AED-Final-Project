/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.HospitalAdmin;

import java.util.ArrayList; 
/**
 *
 * @author chinm
 */
import java.util.ArrayList;

/**
 *
 * @author chinm
 */
public class HospitalAdminDirectory {
    
    private ArrayList<HospitalAdmin> hospitalAdminList;

    public HospitalAdminDirectory() {
        hospitalAdminList = new ArrayList<HospitalAdmin>();
        
    }

    public ArrayList<HospitalAdmin> getHospitalAdminList() {
        return hospitalAdminList;
    }

    public void setNgoManagerList(ArrayList<HospitalAdmin> hospitalAdminList) {
        this.hospitalAdminList = hospitalAdminList;
    }
//    
//    public NgoManager addNgoManager(){
//        NgoManager newmanager = new NgoManager();
//        ngoManagerList.add(newmanager);
//        return newmanager;
//    }
//    
//    public void deleteNgoManager(NgoManager m){
//        ngoManagerList.remove(m);
//    }
//    
//    
//    
    
    
    
}