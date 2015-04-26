package ing;

import ing.myUtil.StringOperations;

import java.time.LocalDate;
import java.time.Period;

/**
 * 
 * @author Mauro Conte
 * @version 1.0
 * @since 1.0
 */

public class Person {
	//TODO o è meglio metterla fuori
	//TODO maiuscola o minuscola
	public static enum Gender{ MALE,FEMALE,UNKNOW }

	//TODO: Costanti non maiuscole
	//TODO: dubbio gender final: se unknow poi deve essere settato
	//TODO: fanno bene tuttti questi final
	private final String firstName;
	private final String lastName;
	private final LocalDate birthday;
	private final Gender gender;
	private int weight;
	
	/**
	 * 
	 * @param the firstName
	 * @param the lastName
	 * @param the birthday year
	 * @param the birthday month
	 * @param the birthday day
	 */
	//TODO: meglio passare tutti i parametri o l'oggetto
	public Person(String firstName, String lastName, int year, int month, int day, Gender gender) {
		this.firstName = firstName.toLowerCase();
		this.lastName = lastName.toLowerCase();
		this.birthday = LocalDate.of(year, month, day);
		this.gender = gender;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return StringOperations.CapitalizeFirstLetter(this.firstName);
	}
	
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return StringOperations.CapitalizeFirstLetter(this.lastName);
	}

	
	/**
	 * 
	 * @return the current age
	 */
	public int getAge() {
		//TODO: oppure è meglio fare una prop e ogni tanto atggiornarla(puo cambiare ogni anno => non troppo spesso)
		Period period = Period.between(this.birthday, LocalDate.now());
		return period.getYears();
	}
	

	@Override
	public String toString() {
		//TODO: o dovevo crearlo senza override
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + getAge() + ", gender=" +gender+"]";
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}


}
