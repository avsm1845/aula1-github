package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		/*
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Product product= new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name= sc.nextLine();
		System.out.print("price: ");
		double price= sc.nextDouble();
		//System.out.print("Quantity in stock: ");
		//int quantity= sc.nextInt();
		
		Product product = new Product(name, price);
		
		System.out.println("Product data: " + product);
		System.out.println();
		
		
		System.out.print("Entre o número de produtos para adicionar ao estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated data: " + product);
		System.out.println();
		
		System.out.print("Entre o número de produtos a serem removidos do estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Updated data: " + product);
		System.out.println();
		sc.close();  
		
		List<String> list = new ArrayList<String>(); // Também pode ser instanciada assim: new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		
		for(String x: list) {
			System.out.println(x);
		} 
		System.out.println();
		
		list.add(2, "Marco");
		
		for(String x: list) {
			System.out.println(x);
		}
		System.out.println("----------------------------------");
		
		list.removeIf(x -> x.charAt(2) == 'r');
		
		for(String x: list) {
			System.out.println(x);
		}
		System.out.println("----------------------------------");
		System.out.println("IndexOf Marco: " + list.indexOf("Marco"));
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x = new Date();
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		
		
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println(sdf3.format(y2));
		
		System.out.println(sdf2.format(x));
		System.out.println(sdf3.format(x));
		
		*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
	}

}
