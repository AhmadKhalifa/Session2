package com.orange.session;

import java.io.Serializable;

/**
 * Created by Khalifa on 8/12/2017.
 */

public class Movie implements Serializable {
    private String name;
    private String imageUrl;
    private String backDropUrl;
    private double rate;
    private int numOfVoters;
    private String date;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBackDropUrl() {
        return backDropUrl;
    }

    public void setBackDropUrl(String backDropUrl) {
        this.backDropUrl = backDropUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getNumOfVoters() {
        return numOfVoters;
    }

    public void setNumOfVoters(int numOfVoters) {
        this.numOfVoters = numOfVoters;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
