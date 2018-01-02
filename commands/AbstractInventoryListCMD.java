package submodules.commands;

import submodules.model.InventoryItem;

import java.util.List;

public abstract class AbstractInventoryListCMD extends AbstractCommand
{
    List<InventoryItem> inventory;
}
