public class TestComparing {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = cat1;

        if(cat1==cat2) {
            System.out.println(true);
        }

        String str1="JAVA";
        String str2="JAVA";
        String str3="Java";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }
}
