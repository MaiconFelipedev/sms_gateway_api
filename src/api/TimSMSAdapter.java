// Adaptador para TIM
// Implementa a Interface SMSSender e adapta a API da TIM

package api;

import java.time.format.DateTimeFormatter;
import model.SMS;

public class TimSMSAdapter implements SMSSender{

	@Override
	public boolean sendSMS(SMS sms) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");   
		System.out.println("Tim SMS - " + dtf.format(sms.getTimestamp()));
		System.out.println("-------------------");
		System.out.println("From: " + sms.getOrigem());
		System.out.println("To  : " + sms.getDestino());
		System.out.println("-------------------");
		System.out.println(sms.getTexto());		
		System.out.println();
		return true;
	}

}
