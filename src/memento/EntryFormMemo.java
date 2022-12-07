package memento;

import entity.Species;


public class EntryFormMemo {
    private Species[] athleteList;
    private int currentNum;

    public EntryFormMemo(Species[] athleteList, int currentNum) {
        this.athleteList = athleteList;
        this.currentNum = currentNum;
    }

    public Species[] getAthleteList() {
        return athleteList;
    }

    public int getCurrentNum() {
        return currentNum;
    }



}
