public class Main {
    public static void main(String[] args) {
        int counter=0;
        int sum=0;

        for (int i=1; i<=1000 && counter <= 5; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                counter++;
                sum += i;
                System.out.println (counter + ": i = " + i + " / sum = " + sum);
            }
        }
        System.out.println("sum = " + sum);
    }
}