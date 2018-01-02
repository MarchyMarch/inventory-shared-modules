package submodules.interfaces;

import submodules.model.InventoryItem;

import java.util.List;

public interface IServerInventory
{
    void checkoutRequest(InventoryItem item);
    List<InventoryItem> requestInventory();
}
