package methodOverriding;

 class Facebook {
	public void watch() {
		System.out.println("see images");
	}
}
public class FacebookDriver extends Facebook {	
	 public void watch() {
		System.out.println("see videos");
	}	
	public static void main(String[] args) {
   FacebookDriver fd=new FacebookDriver();
         fd.watch();
	}
}
