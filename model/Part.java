package submodules.model;

import java.util.UUID;

public class Part extends InventoryItem
{
    Part(){}

    Part(String make, String model, String description)
    {
        this.uuid = UUID.randomUUID().toString();
        this.make = make;
        this.model = model;
        this.description = description;
    }
}
