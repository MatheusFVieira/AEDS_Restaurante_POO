import java.util.Scanner;

public class MESA{

    private int NumMesa;
    private String Data;
    private boolean Reserva;

    public MESA(int NumMesa, String Data, boolean Reserva) {
        this.NumMesa = NumMesa;
        this.Data = Data;
        this.Reserva = Reserva;
    }

    public int getNumMesa() {
        return this.NumMesa;
    }

    public void setNumMesa(int NumMesa) {
        this.NumMesa = NumMesa;
    }

    public String getData() {
        return this.Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public boolean getReserva() {
        return this.Reserva;
    }

    public void setReserva(boolean Reserva) {
        this.Reserva = Reserva;
    }

    public void reservarMesa() {
        if (!Reserva) {
            Reserva = true;
            System.out.println("Mesa " + NumMesa + " reservada para a data " + Data);
        } else {
            System.out.println("Mesa " + NumMesa + " já está reservada para a data " + Data);
        }
    }

    int nuMesa = 10;

    public void realizarReserva(Scanner scanner, MESA tmesa) {

        System.out.println("Você deseja realizar uma reserva de mesa? (Digite 'sim' ou 'nao')");
        String respostaReserva = scanner.next();

        if (respostaReserva.equalsIgnoreCase("sim")) {

            System.out.println("Informe o número da mesa desejada:");
            int numeroMesa = scanner.nextInt();
            
            tmesa.NumMesa = numeroMesa;

            System.out.println("Informe a data da reserva (formato DD/MM/YYYY):");
            String daReser = scanner.next();

            tmesa.Data = daReser;

            MESA mesaEscolhida = new MESA(numeroMesa, daReser, false);

            mesaEscolhida.reservarMesa();
        } else {
            System.out.println("Você optou por não fazer uma reserva. Voce estara sujeito a disponibilidade de mesas");

        }
    }

    public void testereserva(MESA testeme, MESA Tmesa2) {

        if (testeme.NumMesa == Tmesa2.NumMesa && testeme.getData().equals(Tmesa2.getData())){            
            System.out.println("SEJA BEM VINDO");
        } else {
            System.out.println("Essa reserva nao existe e infelizmente nao temos mesas livres, ate a proxima.");
            System.exit(0);
        }
    }
}