package com.wx.wequest;

public class Event {
    /**
     * All data for a event.
     */
    private String title;
    private String address;



    private String description;
    private int like;
    private String id;
    private long time;

    private String username;
    private String imgUri;
    private int commentNumber;

    public Event() {
        this.title = title;
        this.address = address;
        this.description = description;
        this.like = like;
        this.id = id;
        this.time = time;
        this.username = username;
        this.imgUri = imgUri;
        this.commentNumber = commentNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public int getLike() {
        return like;
    }

    public String getId() {
        return id;
    }

    public long getTime() {
        return time;
    }

    public String getUsername() {
        return username;
    }

    public String getImgUri() {
        return imgUri;
    }

    public int getCommentNumber() {
        return commentNumber;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public void setCommentNumber(int commentNumber) {
        this.commentNumber = commentNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
