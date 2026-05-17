package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Treino implements Serializable {

    private String nomeTreino;
    private String objetivo;
    private int duracaoMinutos;

    private List<Exercicio> exercicios;

    public Treino() {

        exercicios = new ArrayList<>();
    }

    public Treino(String nomeTreino,
                   String objetivo,
                   int duracaoMinutos) {

        this.nomeTreino = nomeTreino;
        this.objetivo = objetivo;
        this.duracaoMinutos = duracaoMinutos;

        exercicios = new ArrayList<>();
    }

    public String getNomeTreino() {
        return nomeTreino;
    }

    public void setNomeTreino(String nomeTreino) {
        this.nomeTreino = nomeTreino;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void adicionarExercicio(
            Exercicio exercicio) {

        exercicios.add(exercicio);
    }

    @Override
    public String toString() {

        String texto =
                "\nTreino: " + nomeTreino
                + "\nObjetivo: " + objetivo
                + "\nDuração: "
                + duracaoMinutos + " min"
                + "\nExercícios:\n";

        for (Exercicio e : exercicios) {

            texto += "- " + e + "\n";
        }

        return texto;
    }
}