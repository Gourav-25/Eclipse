package methodOverriding;

 class Elephant{
	public void Big() {
		System.out.println("Largest");
	}
}
public class AnimalDriver extends Elephant  {
	public void Big() {
		System.out.println("Large in Size");
	}
	public static void main(String[] args) {
		AnimalDriver ad=new AnimalDriver();
		ad.Big();
	}
}
