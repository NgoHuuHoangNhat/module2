package algorithms.bai_8;

public class Main {
    public static void main(String[] args) {
        int[] parent = {1, 4, 5, 2, 1};
        int[] child = {1, 2, 3};

        int num = FindArrayChildInArrayParent.findNum(parent,child);
        System.out.println(num);

    }
}
