public class o7_Strings {
    public static void main(String[] args) {
        String name = "A";
        String name2 = "A";

        System.out.println(name.charAt(0));
        System.out.println(name.compareTo(name2));
        if (name == name2) {
            System.out.println("Same");
        }
        if (new String("Soumya") == new String("Soumya")) {
            System.out.println("Same");
        }
    }
}
