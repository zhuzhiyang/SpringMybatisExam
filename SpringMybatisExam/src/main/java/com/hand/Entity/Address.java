package com.hand.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class Address implements Serializable {
private Integer address_id;
private String address;
private String address2;
private String district;
private Integer city_id;
private String postal_code;
private String phone;
private Timestamp last_update;
public Integer getAddress_id() {
	return address_id;
}
public void setAddress_id(Integer address_id) {
	this.address_id = address_id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getAddress2() {
	return address2;
}
public void setAddress2(String address2) {
	this.address2 = address2;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public Integer getCity_id() {
	return city_id;
}
public void setCity_id(Integer city_id) {
	this.city_id = city_id;
}
public String getPostal_code() {
	return postal_code;
}
public void setPostal_code(String postal_code) {
	this.postal_code = postal_code;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Timestamp getLast_update() {
	return last_update;
}
public void setLast_update(Timestamp last_update) {
	this.last_update = last_update;
}


}
