package model.cliente;

import java.time.LocalDate;

public class Cliente {

    private String nome;
    private String documento;
    private LocalDate dataNascimento;
    private Endereco endereco;

    public Cliente(String nome, String documento, LocalDate dataNascimento, Endereco endereco) {
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

}
