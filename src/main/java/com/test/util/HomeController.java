package com.test.util;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.*;
import javax.xml.ws.Action;
import java.io.IOException;

@Controller
public class HomeController {

    @RequestMapping("/")


    public ModelAndView helloWorld() {

        return new ModelAndView("weather", "message", "Greetings and Salutations,");
    }


//    @RequestMapping("/userform")
//
//    public ModelAndView userform(){
//        return new ModelAndView("form", "inst", "Please enter info:" );
//    }
//
//    @RequestMapping("/formhandler")
//
//        public ModelAndView formhandler(@RequestParam("firstname")String firstname, @RequestParam("lastname")String lastname,
//        @RequestParam("email")String email, @RequestParam("phonenumber")String phonenumber, @RequestParam("password")String password) {
//

//
//
//        ModelAndView mv = new ModelAndView("formresponse");
//
//        mv.addObject("firstname", firstname);
//        mv.addObject("lastname", lastname);
//        mv.addObject("email", email);
//        mv.addObject("phonenumber", phonenumber);
//        mv.addObject("password", password);
//        return mv;
//    }
//


    @RequestMapping("/weather")
    public ModelAndView HelloWorld() {

        try {
            // this http client will make request from the other server
            HttpClient http = HttpClientBuilder.create().build();

            //HttpHost host connection info
            HttpHost host = new HttpHost("forecast.weather.gov", 80, "http");

            //HttpHost will actually retrieve the information from the specific URL
            HttpGet getPage = new HttpGet("/MapClick.php?lat=42.331427&lon=-83.045754&FcstType=json");

            //actually run it and pull in the response.
            HttpResponse resp = http.execute(host, getPage);

            //get the actual content from inside the response
            String jsonString = EntityUtils.toString(resp.getEntity());

            //turn into an actual JSON
            JSONObject json = new JSONObject(jsonString);

            //get the response code and some info from json
            int status = resp.getStatusLine().getStatusCode();
            String prodCenter = json.get("productionCenter").toString();

            JSONArray days  = json.getJSONObject("time").getJSONArray("startPeriodName");
            JSONArray temps = json.getJSONObject("data").getJSONArray("temperature");

//            JSONArray text  = json.getJSONObject("text").getJSONArray("text");

            ModelAndView mv = new ModelAndView("weather");
            mv.addObject("status", status);
            mv.addObject("prodCenter", prodCenter);
            mv.addObject("day1", days.getString(0));
            mv.addObject("day2", days.getString(1));
            mv.addObject("temp1", temps.getString(0));
            mv.addObject("temp2", temps.getString(1));
            mv.addObject("day3", days.getString(2));
            mv.addObject("day4", days.getString(3));
            mv.addObject("temp3", temps.getString(2));
            mv.addObject("temp4", temps.getString(3));
            mv.addObject("day5", days.getString(4));
            mv.addObject("day6", days.getString(5));
            mv.addObject("temp5", temps.getString(4));
            mv.addObject("temp6", temps.getString(5));
            mv.addObject("day7", days.getString(6));
            mv.addObject("day8", days.getString(7));
            mv.addObject("temp7", temps.getString(6));
            mv.addObject("temp8", temps.getString(7));
            mv.addObject("day9", days.getString(8));
            mv.addObject("day10", days.getString(9));
            mv.addObject("temp9", temps.getString(8));
            mv.addObject("temp10", temps.getString(9));
            mv.addObject("day11", days.getString(10));
            mv.addObject("day12", days.getString(11));
            mv.addObject("temp11", temps.getString(10));
            mv.addObject("temp12", temps.getString(11));
            mv.addObject("day13", days.getString(12));
            mv.addObject("temp13", temps.getString(12));


            return mv;

//            mv.addObject("text1", text.getString(0));
//            mv.addObject("text2", text.getString(1));
//            mv.addObject("text3", text.getString(2));
//            mv.addObject("text4", text.getString(3));
//            mv.addObject("text5", text.getString(4));
//            mv.addObject("text6", text.getString(5));
//            mv.addObject("text7", text.getString(6));
//            mv.addObject("text8", text.getString(7));
//            mv.addObject("text9", text.getString(8));
//            mv.addObject("text10", text.getString(9));
//            mv.addObject("text11", text.getString(10));
//            mv.addObject("text12", text.getString(11));



        } catch (IOException e) {
            e.printStackTrace();

        } catch (JSONException e) {
            e.printStackTrace();

        }
        return null;
    }

}

