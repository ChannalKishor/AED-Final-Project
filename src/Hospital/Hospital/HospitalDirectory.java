/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Hospital;

import Ngo.NgoManager.NgoManager;
import java.util.ArrayList;

/**
 *
 * @author kishor
 */
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitalHospitalList;
    
    public HospitalDirectory() {
        hospitalHospitalList = new ArrayList<Hospital>();
        
    }

    public ArrayList<Hospital> getHospitalHospitalList() {
        return hospitalHospitalList;
    }

    public void setHospitalHospitalList(ArrayList<Hospital> hospitalHospitalList) {
        this.hospitalHospitalList = hospitalHospitalList;
    }
    
    public Hospital addHospitalHospital(){
        Hospital newHospital = new Hospital();
        hospitalHospitalList.add(newHospital);
        return newHospital;
    }
    
    public void deleteHospitalHospital(Hospital m){
        hospitalHospitalList.remove(m);
    }
//    
//    public NgoManager findNgoManager(String username, String password){
//        for(NgoManager n: ngoManagerList){
//            if(n.getUsername().equals(username) && n.getPassword().equals(password)){
//                return n;
//            }
//            
//        }
//        return null;
//    }
//    
//    public boolean uiqueNgoManagerId(String id) {
//
//        for (NgoManager d : ngoManagerList) {
//
//            if (id.equals(d.getNgoManagerId())) {
//                return false;
//            }
//        }
//            return true; 
//    } 
//    
//    public boolean uniqueNgoManagerUsername(String username){
//        for (NgoManager d: ngoManagerList) {
//
//            if (username.equals(d.getUsername())) {
//                return false;
//            }
//        }
//            return true;
//    }

}
