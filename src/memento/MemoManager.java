package memento;

public class MemoManager {
    private EntryFormMemo entryFormMemo;

    public void setEntryFormMemo(EntryFormMemo entryFormMemo) {
        this.entryFormMemo = entryFormMemo;
    }

    public EntryFormMemo getEntryFormMemo() {
        return entryFormMemo;
    }
}
