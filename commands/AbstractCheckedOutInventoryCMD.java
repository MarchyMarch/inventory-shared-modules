package submodules.commands;

import submodules.model.InventoryItem;

import java.util.List;

public abstract class AbstractCheckedOutInventoryCMD extends AbstractCommand
{
    List<InventoryItem> checkedOut;
}
