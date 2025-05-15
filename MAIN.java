import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {

        // Grupo: Matheus Freitas Vieira e Rafael Ferreira Canto.

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n***** Ola, SEJA BEM VINDO. *****\n");

        System.out.println("Digite nome do restaurante desejado:");
        String nomeres = scanner.nextLine();
        nomeres = nomeres.toUpperCase();

        System.out.println("Digite o endereco do restaurante " + nomeres + ":");        
        String endres = scanner.nextLine();

        RESTAURANTE resttetest = new RESTAURANTE(nomeres, endres);
        resttetest.Nrestaurante(scanner, resttetest);

        scanner.close();
    }
}
