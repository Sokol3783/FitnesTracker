package org.example;

import java.util.ArrayList;
import java.util.List;

public class App{
    public static void main( String[] args ){
        List<Training> trainings = new ArrayList<>();
        trainings.add(new Boxing(100, 60, 90));
        trainings.add(new Crossfit(120, 90, 90, 150));
        trainings.add(new Running(120,45 , 90, 5));
        trainings.add(new Running(120,90 , 87, 10));
        trainings.forEach(s -> System.out.println(s.toString()));
    }
}
