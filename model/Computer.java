package submodules.model;

import java.util.UUID;

public class Computer extends InventoryItem
{
    private String os;
    private int screenSize;
    private String processor;
    private int ram;
    private int hdd;
    private String hddType;
    private String graphics;

    Computer(){}

    Computer(String os, int screenSize, String processor, int ram, int hdd, String hddType, String graphics)
    {
        this.uuid = UUID.randomUUID().toString();
        this.os = os;
        this.screenSize = screenSize;
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.hddType = hddType;
        this.graphics = graphics;
    }

    Computer(String make, String model, String description, String os, int screenSize,
             String processor, int ram, int hdd, String hddType, String graphics)
    {
        this.uuid = UUID.randomUUID().toString();
        this.make = make;
        this.model = model;
        this.description = description;
        this.os = os;
        this.screenSize = screenSize;
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.hddType = hddType;
        this.graphics = graphics;
    }

    public String getOs()
    {
        return os;
    }

    public void setOs(String os)
    {
        this.os = os;
    }

    public int getScreenSize()
    {
        return screenSize;
    }

    public void setScreenSize(int screenSize)
    {
        this.screenSize = screenSize;
    }

    public String getProcessor()
    {
        return processor;
    }

    public void setProcessor(String processor)
    {
        this.processor = processor;
    }

    public int getRam()
    {
        return ram;
    }

    public void setRam(int ram)
    {
        this.ram = ram;
    }

    public int getHdd()
    {
        return hdd;
    }

    public void setHdd(int hdd)
    {
        this.hdd = hdd;
    }

    public String getHddType()
    {
        return hddType;
    }

    public void setHddType(String hddType)
    {
        this.hddType = hddType;
    }

    public String getGraphics()
    {
        return graphics;
    }

    public void setGraphics(String graphics)
    {
        this.graphics = graphics;
    }
}
