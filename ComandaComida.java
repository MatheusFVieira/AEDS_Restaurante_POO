import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ComandaComida extends COMANDA {

    public ComandaComida(ArrayList<String> consumo, double valor) {
        super(consumo, valor);
    }

    private static final Map<String, Double> cardapio = new HashMap<>();

    static {
        cardapio.put("ARROZ", 10.00);
        cardapio.put("TROPEIRO", 15.00);
        cardapio.put("FEIJOADA", 14.00);
    }

    ArrayList<String> consumo = new ArrayList<>();
    double valor;

    public void adicionarComida(String item){
        item = item.toUpperCase();
        Double precoItem = cardapio.get(item);
        if (precoItem == null)
        {
            System.out.println("Item não encontrado no cardápio de comidas.");
        }else{
                consumo.add(item);
                atualizarValorComida(item);
                System.out.println("Vcomida" + this.valor);
        }
    }
    
    public void atualizarValorComida(String item) {
        // Atualize o valor com base no item do 
        Double precoItem = cardapio.get(item);
        if (precoItem != null) {
            this.valor += precoItem;
        } else {
            System.out.println("Item não encontrado no cardápio de comidas.");
        }
    }

    public void listarConsumoComida() {
        System.out.println("Consumo comida:");
        for (String item : consumo) {
            System.out.println(item);
        }
    }
}

