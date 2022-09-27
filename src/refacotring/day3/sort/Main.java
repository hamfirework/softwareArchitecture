package refacotring.day3.sort;

import java.util.ArrayList;


interface Sort{
    void sort(ArrayList<Integer> nums);
}

class BubbleSort implements Sort{
    @Override
    public void sort(ArrayList<Integer> nums) {
        int n = nums.size();
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n - a - 1; b++) {
                if (nums.get(b) > nums.get(b+1)) {
                    int temp = nums.get(b);
                    nums.set(b, nums.get(b+1));
                    nums.set(b+1, temp);
                }
            }
        }
    }
}

class SelectionSort implements Sort{
    @Override
    public void sort(ArrayList<Integer> nums) {
        int n = nums.size();
        for (int a = 0; a < n; a++) {
            for (int b = a + 1; b < n; b++) {
                if (nums.get(a) > nums.get(b)) {
                    int temp = nums.get(a);
                    nums.set(a, nums.get(b));
                    nums.set(b, temp);
                }
            }
        }
    }
}



public class Main {

    public static ArrayList<Integer> nums = new ArrayList<Integer>();

    public static Sort selectAlgorithm(String sortName) {
        if("Bubble".equals(sortName)){
            return new BubbleSort();
        }
        if("Selection".equals(sortName)){
            return new SelectionSort();
        }
        return null;
    }


    public static void run(Sort sort) {
        sort.sort(nums);
    }

    public static void printResult() {
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {

        nums.add(7);
        nums.add(3);
        nums.add(4);
        nums.add(1);
        nums.add(5);
        printResult();

        Sort sort = selectAlgorithm("Bubble");
        run(sort);
        printResult();

        nums.add(2);
        nums.add(9);
        nums.add(4);

        sort = selectAlgorithm("Selection");
        run(sort);
        printResult();
    }
}