class Main{
	public static void main(String[] args){
		Cat cat = new Cat();
		Dog dog = new Dog();

		cat.animalSound();
		System.out.println(cat.breed);
		
		dog.animalSound();
		System.out.println(dog.breed);
	}
}