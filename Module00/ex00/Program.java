package Module00.ex00;

public class Program {
    public static int calculateSum(String str) {
        int sum = 0;
        for (char i : str.toCharArray()) {
            int num = i - '0';
            sum += num;
        }
        return sum;
    }

    public static void main(String[] main) {
        String str = "479598";
        int sum = calculateSum(str);
        System.out.println(sum);
    }
}