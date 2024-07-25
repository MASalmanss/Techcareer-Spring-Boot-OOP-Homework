package Main.entity.araclar;

public abstract class Araba {
    protected String marka;
    protected String model;
    protected String vites_tipi;
    protected String bagaj_kapasitesi;
    protected String renk;
    protected String yas;
    protected String yakit_tipi;
    protected int gunluk_kiralama_bedeli;
    protected int toplamtutar;

    public int getGunluk_kiralama_bedeli() {
        return gunluk_kiralama_bedeli;
    }

    public void setGunluk_kiralama_bedeli(int gunluk_kiralama_bedeli) {
        this.gunluk_kiralama_bedeli = gunluk_kiralama_bedeli;
    }

    public int getToplamtutar() {
        return toplamtutar;
    }

    public void setToplamtutar(int toplamtutar) {
        this.toplamtutar = toplamtutar;
    }
}
