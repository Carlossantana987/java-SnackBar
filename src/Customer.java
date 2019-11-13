public class Customer
{
    private int id;
    private String name;
    private double coh;

    public Customer(int id, String name, double coh)
    {
        this.id = id;
        this.name = name;
        this.coh = coh;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getCoh()
    {
        return coh;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCoh(double coh)
    {
        this.coh = coh;
    }

    public void addCash(double additionalCash)
    {
        return coh += additionalCash
    }

    public void buytotal(double costOfItem)
    {
        return coh -= costOfItem
    }

}