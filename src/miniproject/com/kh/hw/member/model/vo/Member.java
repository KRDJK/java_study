package miniproject.com.kh.hw.member.model.vo;

import java.util.Arrays;

public class Member {

    private String id; // 사원 id
    private String name; // 이름
    private String rank; // 직급
    private String email; // 이메일
    private String phone; // 전화번호
    private int basePay; // 기본급
    private int family; // 가족 수
//        private Bonus[] bonus;

    private int familyBonus; // 가족 수당

    private double taxRate; // 세율

    private int monthSalary; // 한 달 세후 월급


    //생성자
    public Member() {

    }

    public Member(String id, String name, String rank, String email, String phone, int family) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.email = email;
        this.phone = phone;
        this.family = family;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getBasePay() {
        switch (rank) {
            case "사원" :
                basePay = 2000000;
            case "대리" :
                basePay = 2500000;
            case "과장" :
                basePay = 3000000;
            case "부장" :
                basePay = 3500000;
        }
        return basePay;
    }

    public int getFamily() {
        return family;
    }

    public void setFamily(int family) {
        this.family = family;
    }

    public int getFamilyBonus() {
        familyBonus = family * 100000;
        return familyBonus;
    }


    public double getTaxRate() {
        int sum = basePay + familyBonus;
        if (sum >= 2000000 && sum < 2500000) {
            taxRate = 0.05;
        } else if (sum >= 2500000 && sum < 3000000) {
            taxRate = 0.1;
        } else if (sum >= 3000000 && sum < 3500000) {
            taxRate = 0.15;
        } else if (sum >= 3500000) {
            taxRate = 0.2;
        }
        return taxRate;
    }

    public int getMonthSalary() {
        monthSalary = (int) (basePay + familyBonus - ((basePay + familyBonus) * taxRate));
        return monthSalary;
    }


    // 메서드
    public String informBasic() {
        return String.format("[이름 : %s || 직급 : %s || 이메일 : %s || 전화번호 : %s || 가족 수 : %d ]",
                name, rank, email, phone, family);
    }

    public String informSalary() {
        return String.format("[이름 : %s || 직급 : %s || 기본급 : %d || 가족수당 : %d || 세율 : %.2f || 세후 급여 : %d ]",
                name, rank, basePay, familyBonus, taxRate, monthSalary);
    }

    public String informTotal() {
        return String.format("[이름 : %s || 직급 : %s || 이메일 : %s || 전화번호 : %s ||" +
                " 가족 수 : %d || 기본급 : %d || 가족수당 : %d || 세율 : %.2f || 세후 급여 : %d]",
                name, rank, email, phone, family, basePay, familyBonus, taxRate, monthSalary);
    }


} // end class