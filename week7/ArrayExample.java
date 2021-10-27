public class ArrayExample {
    public static void main(String[] args) {
        System.out.println();

        String[] names = new String[5];
        names[0] = "Alisa";
        names[1] = "Kadija";
        names[2] = "Rasheeda";
        names[3] = "Yetunde";
        names[4] = "Amie";

        for(int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }

        System.out.println();
    }
}
