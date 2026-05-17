package server;

import java.net.MalformedURLException;
import service.GestaoTreino;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServidorAcademia {

    public static void main(String[] args) {

        try {

            LocateRegistry.createRegistry(1099);

            GestaoTreino service = new GestaoTreinoImpl();

            Naming.rebind(
                    "rmi://localhost/AcademiaService",
                    service);

            System.out.println(
                    "Servidor RMI da academia iniciado!");

        } catch (MalformedURLException | RemoteException e) {

            System.out.println(
                    "Erro no servidor: "
                            + e.getMessage());

        }
    }
}