package com.wooCommerce.forJ.pojo.v2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Metum {

	@Expose
	private String key;
	@Expose
	private String label;
	@Expose
	private String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Metum withKey(String key) {
		this.key = key;
		return this;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Metum withLabel(String label) {
		this.label = label;
		return this;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Metum withValue(String value) {
		this.value = value;
		return this;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public Integer getIntegerValue() {
		return Integer.valueOf(value);
	}

	public Date getDateValue(String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			return sdf.parse(value);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
}
