package com.alex;

import org.junit.Test;

/**
 * Created by Alex Liang on 2018/10/25.
 */
public class StageTest {

    /**
     * 测试打印从 1 到 100 的数字
     */
    @Test
    public void testStageOne(){
        Stage s = new Stage();
        s.stageOne();
    }

    /**
     * 场景1：测试输入一个数字，如果可以被 3 整除或如果它有一个 3， 那这个数字打 Fizz
     */
    @Test
    public void testSenceOne(){
        Stage s = new Stage();
        //被3整除
        int num = 3;
        s.stageTwo(num);
        System.out.println("-------------------------------");
        //输入的数字有一个3
        int num1 = 31;
        s.stageTwo(num1);
    }

    /**
     * 场景2：测试输入一个数字，如果可以被 5 整除或如果它有一个 5， 那这个数字打 Buzz
     */
    @Test
    public void testSenceTwo(){
        Stage s = new Stage();
        //被5整除
        int num = 5;
        s.stageTwo(num);
        System.out.println("-------------------------------");
        //输入的数字有一个5
        int num1 = 55;
        s.stageTwo(num1);
    }

    /**
     * 场景3：同时满足场景1和场景2，被3整除或如果它有一个3 且 被5整除或如果它有一个5， 那这个数字打 FizzBuzz
     */
    @Test
    public void testSenceThree(){
        Stage s = new Stage();
        //被3整除且被5整除
        int num = 15;
        s.stageTwo(num);
        System.out.println("-------------------------------");
        //被3整除且它有一个5
        int num1 = 45;
        s.stageTwo(num1);
        System.out.println("-------------------------------");
        //它有一个3且被5整除
        int num2 = 35;
        s.stageTwo(num2);
        System.out.println("-------------------------------");
        //它有一个3且它有一个5
        int num3 = 53;
        s.stageTwo(num3);
    }
}
