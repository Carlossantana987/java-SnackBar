public class Main
{
    public static void main(String [] args)
    {
        Customer Jane = new Customer("Jane",45.25);
        Customer Bob = new Customer("Bob",33.14)

        VendingMachine Food = new VendingMachine(1,"Food")
        VendingMachine Drink = new VendingMachine(2,"Drink")
        VendingMachine Office = new VendingMachine(3,"Office")

        snackbar Chips = new snackbar("Chips",10,1.75,Food.getId())
        snackbar ChocolateBar = new snackbar("ChocolateBar",5,1.00,Food.getId())
        snackbar Pretzel = new snackbar("Pretzel",10,2.00,Food.getId())

        snackbar Soda = new snackbar("Soda",10,2.50,Drink.getId())
        snackbar Water = new snackbar("Water",10,2.75,Drink.getId())


        Jane.buySnack(3,soda.getCost())
        system.out.println(Jane.getCoh())
        system.out.println(soda.getQuantity())



    }
}