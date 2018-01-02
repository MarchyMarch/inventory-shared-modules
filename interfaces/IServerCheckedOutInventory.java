package submodules.interfaces;

import submodules.model.InventoryItem;

import java.util.List;

public interface IServerCheckedOutInventory
{
    void returnRequest(InventoryItem item);
    List<InventoryItem> requestCheckOutInventory();
}
