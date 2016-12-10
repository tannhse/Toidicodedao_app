package com.example.silentsword.toidicodedao_app.Ultilities;

import com.example.silentsword.toidicodedao_app.DataObject.PostDTO;

/**
 * Created by SilentSword on 10/12/2016.
 */

public class GlobalVariables {
    //v1.1 Api Address
    private static String apiAddress = "https://public-api.wordpress.com/rest/v1.1/sites/";

    //v1.2 Api Address
    private static String apiAddressv2 = "https://public-api.wordpress.com/rest/v1.2/sites/";

    //Site Name
    private static String siteName;

    //Post ID
    private static int postID;

    //Single Post
    private static PostDTO singlePost;


    public static String getApiAddress() {
        return apiAddress;
    }

    public static void setApiAddress(String apiAddress) {
        GlobalVariables.apiAddress = apiAddress;
    }

    public static String getApiAddressv2() {
        return apiAddressv2;
    }

    public static void setApiAddressv2(String apiAddressv2) {
        GlobalVariables.apiAddressv2 = apiAddressv2;
    }

    public static String getSiteName() {
        return siteName;
    }

    public static void setSiteName(String siteName) {
        GlobalVariables.siteName = siteName;
    }

    public static int getPostID() {
        return postID;
    }

    public static void setPostID(int postID) {
        GlobalVariables.postID = postID;
    }

    public static PostDTO getSinglePost() {
        return singlePost;
    }

    public static void setSinglePost(PostDTO singlePost) {
        GlobalVariables.singlePost = singlePost;
    }
}
