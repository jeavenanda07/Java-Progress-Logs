class Second {
  public static void main(String[] args) {
    Main myObj = new Main(1, "Jeaven Anda", 21, 2027); 
    Main myObj1 = new Main(2, "Maestro", 19, 2025); 
    Main myObj2 = new Main(3, "John Doe", 21, 2026); 

 	 System.out.println("Student " + myObj.id + "\nName: " + myObj.name + "\nAge: " + myObj.age + "\nGraduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method

	System.out.println("\nStudent " + myObj1.id + "\nName: " + myObj1.name + "\nAge: " + myObj1.age + "\nGraduation Year: " + myObj1.graduationYear);
 myObj.study(); 

	System.out.println("\nStudent " + myObj2.id + "\nName: " + myObj2.name + "\nAge: " + myObj1.age + "\nGraduation Year: " + myObj2.graduationYear);
 myObj.study(); 
  }
}
