public class stringcleaner {
    public static void main(String[] args) {
        String originalString = "A man, a plan, a canal: Panama!";
        
        // Replace anything that is not a letter or digit with ""
        String cleanedString = originalString.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("Original: '" + originalString + "'");
        System.out.println("Cleaned: '" + cleanedString + "'");
    }
}