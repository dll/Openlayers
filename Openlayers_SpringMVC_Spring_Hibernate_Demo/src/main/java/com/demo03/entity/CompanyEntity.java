package com.demo03.entity;

import javax.persistence.*;

@Entity
@Table(name = "openlayers_company_info", schema = "learn_demos")
public class CompanyEntity {
    private int id;
    private String name;
    private Integer code;
    private String address;
    private Double locationX;
    private Double locationY;
    private String province;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "code")
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "x_intercept")
    public Double getLocationX() {
        return locationX;
    }

    public void setLocationX(Double locationX) {
        this.locationX = locationX;
    }

    @Basic
    @Column(name = "y_intercept")
    public Double getLocationY() {
        return locationY;
    }

    public void setLocationY(Double locationY) {
        this.locationY = locationY;
    }

    @Basic
    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "CompanyEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code=" + code +
                ", address='" + address + '\'' +
                ", locationX=" + locationX +
                ", locationY=" + locationY +
                ", province='" + province + '\'' +
                '}';
    }
}
