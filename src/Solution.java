import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public void solution() throws IOException {

        Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\ferfe\\IdeaProjects\\module_10\\src\\text.txt"));
        String[] head = scanner.nextLine().split(";");
        int result = 0;

        while (scanner.hasNextLine()){
            String[] buy = scanner.nextLine().split(";");
            result += Integer.parseInt(buy[1])*Integer.parseInt(buy[2]);
        }
        System.out.println(result);
    }
}
