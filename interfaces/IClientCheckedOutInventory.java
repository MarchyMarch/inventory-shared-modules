package submodules.interfaces;

import submodules.model.InventoryItem;

import java.util.List;

public interface IClientCheckedOutInventory
{
    void populateCheckedOut(List<InventoryItem> items);
}
