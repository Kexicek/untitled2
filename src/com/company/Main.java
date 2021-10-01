package com.company;

public class Main {

    public static void main(String[] args) {
        var myPoint = new Point(12, 5);
        System.out.println(myPoint.radek());
        var code = "503";

        switch (code){
            case "401", "402", "403", "404" -> System.out.println("Client's error: " + code);
            case "501", "502", "503", "504" -> System.out.println("Server's error: " + code);
            default -> {
                System.out.println();
                System.out.println("Code not recognized: " + code);
            }}


    }
}
