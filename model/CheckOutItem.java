package submodules.model;

import java.util.Date;
import java.util.UUID;

public class CheckOutItem extends InventoryItem
{
    private Date date;
    private String firstName;
    private String lastName;
    private String netID;
    private String phoneNumber;
    private String email;

    CheckOutItem(){}

    CheckOutItem(String uuid, String make, String model, String description, Date date, String firstName, String lastName,
                 String netID, String phoneNumber, String email)
    {
        this.uuid = uuid;
        this.make = make;
        this.model = model;
        this.description = description;
        this.date = date;
        this.firstName = firstName;
        this.lastName = lastName;
        this.netID = netID;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getNetID()
    {
        return netID;
    }

    public void setNetID(String netID)
    {
        this.netID = netID;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
