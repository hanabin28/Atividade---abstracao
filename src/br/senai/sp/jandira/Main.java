package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Gerente;
import br.senai.sp.jandira.model.Programador;

public class Main {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("João", 12);
        gerente1.setBonus(200);
        gerente1.calcularSalario();
        System.out.println(gerente1.getSalarioBase());

        Programador programador1 = new Programador("Marta", 13);
        programador1.setHoraExtra(15);
        programador1.calcularSalario();
        System.out.println(programador1.getSalarioBase());
    }
}
