/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Directories;

import Funding.FundManager.FundManagerDirectory;
import Funding.PublicUser.PublicUserDirectory;
import Hospital.Doctor.DoctorDirectory;
import Hospital.Hospital.HospitalDirectory;
import Hospital.Patient.PatientDirectory;
import Ngo.CareTaker.CaretakerDirectory;
import Ngo.Ngo.NgoDirectory;
import Ngo.NgoManager.NgoManagerDirectory;

/**
 *
 * @author chinm
 */
public class MainSystem {
    private static MainSystem data;
    private NgoManagerDirectory ngoManagerList;
    private CaretakerDirectory careTakerList;
    private FundManagerDirectory fundManagerList;
    private PublicUserDirectory publicUserList;
    private DoctorDirectory doctorList;
    private PatientDirectory patientList;
    private HospitalDirectory hospitalList;
    private NgoDirectory ngoList;

    
    public MainSystem(){
        ngoManagerList = new NgoManagerDirectory();
        careTakerList = new CaretakerDirectory();
        fundManagerList = new FundManagerDirectory();
        publicUserList = new PublicUserDirectory();
        doctorList = new DoctorDirectory();
        patientList = new PatientDirectory();
        hospitalList = new HospitalDirectory();
        ngoList = new NgoDirectory();
    }
    
   
    public static MainSystem getInstance()
    {
        if(data == null){
            data = new MainSystem();
        }
        
        return data;
    }

    public NgoManagerDirectory getNgoManagerList() {
        return ngoManagerList;
    }

    public void setNgoManagerList(NgoManagerDirectory ngoManagerList) {
        this.ngoManagerList = ngoManagerList;
    }

    public CaretakerDirectory getCareTakerList() {
        return careTakerList;
    }

    public void setCareTakerList(CaretakerDirectory careTakerList) {
        this.careTakerList = careTakerList;
    }

    public FundManagerDirectory getFundManagerList() {
        return fundManagerList;
    }

    public void setFundManagerList(FundManagerDirectory fundManagerList) {
        this.fundManagerList = fundManagerList;
    }

    public PublicUserDirectory getPublicUserList() {
        return publicUserList;
    }

    public void setPublicUserList(PublicUserDirectory publicUserList) {
        this.publicUserList = publicUserList;
    }

    public DoctorDirectory getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(DoctorDirectory doctorList) {
        this.doctorList = doctorList;
    }

    public PatientDirectory getPatientList() {
        return patientList;
    }

    public void setPatientList(PatientDirectory patientList) {
        this.patientList = patientList;
    }

    public HospitalDirectory getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(HospitalDirectory hospitalList) {
        this.hospitalList = hospitalList;
    }

    public NgoDirectory getNgoList() {
        return ngoList;
    }

    public void setNgoList(NgoDirectory ngoList) {
        this.ngoList = ngoList;
    }
    
    
    
    
    @Override
    public String toString(){
        return "System";
    }
}
