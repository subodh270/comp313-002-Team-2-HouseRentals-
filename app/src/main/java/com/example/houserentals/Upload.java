package com.example.houserentals;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Upload {

    public String imgName;
    public String url;


    public Upload() {
    }

    public Upload(String imgName, String url) {
        this.imgName = imgName;
        this.url= url;
    }

    public String getImgName() {
        return imgName;
    }

    public String getUrl() {
        return url;
    }
}
