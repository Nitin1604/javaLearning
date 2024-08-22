class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class Lec40_gettersSetters {
    public static void main(String[] args) {
        MyEmployee nitin = new MyEmployee();
        // nitin.id = 45;
        // nitin.name = "nitin645sokhal"; --> Throws an error due to private access modifier
        nitin.setName("nitin645sokhal");
        System.out.println(nitin.getName());
        nitin.setId(234);
        System.out.println(nitin.getId());
    }
}
