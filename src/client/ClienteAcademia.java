package client;

import java.net.MalformedURLException;
import model.Aluno;
import model.Exercicio;
import model.Plano;
import model.Treino;
import service.GestaoTreino;

import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Scanner;

public class ClienteAcademia {

    public static void main(String[] args) {

        try {

            GestaoTreino service =
                    (GestaoTreino) Naming.lookup(
                            "rmi://localhost/AcademiaService"
                    );

            try (Scanner scanner = new Scanner(System.in)) {
                int opcao = -1;
                
                while (opcao != 0) {
                    
                    System.out.println(
                            "\n===== ACADEMIA RMI ====="
                    );
                    
                    System.out.println(
                            "1 - Matricular aluno"
                    );
                    
                    System.out.println(
                            "2 - Criar treino"
                    );
                    
                    System.out.println(
                            "3 - Listar treinos"
                    );
                    
                    System.out.println(
                            "4 - Avaliar desempenho"
                    );
                    
                    System.out.println(
                            "0 - Sair"
                    );
                    
                    System.out.print("Escolha: ");
                    
                    opcao = scanner.nextInt();
                    
                    scanner.nextLine();
                    
                    switch (opcao) {
                        
                        case 1 -> {
                            System.out.print(
                                    "Nome: "
                            );
                            
                            String nome =
                                    scanner.nextLine();

                            System.out.print(
                                    "Idade: "
                            );
                            
                            int idade =
                                    scanner.nextInt();

                            scanner.nextLine();
                            
                            System.out.print(
                                    "CPF: "
                            );
                            
                            String cpf =
                                    scanner.nextLine();
                            
                            System.out.print(
                                    "Peso: "
                            );
                            
                            double peso =
                                    scanner.nextDouble();
                            
                            System.out.print(
                                    "Altura: "
                            );
                            
                            double altura =
                                    scanner.nextDouble();
                            
                            scanner.nextLine();
                            
                            Treino treinoPadrao =
                                    new Treino(
                                            "Treino Inicial",
                                            "Adaptação",
                                            45
                                    );
                            
                            Plano plano =
                                    new Plano(
                                            1,
                                            "Plano Básico",
                                            99.90,
                                            treinoPadrao
                                    );
                            
                            Aluno aluno =
                                    new Aluno(
                                            1,
                                            nome,
                                            idade,
                                            cpf,
                                            peso,
                                            altura,
                                            plano
                                    );
                            
                            service.matricularAluno(
                                    aluno
                            );
                            
                            System.out.println(
                                    "Aluno matriculado com sucesso!"
                            );
                        }
                            
                        case 2 -> {
                            System.out.print(
                                    "Nome do treino: "
                            );
                            
                            String nomeTreino =
                                    scanner.nextLine();
                            
                            System.out.print(
                                    "Objetivo: "
                            );
                            
                            String objetivo =
                                    scanner.nextLine();
                            
                            System.out.print(
                                    "Duração (min): "
                            );
                            
                            int duracao =
                                    scanner.nextInt();

                            scanner.nextLine();
                            
                            Treino treino =
                                    new Treino(
                                            nomeTreino,
                                            objetivo,
                                            duracao
                                    );
                            
                            System.out.print(
                                    "Quantos exercícios terá o treino? "
                            );
                            
                            int qtdExercicios =
                                    scanner.nextInt();
                            
                            scanner.nextLine();
                            
                            for (int i = 0;
                                    i < qtdExercicios;
                                    i++) {
                                
                                System.out.println(
                                        "\nExercício "
                                                + (i + 1)
                                );
                                
                                System.out.print(
                                        "Nome: "
                                );
                                
                                String nomeExercicio =
                                        scanner.nextLine();
                                
                                System.out.print(
                                        "Séries: "
                                );
                                
                                int series =
                                        scanner.nextInt();
                                
                                System.out.print(
                                        "Repetições: "
                                );
                                
                                int repeticoes =
                                        scanner.nextInt();
                                
                                scanner.nextLine();
                                
                                Exercicio exercicio =
                                        new Exercicio(
                                                nomeExercicio,
                                                series,
                                                repeticoes
                                        );
                                
                                treino.adicionarExercicio(
                                        exercicio
                                );
                            }
                            
                            service.criarTreino(
                                    treino
                            );
                            
                            System.out.println(
                                    "Treino criado com sucesso!"
                            );
                        }
                            
                        case 3 -> {
                            List<Treino> treinos =
                                    service.listarTreinos();
                            
                            System.out.println(
                                    "\n=== TREINOS ==="
                            );
                            
                            for (Treino t : treinos) {
                                
                                System.out.println(t);
                            }
                        }
                            
                        case 4 -> {
                            System.out.print(
                                    "Digite o nome do aluno: "
                            );
                            
                            String nomeAluno =
                                    scanner.nextLine();
                            
                            String resultado =
                                    service.avaliarDesempenho(
                                            nomeAluno
                                    );
                            
                            System.out.println(
                                    resultado
                            );
                        }
                            
                        case 0 -> System.out.println(
                                    "Encerrando cliente..."
                            );
                            
                        default -> System.out.println(
                                    "Opção inválida!"
                            );
                    }
                }
            }

        } catch (MalformedURLException | NotBoundException | RemoteException e) {

            System.out.println(
                    "Erro no cliente: "
                            + e.getMessage()
            );

        }
    }
}