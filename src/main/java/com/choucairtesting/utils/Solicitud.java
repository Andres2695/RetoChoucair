package com.choucairtesting.utils;

public class Solicitud {

    private String url;
    public Solicitud(String url){
        this.url= url;

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "url='" + url + '\'' +
                '}';
    }
}
