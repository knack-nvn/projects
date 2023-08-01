package com.org.tcs.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Setter
@Getter
public class SalesModel {

    @Id
    private int Sales_num;
    private String Sale_name;
    private String Sale_Address;

    public int getSales_num() {
        return Sales_num;
    }

    public void setSales_num(int sales_num) {
        Sales_num = sales_num;
    }

    public String getSale_name() {
        return Sale_name;
    }

    public void setSale_name(String sale_name) {
        Sale_name = sale_name;
    }

    public String getSale_Address() {
        return Sale_Address;
    }

    public void setSale_Address(String sale_Address) {
        Sale_Address = sale_Address;
    }

    public Double getSale_Prize() {
        return Sale_Prize;
    }

    public void setSale_Prize(Double sale_Prize) {
        Sale_Prize = sale_Prize;
    }

    private Double Sale_Prize;


}
