package Aulas.Exercicios.Aula8.Q3.model;

import java.util.Scanner;

public class Sistema {
    public static void iniciar() {
        Scanner scanner = new Scanner(System.in);

        Universidade universidade = new Universidade("Facema", 3);
        String menu =
                "[1] – Cadastrar Departamento\n"
                        + "[2] – Cadastrar Funcionário Técnico\n"
                        + "[3] – Cadastrar Funcionário Docente\n"
                        + "[4] – Buscar Departamento por Nome\n"
                        + "[5] – Buscar Funcionário por Nome\n"
                        + "[6] - Listar Departamentos com Funcionários com Faixa Salarial Específica\n"
                        + "[7] – Listar Funcionários com Faixa Salarial Específica\n"
                        + "[8] – Listar Departamentos cujo gasto total está entre uma Faixa de Valores Específica\n"
                        + "[9] – Listar todos Funcionários da Universidade\n"
                        + "[10] – Listar todos Departamentos da Universidade\n"
                        + "[11] – Listar todos Departamentos da Universidade e seus Respectivos Funcionários\n"
                        + "[12] – Listar todos Funcionários Docente\n"
                        + "[13] – Listar todos Funcionários Técnico\n"
                        + "[0] –  Sair\n";

        String nome;
        String codigo;
        double salario;

        int opc = -1;
        while (opc != 0) {
            System.out.println("-------MENU------\n");
            System.out.println(menu);
            System.out.println("Digite a sua opcao: ");
            opc = Integer.parseInt(scanner.nextLine());

            switch (opc) {
                case 1:
                    System.out.println("Digite o nome do departamento: ");
                    String nomeDepto = scanner.nextLine();

                    System.out.println("Digite o codigo do departamento: ");
                    String codigoDepto = scanner.nextLine();

                    System.out.println("Digite o numero maximo de funcionarios: ");
                    int numMaxFuncionarios = Integer.parseInt(scanner.nextLine());

                    Funcionario[] funcionarios = new Funcionario[numMaxFuncionarios];

                    Departamento novoDepartamento = new Departamento(nomeDepto, codigoDepto, funcionarios);

                    novoDepartamento.setNumeroMaxFuncionario(numMaxFuncionarios);
                    universidade.adicionarDepartamento(novoDepartamento);
                    break;

                case 2:
                    System.out.println("Digite o nome do departamento onde o funcionário técnico será cadastrado:");
                    String nomeDep = scanner.nextLine();

                    Departamento dep = universidade.buscarDepartamento(nomeDep);
                    if (dep == null) {
                        System.out.println("Departamento não encontrado!");
                        break;
                    }

                    System.out.println("Digite o nome do funcionário:");
                    String nomeFunc = scanner.nextLine();
                    System.out.println("Digite o código do funcionário:");
                    String codigoFunc = scanner.nextLine();
                    System.out.println("Digite o salário do funcionário:");
                    salario = Double.parseDouble(scanner.nextLine());
                    System.out.println("Digite o cargo do funcionário técnico:");
                    String cargo = scanner.nextLine();

                    FuncionarioTecnico tecnico = new FuncionarioTecnico(nomeFunc, codigoFunc, salario, cargo);
                    dep.adicionarFuncionario(tecnico);
                    break;

                case 3:
                    System.out.println("Digite o nome do departamento onde o funcionário docente será cadastrado:");
                    nomeDep = scanner.nextLine();

                    dep = universidade.buscarDepartamento(nomeDep);
                    if (dep == null) {
                        System.out.println("Departamento não encontrado!");
                        break;
                    }

                    System.out.println("Digite o nome do funcionário:");
                    nomeFunc = scanner.nextLine();
                    System.out.println("Digite o código do funcionário:");
                    codigoFunc = scanner.nextLine();
                    System.out.println("Digite o salário do funcionário:");
                    salario = Double.parseDouble(scanner.nextLine());
                    System.out.println("Digite a titulação do docente:");
                    String titulacao = scanner.nextLine();

                    FuncionarioDocente docente = new FuncionarioDocente(nomeFunc, codigoFunc, salario, titulacao);
                    dep.adicionarFuncionario(docente);
                    break;

                case 4:
                    System.out.println("Digite o nome do departamento a buscar:");
                    nomeDep = scanner.nextLine();
                    dep = universidade.buscarDepartamento(nomeDep);
                    if (dep != null) {
                        System.out.println(dep.relatorio());
                    } else {
                        System.out.println("Departamento não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Digite o nome do departamento onde buscar:");
                    nomeDep = scanner.nextLine();

                    dep = universidade.buscarDepartamento(nomeDep);
                    if (dep == null) {
                        System.out.println("Departamento não encontrado!");
                        break;
                    }

                    System.out.println("Digite o nome do funcionário a buscar:");
                    nomeFunc = scanner.nextLine();

                    boolean encontrado = false;
                    for (Funcionario f : dep.getFuncionarios()) {
                        if (f != null && f.getNome().equalsIgnoreCase(nomeFunc)) {
                            System.out.println(f.relatorio());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Funcionário não encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Digite a faixa salarial mínima:");
                    double salarioMin = Double.parseDouble(scanner.nextLine());
                    System.out.println("Digite a faixa salarial máxima:");
                    double salarioMax = Double.parseDouble(scanner.nextLine());

                    System.out.println("Departamentos com funcionários nessa faixa salarial:");
                    for (Departamento d : universidade.getDepartamento()) {
                        if (d != null) {
                            boolean temFuncionario = false;
                            for (Funcionario f : d.getFuncionarios()) {
                                if (f != null && f.getSalario() >= salarioMin && f.getSalario() <= salarioMax) {
                                    temFuncionario = true;
                                    break;
                                }
                            }
                            if (temFuncionario) {
                                System.out.println(d.getNome());
                            }
                        }
                    }
                    break;

                case 7:
                    System.out.println("Digite a faixa salarial mínima:");
                    salarioMin = Double.parseDouble(scanner.nextLine());
                    System.out.println("Digite a faixa salarial máxima:");
                    salarioMax = Double.parseDouble(scanner.nextLine());

                    System.out.println("Funcionários nessa faixa salarial:");
                    for (Departamento d : universidade.getDepartamento()) {
                        if (d != null) {
                            for (Funcionario f : d.getFuncionarios()) {
                                if (f != null && f.getSalario() >= salarioMin && f.getSalario() <= salarioMax) {
                                    System.out.println(f.relatorio());
                                }
                            }
                        }
                    }
                    break;

                case 8:
                    System.out.println("Digite o gasto mínimo:");
                    double gastoMin = Double.parseDouble(scanner.nextLine());
                    System.out.println("Digite o gasto máximo:");
                    double gastoMax = Double.parseDouble(scanner.nextLine());

                    System.out.println("Departamentos com gasto total nessa faixa:");
                    for (Departamento d : universidade.getDepartamento()) {
                        if (d != null) {
                            double gastoTotal = 0;
                            for (Funcionario f : d.getFuncionarios()) {
                                if (f != null) {
                                    gastoTotal += f.getSalario();
                                }
                            }
                            if (gastoTotal >= gastoMin && gastoTotal <= gastoMax) {
                                System.out.println(d.getNome());
                            }
                        }
                    }
                    break;

                case 9:
                    System.out.println("Todos os Funcionários da Universidade:");
                    for (Departamento d : universidade.getDepartamento()) {
                        if (d != null) {
                            for (Funcionario f : d.getFuncionarios()) {
                                if (f != null) {
                                    System.out.println(f.relatorio());
                                }
                            }
                        }
                    }
                    break;

                case 10:
                    System.out.println("Todos os Departamentos da Universidade:");
                    for (Departamento d : universidade.getDepartamento()) {
                        if (d != null) {
                            System.out.println(d.relatorio());
                        }
                    }
                    break;

                case 11:
                    System.out.println("Departamentos e seus respectivos funcionários:");
                    for (Departamento d : universidade.getDepartamento()) {
                        if (d != null) {
                            System.out.println(d.relatorio());
                            for (Funcionario f : d.getFuncionarios()) {
                                if (f != null) {
                                    System.out.println("  -> " + f.relatorio());
                                }
                            }
                        }
                    }
                    break;

                case 12:
                    System.out.println("Funcionários Docente:");
                    for (Departamento d : universidade.getDepartamento()) {
                        if (d != null) {
                            for (Funcionario f : d.getFuncionarios()) {
                                if (f instanceof FuncionarioDocente) {
                                    System.out.println(f.relatorio());
                                }
                            }
                        }
                    }
                    break;

                case 13:
                    System.out.println("Funcionários Técnico:");
                    for (Departamento d : universidade.getDepartamento()) {
                        if (d != null) {
                            for (Funcionario f : d.getFuncionarios()) {
                                if (f instanceof FuncionarioTecnico) {
                                    System.out.println(f.relatorio());
                                }
                            }
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
