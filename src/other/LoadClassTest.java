package other;

public class LoadClassTest {

    static {
        System.out.println("OuterClass Load");
    }

    private static class InnerClass {
        static {
            System.out.println("InnerClass Load");
        }
    }


    public static void main(String[] args) {
        LoadClassTest outer = new LoadClassTest();
        System.out.println("-------------------------");
        InnerClass innerClass = new InnerClass();
    }

}
