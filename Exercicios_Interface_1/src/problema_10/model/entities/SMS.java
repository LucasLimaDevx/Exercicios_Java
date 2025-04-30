package problema_10.model.entities;

import problema_10.model.interfaces.Notificacao;

public class SMS implements Notificacao {

	@Override
	public void enviarMensagem(String mensagem) {
		System.out.println("SMS enviado: " + mensagem);
		
	}

}
