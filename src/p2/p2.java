package p2;
import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        System.out.println("1 = ค้อน, 2 =กระดาษ, 3 = กรร");
        Scanner scanner = new Scanner(System.in);
        System.out.print("เลือกหมายเลขสิ่งของสำหรับผู้เล่น #1");
        int player1 = scanner.nextInt();
        System.out.print("เลือกหมายเลขสิ่งของสำหรับผู้เล่น #2");
        int player2 = scanner.nextInt();
        String result ="";
        if (player1 == 1) {
            if (player2 == 1) {
                result = "เสมอกัน";
            } else if (player2 == 2) {
                result = "ผู้เล่น 2 ชนะ";
            } else if (player2 == 3) {
                result = "ผู้เล่น 1 ชนะ";
            }
        }else if (player1 == 2){
            if (player2 == 2){
                result ="ผู้เล่น 1 ชนะ";
            }else if (player2 == 2){
                result ="เสมอกัน";
            }else if (player2 == 3){
                result ="ผู้เล่น 2 ชนะ";
            }
        }else if (player1 == 3) {
            if (player2 == 1) {
                result = "ผู้เล่น 2 ชนะ";
            } else if (player2 == 2) {
                result = "เผู้เล่น 1 ชนะ";
            } else if (player2 == 3) {
                result = "เสมอกัน";
            }
        }
        System.out.println(result);

    }
}
