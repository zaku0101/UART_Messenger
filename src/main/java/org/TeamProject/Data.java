package org.TeamProject;

public class Data {
    private String value;
    private String id;

    public Data(String value,String id){
    this.value=value;
    this.id=id;
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
}

