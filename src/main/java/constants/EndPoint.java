package constants;

public enum EndPoint {
	SAMLTESTENDPOINT("/mobilityx/faces/jsf/Login.jsf");
	
	public final String urlEndPoint;
	EndPoint(String urlEndPoint) {
		this.urlEndPoint = urlEndPoint;
	}
}
