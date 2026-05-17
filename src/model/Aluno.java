package model;

public class Aluno extends Pessoa {

    private double peso;
    private double altura;

    private Plano plano;

    public Aluno() {
    }

    public Aluno(int id,
                  String nome,
                  int idade,
                  String cpf,
                  double peso,
                  double altura,
                  Plano plano) {

        super(id, nome, idade, cpf);

        this.peso = peso;
        this.altura = altura;
        this.plano = plano;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    @Override
    public String toString() {

        return "Aluno: " + nome
                + " | Peso: " + peso
                + " | Altura: " + altura;
    }
}