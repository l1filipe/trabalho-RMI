package server;

import model.Aluno;
import model.Treino;
import service.GestaoTreino;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class GestaoTreinoImpl
        extends UnicastRemoteObject
        implements GestaoTreino {

    private List<Aluno> alunos;
    private List<Treino> treinos;

    public GestaoTreinoImpl()
            throws RemoteException {

        super();

        alunos = new ArrayList<>();
        treinos = new ArrayList<>();
    }

    @Override
    public void matricularAluno(Aluno aluno)
            throws RemoteException {

        for (Aluno a : alunos) {

            if (a.getNome()
                    .equalsIgnoreCase(
                            aluno.getNome())) {

                System.out.println(
                        "Aluno já matriculado."
                );

                return;
            }
        }

        alunos.add(aluno);

        System.out.println(
                "Aluno matriculado: "
                        + aluno.getNome()
        );
    }

    @Override
    public void criarTreino(Treino treino)
            throws RemoteException {

        for (Treino t : treinos) {

            if (t.getNomeTreino()
                    .equalsIgnoreCase(
                            treino.getNomeTreino())) {

                System.out.println(
                        "Treino já existe."
                );

                return;
            }
        }

        treinos.add(treino);

        System.out.println(
                "Treino criado: "
                        + treino.getNomeTreino()
        );
    }

    @Override
    public List<Treino> listarTreinos()
            throws RemoteException {

        return treinos;
    }

    @Override
    public String avaliarDesempenho(
            String nomeAluno)
            throws RemoteException {

        for (Aluno aluno : alunos) {

            if (aluno.getNome()
                    .equalsIgnoreCase(
                            nomeAluno)) {

                double imc =
                        aluno.getPeso() /
                        (aluno.getAltura()
                         * aluno.getAltura());

                String situacao;

                if (imc < 18.5) {

                    situacao =
                            "Abaixo do peso";

                } else if (imc < 25) {

                    situacao =
                            "Peso ideal";

                } else if (imc < 30) {

                    situacao =
                            "Sobrepeso";

                } else {

                    situacao =
                            "Obesidade";
                }

                return "Aluno: "
                        + aluno.getNome()
                        + "\nIMC: "
                        + String.format(
                                "%.2f",
                                imc
                        )
                        + "\nSituação: "
                        + situacao;
            }
        }

        return "Aluno não encontrado.";
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Treino> getTreinos() {
        return treinos;
    }

    public void setTreinos(List<Treino> treinos) {
        this.treinos = treinos;
    }
}