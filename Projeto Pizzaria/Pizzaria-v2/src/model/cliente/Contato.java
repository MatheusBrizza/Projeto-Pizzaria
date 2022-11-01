package model.cliente;

public class Contato {

    private String telefoneResidencial;
    private String telefoneCelular;
    private String email;

    /*
    public Contato(String telefoneResidencial, String telefoneCelular,
                   String email) {
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneCelular = telefoneCelular;
        this.email = email;
    }
    */

    private Contato(ContatoBuilder builder) {
        this.telefoneResidencial = builder.telefoneResidencial;
        this.telefoneCelular = builder.telefoneCelular;
        this.email = builder.email;
    }

    public static ContatoBuilder builder() { return new ContatoBuilder();}

    public static class ContatoBuilder {
        private String telefoneResidencial;
        private String telefoneCelular;
        private String email;


        private ContatoBuilder() {

        }

        public ContatoBuilder telefoneResidencial(String telefoneResidencial) {
            this.telefoneResidencial = telefoneResidencial;
            return this;
        }

        public ContatoBuilder telefoneCelular(String telefoneCelular) {
            this.telefoneCelular = telefoneCelular;
            return this;
        }

        public ContatoBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Contato build() {return new Contato(this);}

    }

}
