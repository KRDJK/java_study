package day07;

public class PhoneMain {

    public static void main(String[] args) {

        Phone galaxy = new Phone("갤럭시 S21"); // Phone 속 데이터가 너무 많아서!! stack에 저장하기 힘듦.
                                // new라는 연산자 자체가 heap의 자리를 빌려달라고 하는 것과 같다.

        Phone iphone = new Phone("아이폰 13pro"); // 새로운 heap 공간에 데이터가 생성되고 해당 주소값이 저장됨.

        Phone note = new Phone("갤노트");
//        p1.powerOff();
//
//        p1.showSpec();

        // p1과 p2의 주소값은 똑같을까??? 그렇지 않다.
        // p1. 이라고 하는 순간 p1의 주소값으로 가라고 하는 것이다.
            // p1.powerOff(); 하면 p1 주소값의 power 데이터가 false로 되는 것!!!
            // p2에는 영향이 없다.

//        System.out.println("p1의 주소 = " + p1);
//        System.out.println("p2의 주소 = " + p2);

        galaxy.sendMessage(iphone, "안녕 나는 갤럭시~");
        galaxy.sendMessage(iphone, "메롱메롱~~");
        note.sendMessage(iphone, "나는 갤럭시 노트야~~ 하위~~");

        iphone.sendMessage(note, "나는 애플폰이야~");
        galaxy.sendMessage(note, "dddddddd");

        iphone.sendMessage(galaxy, "ggpgpgpgpgp");

        iphone.checkMessages();
        galaxy.checkMessages();
        note.checkMessages();

    }
}
