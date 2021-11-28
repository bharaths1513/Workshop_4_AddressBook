package AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	Contacts input = new Contacts();
	List<Contacts> list = new ArrayList<>();
	Scanner scan = new Scanner(System.in);

	public void addContacts() {

		Contacts input = new Contacts();
		System.out.println("Enter First Name");
		String firstName = scan.next();
		System.out.println("Enter Last Name");
		String lastName = scan.next();
		System.out.println("Enter Address");
		String address = scan.next();
		System.out.println("Enter City");
		String city = scan.next();
		System.out.println("Enter State");
		String state = scan.next();
		System.out.println("Enter ZipCode");
		int zipCode = scan.nextInt();
		System.out.println("Enter PhoneNum");
		long phoneNumber = scan.nextLong();
		System.out.println("Enter eMail");
		String email = scan.next();

		Contacts contacts = new Contacts(firstName, lastName, address, city, state, zipCode, phoneNumber, email);
		list.add(contacts);

	}

	public void display() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list);
		}

	}

}
