public class RemoveSpecialChars {
    public static void main(String[] args) {
        String str = "a!b@c#1$2%3^";
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);

        String str1 = "abc  def     gh";
        str1 = str1.replaceAll("\\s+", " ");
        System.out.println(str1);
    }
}
