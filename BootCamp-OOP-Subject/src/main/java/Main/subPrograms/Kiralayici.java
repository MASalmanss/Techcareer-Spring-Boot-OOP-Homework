package Main.subPrograms;

import Main.entity.araclar.Araba;
import Main.entity.araclar.Hatchback;
import Main.entity.araclar.SUV;
import Main.entity.araclar.Sedan;
import Main.entity.kisiler.Kiralayici_Sahis;
import Main.entity.kisiler.Sirket;
import Main.subPrograms.Depo.*;

import java.util.List;

public class Kiralayici {

    private static boolean  kiralabilir_mi(Araba araba , Kiralayici_Sahis kiralayici_sahis){
        if((araba instanceof Sedan || araba instanceof Hatchback)){
            return true;
        }
        else return kiralayici_sahis instanceof Sirket;
    }

    private static boolean aylik_kiralanabilir_mi(Araba araba){
        return !(araba instanceof SUV);
    }

    public static boolean kirala(Araba araba , Kiralayici_Sahis kiralayici_sahis , Integer gun_sayisi){

        if(kiralabilir_mi(araba , kiralayici_sahis) && aylik_kiralanabilir_mi(araba)){

        }
        else {
            return false;
        }
    }
}
