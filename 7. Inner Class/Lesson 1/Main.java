class Main{
	public static void main(String[] args){
		
		//Accessing Static InnerClass
		OuterClass.InnerClass myInner = new OuterClass.InnerClass();
		
		//Outer Class
		OuterClass myOuter = new OuterClass();

		System.out.println(myInner.y + myOuter.x);
	}
}