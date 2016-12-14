package com.example.silentsword.toidicodedao_app.Fragments;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.silentsword.toidicodedao_app.Activities.MainActivity;
import com.example.silentsword.toidicodedao_app.DataObject.PostDTO;
import com.example.silentsword.toidicodedao_app.R;
import com.example.silentsword.toidicodedao_app.Ultilities.GlobalVariables;
import com.example.silentsword.toidicodedao_app.Ultilities.ServiceConnector;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

/**
 * Created by SilentSword on 10/12/2016.
 */

public class NewPostFragment extends Fragment {
    PostDTO postOBJ = new PostDTO();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_newpost, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Bài viết mới");

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);

        String site = "toidicodedao.com/posts/3083";

        ServiceConnector service = new ServiceConnector(GlobalVariables.getApiAddress() + site);
        service.addParam("pretty", "true");
        service.addParam("fields", "ID,site_ID,date,modified,title,URL,short_URL,content");

        try {
            service.Excute(ServiceConnector.RequestMethod.GET);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String response = service.getResponse();


        if (response != null) {
            try {
                //JSONObject object = new JSONObject(response);
                System.out.println(response);
                postOBJ = PostDTO.parseJSONToString(response);
                ((TextView) view.findViewById(R.id.newPost)).setText(postOBJ.getPostContent());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return view;
    }
}
