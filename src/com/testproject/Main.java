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

        System.out.println("to check undo commit");

        // test rebasing
        // let's make a couple commits in test-rebase branch and then a couple in main branch,
        // then rebase feature branch onto main via Checkout with rebase, then make one more commit to feature branch,
        // then perform Interactive Rebase to squash commits in feature branch into one commit and merge feature branch into master, then Push.
        // Finally delete feature branch.

        // second commit to feature branch

        // some code changes to Main
    }

    public void SomeOp(){
        // tired to resolve conflicts, so first commit in master goes in separate function

        // second commit to master

        // some changes to commit

        // some additional changes to add to previous commit

        // some code in master branch

        // adding more code here
    }

    public void SomeOpFeature400(){
        // commit of this changes will go first

        // some code

        // more code

        // a bit more code

        // let's add a bit more code

        // added changes by external-contrib in IDE
    }

    public void SomeNewOp(){
        // new code
        //changes
    }


    // added from github by external-contrib
}
