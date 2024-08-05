public class Lec8_Operators_Expressions {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        // 4.8%1.1 --> Returns Decimal Remainder
        int op1 = 4;
         int op2 = 6 % op1; // Modulo Operator

        // 2. Assignment Operators
        int assOp = 9;
        assOp *= 3; // Same as assOp = assOp * 3
        System.out.println(assOp); // 27

        // 3. Comparison Operators
         System.out.println(64<6); // false

        // 4. Logical Operators
         System.out.println(64>5 && 64>98); // false
        System.out.println(64>5 || 64>98); // true

        // 5. Bitwise Operators
        System.out.println(2&3); // 2

    }
}
