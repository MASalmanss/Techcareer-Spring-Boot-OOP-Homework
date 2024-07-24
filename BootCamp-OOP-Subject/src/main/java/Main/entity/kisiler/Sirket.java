package Main.entity.kisiler;

public class Sirket extends Kiralayici_Sahis{
    private String sirket_ismi;
    private String vergi_no;

    public Sirket(Builder builder) {
        this.sirket_ismi = builder.sirket_ismi;
        this.vergi_no = builder.vergi_no;

    }

    public static class Builder{
        private String sirket_ismi;
        private String vergi_no;
        private String telefon_no;
        private String email;

       public Builder sirket_ismi(String sirket_ismi){
           this.sirket_ismi = sirket_ismi;
           return this;
       }

        public Builder vergi_no(String vergi_no){
            this.vergi_no = vergi_no;
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

       public Sirket build(){
           return new Sirket(this);
       }


    }
}
