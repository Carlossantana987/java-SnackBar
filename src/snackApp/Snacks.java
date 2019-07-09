package snackApp;

public class Snacks
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vMachineId;



    public Snacks(String name, int quantity, double cost, int vMachineId)
    {
    	maxId++;
    	id = maxId;

    	this.name = name;
    	this.quantity = quantity;
    	this.cost = cost;
    	this.vMachineId = vMachineId;
    }

    public int getId()
    {
    	return id;
    }

    public String getName()
    {
    	return name;
    }

    public void setName(String name)
    {
    	this.name = name;
    }

    public double getCost()
    {
    	return cost;
    }

    public void setCost(double cost)
    {
    	this.cost = cost;
    }

    public int getVMachineId()
    {
    	return vMachineId;
    }

    public void setVMachineId(int vMachineId)
    {
    	this.vMachineId = vMachineId;
    }

    public int getQuantity()
    {
    	return quantity;
    }

    public void addQuantity(int quantity)
    {
    	this.quantity += quantity;
    }

    public void buySnack(int quantity)
    {
    	this.quantity -= quantity ;
    }

    public double totalCost(int quantity)
    {
    
    return this.cost * quantity;
    
    }
}