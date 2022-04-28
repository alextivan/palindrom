public class isPalindrom {

    public void Palindrom(int n) {
        int r = 0;
        int s = 0;
        int t = n;

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            s = s * 10 + r;
        }
        if (s == t) {
            System.out.println(t + " is a palindrom");
        } else {
            System.out.println(t + " is not a palindrom");
        }
    }
}
