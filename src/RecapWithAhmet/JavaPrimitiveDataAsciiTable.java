package RecapWithAhmet;

public class JavaPrimitiveDataAsciiTable {

   /*
   POSSIBLE INTERVIEW QUESTIONS:

    1-What is Java and What do you know about JDK,JVM,JRE ?

    Java:is a programming language.It has 3 main components:

     1-JDK(Java Development Kit) -->that has some specific libraries
     which supports the application development. -->You can remember whole building as JDK

     2-JRE(Java RunTime Environment) -->That is responsible for executing the code.
     -->you can remember code fish section of the building as JRE(codefish business is running)

     3-JVM(Java Virtual Machine) -->is a virtual machine which is responsible for convertion
     byte code to binary code(1,0) -->Batch16 classroom as JVM in Codefish.

      PRIMITIVE DATA:It is a simple way to store data in java.The reason people prefer
      using primitive data other than objects is all about taking up space in memory.

      WHOLE NUMBERS:         DECIMAL NUMBERS:       CONDITION:         CHARACTER:
      -->Byte                -->Float              -->boolean          -->Char
      -->Short             * -->Double
     *-->Int
      -->Long

     short number=5;
     short number2=7;
     short result=number2-number;
     sout(result)

     ASCII TABLE:It is a way to access all the characters(alphabet,numbers,symbols) in table.
      -->Google it
    */
   public static void main(String[] args) {

      char letter=65;
      char letter2='g';
      int number='g';
      System.out.println(number); //A or 67   --->103
      System.out.println(letter2-letter);//number (123-65) or 2   -->103 - 65 -->38
      System.out.println(letter2);//123 or 'g'  -->'g'
      System.out.println(letter);//A -->'A'

      double chairslength=12.2;
      double chairssize=5.2;
      float chairangle=5.7f;
      boolean result=chairangle+chairssize>chairslength; //true or false
      System.out.println(result);

   }

}
