package model;

public class Funcionario extends Pessoa {

    private String cargo;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(int id, String nome,
                        int idade, String cpf,
                        String cargo,
                        double salario) {

        super(id, nome, idade, cpf);

        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
