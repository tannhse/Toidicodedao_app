package com.example.silentsword.toidicodedao_app.DataObject;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by SilentSword on 13/12/2016.
 */

public class CommentDTO implements Serializable {
    private int postID;
    private int commentID;
    private String authorName;
    private String authorEmail;
    private String authorURL;
    private String avtURL;
    private Date date;
    private String content;
    private String status;
    private String parentID;
    private int likeCount;

    public CommentDTO(int postID, int commentID, String authorName, String authorEmail, String authorURL, String avtURL, Date date, String content, String status, String parentID, int likeCount) {
        this.postID = postID;
        this.commentID = commentID;
        this.authorName = authorName;
        this.authorEmail = authorEmail;
        this.authorURL = authorURL;
        this.avtURL = avtURL;
        this.date = date;
        this.content = content;
        this.status = status;
        this.parentID = parentID;
        this.likeCount = likeCount;
    }

    public CommentDTO() {
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String getAuthorURL() {
        return authorURL;
    }

    public void setAuthorURL(String authorURL) {
        this.authorURL = authorURL;
    }

    public String getAvtURL() {
        return avtURL;
    }

    public void setAvtURL(String avtURL) {
        this.avtURL = avtURL;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
}
