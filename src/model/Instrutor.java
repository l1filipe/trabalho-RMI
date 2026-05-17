package model;

public class Instrutor extends Pessoa {

    private String cref;
    private String especialidade;

    public Instrutor() {
    }

    public Instrutor(int id, String nome,
            int idade, String cpf,
            String cref,
            String especialidade) {

        super(id, nome, idade, cpf);

        this.cref = cref;
        this.especialidade = especialidade;
    }

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
