package model.cliente;

public class Endereco {

    private String logradouro;
    private String numero;
    private String cep;
    private String estado;
    private Contato clienteContato;


    public Endereco(String logradouro, String numero, String cep, String estado, Contato clienteContato) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.estado = estado;
        this.clienteContato = clienteContato;
    }
}
