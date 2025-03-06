// Fachada para Envio de SMS (FachadaSMS)

package service;

import api.SMSSender;
import api.SMSSenderFactory;
import model.SMS;

public class FachadaSMS {
    public static void enviarMensagem (String origem, String destino, String texto) {
        SMSSender sender = SMSSenderFactory.getSender(destino);
        SMS sms = new SMS(origem, destino, texto);
        boolean sucesso = sender.sendSMS(sms);

        if (sucesso) {
            System.out.println("Mensagem enviada com sucesso para o número da operadora " + destino.substring(0,2));
    
        }
        else {
            System.out.println("Falha no envio da mensagem");
        }
    }

}
