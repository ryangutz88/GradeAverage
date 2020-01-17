package com.company;

public class GradeAverage {

    private int [] scores;

    public GradeAverage(int [] s)
    {
        scores = s;
    }


    private double mean(int first, int last)
    {
        double sum=0;
        for (int i=first; i<=last; i++) {
            sum += scores[i];
        }
        return (sum)/((last-first)+1);
    }

    private boolean showsImprovement(){
        for (int i=0; i < scores.length-1; i++) {
            if (scores[i] > scores[i+1]) {
                return false;
            }
        }
        return true;
    }

    public double finalGrade(){
        if (showsImprovement()) {
            return mean(scores.length/2, scores.length-1);
        }
        return mean(0,scores.length-1);
    }

    public static void main(String[] args) {
        int [] s1 = {50,50,20,80,53};
        int [] s2 = {20,50,50,53,80};
        int [] s3 = {20,50,50,80};

        GradeAverage sr1 = new GradeAverage(s1);
        GradeAverage sr2 = new GradeAverage(s2);
        GradeAverage sr3 = new GradeAverage(s3);

        System.out.println(sr1.mean(1,3));
        System.out.println(sr1.showsImprovement());
        System.out.println(sr1.finalGrade());

        System.out.println(sr2.mean(2,4));
        System.out.println(sr2.showsImprovement());
        System.out.println(sr2.finalGrade());

        System.out.println(sr3.mean(0,2));
        System.out.println(sr3.showsImprovement());
        System.out.println(sr3.finalGrade());
    }

}

/*
50.0
false
50.6
61.0
true
61.0
40.0
true
65.0
 */