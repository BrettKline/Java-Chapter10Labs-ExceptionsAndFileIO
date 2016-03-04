import java.util.Scanner;
public class Prog10_3 {

	public static void main(String[] args) throws NegativeQuantity, NegativePrice {
		RetailItem item1 = new RetailItem();
		RetailItem item2 = new RetailItem();
		RetailItem item3 = new RetailItem();
		
		item1.setDescription("Jacket");
		item2.setDescription("Designer Jeans");
		item3.setDescription("Shirt");
		
		item1.setUnitsOnHand(12);
		item2.setUnitsOnHand(40);
		item3.setUnitsOnHand(20);
		
		item1.setPrice(59.95);
		item2.setPrice(34.95);
		item3.setPrice(24.95);

		System.out.println(item1.toString());
		System.out.println(item2.toString());
		System.out.println(item3.toString());
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a description, a quantity, and a price. Entering negative numbers for either numeric value will throw an exception.");

		RetailItem item4 = new RetailItem();
		try {
			item4.setDescription(input.nextLine());
			item4.setUnitsOnHand(input.nextInt());
			item4.setPrice(input.nextDouble());
			System.out.println(item4.toString());
			input.close();
		}
		catch (NegativeQuantity e) {
			System.out.println(e.getMessage());
		}
		catch (NegativePrice e) {
			System.out.println(e.getMessage());
		}
		finally {
			input.close();
		}
	}

}
