package cata.scraper;

public class Direction {
    private String Dir;
    private String DirectionIconFileName;
    private String DirectionDesc;

    public Direction(String dir, String directionIconFileName, String directionDesc) {
        this.Dir = dir;
        this.DirectionIconFileName = directionIconFileName;
        this.DirectionDesc = directionDesc;
    }

    public String getDir() {
        return Dir;
    }

    public void setDir(String dir) {
        Dir = dir;
    }

    public String getDirectionIconFileName() {
        return DirectionIconFileName;
    }

    public void setDirectionIconFileName(String directionIconFileName) {
        DirectionIconFileName = directionIconFileName;
    }

    public String getDirectionDesc() {
        return DirectionDesc;
    }

    public void setDirectionDesc(String directionDesc) {
        DirectionDesc = directionDesc;
    }
}
