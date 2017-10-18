package com.example.rnest.expansetracker;

/**
 * Created by RnEST on 10/18/2017.
 */

public class TransactionRow {
    private Integer id;
    private Double amount;
    private String description;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Double getAmount(){
        return amount;
    }

    public void setAmount(Double amount){
        this.amount = amount;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
