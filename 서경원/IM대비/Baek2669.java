import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2669 {//1
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] arr = new boolean[101][101];
        int count = 0;

        for(int i = 0; i < 4; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int j = x1; j < x2; j++){
                for(int k = y1; k < y2; k++){
                    if(!arr[j][k]){
                        arr[j][k] = true;
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
