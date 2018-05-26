package com.riztech.retrofitdemo.models.weather;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Flags{

	@SerializedName("sources")
	private List<String> sources;

	@SerializedName("isd-stations")
	private List<String> isdStations;

	@SerializedName("units")
	private String units;

	public void setSources(List<String> sources){
		this.sources = sources;
	}

	public List<String> getSources(){
		return sources;
	}

	public void setIsdStations(List<String> isdStations){
		this.isdStations = isdStations;
	}

	public List<String> getIsdStations(){
		return isdStations;
	}

	public void setUnits(String units){
		this.units = units;
	}

	public String getUnits(){
		return units;
	}

	@Override
 	public String toString(){
		return 
			"Flags{" + 
			"sources = '" + sources + '\'' + 
			",isd-stations = '" + isdStations + '\'' + 
			",units = '" + units + '\'' + 
			"}";
		}
}