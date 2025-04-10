class Main{
	public static void main(String[] args){

		//Accessing Innerclass
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();

		System.out.println(myInner.y + myOuter.x);
	}
}