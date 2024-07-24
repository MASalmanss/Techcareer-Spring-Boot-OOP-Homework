package Main.entity.kisiler;

public class Birey extends Kiralayici_Sahis{
    private String ad_soyad;
    private String tc_no;

    public Birey(Builder builder){
        this.ad_soyad = builder.ad_soyad;
        this.tc_no = builder.tc_no;
        super.email = builder.email;
        super.telefon_no = builder.telefon_no;
    }


    public static class Builder{
        private String ad_soyad;
        private String tc_no;
        private String telefon_no;
        private String email;

        public Builder ad_soyad(String ad_soyad){
            this.ad_soyad = ad_soyad;
            return this;
        }
        public Builder tc_no(String tc_no){
            this.tc_no = tc_no;
            return this;
        }

        public Builder telefon_no(String telefon_no){
            this.telefon_no = telefon_no;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }
        public Birey build(){
            return new Birey(this);
        }
    }
}
