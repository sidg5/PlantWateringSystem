package com.hackathon.bean;

public class TankerDispenseDetails
{
	private int tankerId;
	private String tankerNumber;
	private int waterNeedDispense;
	private int noOfPatches;
	private String areaName;
	
	public int getTankerId() {
		return tankerId;
	}
	public void setTankerId(int tankerId) {
		this.tankerId = tankerId;
	}
	public String getTankerNumber() {
		return tankerNumber;
	}
	public void setTankerNumber(String tankerNumber) {
		this.tankerNumber = tankerNumber;
	}
	public int getWaterNeedDispense() {
		return waterNeedDispense;
	}
	public void setWaterNeedDispense(int waterNeedDispense) {
		this.waterNeedDispense = waterNeedDispense;
	}
	public int getNoOfPatches() {
		return noOfPatches;
	}
	public void setNoOfPatches(int noOfPatches) {
		this.noOfPatches = noOfPatches;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
}
