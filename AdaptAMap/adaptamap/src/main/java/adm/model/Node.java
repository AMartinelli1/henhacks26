package adm.model;

public class Node {

    private String nodeId;
    private double lat;
    private double lon;
    private String buildingId;
    private String floor;

    public Node() {}

    public Node(String nodeId, double lat, double lon,
                String buildingId, String floor) {
        this.nodeId = nodeId;
        this.lat = lat;
        this.lon = lon;
        this.buildingId = buildingId;
        this.floor = floor;
    }

    public String getNodeId() { return nodeId; }
    public void setNodeId(String nodeId) { this.nodeId = nodeId; }

    public double getLat() { return lat; }
    public void setLat(double lat) { this.lat = lat; }

    public double getLon() { return lon; }
    public void setLon(double lon) { this.lon = lon; }

    public String getBuildingId() { return buildingId; }
    public void setBuildingId(String buildingId) { this.buildingId = buildingId; }

    public String getFloor() { return floor; }
    public void setFloor(String floor) { this.floor = floor; }
}