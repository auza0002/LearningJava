package JavaChallenges;

public class valueDoubled {
    public static void main(String[] args) {
        map(new int[] {1, 1, 1, 1, 1, 1});
    }
    public static int[] map(int[] arr) {
        int[] newArray = new int[]{};
        for (int  i = 0; i < arr.length; i++) {
            System.out.println(i * 2);


        }
        return newArray;
    }
}
