package statictest;


/**
 * 静态变量测试
 * 结论：父类的静态变量，其所有子类也都是共用这一个静态变量
 */
public class MainClass {
    public static void main(String[] args) {
        SubClass1 class1 = new SubClass1();
        SubClass2 class2 = new SubClass2();

    }
}
