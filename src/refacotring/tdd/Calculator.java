package refacotring.tdd;

import java.util.*;

public class Calculator {

    public int cal(List<Integer> nums, String operator){

        Optional<Integer> result = Optional.empty();

        if(operator.equals("+")){
            result = nums.stream().reduce((a,b) -> a+b);
        }
        else if(operator.equals("-")){
            result = nums.stream().reduce((a,b) -> a-b);
        }
        else if(operator.equals("*")){
            result = nums.stream().reduce((a,b) -> a*b);
        }
        else if(operator.equals("/")){
            result =  nums.stream().reduce((a,b) -> a/b);
        }
        return result.get();
    }

    public int cal_minus(int a, int b){
        return a > b ? a - b : b - a;
    }


    public int getCount(String text1, String text2) {

        String longText = text2, shortText = text1;
        if(text1.length() > text2.length()){
            longText = text1;
            shortText = text2;
        }

        int result = 0;
        for(int i=0; i<longText.length()-shortText.length()+1; i++){
            if(longText.startsWith(shortText, i)){
                result++;
            }
        }
        return result;
    }
}
