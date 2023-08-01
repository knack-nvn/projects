package com.customer.customerInfo.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name="Cust")
public class Customer implements Serializable {
    @Id
    private int id;
    private String name;
    private int roomNum;
    private String address;

    public int getCusId() {
        return id;
    }

    public void setCusId(int empId) {
        this.id = empId;
    }

    public String getCusName() {
        return name;
    }

    public void setCusName(String cusName) {
        this.name = cusName;
    }

    public int  getCusRoomNum() {
        return roomNum;
    }

    public void setCusRoomNum(int RoomNum) {
        this.roomNum = RoomNum;
    }

    public String getCusAddress() {
        return address;
    }

    public void setEmpAddress(String CusAddress) {
        this.address = CusAddress;
    }
}