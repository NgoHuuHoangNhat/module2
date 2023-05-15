package ss6.demo;

public class Dog extends Animal {
    int chan;
    String nguonGoc ;

    Dog(){
        chan = 4;
        nguonGoc = "Việt Nam";
    }
    public String sua(){
        return "Gau";
    }
    public void vayDuoi(){
        System.out.println("vui quá!!");
    }

}
