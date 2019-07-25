import Question1.*;
import Question2.*;
import Question3.*;
import Question4.*;
import Question5.*;

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
            
            
            }
        }else{
            System.out.println("Mucho pirobo no!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Ejecutar java AssessmentTest <numeroPregunta> ejempo: java AssessmentTest 1");
            }
        
        System.out.println("--------------END AssessmentTest----------");
    }

}

