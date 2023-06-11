package Kegiatan1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Input : ");
        s = sc.nextLine();
        System.out.print("Reversed : ");

        for (int i =s.length(); i>0;--i){
            System.out.print(s.charAt(i-1));
        }
    }
}
