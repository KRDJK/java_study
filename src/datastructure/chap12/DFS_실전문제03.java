package datastructure.chap12;

/*
 예제 입력 4를 가지고 만든 설명!

  1. 문제에서 요구하는 관계는 A, B, C, D, E 순서로 친구관계가 연결되는지 묻고 있으므로
     DFS를 수행했을 때 재귀가 5번 이상 들어간적이 있다면 해당 관계를 만족하는것이 됩니다.
  2. 따라서 인접리스트로 그래프를 구성한 후 DFS를 수행합니다.

   ex) 첫번째 입출력 예시
    0  ->  4
    1  ->  7
    2  ->  7
    3  ->  7, 4, 5
    4  ->  7, 3, 6, 0
    5  ->  3
    6  ->  4
    7  ->  1, 3, 4, 2

   3. DFS 수행시

      재귀 1   ->   재귀 2   ->   재귀 3   ->   재귀 4   ->   재귀 5

        0             4             7             1             7 (이미 방문했으므로 재귀 종료)
        ----------------------------------------------------------------------------------------
                                                  3             7 (이미 방문했으므로 재귀 종료)
                                                                4 (이미 방문했으므로 재귀 종료)
                                                              * 5 (재귀가 더 진행되므로 관계를 만족하므로 1리턴 후 재귀 종료)
        ----------------------------------------------------------------------------------------
                                                  4  (이미 방문했으므로 재귀 종료)
        ----------------------------------------------------------------------------------------
                                                  2             7  (이미 방문했으므로 재귀 종료)
                                    3
                                    6
                                    0 (이미 방문했으므로 재귀 종료)

    4. 모든 노드를 돌아도 1이 리턴되지 않았다면 0을 리턴하고 종료
 */


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// 백준 13023번
public class DFS_실전문제03 {

    // 친구관계를 저장할 인접리스트
    static List<List<Integer>> adjList = new LinkedList<>();

    // 방문 배열
    static boolean[] visited; // 친구 수에 따라 다르다. 총 8명이면  8개짜리 배열로.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();

        visited = new boolean[N];

        for (int i = 0; i < M; i++) {
            int s = sc.nextInt(), e = sc.nextInt();
            
            // 인접리스트에 친구 관계 입력
            adjList.get(s).add(e);
            adjList.get(e).add(s);
        }



    } // end main

    static void DFS(int current) {

        visited[current] = true;
        List<Integer> connectedList = adjList.get(current);
        for (Integer n : connectedList) {
            if (!visited[n]) {
                DFS(n);
            }
        }

    }

} // end class
