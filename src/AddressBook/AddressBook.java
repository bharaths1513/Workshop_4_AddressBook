package AddressBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	List<Contacts> list = new ArrayList<>();
	Scanner scan = new Scanner(System.in);

	public void addressbook() {
		System.out.println("Enter num of Address Book to add");
		int book = scan.nextInt();
		int i = 1;
		while (i <= book) {
			System.out.println("Enter the address book name");
			String bookname = scan.next();
			operation();
			i++;
		}

	}

	public void operation() {

		int Contactcount = 1;
		boolean status = true;

		do {
			System.out.println("Choose 1 - add contact");
			System.out.println("Choose 2 - Display contacts");
			System.out.println("Choose 3 - Edit Contacts");
			System.out.println("Choose 4 - Delete Contacts");

			switch (scan.nextInt()) {

			case 1:
				System.out.println("Enter num of contacts to add");
				int numOfContact = scan.nextInt();

				while (numOfContact <= Contactcount) {
					addContacts();
					Contactcount++;
				}
				break;

			case 2:
				display();
				break;

			case 3:
				editContacts();
				break;

			case 4:
				deleteContacts();
				break;

			default:
				status = false;

			}

		} while (status);

	}

	public void addContacts() {

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

		System.out.println(list);

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
