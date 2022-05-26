package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {
    int[] lotto = new int[6];


    public Lotto() {
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45);
        }
    }

    public void information () {
        System.out.println("lotto 번호 배열: " + Arrays.toString(lotto));
    }
}
