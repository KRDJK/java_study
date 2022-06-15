package day17.api.obj;

public class Count {

    int n;

    // 생성자
    public Count(int n) {
        System.out.println(n + "번 객체 생성됨!");
        this.n = n;
    }


    // 이게 GC 대용 소멸자 역할을 해줄 수 있었던 것!! 지금은 ㄴㄴ 걍 이런게 있었다 ㅇㅇ
    // 9버전부터 도태된 메서드다. 이제 안쓰길 바라면 지워버리지 왜 남겨둠?? 하위버전 호환을 위해서
    @Override
    protected void finalize() throws Throwable {
        System.out.println(n + "번 객체 소멸!");
    }

} // end class
