package com.cuneyt.garage64.entities;

public class DiecastModel {
    private String id;
    private String trademark;
    private String carBrand;
    private String carModel;
    private String trademarkCode;
    private String sort;
    private String carPhoto;

    public DiecastModel() {
    }

    public DiecastModel(String id, String trademark, String carBrand, String carModel, String trademarkCode, String carPhoto) {
        this.id = id;
        this.trademark = trademark;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.trademarkCode = trademarkCode;
        this.carPhoto = carPhoto;
    }

    public DiecastModel(String id, String trademark, String carBrand, String carModel, String trademarkCode, String sort, String carPhoto) {
        this.id = id;
        this.trademark = trademark;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.trademarkCode = trademarkCode;
        this.sort = sort;
        this.carPhoto = carPhoto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getTrademarkCode() {
        return trademarkCode;
    }

    public void setTrademarkCode(String trademarkCode) {
        this.trademarkCode = trademarkCode;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getCarPhoto() {
        return carPhoto;
    }

    public void setCarPhoto(String carPhoto) {
        this.carPhoto = carPhoto;
    }
}
