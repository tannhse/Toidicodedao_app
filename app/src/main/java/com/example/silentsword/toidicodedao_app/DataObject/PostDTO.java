package com.example.silentsword.toidicodedao_app.DataObject;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by SilentSword on 10/12/2016.
 */

public class PostDTO implements Serializable{
    private int postID;
    private int siteID;
    private String releaseDate;
    private String modifiedDate;
    private String postTitle;
    private String postURL;
    private String shortURL;
    private String postContent;

    public PostDTO() {
    }

    public PostDTO(int postID, int siteID, String releaseDate, String modifiedDate, String title, String url, String shortURL, String content) {
        this.setPostID(postID);
        this.setSiteID(siteID);
        this.setReleaseDate(releaseDate);
        this.setModifiedDate(modifiedDate);
        this.setPostTitle(title);
        this.setPostURL(url);
        this.setShortURL(shortURL);
        this.setPostContent(content);
    }



    public static PostDTO parseJSONToString(String jsonString) throws JSONException{
        PostDTO post;
        JSONObject obj = new JSONObject(jsonString);
        int postID;
        int siteID;
        String postDate;
        String modifiedDate;
        String postTitle;
        String postURL;
        String shortURL;
        String postContent;

        postID = obj.getInt("ID");
        siteID = obj.getInt("site_ID");
        postDate = obj.getString("date");
        modifiedDate = obj.getString("modified");
        postTitle = obj.getString("title");
        postURL = obj.getString("URL");
        shortURL = obj.getString("short_URL");
        postContent = obj.getString("content");

        return new PostDTO(postID, siteID, postDate, modifiedDate, postTitle, postURL, shortURL, postContent);
    }


    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getSiteID() {
        return siteID;
    }

    public void setSiteID(int siteID) {
        this.siteID = siteID;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostURL() {
        return postURL;
    }

    public void setPostURL(String postURL) {
        this.postURL = postURL;
    }

    public String getShortURL() {
        return shortURL;
    }

    public void setShortURL(String shortURL) {
        this.shortURL = shortURL;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }
}
