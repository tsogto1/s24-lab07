package frogger;

import java.util.ArrayList;
import java.util.List;

public class Records {
    private final List<FroggerID> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    public boolean addRecord(FroggerID froggerID) {
        if (records.contains(froggerID)) {
            return false;
        }
        records.add(froggerID);
        return true;
    }
}
