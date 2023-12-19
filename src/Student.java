
public class Student { //klasa
	int id; //data member(instancirana varijabla)
	String ime; //data member(instacirana varijabla)
	int starost; //data member(instacirana varijabla)
	
	Student(int i, String n) { //Konstruktor so 2 parametri
		id=i;
		ime=n;
	}
	Student(int i, String n, int a){ //Konstruktor so 3 parametri OVERLOADING
		id=i;
		ime=n;
		starost=a;
	}
	void display() { //metod
		System.out.println(id + "" + ime + "" + starost);
	}
	public static void main(String[] args) {
		Student s1=new Student( 111, " Petar "); //Kreiraj objekt s1
		Student s2=new Student( 222, " Marko ", 25); //Kreiraj objekt s2
		s1.display(); //pecati - s1
		s2.display(); //pecati - s2
	}

}
