import students.Student;

class Main{
	public static void main(String[] args){
		Student myObj = new Student();

		System.out.println(myObj.name);
	}
}



//compile both file
//javac -d . students/Student.java
//javac -d . main-folder/Main.java