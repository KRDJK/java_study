package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.Controller.PhoneController;

public class Run {
    public static void main(String[] args) {
        PhoneController pc = new PhoneController();

        String[] sArr = pc.method();

        for (int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[i]);
            System.out.println();
        }

    } // end main
} // end class
