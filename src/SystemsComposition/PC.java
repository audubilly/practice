package SystemsComposition;

public class PC {

    private Case theCase;
    private Monitor theMonitor;
    private MotherBoard theMotherBoard;

    public PC(Case theCase, Monitor theMonitor,MotherBoard theMotherBoard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherBoard = theMotherBoard;
    }
    public  void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        theMonitor.drawPixelArt(1200,1300,"black");
    }

}

