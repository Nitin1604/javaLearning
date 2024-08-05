public class Lec10_Increment_Decrement_Operators {
    public static void main(String[] args) {
        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        System.out.println("The value of a is:-");
        System.out.println(a);
        float b = 6.54f + x;
        System.out.println("The value of b is:-");
        System.out.println(b);

        // Increment and Decrement Operators
        int i = 56;
        // int b = i++; // first b is assigned i (56) then i is incremented
        int j = 67;
        int c = ++j; // first j is incremented then c is assigned j (68)
        System.out.println("The value of i after increment i++ is:-");
        System.out.println(i++); // First it will print i value as it is i.e 56
        System.out.println("The value of i is:-");
        System.out.println(i); // Secondly it will increment it the value of i by 1 i.e 57
        System.out.println("The value of i before increment ++i is:-");
        System.out.println(++i); // First it will increment the value of i as 58 after i++
        System.out.println("The value of i is:-");
        System.out.println(i); // Secondly it will print the value of increment value of i
        int Y = 7;
        System.out.println("The value of expression [++Y * 8] is:-");
        System.out.println( ++Y *8); // 64
        char ch = 'a';
        System.out.println("The value of ch is:-");
        System.out.println(++ch); // b
    }
}
