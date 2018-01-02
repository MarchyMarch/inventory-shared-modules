package submodules.interfaces;

import submodules.model.Computer;
import submodules.model.InventoryItem;
import submodules.model.Part;

import java.util.List;

public interface IClientInventory
{
    void populateInventory(List<InventoryItem> items);
    void specs(Computer computer);
    void specs(Part part);
}
