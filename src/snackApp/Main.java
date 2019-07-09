package snackApp;

public class Main
{
	public static void main(String [] args)
	{
		Customer jane = new Customer("Jane ", 45.25);
		Customer bob = new Customer ("Bob ", 33.14);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		Snacks chips = new Snacks("Chips ", 36, 1.75, food.getId());
		Snacks chocolateBar = new Snacks("Chocolate ", 36, 1.00, food.getId());
		Snacks pretzel = new Snacks ("Pretzel ", 30, 2.00, food.getId());

		Snacks soda = new Snacks("Soda ", 24, 2.50, drink.getId());
		Snacks water = new Snacks("water ", 20, 2.75, drink.getId());



        // Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.

  		jane.totalP(3, soda.getCost());
		soda.buySnack(3);
		System.out.println(jane.getName() + "has $" + jane.getCOH() + " after buying 3 sodas");
		System.out.println(soda.getQuantity() + " " + soda.getName() + "left");

		//Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.

		jane.totalP(1, pretzel.getCost());
		pretzel.buySnack(1);
		System.out.println(jane.getName() + "has $" + jane.getCOH() + " after buying 1 pretzel");
		System.out.println(pretzel.getQuantity() + " " + pretzel.getName() + "left");

		//Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.

		bob.totalP(2, soda.getCost());
		soda.buySnack(2);
		System.out.println(bob.getName() + "has $" + bob.getCOH() + " after buying 2 sodas");
		System.out.println(soda.getQuantity() + " " + soda.getName() + "left");

		//Customer 1 finds $10. Print Customer 1 Cash on Hand.

		jane.addCash(10);
		System.out.println(jane.getName() + "has found $10 and now has $" + jane.getCOH());

		//Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.

		bob.totalP(1, chocolateBar.getCost());
		chocolateBar.buySnack(1);
		System.out.println(bob.getName() + "has $" + bob.getCOH() + " after buying 1 chocolateBar");
		System.out.println(chocolateBar.getQuantity() + " " + chocolateBar.getName() + "left");

		//Add 12 more items to snack 3. Print quantity of snack 3.

		pretzel.addQuantity(12);
		System.out.println(pretzel.getQuantity() + " " + pretzel.getName() + "have been added");

		//Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.

		bob.totalP(3, pretzel.getCost());
		pretzel.buySnack(3);
		System.out.println(bob.getName() + "has $" + bob.getCOH() + " after buying 3 pretzels");
		System.out.println(pretzel.getQuantity() + " " + pretzel.getName() + "left");




	}
}

