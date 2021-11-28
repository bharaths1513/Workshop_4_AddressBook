package AddressBook;

import java.util.ArrayList;
import java.util.Iterator;
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

	public void editContacts() {
		System.out.println("Enter your First name:");
		String firstName = scan.next();

		Iterator<Contacts> iterator = this.list.listIterator();

		while (iterator.hasNext()) {
			Contacts contacts = iterator.next();

			if (firstName.equals(contacts.getFirstName())) {
				System.out.println("Re-Correct your Last Name");
				contacts.setLastName(scan.next());

				System.out.println("Re-Correct your Address");
				contacts.setAddress(scan.next());

				System.out.println("Re-Correct your City");
				contacts.setCity(scan.next());

				System.out.println("Re-Correct your State");
				contacts.setState(scan.next());

				System.out.println("Re-Correct your Zip");
				contacts.setZipCode(scan.nextInt());

				System.out.println("Re-Correct your Phone Number");
				contacts.setPhoneNumber(scan.nextLong());

				System.out.println("Re-Correct your Email");
				contacts.setEmail(scan.next());
			}
		}
	}

	public void deleteContacts() {
		System.out.println("Enter your First name:");
		String firstName = scan.next();

		Iterator<Contacts> iterator = list.listIterator();
		while (iterator.hasNext()) {
			Contacts contacts = iterator.next();

			if (firstName.equals(contacts.getFirstName())) {
				list.remove(contacts);
				return;
			}
		}
	}

}
