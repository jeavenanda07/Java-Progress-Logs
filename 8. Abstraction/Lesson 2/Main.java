class Main{
	public static void main(String[] args){
		Animal[] animal = {
			new Cat(),
			new Dog()
		};

		for(Animal animals: animal){
			animals.animalSound();
		};
	}
}