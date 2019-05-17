/*
 the following code fragment is meant to give us the how to present columns,rows and content with for loops
*/public class ForLoop {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                for(int k = 0; k < 2; k++)
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}