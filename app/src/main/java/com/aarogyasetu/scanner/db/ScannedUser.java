package com.aarogyasetu.scanner.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class ScannedUser implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "mobile_no")
    private String mobile_no;

    @ColumnInfo(name = "scanned_by")
    private String scanned_by;

    @ColumnInfo(name = "status")
    private String status;

    public ScannedUser(String name, String mobile_no, String scanned_by, String status) {
        this.name = name;
        this.mobile_no = mobile_no;
        this.scanned_by = scanned_by;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getScanned_by() {
        return scanned_by;
    }

    public void setScanned_by(String scanned_by) {
        this.scanned_by = scanned_by;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
