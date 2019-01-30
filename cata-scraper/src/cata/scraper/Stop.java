package cata.scraper;

public class Stop {
    private int StopId;
    private int StopRecordId;
    private String Name;
    private String Description;
    private int Latitude;
    private int Longitude;

    public Stop(int stopId, int stopRecordId, String name, String description, int latitude, int longitude, Boolean isTimePoint) {
        this.StopId = stopId;
        this.StopRecordId = stopRecordId;
        this.Name = name;
        this.Description = description;
        this.Latitude = latitude;
        this.Longitude = longitude;
        this.IsTimePoint = isTimePoint;
    }

    public int getStopId() {
        return StopId;
    }

    public void setStopId(int stopId) {
        StopId = stopId;
    }

    public int getStopRecordId() {
        return StopRecordId;
    }

    public void setStopRecordId(int stopRecordId) {
        StopRecordId = stopRecordId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getLatitude() {
        return Latitude;
    }

    public void setLatitude(int latitude) {
        Latitude = latitude;
    }

    public int getLongitude() {
        return Longitude;
    }

    public void setLongitude(int longitude) {
        Longitude = longitude;
    }

    public Boolean getTimePoint() {
        return IsTimePoint;
    }

    public void setTimePoint(Boolean timePoint) {
        IsTimePoint = timePoint;
    }

    private Boolean IsTimePoint;

}
