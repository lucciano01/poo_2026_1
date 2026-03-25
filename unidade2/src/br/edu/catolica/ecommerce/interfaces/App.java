package br.edu.catolica.ecommerce.interfaces;

public class App {
    public static void main(String[] args) {
//        Notificacao email = new Email();
//        email.enviarMesnagem(" Olá");

        Notificacao sms = new SMS();
        sms.enviarMesnagem(" Te Ligou...!");

    }
}
