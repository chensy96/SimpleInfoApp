package com.example.chensy96.midterm1;

/**
 * Created by chensy96 on 10/19/2017.
 */

public class Professor {
    private String name;
    private String title;
    private String office;
    private String email;
    private String intro;
    private int id;


    public Professor (String name, String title, String office, String email, String intro, int id)
    {
        this.name = name;
        this.title = title;
        this.office = "Office: " + office;
        this.email = "Email: " + email;
        this.intro = intro;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public String getOffice() {
        return office;
    }

    public String getEmail() {
        return email;
    }

    public String getIntro() {
        return intro;
    }

    public int getId(){ return id;}

    public void setTitle(String title) {
        this.title = title;
    }


}
