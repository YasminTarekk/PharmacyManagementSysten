/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.util.Scanner;
/**
 *
 * @author Yasmin
 */
public class JavaApplication8 {

    /**
     
     */
    public static Scanner l = new Scanner(System.in);
    public static void main(String[] args) {
        
   
       boolean f = true;
     Pharmacy P1 = new Pharmacy();
        System.out.println("Please Enter The Pharmacy's Name");
        P1.setStoreName(l.next());
        System.out.println("Please Enter The Pharmacy's Location");
        P1.setStoreLocation(l.next());
        Drug d1 = new Drug();
        d1.setAvailibility(3);
        d1.setComposition("HCL/Hp2");
        d1.setDrugID(223);
        d1.setDrugName("Augmantin");
        d1.setDrugPrice(15);
        d1.setDrugType("Adult");
        d1.setExpirationDate("16/9/2022");
        d1.setProductionDate("16/9/2018");
        Drug d2 = new Drug();
         d2.setAvailibility(7);
        d2.setComposition("H2SO4");
        d2.setDrugID(224);
        d2.setDrugName("Vasline");
        d2.setDrugPrice(99);
        d2.setDrugType("All Ages");
        d2.setExpirationDate("22/6/2024");
        d2.setProductionDate("2/6/2020");
        Drug d3 = new Drug();
         d3.setAvailibility(3);
        d3.setComposition("PVC");
        d3.setDrugID(225);
        d3.setDrugName("Zytrec");
        d3.setDrugPrice(44);
        d3.setDrugType("Adult");
        d3.setExpirationDate("25/7/2021");
        d3.setProductionDate("25/7/2016");
        Drug d4 = new Drug();
         d4.setAvailibility(5);
        d4.setComposition("HCL/Hp2");
        d4.setDrugID(226);
        d4.setDrugName("Otrivine");
        d4.setDrugPrice(65);
        d4.setDrugType("All Ages");
        d4.setExpirationDate("4/12/2028");
        d4.setProductionDate("4/12/2022");
        Drug d5 = new Drug();
         d5.setAvailibility(4);
        d5.setComposition("HCL/Hp2");
        d5.setDrugID(227);
        d5.setDrugName("Oplex");
        d5.setDrugPrice(180);
        d5.setDrugType("Children");
        d5.setExpirationDate("29/3/2026");
        d5.setProductionDate("29/3/2019");
        Drug d6 = new Drug();
         d6.setAvailibility(13);
        d6.setComposition("HCL/Hp2");
        d6.setDrugID(228);
        d6.setDrugName("Capect");
        d6.setDrugPrice(200);
        d6.setDrugType("Adult");
        d6.setExpirationDate("2/6/2023");
        d6.setProductionDate("2/6/2017");
        DrugCatalog DC = new DrugCatalog();
        DC.addDrugs(d1);
        DC.addDrugs(d2);
        DC.addDrugs(d3);
        DC.addDrugs(d4);
        DC.addDrugs(d5);
        DC.addDrugs(d6);
   do{
     System.out.println("Choose:-\n 1. If You Are a Doctor\n 2. If You Are a Patient\n 3. To Display The catalog\n 4. IF You Want To Order\n 5. To Exit");
     int x = l.nextInt();

       switch(x){
          case 1 : User u1 = new User();
                   u1.setStatus("Doctor");
                   System.out.println("What's Your Name");
                   u1.setName(l.next());
                   System.out.println("What's Your Phone Number");
                   u1.setPhonenumber(l.next());
                   System.out.println("What's Your E-mail");
                   u1.setEmail(l.next());
                   System.out.println("Please Set Your ID");
                   Login Lo = new Login();
                   Lo.setId(l.next());
                   System.out.println("And Your Password");
                   Lo.setPassword(l.next());
                   break;
          case 2 : User u2 = new User();
                   u2.setStatus("Patient");
                   System.out.println("What's Your Name");
                   u2.setName(l.next());
                   System.out.println("What's Your Phone Number");
                   u2.setPhonenumber(l.next());
                   System.out.println("What's Your E-mail");
                   u2.setEmail(l.next());
                   break;
                   
          case 3 : System.out.println("Our Catalog Contains");
                    System.out.println("Name : "+d1.getDrugName());
                    System.out.println("We Have : "+d1.getAvailibility()+"Available");
                    System.out.println("Contains : "+d1.getComposition());
                    System.out.println("Price : " + d1.getDrugPrice());
                    System.out.println("Available Only for : "+d1.getDrugType());
                    System.out.println("ExpirationDate : "+d1.getExpirationDate());
                    System.out.println("ProductionDate : "+d1.getProductionDate());
                    
                    System.out.println("Name : "+d2.getDrugName());
                    System.out.println("We Have : "+d2.getAvailibility()+"Available");
                    System.out.println("Contains : "+d2.getComposition());
                    System.out.println("Price : " + d2.getDrugPrice());
                    System.out.println("Available Only for : "+d2.getDrugType());
                    System.out.println("ExpirationDate : "+d2.getExpirationDate());
                    System.out.println("ProductionDate : "+d2.getProductionDate());
                    
                    System.out.println("Name : "+d3.getDrugName());
                    System.out.println("We Have : "+d3.getAvailibility()+"Available");
                    System.out.println("Contains : "+d3.getComposition());
                    System.out.println("Price : " + d3.getDrugPrice());
                    System.out.println("Available Only for : "+d3.getDrugType());
                    System.out.println("ExpirationDate : "+d3.getExpirationDate());
                    System.out.println("ProductionDate : "+d3.getProductionDate());
                    
                    System.out.println("Name : "+d4.getDrugName());
                    System.out.println("We Have : "+d4.getAvailibility()+"Available");
                    System.out.println("Contains : "+d4.getComposition());
                    System.out.println("Price : " + d4.getDrugPrice());
                    System.out.println("Available Only for : "+d4.getDrugType());
                    System.out.println("ExpirationDate : "+d4.getExpirationDate());
                    System.out.println("ProductionDate : "+d4.getProductionDate());
                    
                    System.out.println("Name : "+d5.getDrugName());
                    System.out.println("We Have : "+d5.getAvailibility()+"Available");
                    System.out.println("Contains : "+d5.getComposition());
                    System.out.println("Price : " + d5.getDrugPrice());
                    System.out.println("Available Only for : "+d5.getDrugType());
                    System.out.println("ExpirationDate : "+d5.getExpirationDate());
                    System.out.println("ProductionDate : "+d5.getProductionDate());
                    
                    System.out.println("Name : "+d6.getDrugName());
                    System.out.println("We Have : "+d6.getAvailibility()+"Available");
                    System.out.println("Contains : "+d6.getComposition());
                    System.out.println("Price : " + d6.getDrugPrice());
                    System.out.println("Available Only for : "+d6.getDrugType());
                    System.out.println("ExpirationDate : "+d6.getExpirationDate());
                    System.out.println("ProductionDate : "+d6.getProductionDate());
                    break;
                 
         case 4 : Order O = new Order();
                    System.out.println("Please Set The Order No");
                    O.setOrderNumber(l.nextInt());
                    System.out.println("Which Drug Do You Want\n 1.For "+d1.getDrugName()+"\n 1.For "+d1.getDrugName()+"\n 2.For "+d2.getDrugName()+"\n 3.For "+d3.getDrugName()+"\n 4.For "+d4.getDrugName()+"\n 5.For "+d5.getDrugName()+"\n 6.For "+d6.getDrugName());
                    int y = l.nextInt();
                    OrderItem Order1 = new OrderItem();
                    switch(y){
                        case 1 : System.out.println("How Many of : "+d1.getDrugName());
                                         Order1.setQuantity(l.nextInt());
                                         System.out.println("The Final Price is : "+(Order1.getQuantity()*d1.getDrugPrice()));
                                         break;
                        case 2 : System.out.println("How Many of : "+d2.getDrugName());
                                         Order1.setQuantity(l.nextInt());
                                         System.out.println("The Final Price is : "+(Order1.getQuantity()*d2.getDrugPrice()));
                                         break;
                        case 3 : System.out.println("How Many of : "+d3.getDrugName());
                                         Order1.setQuantity(l.nextInt());
                                         System.out.println("The Final Price is : "+(Order1.getQuantity()*d3.getDrugPrice()));
                                         break;
                        case 4 : System.out.println("How Many of : "+d4.getDrugName());
                                         Order1.setQuantity(l.nextInt());
                                         System.out.println("The Final Price is : "+(Order1.getQuantity()*d4.getDrugPrice()));
                                         break;
                        case 5 : System.out.println("How Many of : "+d5.getDrugName());
                                         Order1.setQuantity(l.nextInt());
                                         System.out.println("The Final Price is : "+(Order1.getQuantity()*d5.getDrugPrice()));
                                         break;
                        case 6 : System.out.println("How Many of : "+d6.getDrugName());
                                         Order1.setQuantity(l.nextInt());
                                         System.out.println("The Final Price is : "+(Order1.getQuantity()*d6.getDrugPrice()));
                                         break;
                        
                          
                    }
                    break;
         case 5 : System.out.println("Thanks For Visiting Our Pharmacy");
                  f= false;
                  break;
   }     
      }
      while(f);
    }
        
        
        
        // TODO code application logic here
    }
    

