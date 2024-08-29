import javax.print.Doc;
class firstClass{
    int a;
    public int getA() {
        return a;
    }
    firstClass(int a){
        this.a = a;
    }
    public int returnOne(){
        return 1;
    }
}
class secondClass extends firstClass{
    secondClass(int c){
    super(c);
    System.out.println("I am a constructor"); 
  }
}
public class Lec47_this_super {
    public static void main(String[] args) {
        firstClass e = new firstClass(65);
        secondClass d = new secondClass(5);
        System.out.println(e.getA()); 
    } 
}