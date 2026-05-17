package service;

import model.Aluno;
import model.Treino;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface GestaoTreino extends Remote {

    void matricularAluno(Aluno aluno)
            throws RemoteException;

    void criarTreino(Treino treino)
            throws RemoteException;

    List<Treino> listarTreinos()
            throws RemoteException;

    String avaliarDesempenho(String nomeAluno)
            throws RemoteException;
}