import java.util.*;
import java.util.Comparator;
import java.util.Collections;
import java.util.LinkedList;

class Users{

	String name;
	String address;
	long phone;
	 int zip;

	Users(String name,String address,long phone,int zip){
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.zip=zip;
	      }

}



class Operations
{
	LinkedList <Users> l = new LinkedList<Users>();

	public void create(){


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();

		System.out.println("Enter address");
		String address=sc.nextLine();
		System.out.println("Enter Phone Number");
		long  phone=sc.nextLong();

		System.out.println("Enter zip code");
		int zip=sc.nextInt();


		Users u1 = new Users(name,address,phone,zip);
		l.add(u1);

	}

	public void display(){


 		for (Users i : l)
		{
		 System.out.println(i.name+" "+i.address+" "+i.phone+" "+i.zip);
		}
		System.out.println("Entries in address book are: " +l.size());

	}

	public void delete()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Index to be Deleted");
		int index = sc.nextInt();
		l.remove(index);
		System.out.println("Index Deleted Successfully");
	}

	//public void Sorting()
	//{
	//	Collections.sort(l);

	//}


	/*public void rename()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Index to be Renamed");
		int index = sc.nextInt();
		System.out.println("Enter New name");
		String newname=sc.nextLine();
		u1.name=newname;
                l.set(index,newname);

	}*/

	public  void menu(){

		int choice;

		while(true){
				System.out.println("Enter choice");
				System.out.println("1.Enter New Entry");
				System.out.println("2.Display");
				System.out.println("3.Delete entry");
				System.out.println("4.Exit ");

			Scanner sc = new Scanner(System.in);
			choice=sc.nextInt();

			switch (choice)
				{
				case 1:
					create();
				        System.out.println("Entry number"+l.size()+" added in address book");
					break;
				case 2:

					display();
					break;

				case 3:
					delete();
					break;

				case 4 :
					System.exit(0);
					break;

				default :
					System.out.println("Wrong Choice entered!");
				}

			}
	}


}

class Book{

	public static void main(String args[])
	{
		Operations obj = new Operations();
		obj.menu();
	}
}
