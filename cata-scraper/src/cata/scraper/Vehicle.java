package cata.scraper;

public class Vehicle {
    private int VehicleId;
    private String Name;
    private int Latitude;
    private int Longitude;
    private int RouteId;
    private int TripId;
    private int RunId;
    private String Direction;
    private String DirectionLong;
    private String Destination;
    private int Speed;
    private int Heading;
    private int Deviation;
    private String OpStatus;
    private String CommStatus;
    private int GPSStatus;
    private String DriverName;
    private String LastStop;
    private int OnBoard;
    private String LastUpdated;
    private String DisplayStatus;
    private int BlockFareboxId;

    public Vehicle(int vehicleId, String name, int latitude, int longitude, int routeId, int tripId, int runId, String direction, String directionLong, String destination, int speed, int heading, int deviation, String opStatus, String commStatus, int GPSStatus, String driverName, String lastStop, int onBoard, String lastUpdated, String displayStatus, int blockFareboxId) {
        this.VehicleId = vehicleId;
        this. Name = name;
        this.Latitude = latitude;
        this.Longitude = longitude;
        this.RouteId = routeId;
        this.TripId = tripId;
        this.RunId = runId;
        this.Direction = direction;
        this.DirectionLong = directionLong;
        this.Destination = destination;
        this.Speed = speed;
        this.Heading = heading;
        this.Deviation = deviation;
        this.OpStatus = opStatus;
        this.CommStatus = commStatus;
        this.GPSStatus = GPSStatus;
        this.DriverName = driverName;
        this.LastStop = lastStop;
        this.OnBoard = onBoard;
        this.LastUpdated = lastUpdated;
        this.DisplayStatus = displayStatus;
        this.BlockFareboxId = blockFareboxId;
    }

    public int getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(int vehicleId) {
        VehicleId = vehicleId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    public int getRouteId() {
        return RouteId;
    }

    public void setRouteId(int routeId) {
        RouteId = routeId;
    }

    public int getTripId() {
        return TripId;
    }

    public void setTripId(int tripId) {
        TripId = tripId;
    }

    public int getRunId() {
        return RunId;
    }

    public void setRunId(int runId) {
        RunId = runId;
    }

    public String getDirection() {
        return Direction;
    }

    public void setDirection(String direction) {
        Direction = direction;
    }

    public String getDirectionLong() {
        return DirectionLong;
    }

    public void setDirectionLong(String directionLong) {
        DirectionLong = directionLong;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getHeading() {
        return Heading;
    }

    public void setHeading(int heading) {
        Heading = heading;
    }

    public int getDeviation() {
        return Deviation;
    }

    public void setDeviation(int deviation) {
        Deviation = deviation;
    }

    public String getOpStatus() {
        return OpStatus;
    }

    public void setOpStatus(String opStatus) {
        OpStatus = opStatus;
    }

    public String getCommStatus() {
        return CommStatus;
    }

    public void setCommStatus(String commStatus) {
        CommStatus = commStatus;
    }

    public int getGPSStatus() {
        return GPSStatus;
    }

    public void setGPSStatus(int GPSStatus) {
        this.GPSStatus = GPSStatus;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public String getLastStop() {
        return LastStop;
    }

    public void setLastStop(String lastStop) {
        LastStop = lastStop;
    }

    public int getOnBoard() {
        return OnBoard;
    }

    public void setOnBoard(int onBoard) {
        OnBoard = onBoard;
    }

    public String getLastUpdated() {
        return LastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        LastUpdated = lastUpdated;
    }

    public String getDisplayStatus() {
        return DisplayStatus;
    }

    public void setDisplayStatus(String displayStatus) {
        DisplayStatus = displayStatus;
    }

    public int getBlockFareboxId() {
        return BlockFareboxId;
    }

    public void setBlockFareboxId(int blockFareboxId) {
        BlockFareboxId = blockFareboxId;
    }
}
