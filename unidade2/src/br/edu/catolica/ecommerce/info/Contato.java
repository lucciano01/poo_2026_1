package br.edu.catolica.ecommerce.info;

public class Contato {

    private String telefone;
    private String email;
    private String redeSocial;

    public Contato(String telefone, String email, String redeSocial) {
        this.telefone = telefone;
        this.email = email;
        this.redeSocial = redeSocial;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", redeSocial='" + redeSocial + '\'' +
                '}';
    }
}
