/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.dvdlibrary.dto;

import java.util.Date;

/**
 *
 * @author janlee
 */
public class DVD {
    
    private String title;
    private int month;
    private int day;
    private int year;
    private String MPAARating; // motion picture association rating
    private String directorName;
    private String studio;
    private String userRating;

    public DVD(String title, int[] releaseDate, String MPAARating, String directorName, String studioName, String userRating) {
        this.title = title;
        this.month = month;
        this.day = day;
        this.year = year;
        this.MPAARating = MPAARating;
        this.directorName = directorName;
        this.studio = studio;
        this.userRating = userRating;
                
    }

    public DVD(String newTitle, int month, int day, int year, String mpaaRating, String directorName, String studio, String userRating) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMPAARating() {
        return MPAARating;
    }

    public void setMPAARating(String MPAARating) {
        this.MPAARating = MPAARating;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getUserRating() {
        return userRating;
    }

    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }
    
}