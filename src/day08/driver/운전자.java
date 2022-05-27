package day08.driver;

import day08.car.딜러;
import day08.car.엔진;
import day08.car.자동차;

public class 운전자 {

    자동차 내차;
    private String 비밀일기;

    void 운전하다() {
        내차.시동을걸다();
//        내차.엔진오일을_분사하다(); 시동을 걸 때만 분사되어야 함. 운전자가 괜히 이러다가는 고장나지
//        내차.v6엔진 = new 엔진(); 정비사가 해야할 일

//        내차 = new 자동차(); 운전자가 뭔데 차를 만드니..?? 사와야지
    }

    void 차를_구매하다(딜러 착한딜러) {
        내차 = 착한딜러.차를_판매하다(100000000);
    }


}
