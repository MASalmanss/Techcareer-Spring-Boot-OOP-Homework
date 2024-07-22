package Main.entity.kisiler;

public class Birey extends Kiralayici_Sahis{
    private String ad_soyad;
    private String tc_no;

    public Birey(Builder builder){
        this.ad_soyad = builder.ad_soyad;
        this.tc_no = builder.tc_no;
    }


    public static class Builder{
        private String ad_soyad;
        private String tc_no;

        public Builder ad_soyad(String ad_soyad){
            this.ad_soyad = ad_soyad;
            return this;
        }
        public Builder tc_no(String tc_no){
            this.tc_no = tc_no;
            return this;
        }
        public Birey build(){
            return new Birey(this);
        }
    }
}
