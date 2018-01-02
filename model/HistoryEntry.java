package submodules.model;

import java.util.Date;

public class HistoryEntry extends InventoryItem
{
    private String name;
    private Date dateReturned;

    HistoryEntry(){}

    HistoryEntry(String uuid, String make, String model, String description, String name, Date dateReturned)
    {
        this.uuid = uuid;
        this.make = make;
        this.model = model;
        this.description = description;
        this.name = name;
        this.dateReturned = dateReturned;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Date getDateReturned()
    {
        return dateReturned;
    }

    public void setDateReturned(Date dateReturned)
    {
        this.dateReturned = dateReturned;
    }
}
