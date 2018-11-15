package nju.edu.wyc.vo;

/**
 * 动态信息
 * @author wyc666
 *
 */
public class Spittle {
	private long id;
	private long auther_Id;
	private String text;
	private double latitude;
	private double longitude;

	
	public Spittle(){}
	
	public Spittle(long id, long auther_Id, String text){	
		this.id = id;
		this.auther_Id = auther_Id;
		this.text = text;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getAuther_Id() {
		return auther_Id;
	}
	public void setAuther_Id(long auther_Id) {
		this.auther_Id = auther_Id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
}
