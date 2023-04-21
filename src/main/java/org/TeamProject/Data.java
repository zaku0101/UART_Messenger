package org.TeamProject;

public class Data {
    private String value;
    private String id;

    private String baudRate;



    public Data(String id, String baudRate,String value){
    this.value=value;
    this.id=id;
    this.baudRate=baudRate;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getBaudRate() {
        return baudRate;
    }

    public void setBaudRate(String baudRate) {
        this.baudRate = baudRate;
    }
}

