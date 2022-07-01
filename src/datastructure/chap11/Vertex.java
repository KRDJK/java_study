package datastructure.chap11;

// 정점 설계 - 정점이란 내가 보관할 데이터를 담는 공간
public class Vertex {

    private int id; // 정점 고유 번호
    private String data; // 정점에 저장할 데이터
    private boolean visitFlag; // 정점 방문 여부


    public Vertex(String data) {
        this.data = data;
        this.id = -1; // 생성된 직후에는 id가 처음엔 없다는 뜻.
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isVisitFlag() {
        return visitFlag;
    }

    public void setVisitFlag(boolean visitFlag) {
        this.visitFlag = visitFlag;
    }
}
