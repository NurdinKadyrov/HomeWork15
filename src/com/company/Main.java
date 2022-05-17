package com.company;


import com.company.animals.Eagle;
import com.company.animals.Shark;
import com.company.animals.Turtle;

public class Main {

    public static void main(String[] args) {
        Animals shark = new Shark();
        Animals eagle = new Eagle();
        Animals turtle = new Turtle();

        Animals[] animals = {turtle, eagle, shark};

        for (Animals s : animals) {
            if (s instanceof Shark) {
                ((Shark) s).attack();
            }
            if (s.getClass().getName().equals("work: Shark")) {
                ((Shark) s).attack();
            }

            if (s instanceof Turtle) {
                ((Turtle) s).swim();
            }
            if (s.getClass().getName().equals("work: Turtle")) {
                ((Turtle) s).swim();
            }
            if (s instanceof Eagle) {
                ((Eagle) s).fly();
            }
            if (s.getClass().getName().equals("work: Eagle")) {
                ((Eagle) s).fly();
            }
            System.out.println();
        }
        Animals[] reptile = {turtle};
        Animals[] fish = {shark};
        Animals[] bird = {eagle};
    }
}
