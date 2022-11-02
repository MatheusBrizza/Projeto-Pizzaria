package model.cliente;

import java.time.LocalDate;

public class Cliente {

    private String nome;
    private String documento;
    private LocalDate dataNascimento;
    private Endereco endereco;

    /*
    construtor sem builder
    public Cliente(String nome, String documento, LocalDate dataNascimento,
                   Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public Cliente(String nome, String documento, Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.dataNascimento = LocalDate.now();
    }
    */
    // construtor com builder
    private Cliente(ClienteBuilder builder) {
        this.nome = builder.nome;
        this.documento = builder.documento;
        this.endereco = builder.endereco;
        this.dataNascimento = builder.dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public static ClienteBuilder builder() { return new ClienteBuilder();}


    public static class ClienteBuilder {

        private String nome;
        private String documento;
        private LocalDate dataNascimento;
        private Endereco endereco;

        private ClienteBuilder() {

        }

        public ClienteBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public ClienteBuilder documento(String documento) {
            this.documento = documento;
            return this;
        }

        public ClienteBuilder dataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public ClienteBuilder endereco(Endereco endereco) {
            this.endereco = endereco;
            return this;
        }

        public Cliente build() { return new Cliente(this);}

    }

}
