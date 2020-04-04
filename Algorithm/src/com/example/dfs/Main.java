package com.example.dfs;


public class Main {
	public static void main(String[] args) {
		/*
		 * 깊이 우선 탐색
		 * 루트 노드에서 시작해서 다음 분기로 넘어가기전에 해당
		 * 분기를 완벽하게 탐색하는 방법
		 * ex ) 미로 한방향으로 쭉가다가 막히면 갈림길로 돌아와 다른방향을 탐색
		 * ㄱ
		 * 구현방법 1. 순환 호출
		 * 2 명시적인 스택 사용
		 * 시작 정점 v를 결정
		 * v에서 인접한 정점중에서 방문하지않은 정점잇으면 v를 스택에저장
		 * w방문 w는 다시 v가됨.
		 * 위를 반복
		 * 다방문하면 스택을 pop하여 가장 마지막 방문 정점을 v로하여 다시 반복
		 * 스택이 빌빌때까지
		 * https://itdexter.tistory.com/86(그래프)
		 * https://kgh940525.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-DFS(재귀)
		 * 
		 * 시간 복잡도
		 * 그래프의 모든 간선을 조회 
		 * 인접리스트로 표현된 그래프 O(N+E)
		 * 인접 행렬로 표현된 그래프 O(N2)
		 * 
		 * 장점 깊은곳에있으면 빨리찾아
		 * 단점 자칫하면 오버플로우나고 최단거리라는 보장은 없어.
		 * 
		 * 
		 * 
		 * 
		 * 
		*/
	}
	
}
