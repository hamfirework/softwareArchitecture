package refacotring.day1;

public class Main {
    public static int splitAndSum(String text) {
        if (isEmpty(text)) {
            return 0;
        }
        return getSum(toInts(split(text)));
    }

    private static boolean isEmpty(String text) {
        if(text==null) return true;
        if(text.isEmpty())  return true;
        return false;
    }

    private static String[] split(String text) {
        return text.split("-");
    }

    private static int[] toInts(String[] values) {
        int[] nums = new int[values.length];
        for (int i=0; i < values.length; i++) {
            nums[i] += Integer.parseInt(values[i]);
        }
        return nums;
    }

    private static int getSum(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result += num;
        }
        return result;
    }

    public static void main(String[] args) {

        int ret = splitAndSum("11-22-33");

        System.out.println(ret);

    }
}

