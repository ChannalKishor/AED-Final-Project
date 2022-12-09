/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ngo.CareTaker;

import java.util.ArrayList;

/**
 *
 * @author chinm
 */
public class CaretakerDirectory {
    private ArrayList<Caretaker> caretakerList;

    public CaretakerDirectory() {
        caretakerList = new ArrayList<Caretaker>();
        
    }

    public ArrayList<Caretaker> getCaretakerList() {
        return caretakerList;
    }

    public void setCaretakerList(ArrayList<Caretaker> caretakerList) {
        this.caretakerList = caretakerList;
    }
    
    public Caretaker addCaretaker(){
        Caretaker c = new Caretaker();
        caretakerList.add(c);
        return c;
    }
    
    public void deleteCaretaker(Caretaker c){
        caretakerList.remove(c);
    }
}
