package com.riztech.retrofitdemo.models.weather;

import com.google.gson.annotations.SerializedName;

public class Currently{

	@SerializedName("summary")
	private String summary;

	@SerializedName("precipProbability")
	private int precipProbability;

	@SerializedName("visibility")
	private double visibility;

	@SerializedName("windGust")
	private double windGust;

	@SerializedName("precipIntensity")
	private int precipIntensity;

	@SerializedName("icon")
	private String icon;

	@SerializedName("cloudCover")
	private double cloudCover;

	@SerializedName("windBearing")
	private int windBearing;

	@SerializedName("apparentTemperature")
	private double apparentTemperature;

	@SerializedName("pressure")
	private double pressure;

	@SerializedName("dewPoint")
	private double dewPoint;

	@SerializedName("ozone")
	private double ozone;

	@SerializedName("nearestStormDistance")
	private int nearestStormDistance;

	@SerializedName("temperature")
	private double temperature;

	@SerializedName("humidity")
	private double humidity;

	@SerializedName("time")
	private int time;

	@SerializedName("windSpeed")
	private double windSpeed;

	@SerializedName("uvIndex")
	private int uvIndex;

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setPrecipProbability(int precipProbability){
		this.precipProbability = precipProbability;
	}

	public int getPrecipProbability(){
		return precipProbability;
	}

	public void setVisibility(double visibility){
		this.visibility = visibility;
	}

	public double getVisibility(){
		return visibility;
	}

	public void setWindGust(double windGust){
		this.windGust = windGust;
	}

	public double getWindGust(){
		return windGust;
	}

	public void setPrecipIntensity(int precipIntensity){
		this.precipIntensity = precipIntensity;
	}

	public int getPrecipIntensity(){
		return precipIntensity;
	}

	public void setIcon(String icon){
		this.icon = icon;
	}

	public String getIcon(){
		return icon;
	}

	public void setCloudCover(double cloudCover){
		this.cloudCover = cloudCover;
	}

	public double getCloudCover(){
		return cloudCover;
	}

	public void setWindBearing(int windBearing){
		this.windBearing = windBearing;
	}

	public int getWindBearing(){
		return windBearing;
	}

	public void setApparentTemperature(double apparentTemperature){
		this.apparentTemperature = apparentTemperature;
	}

	public double getApparentTemperature(){
		return apparentTemperature;
	}

	public void setPressure(double pressure){
		this.pressure = pressure;
	}

	public double getPressure(){
		return pressure;
	}

	public void setDewPoint(double dewPoint){
		this.dewPoint = dewPoint;
	}

	public double getDewPoint(){
		return dewPoint;
	}

	public void setOzone(double ozone){
		this.ozone = ozone;
	}

	public double getOzone(){
		return ozone;
	}

	public void setNearestStormDistance(int nearestStormDistance){
		this.nearestStormDistance = nearestStormDistance;
	}

	public int getNearestStormDistance(){
		return nearestStormDistance;
	}

	public void setTemperature(double temperature){
		this.temperature = temperature;
	}

	public double getTemperature(){
		return temperature;
	}

	public void setHumidity(double humidity){
		this.humidity = humidity;
	}

	public double getHumidity(){
		return humidity;
	}

	public void setTime(int time){
		this.time = time;
	}

	public int getTime(){
		return time;
	}

	public void setWindSpeed(double windSpeed){
		this.windSpeed = windSpeed;
	}

	public double getWindSpeed(){
		return windSpeed;
	}

	public void setUvIndex(int uvIndex){
		this.uvIndex = uvIndex;
	}

	public int getUvIndex(){
		return uvIndex;
	}

	@Override
 	public String toString(){
		return 
			"Currently{" + 
			"summary = '" + summary + '\'' + 
			",precipProbability = '" + precipProbability + '\'' + 
			",visibility = '" + visibility + '\'' + 
			",windGust = '" + windGust + '\'' + 
			",precipIntensity = '" + precipIntensity + '\'' + 
			",icon = '" + icon + '\'' + 
			",cloudCover = '" + cloudCover + '\'' + 
			",windBearing = '" + windBearing + '\'' + 
			",apparentTemperature = '" + apparentTemperature + '\'' + 
			",pressure = '" + pressure + '\'' + 
			",dewPoint = '" + dewPoint + '\'' + 
			",ozone = '" + ozone + '\'' + 
			",nearestStormDistance = '" + nearestStormDistance + '\'' + 
			",temperature = '" + temperature + '\'' + 
			",humidity = '" + humidity + '\'' + 
			",time = '" + time + '\'' + 
			",windSpeed = '" + windSpeed + '\'' + 
			",uvIndex = '" + uvIndex + '\'' + 
			"}";
		}
}