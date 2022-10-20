import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Redirecting to the Authentication Page");
		System.out.println("Please enter 0 if you are a buyer or 1 if you are a seller?");
		Scanner scan=new Scanner(System.in);
		int x=-1;
		try
		{
		int in=scan.nextInt();
		x=in;
		} catch(Exception e)
		{
			System.out.println("Wrong Input type");
		}
		if(x==0 || x==1)
		{
			System.out.println("Please enter your username");
			String username=scan.next();
			System.out.println("Please enter your password");
			String password=scan.next();
			if(x==0)
			{
			File file=new File("BuyerInfo");
			Scanner s=new Scanner(file);
			boolean authflag=false;
			while(s.hasNextLine())
			{
				String a[]=s.nextLine().split(":");
				if(a[0].equals(username) && a[1].equals(password))
				{
					System.out.println(" Buyer Authentication Successful");
					authflag=true;
					break;
				}
			}
			if(authflag==false)
			{
				System.out.println("Incorrect Credentials");
			}
			}
			else
			{
				File file=new File("SellerInfo");
				Scanner s=new Scanner(file);
				boolean authflag=false;
				while(s.hasNextLine())
				{
					String a[]=s.nextLine().split(":");
					if(a[0].equals(username) && a[1].equals(password))
					{
						System.out.println("Seller Authentication Successful");
						authflag=true;
						break;
					}
				}
				if(authflag==false)
				{
					System.out.println("Incorrect Credentials");
				}
			}
			
		}
		
		else
		{
			System.out.println("Authentication denied");
		}
	}
	
}