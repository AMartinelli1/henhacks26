package adm.model;

public class Edge {

    private String edgeId;
    private String fromNodeId;
    private String toNodeId;
    private double distanceM;
    private String edgeType;
    private boolean accessible;
    private Double slope;
    private boolean indoor;

    public Edge() {}

    public String getEdgeId() { return edgeId; }
    public void setEdgeId(String edgeId) { this.edgeId = edgeId; }

    public String getFromNodeId() { return fromNodeId; }
    public void setFromNodeId(String fromNodeId) { this.fromNodeId = fromNodeId; }

    public String getToNodeId() { return toNodeId; }
    public void setToNodeId(String toNodeId) { this.toNodeId = toNodeId; }

    public double getDistanceM() { return distanceM; }
    public void setDistanceM(double distanceM) { this.distanceM = distanceM; }

    public String getEdgeType() { return edgeType; }
    public void setEdgeType(String edgeType) { this.edgeType = edgeType; }

    public boolean isAccessible() { return accessible; }
    public void setAccessible(boolean accessible) { this.accessible = accessible; }

    public Double getSlope() { return slope; }
    public void setSlope(Double slope) { this.slope = slope; }

    public boolean isIndoor() { return indoor; }
    public void setIndoor(boolean indoor) { this.indoor = indoor; }
}