package a객체지향연습_유사메이플.model.vo;

public abstract class 모험가 {

    // 공통 속성
    private int adDamage; // 공격력
    private int hp; // 체력
    private int mp; // 마나

    // 생성자
    protected 모험가() {
        adDamage = 5;
        hp = 50;
        mp = 50;
    }

    // 메서드
    // 기본공격 기능
    public boolean basicAttack() {
        // 공격에 성공하면 true, 실패하면 false 반환
    }
    

    // 점프 기능
    public void jump() {
        System.out.println("플레이어가 점프합니다.");
    }

    // getter / setter
    public int getAdDamage() {
        return adDamage;
    }

    public void setAdDamage(int adDamage) {
        this.adDamage = adDamage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
} // end class
