package com.Inheritances;

class Joiningdate {
	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString() {
		return day + " " + month + " " + year;
	}
}

class Job {
	private int jobid;
	private String profile;
	private Joiningdate date;

	public int getJobid() {
		return jobid;
	}

	public void setJobid(int jobid) {
		this.jobid = jobid;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public Joiningdate getDate() {
		return date;
	}

	public void setDate(Joiningdate date) {
		this.date = date;
	}

	public String toString() {
		return jobid + " " + profile + " " + date;
	}
}

public class Person {
	private int id;
	private String name;
	private Job job;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public String toString() {
		return id + " " + name + " " + job;
	}

	public static void main(String[] args) {

		Joiningdate date = new Joiningdate();

		Job job = new Job();

		Person per = new Person();

		per.setId(51);
		per.setJob(job);
		per.setName("vicky ");

		per.getJob().setJobid(51);
		per.getJob().setProfile("Engineer");

		per.getJob().setDate(date);

		per.getJob().getDate().setDay(14);
		per.getJob().getDate().setMonth(04);
		per.getJob().getDate().setYear(2023);

		System.out.println(per);
		System.out
				.println("-------------------------------------------------------------");

		System.out.println(per.id + " " + per.name + " "
				+ per.getJob().getJobid() + " " + per.getJob().getProfile()
				+ " " + per.getJob().getDate().getDay() + " "
				+ per.getJob().getDate().getMonth() + " "
				+ per.getJob().getDate().getYear());

		/*
		 * System.out.println("id:"+per.getId() + " " + "Name:"+per.getName() +
		 * " " +"Job id:"+ per.getJob().getJobid() + " " +"Job Profile :"+
		 * per.getJob().getProfile() + " "+ "Date is:-"+
		 * per.getJob().getDate().getDay() + ":" +
		 * per.getJob().getDate().getMonth() + ":" +
		 * per.getJob().getDate().getYear());
		 */

	}

}
