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
import JobApp.Applicant.ApplicantDirectory;
import Ngo.CareTaker.CaretakerDirectory;
import Ngo.Children.ChildrenDirectory;
import Ngo.Ngo.NgoDirectory;
import Ngo.NgoManager.NgoManagerDirectory;
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
    private DoctorDirectory doctorList;
    private PatientDirectory patientList;
    private HospitalDirectory hospitalList;
    private NgoDirectory ngoList;
    private ChildrenDirectory childrenList;
    private TeacherDirectory teacherList;
    private StudentDirectory studentList;
    private ApplicantDirectory applicantList;
    private PrincipalDirectory principalList;

    
    public MainSystem(){
        ngoManagerList = new NgoManagerDirectory();
        careTakerList = new CaretakerDirectory();
        fundManagerList = new FundManagerDirectory();
        publicUserList = new PublicUserDirectory();
        doctorList = new DoctorDirectory();
        patientList = new PatientDirectory();
        hospitalList = new HospitalDirectory();
        ngoList = new NgoDirectory();
        childrenList = new ChildrenDirectory();
        teacherList = new TeacherDirectory();
        studentList = new StudentDirectory();
        applicantList = new ApplicantDirectory();
        principalList = new PrincipalDirectory();
        
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
    
    
    
    
    
    
    
    @Override
    public String toString(){
        return "System";
    }
}
