package com.verizon.isp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plans")
public class Plans {

	@Id
	private String title;
	private String netSpeed;
	private String maxUsage;
	private String charge;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNetSpeed() {
		return netSpeed;
	}

	public void setNetSpeed(String netSpeed) {
		this.netSpeed = netSpeed;
	}

	public String getMaxUsage() {
		return maxUsage;
	}

	public void setMaxUsage(String maxUsage) {
		this.maxUsage = maxUsage;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

}
