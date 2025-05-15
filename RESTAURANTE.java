import java.util.ArrayList;
import java.util.Scanner;

public class RESTAURANTE{
    
    private String nome;
    private String endereco;

    public RESTAURANTE(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void Nrestaurante(Scanner scanner, RESTAURANTE Trest){
        System.out.println("\n********** FAÇA O SEU CADASTRO NO RESTAURANTE " + Trest.getNome() + "**********\n");

        System.out.println("Digite o seu nome:");
        String nomecad = scanner.nextLine();

        System.out.println("Digite o seu email:");        
        String emailcad = scanner.nextLine();

        CLIENTE clientetest = new CLIENTE(nomecad, emailcad);

        System.out.println("\n********** CENTRAL DE RESERVAS RESTAURANTE " + Trest.getNome() + "**********\n");

        MESA mesaTeste = new MESA(1, "21/11/2023", false);
        
        mesaTeste.realizarReserva(scanner, mesaTeste);

        System.out.println("\n********** BEM VINDO AO RESTAURANTE " + Trest.getNome() +  "**********\n");

        System.out.println("Você possui uma reserva? (Digite 'sim' ou 'nao')");
        String respostaReserva = scanner.next();

        if (respostaReserva.equalsIgnoreCase("sim")) {
            System.out.println("Informe o número da mesa da sua reserva:");
            int nMesa = scanner.nextInt();

            System.out.println("Informe a data da sua reserva:");
            String tdata = scanner.next();

            MESA mesaAtual = new MESA(nMesa, tdata, true);
            mesaAtual.testereserva(mesaAtual, mesaTeste);
        }else {
            System.out.println("Infelizmente não temos nenhuma mesa disponivel hoje, ate a proxima.");
            System.exit(0);
        }

        ComandaComida comandaComida = new ComandaComida(new ArrayList<>(), 0.0);
        ComandaBebida comandaBebida = new ComandaBebida(new ArrayList<>(), 0.0);


        int op = 4;
        
        while (op != 0) {
            System.out.println("Para ver o cardpio digite (1)");
            System.out.println("Para fazer um pedido de comida digite (2)");
            System.out.println("Para fazer um pedido de bebida digite (3)");
            System.out.println("Para pedir a conta digite (0)");

            op = scanner.nextInt();

            COMANDA comandaTotal = new COMANDA(new ArrayList<>(), 0.0);

            switch (op) {
                case 1:
                    System.out.println("CARDAPIO:\nCOMIDAS: \n1. Arroz (R$10,00)\n2. Tropeiro (R$15,00)\n3. Feijoada (R$14,00)\nBEBIDAS:\n1. Agua (R$3,00)\n2. Refrigerante (R$5,00)\n3. Sucos (R$6,00)");
                    break;
                case 2:
                    System.out.println("O que gostaria para comer?");
                    String NpedidoCo = scanner.next();

                    comandaComida.adicionarComida(NpedidoCo);
                    comandaComida.listarConsumoComida();
                    comandaTotal.somarComandas(comandaComida, comandaBebida);
                    break;

                case 3:
                    System.out.println("O que gostaria para beber");
                    String NpedidoBe = scanner.next();

                    comandaBebida.adicionarBebida(NpedidoBe);
                    comandaBebida.listarConsumoBebida();
                    comandaTotal.somarComandas(comandaComida, comandaBebida);
                    break;

                case 0:    
                    comandaComida.listarConsumoComida();
                    comandaBebida.listarConsumoBebida();
                    comandaTotal.adcdezpc(comandaComida, comandaBebida);        
                    comandaTotal.dividirValor(scanner, comandaComida, comandaBebida);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("Obrigado pela visita Sr(a) " + clientetest.getNomeCliente() + ", Volte Sempre");
        scanner.close();
    }
}