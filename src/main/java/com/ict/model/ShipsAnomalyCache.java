package com.ict.model;

public class ShipsAnomalyCache {
    private Long id;

    private Integer infoColTime;

    private Short packageType;

    private Integer sendTime;

    private Short dataLenth;

    private Integer packageNumber;

    private Integer longitude;

    private Integer latitude;

    private Byte anomalyClass;

    private Byte anomalyType;

    private Integer shipMmsi;

    private Byte shipType;

    private Short direction;

    private Short heading;

    private Short speed;

    private Integer imoNumber;

    private String shipName;

    private String callSign;

    private Short shipLength;

    private Short shipBreadth;

    private String destination;

    private String eta;

    private Short draft;

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

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
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

    public Integer getShipMmsi() {
        return shipMmsi;
    }

    public void setShipMmsi(Integer shipMmsi) {
        this.shipMmsi = shipMmsi;
    }

    public Byte getShipType() {
        return shipType;
    }

    public void setShipType(Byte shipType) {
        this.shipType = shipType;
    }

    public Short getDirection() {
        return direction;
    }

    public void setDirection(Short direction) {
        this.direction = direction;
    }

    public Short getHeading() {
        return heading;
    }

    public void setHeading(Short heading) {
        this.heading = heading;
    }

    public Short getSpeed() {
        return speed;
    }

    public void setSpeed(Short speed) {
        this.speed = speed;
    }

    public Integer getImoNumber() {
        return imoNumber;
    }

    public void setImoNumber(Integer imoNumber) {
        this.imoNumber = imoNumber;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName == null ? null : shipName.trim();
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign == null ? null : callSign.trim();
    }

    public Short getShipLength() {
        return shipLength;
    }

    public void setShipLength(Short shipLength) {
        this.shipLength = shipLength;
    }

    public Short getShipBreadth() {
        return shipBreadth;
    }

    public void setShipBreadth(Short shipBreadth) {
        this.shipBreadth = shipBreadth;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta == null ? null : eta.trim();
    }

    public Short getDraft() {
        return draft;
    }

    public void setDraft(Short draft) {
        this.draft = draft;
    }

    public Integer getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Integer insertTime) {
        this.insertTime = insertTime;
    }
}