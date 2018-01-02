package submodules.interfaces;

import submodules.model.HistoryEntry;

import java.util.List;

public interface IServerHistory
{
    List<HistoryEntry> requestHistory();
}
