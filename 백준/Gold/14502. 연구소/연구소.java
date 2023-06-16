import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static class virus {
		int r, c;
		virus(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}
	
	static int N, M; // 지도의 세로, 가로
	
	static int[] dr = {-1, 1, 0, 0}; // 상하좌우
	static int[] dc = {0, 0, -1, 1};
	
	static int[][] map;
	
	static int maxSafeZone = Integer.MIN_VALUE; // 안전 영역 크기 최댓값
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0);
		
		System.out.println(maxSafeZone);
	}
	
	// 벽 세우기
	public static void dfs(int depth) {
		// 벽 3개 다 세우면 바이러스 뿌리기 (bfs 탐색)
		if(depth == 3) {
			bfs();
			return;
		}
		
		// 벽 3개 다 못 세웠다면 벽 세우기
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				// 빈 칸일 경우
				if(map[i][j] == 0) {
					map[i][j] = 1; // 벽 세우기
					dfs(depth+1); // 추가로 벽 세우기
					map[i][j] = 0; // 돌려 놓기
				}
			}
		}
	}
	
	// 바이러스 뿌리기
	public static void bfs() {
		Queue<virus> q = new LinkedList<>();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] == 2) // 바이러스가 있다면
					q.add(new virus(i, j)); // 바이러스 위치 저장
			}
		}
		
		int[][] copy = new int[N][M];
		for(int i=0; i<N; i++) {
			copy[i] = map[i].clone();
		}
		
		while(!q.isEmpty()) {
			virus now = q.poll();
			int r = now.r;
			int c = now.c;
			
			for(int d=0; d<4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				
				if(nr >= 0 && nr < N && nc >= 0 && nc < M && copy[nr][nc] == 0) {
					q.add(new virus(nr, nc));
					copy[nr][nc] = 2;
				}
			}
		}
		// 안전 영역 크기 구하기
		safe(copy);
	}
	
	public static void safe(int[][] map) {
		int count = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] == 0)
					count++;
			}
		}
		if(maxSafeZone < count)
			maxSafeZone = count;
	}
}