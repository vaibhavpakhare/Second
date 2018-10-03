package com.scp.java.VaibhavHibernate;

public class Mobile {
	private int mobId;
	private String mobName;
	private int mobPrise;

	public int getMobId() {
		return mobId;
	}

	public void setMobId(int mobId) {
		this.mobId = mobId;
	}

	public String getMobName() {
		return mobName;
	}

	public void setMobName(String mobName) {
		this.mobName = mobName;
	}

	public int getMobPrise() {
		return mobPrise;
	}

	public void setMobPrise(int mobPrise) {
		this.mobPrise = mobPrise;
	}

	@Override
	public String toString() {
		return "\n Mobile [mobId=" + mobId + ", mobName=" + mobName + ", mobPrise=" + mobPrise + "]";
	}

	public Mobile(int mobId, String mobName, int mobPrise) {
		super();
		this.mobId = mobId;
		this.mobName = mobName;
		this.mobPrise = mobPrise;
	}

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

}
