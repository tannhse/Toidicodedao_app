package com.example.silentsword.toidicodedao_app.Ultilities;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by SilentSword on 14/12/2016.
 */

public class LinkRemover {
    public static ArrayList linksList(String content) {
        ArrayList links = new ArrayList();
        String regex = "\\(?\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);
        while(m.find()) {
            links.add(content.substring(m.start(0),
                    m.end(0)));
        }
        return links;
    }
}
