public class lesson3_gymTask {
    public static void main(String[] args) {
        int set = 5;
        int atjumani = 3;
        int prisedani = 5;
        int press = 7;

        for (int i = 1; i <= set; i++) {
            System.out.println("Set number " + i);
            if (set % 2 == 0) {
                for (int j = 1; j <= prisedani; j++) {
                    System.out.println("Prisedaem " + j);
                }
                for (int k = 1; k <= press; k++) {
                    System.out.println("Ka4ac press " + k);
                }
            }
            else if (set % 2 != 0) {
                for (int l = 1; l <= atjumani; l++) {
                    System.out.println("Atjumani " + l);
                }
                for (int j = 1; j <= press; j++) {
                    System.out.println("Ka4ac press " + j);
                }
            }
            System.out.println("Nice Cock! You are almost boss of the gym!");
        }
        System.out.println("Congrats! You are boss of the gym!");
    }
}