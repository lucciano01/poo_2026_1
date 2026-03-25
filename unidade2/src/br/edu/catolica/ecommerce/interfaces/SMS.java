package br.edu.catolica.ecommerce.interfaces;

public class SMS implements Notificacao{


    @Override
    public void enviarMesnagem(String msg) {
        System.out.println("Mensagem enviada por SMS: " +msg);
    }
}
