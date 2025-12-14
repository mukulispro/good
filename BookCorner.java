public class BookCorner {
    public static void main(String[] args) {
        // 
        String[] categories = {"Fiction", "Nepali"};

        
        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];

        
        titles[0][0] = "The Great Gatsby";   
        prices[0][0] = 1200.0;

        titles[1][0] = "Asahamati - 5";      
        prices[1][0] = 750.0;

        
        for (int i = 0; i < categories.length; i++) {
            System.out.printf("Category: %s | Title: %s | Price: %.2f%n",
                              categories[i], titles[i][0], prices[i][0]);
        }
    }
}