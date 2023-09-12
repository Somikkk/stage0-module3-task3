package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;
        System.out.println(first + "\n" + second + "\n" + third);
        first = 15;
        second = 6;
        third = 4;
        int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;
        first = 1;
        second = 10;
        third = 100;
        System.out.println(linkToFirst + "\n" + linkToSecond + "\n" + linkToThird + "\n" + first + "\n" + second + "\n" + third);
    }
}
