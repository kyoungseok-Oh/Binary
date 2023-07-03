public class BinaryExam {
    public static void main(String[] args) {
        //Q. 123을 10진수, 2진수, 8진수, 16진수로 출력하시오
        int data = 123;
        String binary=java.lang.Integer.toBinaryString(data);
        System.out.println("binary = " + binary);
        String octal=java.lang.Integer.toOctalString(data);
        System.out.println("octal = " + octal);
        String hexa=java.lang.Integer.toHexString(data);
        System.out.println("hexa = " + hexa);
        
        int x = 123; // 10진수는 그대로 적기
        System.out.println("x = " + x);
        int y = 0b1111011; // 2진수는 앞에 0b 붙이기
        System.out.println("y = " + y);
        int z = 0173; // 8진수는 앞에 0붙이기
        System.out.println("z = " + z);
        int u = 0x7B; // 16진수는 앞에 0x붙이기
        System.out.println("u = " + u);
    }
}
