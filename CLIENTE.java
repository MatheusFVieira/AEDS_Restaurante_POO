public class CLIENTE {

    private String nomeCliente;
    private String email;

    public CLIENTE(String nomeCliente, String email) {
        this.nomeCliente = nomeCliente;
        this.email = email;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    
    }
}

