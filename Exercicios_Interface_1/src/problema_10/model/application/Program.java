package problema_10.model.application;

import problema_10.model.entities.Email;
import problema_10.model.entities.SMS;

public class Program {

	public static void main(String[] args) {
		Email email = new Email();
		email.enviarMensagem("Oi");
		email.enviarMensagem("Promoção");
		
		SMS sms = new SMS();
		
		sms.enviarMensagem("Oi");
		sms.enviarMensagem("Promoção");

	}

}
