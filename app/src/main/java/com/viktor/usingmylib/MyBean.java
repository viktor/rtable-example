package com.viktor.usingmylib;

import com.viktor.rtable.annotations.GridColumn;

public class MyBean {

    @GridColumn(width = 100, position = 0)
    private String id;
    @GridColumn(width = 300, position = 1)
    private String name;

    public MyBean(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public MyBean() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
