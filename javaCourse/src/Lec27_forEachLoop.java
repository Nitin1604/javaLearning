public class Lec27_forEachLoop {
    public static void main(String[] args) {
        float [] result = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
        String [] students ={"Johan", "Rohan", "Mohan", "Sohan" , "Nitin", "Abhimanyu"};
        System.out.println("The length of the array name students is: " + students.length);
        System.out.println("Element present at index 2 is: " + students[2]);

        int [] marks = {98, 45, 79, 99, 80};
         System.out.println("The length of array marks is: " + marks.length);

        // Displaying the Array (Naive way)
        System.out.println("Printing using Naive way");
        System.out.println("Element present at index 0: " + marks[0]);
        System.out.println("Element present at index 1: " + marks[1]);
        System.out.println("Element present at index 2: " + marks[2]);
        System.out.println("Element present at index 3: " + marks[3]);
        System.out.println("Element present at index 4: " + marks[4]);

        // Displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        // Quick Quiz: Displaying the Array in Reverse order (for loop)
        System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }

        // Quick Quiz: Displaying the Array (for-each loop)
        System.out.println("Printing using for-each loop");
        for(int element: marks){
            System.out.println(element);
        }
    }
}
