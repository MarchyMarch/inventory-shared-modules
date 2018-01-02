package submodules.interfaces;

import submodules.model.HistoryEntry;

import java.util.List;

public interface IClientHistory
{
    void populateHistory(List<HistoryEntry> history);
}
