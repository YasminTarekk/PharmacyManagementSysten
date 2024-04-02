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
public class Drug {
  private int drugID;
 private String drugName;
 private String composition;
 private String drugType;
 private int availibility;
 private String expirationDate;
 private String productionDate;
 private int drugPrice;

    public int getDrugID() {
        return drugID;
    }

    public void setDrugID(int drugID) {
        this.drugID = drugID;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public int getAvailibility() {
        return availibility;
    }

    public void setAvailibility(int availibility) {
        this.availibility = availibility;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public int getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(int drugPrice) {
        this.drugPrice = drugPrice;
    }

    @Override
    public String toString() {
        return "Drug{" + "drugID=" + drugID + ", drugName=" + drugName + ", composition=" + composition + ", drugType=" + drugType + ", availibility=" + availibility + ", expirationDate=" + expirationDate + ", productionDate=" + productionDate + ", drugPrice=" + drugPrice + '}';
    }
   
    public void  payment(double drugPrice){
  //returns the price meant for te customer to pay
   System.out.print("Drug price:" + drugPrice);
   }
   public void payment(double drugPrice,double salesPrice ){
   //returns the profit 
   System.out.println("The profit is:"+(drugPrice-salesPrice));
   }
}
