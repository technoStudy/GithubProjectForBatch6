public class UgurInanmazFeatures {

    public static void main(String[] args) {
        String str1 = "Sample String";
        System.out.println(str1.getClass().getSimpleName());
        double str2 = 222;  // int, float, double etc numeric values here
        System.out.println(((Object)str2).getClass().getSimpleName());
    }

}
