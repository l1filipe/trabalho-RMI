package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Academia implements Serializable {

    private String nome;

    private List<Aluno> alunos;
    private List<Instrutor> instrutores;
    private List<Treino> treinos;

    public Academia() {

        alunos = new ArrayList<>();
        instrutores = new ArrayList<>();
        treinos = new ArrayList<>();
    }

    public Academia(String nome) {

        this.nome = nome;

        alunos = new ArrayList<>();
        instrutores = new ArrayList<>();
        treinos = new ArrayList<>();
    }

    public Academia(List<Aluno> alunos, List<Instrutor> instrutores, String nome, List<Treino> treinos) {
        this.alunos = alunos;
        this.instrutores = instrutores;
        this.nome = nome;
        this.treinos = treinos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public List<Treino> getTreinos() {
        return treinos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarInstrutor(Instrutor instrutor) {
        instrutores.add(instrutor);
    }

    public void adicionarTreino(Treino treino) {
        treinos.add(treino);
    }

    public void setInstrutores(List<Instrutor> instrutores) {
        this.instrutores = instrutores;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void setTreinos(List<Treino> treinos) {
        this.treinos = treinos;
    }
}