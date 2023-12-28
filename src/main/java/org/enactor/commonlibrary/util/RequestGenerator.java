package org.enactor.commonlibrary.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RequestGenerator
{
    /**
     * This method is used to create and send the GET request for the given url
     * @param apiUrl url of the get end point
     * @return response of the get request
     * @throws IOException
     */
    public static String makeGetRequest(String apiUrl) throws IOException
    {
        try
        {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            try
            {
                connection.setRequestMethod(Constant.GET_METHOD);
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream())))
                {
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null)
                    {
                        response.append(line);
                    }
                    return response.toString();
                }
            }
            finally
            {
                connection.disconnect();
            }
        }catch (MalformedURLException e)
        {
            throw new RuntimeException("Malformed URL: " + apiUrl, e);
        }
    }

    public static String makePostRequest(String apiUrl, String requestBody) throws IOException
    {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        try
        {
            connection.setRequestMethod(Constant.POST_METHOD);
            connection.setDoOutput(true);
            try (OutputStream os = connection.getOutputStream())
            {
                os.write(requestBody.getBytes());
            }
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream())))
            {
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null)
                {
                    response.append(line);
                }
                return response.toString();
            }
        } finally
        {
            connection.disconnect();
        }
    }
}
