package model;

public class Visitante extends Pessoa {

    private String dataVisita;

    public Visitante() {
    }

    public Visitante(int id, String nome,
            int idade, String cpf,
            String dataVisita) {

        super(id, nome, idade, cpf);

        this.dataVisita = dataVisita;
    }

    public String getDataVisita() {
        return dataVisita;
    }

    public void setDataVisita(String dataVisita) {
        this.dataVisita = dataVisita;
    }
}