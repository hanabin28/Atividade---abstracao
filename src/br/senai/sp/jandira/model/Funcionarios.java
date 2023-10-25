package br.senai.sp.jandira.model;

abstract class Funcionarios {
    private String nome;
    private double salarioBase = 3500;
    private int id;

    public Funcionarios(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    abstract void calcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
