package com.company;

public class Main {

    public static void main(String[] args) {



        ReportCard newreportCard = studentResult();




    }


    public static ReportCard studentResult(){



        for (int i=1 ; i<4 ; i++) {

            int number = i;


            switch (number) {

                case 1:
                     new FirstStudent();
                     break;

                case 2:
                    new SecondStudent();
                    break;

                case 3:
                    new
                            ThirdStudent();
                    break;

                default:
                    return null;

            }

        }

        return null;
    }



}
