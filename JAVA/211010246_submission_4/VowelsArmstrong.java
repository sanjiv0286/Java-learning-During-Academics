import java.util.*;

class VowelsArmstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Armstrong a1 = new Armstrong();
        System.out.println("MATRIX : ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a1.a[i][j] + " ");
            }
            System.out.println();
        }
        a1.sum();

    }
}

class Armstrong {
    char a[][] = { { 'Y', 'B', 'U', 'D', 'Q' }, { 'F', 'G', 'H', 'I', 'J' }, { 'O', 'L', 'M', 'N', 'K' },
            { 'P', 'E', 'R', 'S', 'T' }, { 'C', 'V', 'W', 'X', 'A' } };

    void sum() {
        int sm = 0;
        System.out.println("the elements are:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i][j] == 'A' || a[i][j] == 'E' || a[i][j] == 'I' || a[i][j] == 'O' || a[i][j] == 'U') {
                    System.out.println("Row : " + i + " Column : " + j);
                    sm += i + j;
                }
            }
        }
        System.out.println("SUM : " + sm);
        int temp = sm;
        int curr = 0;
        while (sm > 0) {
            int t = sm % 10;
            sm /= 10;
            int cb = t * t * t;
            curr += cb;
        }
        if (temp == curr) {
            System.out.println("It is an ArmStrong number");
        } else {
            System.out.println("It is not an ArmStrong number");
        }

    }

}