public class ReturnValues {
 public static void main(String[] args) {///this is technically the function, that excutes the code, the other functions are methods
        double area1 = calculateArea(2.3, 3.6);//This section is where the function will be stored/called
        printArea(2.3, 3.6, area1);

        String englishExplanation = explaineArea("English");
        System.out.println(englishExplanation);
        
        String frenchExplanation = explaineArea("French");
        System.out.println(frenchExplanation);

       }


///////////////////////////computation methods////////////////////
       
       public static double calculateArea(double length, double width) {////this section is the computation of the function
        if(length < 0 || width < 0) {
            System.out.println("invalid Dimenstions");
            System.exit(0);
        }
        double area = length * width; ///the name of the computation 'area'
        return area; ///return the area
    }

        public static String explaineArea(String language){
                
            switch (language) {
                case "English": return "Area equals length * width"; ///do not need to put break in this because return will break the entire function
                case "French" : return "La surface est egale a la longueur * la largeur";
                case "Spanish" : return "area es igual a largo * ancho";
                default: return "Language not avaiable";
                       
                   
            }
       }

       public static void printArea(double length, double width, double area){
        System.out.println("A rectangle with a length of " + length + " and a width of " +  width + "has an area of " + area );

       }
}


