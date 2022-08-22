package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        System.out.println("Welcome to User Registration problem");
        String regex_firstname = "[A-Z]{1}(?=.*[a-z]).{2,}";
        String regex_lastname = "[A-Z]{1}(?=.*[a-z]).{2,}";
        String regex_email = "^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[(com)|(co)|(net)]+(?:\\.[a-z]{2,}){0,1}$";
        String regex_mobile_number="^\\d{2}(\\s{1}\\d{10})$";
        String regex_password = "^[A-Z 0-9]{8,}$";

        String firstname = "Talib";
        String lastname = "Sheikh";
        String email = "talibsheikh456@gmail.com";
        String mobile = "91 8793679452";
        String password = "ABCD1234";

        Pattern pattern = Pattern.compile(regex_firstname);
        Pattern pattern1 = Pattern.compile(regex_lastname);
        Pattern pattern2 = Pattern.compile(regex_email);
        Pattern pattern3 = Pattern.compile(regex_mobile_number);
        Pattern pattern4 = Pattern.compile(regex_password);


        Matcher matcher = pattern.matcher(firstname);
        Matcher matcher1 = pattern1.matcher(lastname);
        Matcher matcher2 = pattern2.matcher(email);
        Matcher matcher3 = pattern3.matcher(mobile);
        Matcher matcher4 = pattern4.matcher(password);

        System.out.println("Pattern match for firstname is: " + matcher.find());
        System.out.println("Pattern match for lastname is: " + matcher1.find());
        System.out.println("Pattern match for email is: " + matcher2.find());
        System.out.println("Pattern match for mobile is: " + matcher3.find());
        System.out.println("Pattern match for Password is: " + matcher4.find());


    }
}