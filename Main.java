
public class Main {

	@SuppressWarnings("static-access")
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Lucas", 1996);
		Person p2 = new Person("Harry");
		Person p3 = new Person("Mary", 1980);
		Person p4 = new Person("Bob", 1965);
		Person p5 = new Person("Stacy", 2002);
		Person p6 = new Person("Paul", 1976);
		Person p7 = new Person("Paula", 1994);
		
		System.out.println(p1.personName + " " + p1.personBirthYear);
		System.out.println(p2.personName + " " + p2.personBirthYear);
		
		System.out.println(p1.getName(p1));
		System.out.println(p3.getName(p3));
		
		System.out.println(p5.getBirthYear(p5));
		System.out.println(p4.getBirthYear(p4));
		
		System.out.println(p7.isFemale(p7));
		System.out.println(p5.isFemale(p5));
		
		System.out.println(Person.getOlder(p3, p6));
		System.out.println(Person.getOlder(p5, p1));
		
		
		
		
	}

}
