package com.example.silentsword.toidicodedao_app.DataObject;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by SilentSword on 10/12/2016.
 */

public class PostDTO implements Serializable{
    private static int postID;
    private static int siteID;
    private static Date releaseDate;
    private static Date modifiedDate;
    private static String postTitle;
    private static String postURL;
    private static String shortURL;
    private static String postContent;

    public PostDTO() {
    }

    public PostDTO(int postID, int siteID, Date releaseDate, Date modifiedDate, String title, String url, String shortURL, String content) {
        this.postID = postID;
        this.siteID = siteID;
        this.releaseDate = releaseDate;
        this.modifiedDate = modifiedDate;
        this.postTitle = title;
        this.postURL = url;
        this.shortURL = shortURL;
        this.postContent = content;
    }

    public static int getPostID() {
        return postID;
    }

    public static void setPostID(int postID) {
        PostDTO.postID = postID;
    }

    public static int getSiteID() {
        return siteID;
    }

    public static void setSiteID(int siteID) {
        PostDTO.siteID = siteID;
    }

    public static Date getReleaseDate() {
        return releaseDate;
    }

    public static void setReleaseDate(Date releaseDate) {
        PostDTO.releaseDate = releaseDate;
    }

    public static Date getModifiedDate() {
        return modifiedDate;
    }

    public static void setModifiedDate(Date modifiedDate) {
        PostDTO.modifiedDate = modifiedDate;
    }

    public static String getPostTitle() {
        return postTitle;
    }

    public static void setPostTitle(String postTitle) {
        PostDTO.postTitle = postTitle;
    }

    public static String getPostURL() {
        return postURL;
    }

    public static void setPostURL(String postURL) {
        PostDTO.postURL = postURL;
    }

    public static String getShortURL() {
        return shortURL;
    }

    public static void setShortURL(String shortURL) {
        PostDTO.shortURL = shortURL;
    }

    public static String getPostContent() {
        return postContent;
    }

    public static void setPostContent(String postContent) {
        PostDTO.postContent = postContent;
    }
}
