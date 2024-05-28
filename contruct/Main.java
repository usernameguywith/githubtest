
public class Main {
	
	public static void main(String[] args) {
		human human1 = new human("Rick", 65, 70);
		human human2 = new human("morty", 80, 90);
		
		System.out.println(human1.name + "\n" + human2.name);
		human1.eat();
		human2.eat();
	}

}
