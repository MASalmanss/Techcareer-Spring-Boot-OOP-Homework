package Main.subPrograms;

import Main.entity.araclar.Hatchback;
import Main.entity.araclar.SUV;
import Main.entity.araclar.Sedan;

import java.util.ArrayList;
import java.util.List;

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
}
