package com.bdsimtoolkitmdashikulislam.bdsimtoolkit;

public class LatestOffer {

    private int image;
    private String textView1;
    private String textView2;

    public LatestOffer(int image, String textView1, String textView2) {
        this.image = image;
        this.textView1 = textView1;
        this.textView2 = textView2;
    }

    public int getImage() {
        return image;
    }

    public String getTextView1() {
        return textView1;
    }

    public String getTextView2() {
        return textView2;
    }
}
