package cata.scraper;

public class Bus{



    private int RouteId;
    private int RouteRecordId;
    private String ShortName;
    private String LongName;
    private String RouteAbbreviation;
    private String IvrDescription;
    private String Color;
    private String TextColor;
    private Boolean IsVisible;
    private String Group;
    private int SortOrder;
    private String RouteTraceFile;
    private String RouteTraceHash64;
    private Boolean IsHeadWay;
    private Boolean IncludeInGoogle;
    private String GoogleDescription;
    private Stop Stops[];
    private RouteStop RouteStops[];
    private Direction Directions[];
    private Vehicle Vehicles[];
    private Message Messages[];


    public int getRouteId() {
        return RouteId;
    }

    public void setRouteId(int routeId) {
        RouteId = routeId;
    }

    public int getRouteRecordId() {
        return RouteRecordId;
    }

    public void setRouteRecordId(int routeRecordId) {
        RouteRecordId = routeRecordId;
    }

    public String getShortName() {
        return ShortName;
    }

    public void setShortName(String shortName) {
        ShortName = shortName;
    }

    public String getLongName() {
        return LongName;
    }

    public void setLongName(String longName) {
        LongName = longName;
    }

    public String getRouteAbbreviation() {
        return RouteAbbreviation;
    }

    public void setRouteAbbreviation(String routeAbbreviation) {
        RouteAbbreviation = routeAbbreviation;
    }

    public String getIvrDescription() {
        return IvrDescription;
    }

    public void setIvrDescription(String ivrDescription) {
        IvrDescription = ivrDescription;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getTextColor() {
        return TextColor;
    }

    public void setTextColor(String textColor) {
        TextColor = textColor;
    }

    public Boolean getVisible() {
        return IsVisible;
    }

    public void setVisible(Boolean visible) {
        IsVisible = visible;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public int getSortOrder() {
        return SortOrder;
    }

    public void setSortOrder(int sortOrder) {
        SortOrder = sortOrder;
    }

    public String getRouteTraceFile() {
        return RouteTraceFile;
    }

    public void setRouteTraceFile(String routeTraceFile) {
        RouteTraceFile = routeTraceFile;
    }

    public String getRouteTraceHash64() {
        return RouteTraceHash64;
    }

    public void setRouteTraceHash64(String routeTraceHash64) {
        RouteTraceHash64 = routeTraceHash64;
    }

    public Boolean getHeadWay() {
        return IsHeadWay;
    }

    public void setHeadWay(Boolean headWay) {
        IsHeadWay = headWay;
    }

    public Boolean getIncludeInGoogle() {
        return IncludeInGoogle;
    }

    public void setIncludeInGoogle(Boolean includeInGoogle) {
        IncludeInGoogle = includeInGoogle;
    }

    public String getGoogleDescription() {
        return GoogleDescription;
    }

    public void setGoogleDescription(String googleDescription) {
        GoogleDescription = googleDescription;
    }

    public Stop[] getStops() {
        return Stops;
    }

    public void setStops(Stop[] stops) {
        Stops = stops;
    }

    public RouteStop[] getRouteStops() {
        return RouteStops;
    }

    public void setRouteStops(RouteStop[] routeStops) {
        RouteStops = routeStops;
    }

    public Direction[] getDirections() {
        return Directions;
    }

    public void setDirections(Direction[] directions) {
        Directions = directions;
    }

    public Vehicle[] getVehicles() {
        return Vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        Vehicles = vehicles;
    }

    public Message[] getMessages() {
        return Messages;
    }

    public void setMessages(Message[] messages) {
        Messages = messages;
    }
}
