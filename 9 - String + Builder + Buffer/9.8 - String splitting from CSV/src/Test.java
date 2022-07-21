public class Test {
    public static void main(String[] args) {
        String str = "Navin, Mahesh, Rahul, Vijay";

        String[] names = str.split(", ");

        System.out.println(names.length);
        System.out.println(names[2]);

        for(String name : names)
            System.out.println(name);
    }
}
