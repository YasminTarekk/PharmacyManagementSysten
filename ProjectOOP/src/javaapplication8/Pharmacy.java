/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Yasmin
 */
public class Pharmacy {
    
       //main info for the store 
    private String storeName;
    private String storeLocation;
    private DrugCatalog drugCatalog;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public DrugCatalog getDrugCatalog() {
        return drugCatalog;
    }

    public void setDrugCatalog(DrugCatalog drugCatalog) {
        this.drugCatalog = drugCatalog;
    }

    @Override
    public String toString() {
        return "Pharmacy{" + "storeName=" + storeName + ", storeLocation=" + storeLocation + ", drugCatalog=" + drugCatalog + '}';
    }
    
}
