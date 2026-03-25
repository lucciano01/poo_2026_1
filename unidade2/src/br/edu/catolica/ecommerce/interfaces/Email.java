package br.edu.catolica.ecommerce.interfaces;

public class Email implements Notificacao {

    @Override
    public void enviarMesnagem(String msg) {
        System.out.println("Mensagem via Email : " +msg);
    }

    @Override
    public void notificacaoJudicial() {

    }
}
