package methodOverriding;

public class WhatsappVer2 extends Whatsapp {
	 public void send() {
		System.out.println("Call");
	}
	public static void main(String[] args) {
		WhatsappVer2 wv2=new WhatsappVer2();
		wv2.send();
	}
}
