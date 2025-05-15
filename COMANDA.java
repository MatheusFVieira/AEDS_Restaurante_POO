import java.util.ArrayList;
import java.util.Scanner;

public class COMANDA {

    private ArrayList<String> consumo = new ArrayList<>();
    private double valor;

    public COMANDA(ArrayList<String> consumo, double valor) {
        this.consumo = consumo;
        this.valor = valor;
    }

    public ArrayList<String> getConsumo() {
        return consumo;
    }

    public void setConsumo(ArrayList<String> consumo) {
        this.consumo = consumo;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void somarComandas(ComandaComida cComida, ComandaBebida cBebida) {
        this.valor = cBebida.valor + cComida.valor;

        System.out.println("Valor total das comandas de bebida e comida:\nR$" +  this.valor);
    }

    public void adcdezpc(ComandaComida cComida, ComandaBebida cBebida) {
        this.valor = cBebida.valor + cComida.valor; 
        this.valor = this.valor * 1.1;
        System.out.println("Valor das duas comandas juntas com 10%:\nR$" + this.valor);
    }

    public void dividirValor(Scanner scanner, ComandaComida cComida, ComandaBebida cBebida) {

        this.valor = cBebida.valor + cComida.valor; 
        this.valor = this.valor * 1.1;
        System.out.println("Para quantas pessoas o valor da conta sera dividido:");
        int nPessoas = scanner.nextInt();

        double vPorPessoa = this.valor / nPessoas;
        
        System.out.println("Valor por pessoa:\nR$" + vPorPessoa);
    }    
}
