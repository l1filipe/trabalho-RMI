package model;

import java.io.Serializable;

public class Plano implements Serializable {

    private int id;
    private String tipoPlano;
    private double valorMensal;

    private Treino treino;

    public Plano() {
    }

    public Plano(int id,
            String tipoPlano,
            double valorMensal,
            Treino treino) {

        this.id = id;
        this.tipoPlano = tipoPlano;
        this.valorMensal = valorMensal;
        this.treino = treino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }
}
