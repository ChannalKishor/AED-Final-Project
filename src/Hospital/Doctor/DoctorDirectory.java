/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Doctor;
import java.util.ArrayList; 

/**
 *
 * @author kishor
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorList;
    
    public DoctorDirectory() {
        doctorList = new ArrayList<Doctor>();   
    }

    public ArrayList<Doctor> getHospitalAdminList() {
        return doctorList;
    }

    public void setHospitalAdminList(ArrayList<Doctor> hospitalAdminList) {
        this.doctorList = hospitalAdminList;
    }
    
    public Doctor addHospitalAdmin(){
        Doctor newhospitaladmin = new Doctor();
        doctorList.add(newhospitaladmin);
        return newhospitaladmin;
    }
    
    public void deleteHospitalAdmin(Doctor m){
        doctorList.remove(m);
    }
    
}
