package com.alex;

/**
 * Created by Alex Liang on 2018/10/25.
 */
public class Stage {

    /**
     * 打从 1 到 100 的数字。但对于 3 的倍数打“Fizz”而不是数字，
     * 5 的倍数打”Buzz”, 3 和 5 的倍数打”FizzBuzz”
     */
    public void stageOne() {
        for (int i = 1; i < 100; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if((i % 5 == 0)){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    /**
     *  一个数字，如果可以被 3 整除或如果它有一个 3， 那这个数字打 Fizz
     *  一个数字，如果可以被 5 整除或如果它有一个 5， 那这个数字打 Buzz
     *  一个数字，如果同时满足以上两个条件， 那这个数字打 FizzBuzz
     */
    public void stageTwo(int num) {
        String temp;
        for (int i = 1; i < 100; i++) {
            temp = String.valueOf(i);
            if(num < i){
                break;
            }
            if ((i % 3 == 0 || temp.contains("3"))
                    && (i % 5 == 0 || temp.contains("5"))) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0 || temp.contains("3")) {
                System.out.println("Fizz");
            } else if ((i % 5 == 0 || temp.contains("5"))) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}
