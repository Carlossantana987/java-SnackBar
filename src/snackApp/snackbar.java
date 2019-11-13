public class Snack
{
    private static int MaxId = 0;
    private int id;
    private String name;
    private int quantity
    private double cost;
    private int machineId;

    public Snack(int id, String name, int quantity,double cost, int machineId)
    {
        maxId++;
        Id = maxId;
        this.name = name;
        this.quantity = quantity
        this.cost = cost;
        this.machineId = machineId;
    }

    public int getId()
    {
        return Id;
    }

    public String getName()
    {
        return name;
    }

    public int getQuantity()
    {
        return quantity
    }

    public double getCost()
    {
        return cost;
    }

    public int getMachineId()
    {
        return machineId;
    }

    public void setId(int id)
    {
        Id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public void setMachineId(int machineId)
    {
        this.machineId = machineId;
    }

    public void addQuantity(int quantity)
    {
        return this.quantity += quantity
    }

    public void buySnack(int quantity)
    {
        return this.quantity *= quantity
    }

    public void totalCost(int quantity)
    {
        return this.cost *= quantity
    }


}

