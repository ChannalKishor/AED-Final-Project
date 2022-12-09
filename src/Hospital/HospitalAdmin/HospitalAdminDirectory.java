/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.HospitalAdmin;
import java.util.ArrayList; 
/**
 *
 * @author kishor
 */
import java.util.ArrayList;

/**
 *
 * @author kishor
 */
public class HospitalAdminDirectory {
    
    private ArrayList<HospitalAdmin> hospitalAdminList;

    public HospitalAdminDirectory() {
        hospitalAdminList = new ArrayList<HospitalAdmin>();
        
    }

    public ArrayList<HospitalAdmin> getHospitalAdminList() {
        return hospitalAdminList;
    }

    public void setHospitalAdminList(ArrayList<HospitalAdmin> hospitalAdminList) {
        this.hospitalAdminList = hospitalAdminList;
    }
    
    public HospitalAdmin addHospitalAdmin(){
        HospitalAdmin newhospitaladmin = new HospitalAdmin();
        hospitalAdminList.add(newhospitaladmin);
        return newhospitaladmin;
    }
    
    public void deleteHospitalAdmin(HospitalAdmin m){
        hospitalAdminList.remove(m);
    }
    
}