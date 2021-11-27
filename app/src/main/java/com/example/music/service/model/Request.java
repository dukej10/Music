package com.example.music.service.model;

public class Request {
    private int trackId;
    private String previewUrl;
    public Request(int trackId,String previewUrl){
        this.trackId = trackId;
        this.previewUrl = previewUrl;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }
}
