package cata.scraper;

public class RouteStop {
    private int RouteId;
    private int StopId;
    private int SortOrder;
    private String Direction;

    public RouteStop(int routeId, int stopId, int sortOrder, String direction) {
        this.RouteId = routeId;
        this.StopId = stopId;
        this.SortOrder = sortOrder;
        this.Direction = direction;
    }

    public int getRouteId() {
        return RouteId;
    }

    public void setRouteId(int routeId) {
        RouteId = routeId;
    }

    public int getStopId() {
        return StopId;
    }

    public void setStopId(int stopId) {
        StopId = stopId;
    }

    public int getSortOrder() {
        return SortOrder;
    }

    public void setSortOrder(int sortOrder) {
        SortOrder = sortOrder;
    }

    public String getDirection() {
        return Direction;
    }

    public void setDirection(String direction) {
        Direction = direction;
    }
}
