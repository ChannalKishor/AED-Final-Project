/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.Teacher;


import java.util.ArrayList;

/**
 *
 * @author chinm
 */
public class TeacherDirectory {
    private ArrayList<Teacher> teacherList;

    public TeacherDirectory() {
        teacherList = new ArrayList<Teacher>();
        
    }

    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(ArrayList<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
    
    public Teacher addTeacher(){
        Teacher newmanager = new Teacher();
        teacherList.add(newmanager);
        return newmanager;
    }
    
    public void deleteTeacher(Teacher m){
        teacherList.remove(m);
    }
    
}
