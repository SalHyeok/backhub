import java.util.*;

class Shark {
    int x, y, size, ate;
    
    public Shark(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.ate = 0;
    }
}

class Fish {
    int x, y, dist;
    
    public Fish(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}

public class Main {
    static int[][] map;
    static int n, time;
    static Shark shark;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];
        
        int sharkX = 0, sharkY = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 9) {
                    sharkX = i;
                    sharkY = j;
                }
            }
        }
        
        shark = new Shark(sharkX, sharkY, 2);
        map[sharkX][sharkY] = 0;
        
        while (true) {
            Fish fish = findNearestFish();
            if (fish == null) break;
            
            time += fish.dist;
            shark.x = fish.x;
            shark.y = fish.y;
            shark.ate++;
            map[fish.x][fish.y] = 0;
            
            if (shark.ate >= shark.size) {
                shark.size++;
                shark.ate = 0;
            }
        }
        
        System.out.println(time);
    }
    
    static Fish findNearestFish() {
        boolean[][] visited = new boolean[n][n];
        Queue<Fish> queue = new LinkedList<>();
        queue.add(new Fish(shark.x, shark.y, 0));
        visited[shark.x][shark.y] = true;
        
        ArrayList<Fish> candidates = new ArrayList<>();
        
        while (!queue.isEmpty()) {
            Fish current = queue.poll();
            
            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny] && map[nx][ny] <= shark.size) {
                    visited[nx][ny] = true;
                    queue.add(new Fish(nx, ny, current.dist + 1));
                    
                    if (map[nx][ny] > 0 && map[nx][ny] < shark.size) {
                        candidates.add(new Fish(nx, ny, current.dist + 1));
                    }
                }
            }
        }
        
        if (candidates.isEmpty()) {
            return null;
        } else {
            candidates.sort((f1, f2) -> {
                if (f1.dist == f2.dist) {
                    if (f1.x == f2.x) {
                        return Integer.compare(f1.y, f2.y);
                    }
                    return Integer.compare(f1.x, f2.x);
                }
                return Integer.compare(f1.dist, f2.dist);
            });
            
            return candidates.get(0);
        }
    }
}