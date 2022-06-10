package day14.poly.basic;


class Monitor{}

class LGMonitor extends Monitor{}
class HPMonitor extends Monitor{}



public class Computer {

//    LGMonitor monitor;
    Monitor monitor;


    Computer() {
//        this.monitor = new LGMonitor();
        this.monitor = new HPMonitor(); // 둘 다 가능해진다.
    }


    void changeHPMonitor() {
        this.monitor = new HPMonitor();
    }

} // end class
