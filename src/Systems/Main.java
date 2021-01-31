package Systems;

public class Main {

    public static void main(String[] args) {

        Case theCase = new Case("Asos","Dell","240v",
                new Dimensions(21,20,35));

        Monitor theMonitor = new Monitor("32inches","DellScreens"
                ,32,new Resolution(23,30));

        MotherBoard theMotherBoard = new MotherBoard("corei3","DEllMotherBoards",
                "systems",4,2);

        PC pc = new PC(theCase,theMonitor,theMotherBoard);
        pc.getTheCase().getPowerSupply();
        pc.getTheMonitor().drawPixelArt(5,5 ,"Green");
        pc.getTheMotherBoard().loadProgram("Scrum");
        pc.getTheMotherBoard().getManufacturer();
        pc.getTheCase().pressPowerButton();
    }

}
