/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author abhisheksagar
 */
public class Vitalshistory {
    private ArrayList<Vitals> history;
    
    public Vitalshistory(){
        this.history=new ArrayList<Vitals>();
    }

    public ArrayList<Vitals> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Vitals> history) {
        this.history = history;
    }
    
    public Vitals addNewvital(){
        Vitals vital= new Vitals();
        history.add(vital);
        return vital;
    }
    public void deleteVitals(Vitals v){
        history.remove(v);
    }
}
