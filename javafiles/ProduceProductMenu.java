import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProduceProductMenu implements ProductMenu {

	public void showMenu() {
		File file=new File("ProductInfo");
		Scanner s = null;
		try {
			Scanner t = new Scanner(file);
			s=t;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(s.hasNextLine())
		{
			String a[]=s.nextLine().split(":");
			if(a[0].equals("Produce"))
			{
				System.out.println(a[1]);
			}
		}
	}

	public void showAddButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showViewButton() {

	}

	public void showComboxes() {

	}

}
