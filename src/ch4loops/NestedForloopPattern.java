package ch4loops;

public class NestedForloopPattern {
    public static void main(String[] args) {

        for(int row = 0; row < 6;row++){
            //System.out.println(row);
            for(int column=1;column<=6-row;column++){
                System.out.printf("%-4d" ,column);
            }
            System.out.println();
        }
    }
}
