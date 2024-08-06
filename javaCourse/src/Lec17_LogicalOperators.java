public class Lec17_LogicalOperators {
    public static void main(String[] args) {
        System.out.println("For Logical AND...");
        boolean logicalOp1 = true;
        boolean logicalOp2 = false;
        if (logicalOp1 && logicalOp2){
            System.out.println("Boolean of logicaOp1 and logicalOp2 is: " + "True");
        }
        else{
            System.out.println("Boolean of logicalOp1 and logicalOp2 is: " + "False");
        }

        System.out.println("For Logical OR...");

        if (logicalOp1 || logicalOp2){
            System.out.println("Booleans of logicalOp1 or logicalOp2 is: " + "True");
        }
        else{
            System.out.println("Boolean of logicalOp1 or logicalOp2 is: " + "True");
        }

        System.out.println("For Logical NOT");
        System.out.print("Not(logicalOp1) is ");
        System.out.println(!logicalOp1);
        System.out.print("Not(logicalOp2) is ");
        System.out.println(!logicalOp2);
    }
}
