package sixTen;

public class Aniaml {

	public static void main(String[] args) {
		Aniaml animal=new Aniaml();
		Aniaml mayDog=new Dog();
		animal.makeSound();
		mayDog.makeSound();
		

	}
	public void makeSound() {
        System.out.println("The animal makes a sound");
    }

}



