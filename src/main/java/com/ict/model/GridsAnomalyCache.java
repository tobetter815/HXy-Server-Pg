package com.ict.model;

public class GridsAnomalyCache {
    private Long id;

    private Integer infoColTime;

    private Short packageType;

    private Integer sendTime;

    private Short dataLenth;

    private Integer packageNumber;

    private Integer gridLongitude;

    private Integer gridLatitude;

    private Byte anomalyClass;

    private Byte anomalyType;

    private Byte shipType;

    private Short shipCount;

    private Short shipNormalCount;

    private Integer insertTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getInfoColTime() {
        return infoColTime;
    }

    public void setInfoColTime(Integer infoColTime) {
        this.infoColTime = infoColTime;
    }

    public Short getPackageType() {
        return packageType;
    }

    public void setPackageType(Short packageType) {
        this.packageType = packageType;
    }

    public Integer getSendTime() {
        return sendTime;
    }

    public void setSendTime(Integer sendTime) {
        this.sendTime = sendTime;
    }

    public Short getDataLenth() {
        return dataLenth;
    }

    public void setDataLenth(Short dataLenth) {
        this.dataLenth = dataLenth;
    }

    public Integer getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(Integer packageNumber) {
        this.packageNumber = packageNumber;
    }

    public Integer getGridLongitude() {
        return gridLongitude;
    }

    public void setGridLongitude(Integer gridLongitude) {
        this.gridLongitude = gridLongitude;
    }

    public Integer getGridLatitude() {
        return gridLatitude;
    }

    public void setGridLatitude(Integer gridLatitude) {
        this.gridLatitude = gridLatitude;
    }

    public Byte getAnomalyClass() {
        return anomalyClass;
    }

    public void setAnomalyClass(Byte anomalyClass) {
        this.anomalyClass = anomalyClass;
    }

    public Byte getAnomalyType() {
        return anomalyType;
    }

    public void setAnomalyType(Byte anomalyType) {
        this.anomalyType = anomalyType;
    }

    public Byte getShipType() {
        return shipType;
    }

    public void setShipType(Byte shipType) {
        this.shipType = shipType;
    }

    public Short getShipCount() {
        return shipCount;
    }

    public void setShipCount(Short shipCount) {
        this.shipCount = shipCount;
    }

    public Short getShipNormalCount() {
        return shipNormalCount;
    }

    public void setShipNormalCount(Short shipNormalCount) {
        this.shipNormalCount = shipNormalCount;
    }

    public Integer getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Integer insertTime) {
        this.insertTime = insertTime;
    }
}