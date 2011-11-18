package com.giantflyingsaucer.restjson.v1.resources;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item {
    
    private int id;
    private String name;
    private String description;
    
    public Item() {}
    
    public Item(int id, String name, String description) {
        this.id = id;
        this.name  = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}
