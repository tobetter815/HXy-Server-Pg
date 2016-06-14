package com.ict.model;/**
 * Created by chenlong on 5/3/2016.
 */

/**
 * Ship_Rendezvous_Cache
 * Created by chenlong on 5/3/2016.
 */
public class Ship_Rendezvous_Cache {
    public int id;
    public int info_col_time;
    public int package_type;
    public int send_time;
    public int data_lenth;
    public int package_number;
    public double longitude;
    public double latitude;
    public int anomaly_class;
    public int normal_recv_interval;
    public int avg_ship_count;
    public int ship_count_per_day;
    public int rendezvous_ship_count;
    public int rendezvous_start_time;
    public String rendezvous_ship_mmsi_list;
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

    public int getPackage_number() {
        return package_number;
    }

    public void setPackage_number(int package_number) {
        this.package_number = package_number;
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

    public int getRendezvous_ship_count() {
        return rendezvous_ship_count;
    }

    public void setRendezvous_ship_count(int rendezvous_ship_count) {
        this.rendezvous_ship_count = rendezvous_ship_count;
    }

    public int getRendezvous_start_time() {
        return rendezvous_start_time;
    }

    public void setRendezvous_start_time(int rendezvous_start_time) {
        this.rendezvous_start_time = rendezvous_start_time;
    }

    public String getRendezvous_ship_mmsi_list() {
        return rendezvous_ship_mmsi_list;
    }

    public void setRendezvous_ship_mmsi_list(String rendezvous_ship_mmsi_list) {
        this.rendezvous_ship_mmsi_list = rendezvous_ship_mmsi_list;
    }

    public int getInsert_time() {
        return insert_time;
    }

    public void setInsert_time(int insert_time) {
        this.insert_time = insert_time;
    }
}
