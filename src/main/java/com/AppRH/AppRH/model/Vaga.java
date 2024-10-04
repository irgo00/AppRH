package com.AppRH.AppRH.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Vaga implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @NotEmpty
    private String nome;

    @NotEmpty
    private String descricao;

    @NotEmpty
    private String data;

    @NotEmpty
    private double salario;

    @OneToMany (mappedBy = "vaga", cascade = CascadeType.REMOVE)
    private List<Candidato> candidatos;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public @NotEmpty String getNome() {
        return nome;
    }

    public void setNome(@NotEmpty String nome) {
        this.nome = nome;
    }

    public @NotEmpty String getDescricao() {
        return descricao;
    }

    public void setDescricao(@NotEmpty String descricao) {
        this.descricao = descricao;
    }

    public @NotEmpty String getData() {
        return data;
    }

    public void setData(@NotEmpty String data) {
        this.data = data;
    }

    @NotEmpty
    public double getSalario() {
        return salario;
    }

    public void setSalario(@NotEmpty double salario) {
        this.salario = salario;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }
}
