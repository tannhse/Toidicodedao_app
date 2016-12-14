package com.example.silentsword.toidicodedao_app.Ultilities;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SilentSword on 14/12/2016.
 */

public class ServiceConnector {
    private List<NameValuePair> params;
    private List<NameValuePair> headers;

    private String url;

    private String response;

    private int responseCode;
    private String message;

    public String getResponse() {
        return response;
    }

    public String getErrorMessage () {
        return message;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public ServiceConnector(String url) {
        this.url = url;
        params = new ArrayList<NameValuePair>();
        headers = new ArrayList<NameValuePair>();
    }

    public void addParam(String name, String value) {
        params.add(new BasicNameValuePair(name, value));
    }

    public void addHeader(String name, String value) {
        headers.add(new BasicNameValuePair(name, value));
    }

    public enum RequestMethod
    {
        GET,
        POST
    }

    public void Excute(RequestMethod method) throws Exception{
        switch (method) {
            case GET: {
                //add parameters
                String combinedParams = "";
                if (!params.isEmpty()){
                    combinedParams += "?";
                    for (NameValuePair p : params) {
                        String paramString = p.getName() + "=" + URLEncoder.encode(p.getValue(), "UTF-8");
                        if(combinedParams.length() > 1)
                        {
                            combinedParams += "&" + paramString;
                        }
                        else
                        {
                            combinedParams += paramString;
                        }
                    }
                }

                HttpGet request = new HttpGet(url + combinedParams);

                excuteRequest(request, url);
                break;
            }

            case POST: {
                HttpPost request = new HttpPost(url);

                if (!params.isEmpty()) {
                    request.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
                }

                excuteRequest(request, url);
                break;
            }
        }
    }

    private void excuteRequest (HttpUriRequest request, String url) {
        HttpClient client = new DefaultHttpClient();

        HttpResponse httpResponse;

        try {
            httpResponse = client.execute(request);
            responseCode = httpResponse.getStatusLine().getStatusCode();
            message = httpResponse.getStatusLine().getReasonPhrase();

            HttpEntity entity = httpResponse.getEntity();

            if (entity != null) {
                InputStream inStream = entity.getContent();
                response = convertStreamToString(inStream);

                inStream.close();
            }

        } catch (ClientProtocolException e) {
            client.getConnectionManager().shutdown();
            e.printStackTrace();
        } catch (IOException ex) {
            client.getConnectionManager().shutdown();
            ex.printStackTrace();
        }
    }

    private static String convertStreamToString (InputStream is) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();

        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
