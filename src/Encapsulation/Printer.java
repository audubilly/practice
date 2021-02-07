package Encapsulation;

public class Printer {

    private String name;
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(String name, int tonerLevel, boolean duplex) {
        this.name = name;


        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }


        this.pagesPrinted = 0;
        this.duplex = duplex;
    }


    public int fillUpToner(int tonerLevel) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            if (this.tonerLevel + tonerLevel > 100) {
                return -1;
            }
            this.tonerLevel += tonerLevel;
            return this.tonerLevel;
        } else {
            return -1;
        }


    }


    public int incrementNumberOfPagesPrinted(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

  }


