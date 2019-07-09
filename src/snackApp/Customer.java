package snackApp;

public class Customer
{
	private static int maxId = 0;
	private int id;
	private String name;
	private double cOH;


	public Customer(String name, double cOH)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.cOH = cOH;

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

	public double getCOH()
	{
		return cOH;
	}

	public void setCOH(double cOH)
	{
		this.cOH = cOH;
	}

	public void addCash(double addCash)
	{
		this.cOH += addCash;
	} 

	public void totalP(int quantity ,double amount)
	{
		this.cOH -= amount;
	}
}