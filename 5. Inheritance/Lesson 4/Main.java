class Main{
	public static void main(String[] args){
		Car car = new Car("Car", "Volvo", 2012);
		Motorcycle motorcycle = new Motorcycle("Motorcycle", "Honda", 2021);
		Bicycle bicycle = new Bicycle("Bicycle", "Trek Marlin 7", 2024);


		car.displayInfo();
		motorcycle.displayInfo();
		bicycle.displayInfo();

		System.out.println(car.getName());
		System.out.println(bicycle.getName());
		System.out.println(motorcycle.getName());
	}
}