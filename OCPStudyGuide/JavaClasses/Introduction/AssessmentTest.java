import Question1.*;
import Question2.*;
import Question3.*;
import Question4.*;
import Question5.*;
import Question10.*;
import Question13.*;
import Question15.*;
import Question16.*;
import Question18.*;

public class AssessmentTest{

    public static void main(String... ss){
    
        System.out.println("-------------START AssessmentTest---------");
        if(ss.length > 0){
            int question = Integer.valueOf(ss[0]);
            switch(question){
                case 1: //Question 1
                        BabyPandaBathManager.main("");
                        break;
                case 2: //Question 2 has a error(Class Message define method abstrat and final.).
                        //Executes MessageOK:
                        //Message.main(""); 
                        MessageOK.main("");
                        break;
                case 3://Question 3 
                        System.out.println("Class Never Compiles!.");
                        break;
                case 4://Question 4
                        Box.main("");
                        break;
                case 5://Question 5
                        Question5.main("");
                        break;
                case 10://Question 10: Al ejecutar java -ea Question10/AssertDemo aparece la exception del AssertDemo
                        AssertDemo.main("");
                        break;
                case 11://Question 11:
                        System.out.println("Question 11: No compila el metodo dado. Faltan imports (MagicClassOK.java)");
                        break;
                case 13://Question 13:
                        System.out.println("Question 13: Code compiles only if add \"import java.io.Console;\" (ConsoleClass.java)");
                        ConsoleClass.main("");
                        break;
                case 14://Question 14:
                        System.out.println("Question 141: Codigo dado tiene mas de 3 errores.");
                        break;
                case 15://Question 15:
                        VisitPark.main("");
                        break;
                case 16://Question 16:
                        Q16.main("");
                        break;
                case 18://Question 18: Opciones C y D correctas
                        Q18.main("");
                        break;
            }
        }else{
            System.out.println("Mucho pirobo no!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Ejecutar java AssessmentTest <numeroPregunta> ejempo: java AssessmentTest 1");
            }
        
        System.out.println("--------------END AssessmentTest----------");
    }

}

