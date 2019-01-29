package cata.scraper;

public class Bus{
    private int onBoard;
    private String shortName;
    private String longName;
    private String lastUpdateTime;

    public Bus(int onBoard, String shortName, String longName, String lastUpdateTime) {
        this.onBoard = onBoard;
        this.shortName = shortName;
        this.longName = longName;
        this.lastUpdateTime = lastUpdateTime;
    }

}
