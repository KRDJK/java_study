package day09.objarr.self;

public class StudentController {

    private Student[] sArr = new Student[5];
    public int CUT_LINE = 60;



    // 생성자
    public StudentController() {
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = new Student(); // ?? 맞나
        }
    }

}
