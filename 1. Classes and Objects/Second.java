class Second{
	public static void main(String[] args){
		Main myCar = new Main();
		
		myCar.speed(120);
		myCar.fullThrottle();
		
		System.out.println("Car brand list: ");
		for(int i = 0; i < myCar.brand.length; i++){
			System.out.println(myCar.brand[i]);
		}
		
	}
}