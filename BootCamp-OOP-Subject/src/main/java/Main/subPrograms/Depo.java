package Main.subPrograms;

import Main.entity.araclar.Araba;
import Main.entity.araclar.Hatchback;
import Main.entity.araclar.SUV;
import Main.entity.araclar.Sedan;

import java.util.ArrayList;
import java.util.List;

//Static Base

public class Depo {
   static private List<SUV> suvList;
   static private List<Sedan> sedanList;
   static private List<Hatchback> hatchbackList;

    static {
        suvList = new ArrayList<>();
        sedanList = new ArrayList<>();
        hatchbackList = new ArrayList<>();
    }

    public static List<SUV> getSuvList() {
        return suvList;
    }

    public static void setSuvList(List<SUV> suvList) {
        Depo.suvList = suvList;
    }

    public static List<Sedan> getSedanList() {
        return sedanList;
    }

    public static void setSedanList(List<Sedan> sedanList) {
        Depo.sedanList = sedanList;
    }

    public static List<Hatchback> getHatchbackList() {
        return hatchbackList;
    }

    public static void setHatchbackList(List<Hatchback> hatchbackList) {
        Depo.hatchbackList = hatchbackList;
    }


    private static void addSedan(Sedan sedan){
        sedanList.add(sedan);
    }



    private static void addSuv(SUV suv){
        suvList.add(suv);
    }



    private static void addHatchback(Hatchback hatchback){
        hatchbackList.add(hatchback);
    }

    public static boolean arac_kaydet(Araba araba){
        if(araba instanceof  SUV){
            addSuv((SUV) araba);
            return true;
        } else if (araba instanceof Sedan) {
            addSedan((Sedan) araba);
            return true;
        } else if (araba instanceof Hatchback) {
            addHatchback((Hatchback) araba);
            return true;
        }
        else {
            return false;
        }
    }

}

