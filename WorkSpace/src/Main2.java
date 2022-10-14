public class Main2 {

    public static void main(String[] args) {

        discriminant(1,1,1);

        String[] words = {"word", "My World", "Unexpected","huricane"};

        System.out.println("Array size is: " + words.length);

        String shortest = words[0];
        for(int i = 0; i < words.length;i++){
            if(words[i].length()<= shortest.length()){
                shortest=words[i];
            }
        }
        System.out.println("Shortest word in an array is: " + shortest);
    }

    public static void discriminant(int a, int b,int c) {
        System.out.println("Discriminant is: " + (b * b - 4 * a * c));
    }
}
