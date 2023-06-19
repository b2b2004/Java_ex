package com.example.javaworkspace.chap_05;

public class _02_Catch {
    public static void main(String[] args) {

        try {
//            System.out.println(3/0);

//            int[] arr = new int[3];
//            arr[5] = 100;

            Object obj = "test";
            System.out.println((int) obj);

        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException 오류 발생 " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException 오류 발생 " + e.getMessage());
        }catch (ClassCastException e) {
            System.out.println("ClassCastException 오류 발생 " + e.getMessage());
        }catch (Exception e){
            System.out.println("그 외");
        }

        System.out.println("프로그램 정상 종료");
    }
}
