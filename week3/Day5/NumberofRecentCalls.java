class RecentCounter {
    private static final int[] records = new int[10000];
    private int start;
    private int end;

    public RecentCounter() {
        start = 0;
        end = 0;
    }

    public int ping(int t) {
        
        while (start < end && t - records[start] > 3000) {
            start++;
        }

        
        records[end++] = t;

      
        return end - start;
    }
}

public class NumberofRecentCalls {
    public static void main(String[] args) {
        RecentCounter rc = new RecentCounter();

        System.out.println(rc.ping(1));     // 1
        System.out.println(rc.ping(100));   // 2
        System.out.println(rc.ping(3001));  // 3
        System.out.println(rc.ping(3002));  // 3
    }
}

