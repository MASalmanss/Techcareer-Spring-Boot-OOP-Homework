package Main;

import Main.entity.araclar.Araba;
import Main.entity.araclar.SUV;
import Main.entity.kisiler.Sirket;
import Main.subPrograms.Kiralayici;

import java.util.Scanner;

public class AracKiralamaProgrami {

   static public void calistir(){

       // Bunu örnek olarak veriyorum arttırılabilirler

       SUV suv = new  SUV.Builder()
               .gunluk_kiralama_bedeli(100)
               .marka("Mecedes").model("C180")
               .bagaj_kapasitesi("600 lt")
               .vites_tipi("Otomatik")
               .yakit_tipi("Benzin")
               .renk("Sarı")
               .build();

       Sirket sirket = new Sirket.Builder()
               .sirket_ismi("Salman Teknoloji")
               .email("ababsjd@gmail.com")
               .vergi_no("QWE12312")
               .telefon_no("999 888 9999").build();

       Kiralayici.kirala(suv , sirket , 90);
    }
}
