public class Person{

	String personName;
	int personBirthYear;
	
	
	public Person(String name) {
		personName = name;
		personBirthYear = 1990;
		return;
	}
	
	public Person(String name, int birthYear) {
		personName = name;
		personBirthYear = birthYear;
	}
	
	public static String getName(Person person) {
		String name = person.personName;
		return name;
	}
	
	public int getBirthYear(Person person) {
		int year = person.personBirthYear;
		return year;
	}
	
	public boolean isFemale(Person person) {
		boolean female = true;
		String name = person.personName;
		char last = name.charAt(name.length() - 1);
		if (last != 'a') {
			female = false;
			return female;
		}
		return female;
		
	}
	
	public static String getOlder(Person person1, Person person2) {
		int age1 = person1.personBirthYear;
		int age2 = person2.personBirthYear;
		if(age1 < age2) {
			return (person1.personName + " is older than " + person2.personName);
		}
		if(age1 > age2) {
			return (person2.personName + " is older than " + person1.personName);
		}
		return person2.personName;
	}
	
	
}