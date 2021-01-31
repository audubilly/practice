package Systems;

public class PC {

    private Case theCase;
    private Monitor theMonitor;
    private MotherBoard theMotherBoard;

    public PC(Case theCase, Monitor theMonitor,MotherBoard theMotherBoard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherBoard = theMotherBoard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public MotherBoard getTheMotherBoard() {
        return theMotherBoard;
    }
}

