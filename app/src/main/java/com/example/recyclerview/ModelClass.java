package com.example.recyclerview;

public class ModelClass {

    //Initialising every widget which i had used in item_design.xml
    private int imageView1;
    private String textView1;
    private String textView2;
    private String textView3;
    private String divider;

    //creating getter for our recyclerview
    //creating setter manually

    ModelClass(int imageView1,String textView1,String textView2,String textView3,String divider){
        this.imageView1=imageView1;
        this.textView1=textView1;
        this.textView2=textView2;
        this.textView3=textView3;
        this.divider=divider;
    }

    public int getImageView1() {
        return imageView1;
    }

    public String getTextView1() {
        return textView1;
    }

    public String getTextView2() {
        return textView2;
    }

    public String getTextView3() {
        return textView3;
    }

    public String getDivider() {
        return divider;
    }
}
