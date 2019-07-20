import Question1.*;
import Question2.*;

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
                        Message.main("");
                        //MessageOK.main("");
                        break;
            
            
            }
        }else{
            System.out.println("Mucho pirobo no!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Ejecutar java AssessmentTest <numeroPregunta> ejempo: java AssessmentTest 1");
            }
        
        System.out.println("--------------END AssessmentTest----------");
    }

}

