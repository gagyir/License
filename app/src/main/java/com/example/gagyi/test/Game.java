package com.example.gagyi.test;

/**
 * Created by gagyi on 2017-10-30.
 */

public class Game {

    public String id;

    public String getId() {
        return id;
    }

    public Game(String id, String name, String packageName, String link, String description) {
        this.id = id;
        this.name = name;
        this.packageName = packageName;
        this.link = link;
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String name;
    public String packageName;
    public String link;
    public String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
