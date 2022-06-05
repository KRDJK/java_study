package 일요일연습.vo;

public class Player {

    private String job; // 직업
    private String nickName; // 캐릭터 이름
    private char gender; // 성별
    private int hp; // 체력
    private int ad; // 물리 공격력
    private int ap; // 마법 공격력
    private String[] inventory; // 아이템 목록


    // 생성자
    public Player(String job, String nickName, char gender) {
        this.job = job;
        this.nickName = nickName;
        this.gender = gender;
        this.hp = 50;
        this.ad = 5;
        this.ap = 5;
    }


    // 메서드
    // 몬스터를 공격하는 메서드
    


    // 인벤토리를 확인하는 메서드
    public void inventoryInform() {

    }


    // setter / getter
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public String[] getInventory() {
        return inventory;
    }

    public void setInventory(String[] inventory) {
        this.inventory = inventory;
    }



} // end class
