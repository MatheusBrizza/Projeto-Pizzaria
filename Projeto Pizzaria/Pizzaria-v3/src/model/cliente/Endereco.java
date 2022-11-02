package model.cliente;

import model.cliente.Contato;

public class Endereco {

    private String logradouro;
    private String numero;
    private String cep;
    private String estado;
    private Contato clienteContato;
    /*
    public Endereco(String logradouro, String numero, String cep, String estado, Contato clienteContato) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.estado = estado;
        this.clienteContato = clienteContato;
    }
    */

    private Endereco(EnderecoBuilder builder) {
        this.logradouro = builder.logradouro;
        this.numero = builder.numero;
        this.cep = builder.cep;
        this.estado = builder.estado;
        this.clienteContato = builder.clienteContato;
    }

    public static class EnderecoBuilder {

        private String logradouro;
        private String numero;
        private String cep;
        private String estado;
        private Contato clienteContato;


        private EnderecoBuilder() {

        }

        public EnderecoBuilder logradouro(String logradouro) {
            this.logradouro = logradouro;
            return this;
        }

        public EnderecoBuilder numero(String numero) {
            this.numero = numero;
            return this;
        }

        public EnderecoBuilder cep(String cep) {
            this.cep = cep;
            return this;
        }

        public EnderecoBuilder estado(String estado) {
            this.estado = estado;
            return this;
        }

        public EnderecoBuilder clienteContato(Contato clienteContato) {
            this.clienteContato = clienteContato;
            return this;
        }

        public Endereco build() {return new Endereco(this);}
    }
}
