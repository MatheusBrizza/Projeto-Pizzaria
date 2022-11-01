package model.cliente;

public class Contato {

    private String telefoneResidencial;
    private String telefoneCelular;
    private String email;


    public Contato(String telefoneResidencial, String telefoneCelular, String email) {
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneCelular = telefoneCelular;
        this.email = email;
    }
}
