public class TheIfStatement {
    public static void main(String[] args) {
        System.out.println();

        /*
        
            if(<boolean expression) {
                <statements to execute when boolean expression is true 
            }

        
            if(<boolean expression) {
                <statements to execute when boolean expression is true 
            } 
            else {
                <statements to execute when boolean expression is false 
            }

            
            if(<boolean expression) {
                <statements to execute when boolean expression is true 
            } 
            else if (<boolean expression>) {
                <statements to execute when boolean expression is true 
            }
            else {
                <statements to execute when boolean expression is false 
            }
        
        */

        // E.g. Print Hello World if 5 > 4
        String status = "NEW";
        if(status.equalsIgnoreCase("New") || status.equalsIgnoreCase("Started") || status.equalsIgnoreCase("Completed")) {
            System.out.println("Item is in a valid state");
        }
        else {
            System.out.println("The item is in an invalid state");
        }

        System.out.println();
    }
}
