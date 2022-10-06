package Semaine04;

public class test {
    public static void main(String[] args) {

        int d = 5;
        int n = 5554555;

        System.out.println(amazing(n,d));
    }



    public static int amazing(int n,
                                int d)
    {
        int count = 0;

        // Loop to find the digits of N
        while (n > 0)
        {

            // check if the digit is D
            count = (n % 10 == d) ?
                    count + 1 : count;
            n = n / 10;
        }

        // return the count of the
        // occurrences of D in N
        return count;
    }


}
