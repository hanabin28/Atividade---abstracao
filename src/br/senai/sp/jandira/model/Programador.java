package br.senai.sp.jandira.model;

public class Programador extends Funcionarios{
    private int horaExtra;

    public Programador(String nome, int id) {
        super(nome, id);
    }

    @Override
    public void calcularSalario() {
        setSalarioBase(getSalarioBase() + getHoraExtra());
    }

    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }
}
