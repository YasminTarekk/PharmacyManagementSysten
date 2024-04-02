/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.ArrayList;

/**
 *
 * @author Yasmin
 */
public class DrugCatalog {
     //drugs menu to make it easier for the customer to find what they're searching for
    private ArrayList<Drug> drugList;


    public DrugCatalog(){
    this.drugList = new ArrayList<>();
}
    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }

    public Drug addDrugs(Drug d) {
       // Drug d = new Drug();
        drugList.add(d);
        return d;
        
    }
    public void removeDrug(Drug d)
    {
        drugList.remove(d);
    }

    @Override
    public String toString() {
        return "DrugCatalog{" + drugList + '}';
    }
    
}
