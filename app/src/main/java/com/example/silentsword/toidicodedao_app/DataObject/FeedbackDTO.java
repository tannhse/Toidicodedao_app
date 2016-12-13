package com.example.silentsword.toidicodedao_app.DataObject;

import java.io.Serializable;

/**
 * Created by SilentSword on 13/12/2016.
 */

public class FeedbackDTO implements Serializable {
    private String name;
    private String email;
    private String FBContent;

    public FeedbackDTO() {

    }

    public FeedbackDTO(String name, String email, String content) {
        this.name = name;
        this.email = email;
        this.FBContent = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFBContent() {
        return FBContent;
    }

    public void setFBContent(String FBContent) {
        this.FBContent = FBContent;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
