package com.scoe.java.ScoeHibernateFirst;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "Student")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {
	@Id
	private int studId;
	// @Column(name = "stuent name")
	private String studName;
	private String sCity;

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getsCity() {
		return sCity;
	}

	public void setsCity(String sCity) {
		this.sCity = sCity;
	}

	@Override
	public String toString() {
		return "\n Student [studId=" + studId + ", studName=" + studName + ", sCity=" + sCity + "]";
	}

	public Student(int studId, String studName, String sCity) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.sCity = sCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
