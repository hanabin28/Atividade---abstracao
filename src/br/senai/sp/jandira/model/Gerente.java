package br.senai.sp.jandira.model;

public class Gerente extends Funcionarios{
    private double bonus;

    public Gerente(String nome, int id) {
        super(nome, id);
    }

    @Override
    public void calcularSalario() {
        setSalarioBase(getSalarioBase() + getBonus());
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
