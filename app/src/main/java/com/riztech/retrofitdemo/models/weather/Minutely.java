package com.riztech.retrofitdemo.models.weather;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Minutely{

	@SerializedName("summary")
	private String summary;

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("icon")
	private String icon;

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setIcon(String icon){
		this.icon = icon;
	}

	public String getIcon(){
		return icon;
	}

	@Override
 	public String toString(){
		return 
			"Minutely{" + 
			"summary = '" + summary + '\'' + 
			",data = '" + data + '\'' + 
			",icon = '" + icon + '\'' + 
			"}";
		}
}