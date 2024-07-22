package Main.entity.araclar;

public class Hatchback extends Araba {

    public Hatchback(Builder builder) {
        super.marka = builder.marka;
        super.bagaj_kapasitesi = builder.bagaj_kapasitesi;
        super.renk = builder.renk;
        super.model = builder.model;
        super.vites_tipi = builder.vites_tipi;
        super.yas = builder.yas;
        super.yakit_tipi = builder.yakit_tipi;
        super.gunluk_kiralama_bedeli = builder.gunluk_kiralama_bedeli;
    }

    public static class Builder{
        private String marka;
        private String model;
        private String vites_tipi;
        private String bagaj_kapasitesi;
        private String renk;
        private String yas;
        private String yakit_tipi;
        private int gunluk_kiralama_bedeli;

        public Builder marka(String value){
            this.marka = value;
            return this;
        }



        public Builder model(String value){
            this.model = value;
            return this;
        }


        public Builder vites_tipi(String value){
            this.vites_tipi = value;
            return this;
        }

        public Builder bagaj_kapasitesi(String value){
            this.bagaj_kapasitesi = value;
            return this;
        }

        public Builder renk(String value){
            this.renk = value;
            return this;
        }

        public Builder yas(String value){
            this.yas = value;
            return this;
        }

        public Builder yakit_tipi(String value){
            this.yakit_tipi = value;
            return this;
        }

        public Builder gunluk_kiralama_bedeli(int value){
            this.gunluk_kiralama_bedeli = value;
            return this;
        }

        public Hatchback build(){
            return new Hatchback(this);
        }


    }
}
