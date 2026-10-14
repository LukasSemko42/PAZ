package sk.upjs.paz;

import sk.upjs.jpaz2.Turtle;

public class ExamTurtle extends Turtle {
    public int sumOfSmallerDigits(int n, int maxDigit){
        int result=0;
        while (n>=1){
            if (n%10 < maxDigit){
                result += n%10;
            }
            n=n/10;
        }
        return result;
    }
}
