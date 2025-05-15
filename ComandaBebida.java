import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ComandaBebida extends COMANDA {

    public ComandaBebida(ArrayList<String> consumo, double valor) {
        super(consumo, valor);
    }

    ArrayList<String> consumo = new ArrayList<>();
    double valor;

    private static final Map<String, Double> cardapio = new HashMap<>();

    static {
        cardapio.put("AGUA", 3.00);
        cardapio.put("REFRIGERANTE", 5.00);
        cardapio.put("SUCO", 6.00);
    }

    public void adicionarBebida(String item) {
        item = item.toUpperCase();
        Double precoItem = cardapio.get(item);
        if (precoItem == null) {
            System.out.println("Item não encontrado no cardápio de bebidas.");
        } else {
            consumo.add(item);
            atualizarValorBebida(item);
            System.out.println("Vbebida" + this.valor);
        }
    }

    public void atualizarValorBebida(String item) {
        Double precoItem = cardapio.get(item);
        if (precoItem != null) {
            this.valor += precoItem;
        } else {
            System.out.println("Item não encontrado no cardápio de bebidas.");
        }
    }

    public void listarConsumoBebida() {
        System.out.println("Consumo Bebida:");
        for (String item : consumo) {
            System.out.println(item);
        }
    }
}