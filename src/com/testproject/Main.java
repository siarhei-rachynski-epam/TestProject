package com.testproject;

public class Main {

    public static void main(String[] args) {
        System.out.println("test project");
        System.out.println("one more line");
        System.out.println("second more line added");
        System.out.println("extra line added directly on github");
        System.out.println("one more extra line added from home282");

        SimpleFeature1 sf1 = new SimpleFeature1();
        sf1.SimpleFunction();

        SimpleFeature2 sf2 = new SimpleFeature2();
        sf2.SimpleFunction();

        System.out.println("some intermediate point");

        System.out.println("next point in master flow");

        System.out.println("3rd intermediate point");

        Feature100 ft100 = new Feature100();
        ft100.SomeOp();


        System.out.println("feature200");
        System.out.println("feature200v2");

        System.out.println("feature200v2 - worked on some urgent patch");

        System.out.println("feature200v2 - test stashing - staged (committed into local)");


        System.out.println("in master to test rebasing");

        System.out.println("test rebasing");

        System.out.println("test fetching");
        System.out.println("test fetching2");
        System.out.println("feature200v2");

        System.out.println("feature200v2 - worked on some urgent patch");

        System.out.println("feature200v2 - test stashing - staged (committed into local)");


        System.out.println("adde new op in main");

        System.out.println("to check undo commit");
    }

}
