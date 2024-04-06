package com.blackcoffer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DATA")
public class Model {
	@Id
	@Column(name = "INTENSITY")
	private String intensity;
	
	@Column(name = "LIKELIHOOD")
	private String likelihood;
	
	@Column(name = "RELEVANCE")
	private String relevance;
	
	@Column(name = "YEAR")
	private String year;
	
	@Column(name = "COUNTRY")
	private String country;
	
	@Column(name = "TOPIC")
	private String topics;
	
	@Column(name = "REGION")
	private String region;
	
	@Column(name = "CITY")
	private String city;
	
	
	public String getIntensity() {
		return intensity;
	}
	public void setIntensity(String intensity) {
		this.intensity = intensity;
	}
	public String getLikelihood() {
		return likelihood;
	}
	public void setLikelihood(String likelihood) {
		this.likelihood = likelihood;
	}
	public String getRelevance() {
		return relevance;
	}
	public void setRelevance(String relevance) {
		this.relevance = relevance;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTopics() {
		return topics;
	}
	public void setTopics(String topics) {
		this.topics = topics;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Model [intensity=" + intensity + ", likelihood=" + likelihood + ", relevance=" + relevance + ", year="
				+ year + ", country=" + country + ", topics=" + topics + ", region=" + region + ", city=" + city + "]";
	}

	
}
