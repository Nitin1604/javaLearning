class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 1120;
        name = "Nitin";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
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

public class Lec42_Constructors {
    public static void main(String[] args) {
        //MyMainEmployee nitin = new MyMainEmployee("nitin645sokhal", 12);
        MyMainEmployee nitin = new MyMainEmployee();
        nitin.setName("nitin645sokhal");
        nitin.setId(34);
        System.out.println(nitin.getId());
        System.out.println(nitin.getName());
    }
}
