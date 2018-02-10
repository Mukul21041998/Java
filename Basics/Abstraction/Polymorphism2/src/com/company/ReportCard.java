package com.company;

public abstract class  ReportCard {


    private String name;
    private int marks;

    public ReportCard(String name, int marks) {
        this.name = name;
        this.marks = marks;

        System.out.println((this.name + " " + "marks is" + " " + this.marks));

    }


}
