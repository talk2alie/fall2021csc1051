public class ComparisonOperators {
    public static void main(String[] args) {
        /**
         
            >   - Greter than
            E.g 5 > 4

            <   - Less than
            E.g 4 < 5

            ==  - Equals to
            E.g 5 == 5

            !=  - Not Equal to
            E.g. 6 != 5

            >=  - Greater than or Equals to
            E.g 5 >= 3

            <=  - Less than or Equals to
            E.g 4 <= 4

         */

         TodoItem item = new TodoItem("Eat all day", "2021-10-24");
         item.changeStatus(ItemStatus.Completed);
    }
}
