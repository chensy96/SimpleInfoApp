package com.example.chensy96.midterm1;

/**
 * Created by chensy96 on 10/19/2017.
 */

public class Content {
    private String name;
    private String title;
    private String credits;
    private String intro;
    private int id;
    private int pre;


    public Content (String name, String title, String credits, String intro, int id, int pre)
    {
        this.name = name;
        this.title = title;
        this.credits = "Credits: " + credits;
        this.intro = intro;
        this.id = id;
        this.pre = pre;
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

    public String getCredits() {
        return credits;
    }


    public String getIntro() {
        return intro;
    }

    public int getId(){ return id;}

    public int getPre() {return pre;}

}
