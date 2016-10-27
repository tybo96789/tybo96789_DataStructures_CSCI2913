package HW_6;

/**
 *
 * @author Tyler Atiburcio
 */
public class EvaluateBooleanExpressionsTest {
    
    static final String[] TEST = 
    {"Standard Case", "!(1 > 2)",
    "Standard Case", "(2 < 3) && (4 == 5)",
    "Standard Case", "((4 == 5) && (2 < 3)) || (9 != 1)",
    "Standard Case", "(2 > 3) == (4 == 5)",
    "Standard Case", "(2<=2)",
    "Standard Case", "!(8>=9)",
    "Boundary Case", "",
    "Boundary Case", "()",
    "Boundary Case", "!(!(!(1 != 2)))",
    };
    
    public static void main(String[] args) {
        for (int i = 0; i < TEST.length; i++) {
            System.out.print(TEST[i] +":\t");
            System.out.println(TEST[++i]);
            System.out.println(EvaluateBooleanExpressions.evaluateBooleanExpression(TEST[i]));
            System.out.println("\n");
        }
    }

}
