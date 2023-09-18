package com.skyapi.weatherforcast.common;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "locations")
public class Location {
	
	@Column(length=12, nullable = false)
	@Id
	@NotBlank
	private String code;
	
	@Column(length=128, nullable = false)
	@JsonProperty("city_name")
	@NotBlank
	private String cityName;
	
	@Column(length=64, nullable = false)
	@JsonProperty("country_name")
	@NotBlank
	private String countryName;
	
	@Column(length=64, nullable = false)
	@JsonProperty("country_code")
	@NotBlank
	private String countryCode;
	
	@Column(length=64, nullable = false)
	@NotNull
	@JsonProperty("region_name")
	private String regionName;
	
	private boolean enabled;
	
	@JsonIgnore
	private boolean trashed;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isTrashed() {
		return trashed;
	}

	public void setTrashed(boolean trashed) {
		this.trashed = trashed;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		return Objects.equals(code, other.code);
	}

	@Override
	public String toString() {
		return "Location [code=" + code + ", cityName=" + cityName + ", countryName=" + countryName + ", countryCode="
				+ countryCode + ", regionName=" + regionName + ", enabled=" + enabled + ", trashed=" + trashed + "]";
	}
	
	
}
