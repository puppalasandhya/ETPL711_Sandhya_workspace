package com.evergent.corejava.casestudy;

class KidUsers implements LibraryUser{
	 int age;
	 String bookType;

	public void registerAccount(int Age)
	{
		age=Age;
		if(age<12)
		{
			System.out.println(" You have successfully registered under a Kids Account");
		}
		else
		{
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
		
	}
	public void requestBook(String bookType)
	{
		if(bookType.equals("Kids"))
		{
			System.out.println(" Book Issued successfully, please return the book within 10 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
}

class AdultUser implements LibraryUser{
	int age;
	 String bookType;

	public void registerAccount(int Age)
	{
		age=Age;
		if(age>12)
		{
			System.out.println("You have successfully registered under an Adult Account");
		}
		else
		{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}
	public void requestBook(String bookType)
	{
		if(bookType.equals("Fiction"))
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
}
public class LibraryInterfaceDemo {
	public static void main(String args[])
	{
		KidUsers  ks=new KidUsers();
		ks.registerAccount(10);
		ks.requestBook("Kids");
		
		AdultUser  al=new AdultUser();
		al.registerAccount(18);
		al.requestBook("Fiction");
		
	}
}