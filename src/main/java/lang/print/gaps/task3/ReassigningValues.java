package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        //write code here
        int first = 1;
        int second = 10;
        int third = 100;
        System.out.println(first + "\n" + second + "\n" + third);
        int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;
        first = 15;
        second = 6;
        third = 4;
        System.out.print(first + "\n" + second + "\n" + third + "\n" + linkToFirst + "\n" + linkToSecond + "\n" + linkToThird + "\n");

    }
}
