package PracticeQR;




import org.smslib.OutboundMessage;
import org.smslib.modem.SerialModemGateway;


public class OTPHandleFromMobile {
	public static void main(String[] args) throws Throwable {

		
//	OutboundNotification outboundNotification = new OutboundNotification();
	OutboundMessage outBound = new OutboundMessage();
	SerialModemGateway gateway = new SerialModemGateway("modem.com3", "COM3", 9600, "IN2011", "COM3");
	gateway.setInbound(true);
	gateway.setOutbound(true);
	gateway.setSmscNumber("+919777038291");
	
	
    
	
		
	

	}
}
