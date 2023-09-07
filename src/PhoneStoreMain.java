

import java.util.*;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PhoneStoreMain {

	public static void main(String[] args) throws FileNotFoundException{
		ImageIcon icon=new ImageIcon("iPhone13.jpg");
		ImageIcon h = new ImageIcon("photos//HuaweiNova5T.jpg");
		ImageIcon g = new ImageIcon("photos//GooglePixel5.jpg");
		ImageIcon s = new ImageIcon("photos//SamsungGalaxys22.jpg");
		ImageIcon o = new ImageIcon("photos//OnePlus9.jpg");
		File F = new File("data//PhoneTitles");
		
		
		PhoneModelEntry phone1 = new PhoneModelEntry("IPhone 13", 999, 299, icon);
		PhoneModelEntry phone2 = new PhoneModelEntry("Google Pixel 5", 1100, 399, g);
		PhoneModelEntry phone3 = new PhoneModelEntry("Samsung Galaxy S22", 750, 599, s);
		PhoneModelEntry phone4 = new PhoneModelEntry("Huawei Nova 5T", 100, 500, h);
		PhoneModelEntry phone5 = new PhoneModelEntry("OnePlus 9", 650, 550, o);
		System.out.println(phone1.toString());
		System.out.println(phone2.toString());
		System.out.println(phone3.toString());
		System.out.println(phone4.toString());
		System.out.println(phone5.toString());
		
		
		ArrayList<PhoneModelEntry> phones = new ArrayList<PhoneModelEntry>();
		phones.add(phone1);
		phones.add(phone2);
		phones.add(phone3);
		phones.add(phone4);
		phones.add(phone5);
		Collections.sort(phones);
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("iPhone13");
		names.add("Google Pixel 5");
		names.add("Smasung Galaxy S6");
		names.add("Hawaii Phone Unlimted");
		names.add("One Plus 9");
		Collections.sort(names);
		int w=0;
		while(w==0)
		{
			
			JOptionPane.showMessageDialog(null, "Welcome to PhoneSmart"+"\nWhere you'll find the Smartest Phones Around!", 
					   "ASP 2.0", JOptionPane. INFORMATION_MESSAGE, icon);
			
			ArrayList<String> Phones = new ArrayList<String>();
			
			String name = JOptionPane.showInputDialog(null, "Whats your name?",
					"Phone- Name",
					JOptionPane.QUESTION_MESSAGE);
			String[] firstname=name.split(" ");
			
			
			
			int option=JOptionPane.showOptionDialog(null, "Hello, "+firstname[0]+"!"+
					"\nDo you want a Contract for your Phone?", "Phone- Contract", 
					JOptionPane.YES_NO_OPTION, 
					JOptionPane.QUESTION_MESSAGE, null, null, 0);
			
			
			int size;
			size= phones.size();
			File f = new File("data//PhonesWithContract.txt");
			File j = new File("data//PhonesWithoutContract.txt");
			Scanner in = new Scanner(f);
			Scanner key = new Scanner(j);
			ArrayList <String> phonesCont = new ArrayList<String>();
			ArrayList<String> phonesWithoutCont = new ArrayList <String>();
			String[] parts;
			String[] partTwo;
			String[] modelNames= new String[size];
			String[] models = new String[size];
			double[] pricesCont= new double[size];
			double[] pricesWithoutCont= new double[size]; 
			String[] images = new String[size];
			
			
			while (in.hasNextLine()) {
				phonesCont.add(in.nextLine());
					
			}
			
			
			for (int i=0; i<size; i++)
			{
				parts= phonesCont.get(i).split("\\$");
				partTwo= phonesCont.get(i).split("\\|");
				modelNames[i]=parts[0].trim();
				pricesCont[i]=
						Double.parseDouble(parts[1].trim());
				//pricesWithoutCont[i]= 
						//Double.parseDouble(parts[2].trim());
				images[i]=partTwo[0].trim();
				System.out.println(modelNames[i]+ " | "+ " $" +pricesCont[i] +
						"$" + pricesWithoutCont[i]);
				
				models[i]=modelNames[i]+ " - "+ " $" +
				pricesCont[i];
			}
			while (key.hasNextLine())
			{
				phonesWithoutCont.add(key.nextLine());
			}
			for (int i=0; i<size; i++)
			{
				parts= phonesWithoutCont.get(i).split("\\$");
				partTwo= phonesCont.get(i).split("\\|");
				models[i]=parts[0].trim();
				//pricesCont[i]=
						Double.parseDouble(parts[1].trim());
				pricesWithoutCont[i]= 
						Double.parseDouble(parts[1].trim());
				images[i] = partTwo[0].trim();
				//System.out.println(modelNames[i]+ " | "+ " $" +pricesCont[i] +
					//	"$" + pricesWithoutCont[i]);
				
				models[i]=modelNames[i]+ " - "+ " $" +
				pricesWithoutCont[i];
			}
			
			
			int q=0;
			String choice="";
			while(option==0 && q==0)
			{
				
				 choice=(String)JOptionPane.showInputDialog(null, "Phone Options", "Choose A Phone (Contract)", JOptionPane.QUESTION_MESSAGE, icon, models, pricesCont);
				q=1;
				System.out.println(choice);
			}
			
			while(option==1 && q==0)
			{
			
				 choice=(String)JOptionPane.showInputDialog(null, "Phone Options", "Choose A Phone (No Contract)", JOptionPane.QUESTION_MESSAGE, icon, models, pricesWithoutCont);
				q=1;
				System.out.println(choice);
			}
			
			
			String[] areaCodes= {"404", "478", "678", "706"};
			
			File fi=new File("data\\AreaCodes.txt");
			Scanner input=new Scanner(fi);
			int i=0;
			do {
				areaCodes[i++]= input.nextLine();}
				while (input.hasNextLine()) ;
			Random rr= new Random();
			String selection= (String)JOptionPane.showInputDialog(null,
					"Choose An Area Code",
					"Phone- AreaCode",
					JOptionPane.INFORMATION_MESSAGE, null, areaCodes, 0);
			String phonenumber= selection+rr.nextInt()%10000000;
			
			
			
			int finall= JOptionPane.showConfirmDialog(null,"Name: "+name+"\nPhone: "+ choice+"\nContract: "
			+option+"\nPhone Number: "+phonenumber);
			System.out.println(finall);
			
			if (finall==0)
			{
				JOptionPane.showMessageDialog(null, "YourPhone", 
						   "ASP 2.0", JOptionPane. INFORMATION_MESSAGE, s);
			}
	
			
			
			
			
			
			
		}
		
		
		
	
		
		
		//JOptionPane.showInputDialog(null, "Pick", "Pick a Phone",
			//	JOptionPane.QUESTION_MESSAGE, icon, models2, names);
				
		
		
		
		
		



	}
	}
	



