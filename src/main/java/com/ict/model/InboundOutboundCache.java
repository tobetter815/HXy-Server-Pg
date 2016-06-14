package com.ict.model;

public class InboundOutboundCache {
    private Long id;

    private Integer infoColTime;

    private Short packageType;

    private Integer sendTime;

    private Short dataLenth;

    private Integer packageNumber;

    private Integer recvTime;

    private Integer anomaly;

    private Integer shipMmsi;

    private Integer longitude;

    private Integer latitude;

    private Integer locateTime;

    private Byte isInbound;

    private String portUnlocode;

    private String portName;

    private String countryUnlcode;

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

    public Integer getRecvTime() {
        return recvTime;
    }

    public void setRecvTime(Integer recvTime) {
        this.recvTime = recvTime;
    }

    public Integer getAnomaly() {
        return anomaly;
    }

    public void setAnomaly(Integer anomaly) {
        this.anomaly = anomaly;
    }

    public Integer getShipMmsi() {
        return shipMmsi;
    }

    public void setShipMmsi(Integer shipMmsi) {
        this.shipMmsi = shipMmsi;
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

    public Integer getLocateTime() {
        return locateTime;
    }

    public void setLocateTime(Integer locateTime) {
        this.locateTime = locateTime;
    }

    public Byte getIsInbound() {
        return isInbound;
    }

    public void setIsInbound(Byte isInbound) {
        this.isInbound = isInbound;
    }

    public String getPortUnlocode() {
        return portUnlocode;
    }

    public void setPortUnlocode(String portUnlocode) {
        this.portUnlocode = portUnlocode == null ? null : portUnlocode.trim();
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName == null ? null : portName.trim();
    }

    public String getCountryUnlcode() {
        return countryUnlcode;
    }

    public void setCountryUnlcode(String countryUnlcode) {
        this.countryUnlcode = countryUnlcode == null ? null : countryUnlcode.trim();
    }

    public Integer getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Integer insertTime) {
        this.insertTime = insertTime;
    }
}