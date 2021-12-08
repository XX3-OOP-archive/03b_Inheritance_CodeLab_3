package com.cc.java;

public class App {
    public static void main(String[] args) {

      MA_Production ma1 = new MA_Production("Mustermann", "Max", 1965, "ID001" , "production", "worker",2010);
      MA_Accounting ma2 = new MA_Accounting("Popow", "Oleg", 1974, "ID002" , "accounting", "accountant",2012);
      MA_Advertising ma3 = new MA_Advertising("Martinelli", "Silvia", 1985, "ID003" , "advertising", "consultant", 2018);
      
      
      ausgabe("------- MA 1 --------------");	
      
      ausgabe(ma1.startsWork());
      ausgabe(ma1.hasLunch());
      ausgabe(ma1.doYourWork());
      ausgabe(ma1.getEmployedTime());
      ausgabe(ma1.getPersonalData());

      ausgabe("------- MA 2 --------------");	
      
      ausgabe(ma2.startsWork());
      ausgabe(ma2.hasLunch());
      ausgabe(ma2.doYourWork());
      ausgabe(ma2.getEmployedTime());
      ausgabe(ma2.getPersonalData());

      ausgabe("------- MA 3 --------------");	
      
      ausgabe(ma3.startsWork());
      ausgabe(ma3.hasLunch());
      ausgabe(ma3.doYourWork());
      ausgabe(ma3.getEmployedTime());
      ausgabe(ma3.getPersonalData());
    
      ausgabe("------- Misc --------------");	

      ausgabe("Geburtsjahr: " + ma1.getBirthYear());				
      ma2.setFamilyName("Nossow");
      ausgabe(ma2.getFamilyName());
      
    }
  

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
