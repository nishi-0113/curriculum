package cheak;

public class Main {
    private String firstName = "西";
    private String lastName = "那緒斗";
    
    public void printName() {
        System.out.println(firstName + lastName);
        
    }
    
    public static void main(String[] args) {
        Main n = new Main();
        n.printName();
        
        Pet name = new Pet("java吉", "hoge");
        name.introduce();
        System.out.println();

        RobotPet r2d2 = new RobotPet("R2D2", "ルーク");
        r2d2.introduce();
        System.out.println();

        
        
    }
    
}