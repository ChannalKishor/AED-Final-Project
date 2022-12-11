/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Directories;

import Funding.Donation.DonationDirectory;
import Funding.FundManager.FundManagerDirectory;
import Funding.PublicUser.PublicUserDirectory;
import Hospital.Doctor.DoctorDirectory;
import Hospital.Encounter.EncounterDirectory;
import Hospital.Hospital.HospitalDirectory;
import Hospital.Patient.PatientDirectory;
import Hospital.VitalSigns.VitalSignDirectory;
import JobApp.Applicant.ApplicantDirectory;
import JobApp.Applicant.TeacherApplyDirectory;
import Ngo.CareTaker.CaretakerDirectory;
import Ngo.Children.ChildrenDirectory;

import Ngo.NgoManager.NgoManagerDirectory;
import Pharmacy.MedicineDirectory;
import Pharmacy.Pharmacist.PharmacistDirectory;
import School.Application.ApplicationDirectory;
import School.FinalResult.FinalResultDirectory;
import School.Principal.PrincipalDirectory;
import School.Student.Student;
import School.Student.StudentDirectory;
import School.Teacher.TeacherDirectory;

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
    private EncounterDirectory encounterlist;
    private DoctorDirectory doctorList;
    private PatientDirectory patientList;
    private HospitalDirectory hospitalList;
    private PharmacistDirectory pharmlist;
    private FinalResultDirectory resList;
    private ChildrenDirectory childrenList;
    private TeacherDirectory teacherList;
    private StudentDirectory studentList;
    private ApplicantDirectory applicantList;
    private PrincipalDirectory principalList;
    private ApplicationDirectory applicationList;
    private VitalSignDirectory vitalSignList;
    private MedicineDirectory medicineList;
    private DonationDirectory donationList;
    private TeacherApplyDirectory applist;

    
    public MainSystem(){
        ngoManagerList = new NgoManagerDirectory();
        careTakerList = new CaretakerDirectory();
        fundManagerList = new FundManagerDirectory();
        publicUserList = new PublicUserDirectory();
        pharmlist = new PharmacistDirectory();
        doctorList = new DoctorDirectory();
        patientList = new PatientDirectory();
        hospitalList = new HospitalDirectory();
        encounterlist = new EncounterDirectory();
        resList = new FinalResultDirectory();
        childrenList = new ChildrenDirectory();
        teacherList = new TeacherDirectory();
        studentList = new StudentDirectory();
        applicantList = new ApplicantDirectory();
        principalList = new PrincipalDirectory();
        applicationList = new ApplicationDirectory();
        vitalSignList = new VitalSignDirectory();
        medicineList = new MedicineDirectory();
        donationList = new DonationDirectory();
        applist = new TeacherApplyDirectory();
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

 
    public ChildrenDirectory getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(ChildrenDirectory childrenList) {
        this.childrenList = childrenList;
    }

    public static MainSystem getData() {
        return data;
    }

    public static void setData(MainSystem data) {
        MainSystem.data = data;
    }

    public TeacherDirectory getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(TeacherDirectory teacherList) {
        this.teacherList = teacherList;
    }

    public StudentDirectory getStudentList() {
        return studentList;
    }

    public void setStudentList(StudentDirectory studentList) {
        this.studentList = studentList;
    }

    public ApplicantDirectory getApplicantList() {
        return applicantList;
    }

    public PrincipalDirectory getPrincipalList() {
        return principalList;
    }

    public ApplicationDirectory getApplicationList() {
        return applicationList;
    }

    public EncounterDirectory getEncounterlist() {
        return encounterlist;
    }

    public PharmacistDirectory getPharmlist() {
        return pharmlist;
    }

    public VitalSignDirectory getVitalSignList() {
        return vitalSignList;
    }

    public MedicineDirectory getMedicineList() {
        return medicineList;
    }

    public DonationDirectory getDonationList() {
        return donationList;
    }

    public void setDonationList(DonationDirectory donationList) {
        this.donationList = donationList;
    }

    public TeacherApplyDirectory getApplist() {
        return applist;
    }

    public FinalResultDirectory getResList() {
        return resList;
    }
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public String toString(){
        return "System";
    }
}
