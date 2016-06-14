package com.ict.model;/**
 * Created by chenlong on 5/3/2016.
 */

/**
 * AIS_Device_Offline_Cache
 * Created by chenlong on 5/3/2016.
 */
public class AIS_Device_Offline_Cache {
    public int id;
    public int info_col_time;
    public int package_type;
    public int send_time;
    public int data_lenth;

    public double longitude;
    public double latitude;
    public int anomaly_class;
    public int offline_probability;
    public int normal_recv_interval;
    public int avg_ship_count;
    public int ship_count_per_day;

    public int total_offline_time;
    public int ship_MMSI;
    public int ship_type;
    public int direction;
    public int heading;
    public int speed;
    public int iMO_Number;

    public String ship_name;
    public String call_sign;
    public int ship_length;
    public int ship_breadth;
    public String destination;
    public String eTA;
    public int draft;
    public int insert_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInfo_col_time() {
        return info_col_time;
    }

    public void setInfo_col_time(int info_col_time) {
        this.info_col_time = info_col_time;
    }

    public int getPackage_type() {
        return package_type;
    }

    public void setPackage_type(int package_type) {
        this.package_type = package_type;
    }

    public int getSend_time() {
        return send_time;
    }

    public void setSend_time(int send_time) {
        this.send_time = send_time;
    }

    public int getData_lenth() {
        return data_lenth;
    }

    public void setData_lenth(int data_lenth) {
        this.data_lenth = data_lenth;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public int getAnomaly_class() {
        return anomaly_class;
    }

    public void setAnomaly_class(int anomaly_class) {
        this.anomaly_class = anomaly_class;
    }

    public int getOffline_probability() {
        return offline_probability;
    }

    public void setOffline_probability(int offline_probability) {
        this.offline_probability = offline_probability;
    }

    public int getNormal_recv_interval() {
        return normal_recv_interval;
    }

    public void setNormal_recv_interval(int normal_recv_interval) {
        this.normal_recv_interval = normal_recv_interval;
    }

    public int getAvg_ship_count() {
        return avg_ship_count;
    }

    public void setAvg_ship_count(int avg_ship_count) {
        this.avg_ship_count = avg_ship_count;
    }

    public int getShip_count_per_day() {
        return ship_count_per_day;
    }

    public void setShip_count_per_day(int ship_count_per_day) {
        this.ship_count_per_day = ship_count_per_day;
    }

    public int getTotal_offline_time() {
        return total_offline_time;
    }

    public void setTotal_offline_time(int total_offline_time) {
        this.total_offline_time = total_offline_time;
    }

    public int getShip_MMSI() {
        return ship_MMSI;
    }

    public void setShip_MMSI(int ship_MMSI) {
        this.ship_MMSI = ship_MMSI;
    }

    public int getShip_type() {
        return ship_type;
    }

    public void setShip_type(int ship_type) {
        this.ship_type = ship_type;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getiMO_Number() {
        return iMO_Number;
    }

    public void setiMO_Number(int iMO_Number) {
        this.iMO_Number = iMO_Number;
    }

    public String getShip_name() {
        return ship_name;
    }

    public void setShip_name(String ship_name) {
        this.ship_name = ship_name;
    }

    public String getCall_sign() {
        return call_sign;
    }

    public void setCall_sign(String call_sign) {
        this.call_sign = call_sign;
    }

    public int getShip_length() {
        return ship_length;
    }

    public void setShip_length(int ship_length) {
        this.ship_length = ship_length;
    }

    public int getShip_breadth() {
        return ship_breadth;
    }

    public void setShip_breadth(int ship_breadth) {
        this.ship_breadth = ship_breadth;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String geteTA() {
        return eTA;
    }

    public void seteTA(String eTA) {
        this.eTA = eTA;
    }

    public int getDraft() {
        return draft;
    }

    public void setDraft(int draft) {
        this.draft = draft;
    }

    public int getInsert_time() {
        return insert_time;
    }

    public void setInsert_time(int insert_time) {
        this.insert_time = insert_time;
    }
}
