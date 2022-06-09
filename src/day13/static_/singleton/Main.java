package day13.static_.singleton;

public class Main {

    public static void main(String[] args) {

        Controller c1 = Controller.getInstance();
        Controller c2 = Controller.getInstance();
        Controller c3 = Controller.getInstance();
//        Controller c2 = new Controller();
//        Controller c3 = new Controller();


        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);


        c1.number = 100;
        c2.number = 200;
        c3.number = 300;

        System.out.println("c1 = " + c1.number);
        System.out.println("c2 = " + c2.number);
        System.out.println("c3 = " + c3.number);

    } // end main
} // end class
