package com.fishdetection.usermanagement;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "exampleee")
public class User {
    @Id
    int id;
    String nameFish;
    String typeFish;
    String price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameFish() {
        return nameFish;
    }

    public void setNameFish(String nameFish) {
        this.nameFish = nameFish;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public User(int id, String nameFish, String typeFish, String price){
            super();
            this.id = id;
            this.nameFish = nameFish;
            this.typeFish = typeFish;
            this.price = price;
    }
}
