/**
 * program начало работы -метод статический работа с массивом строк МЕЙН
 */
// чтоб выводить массивы

import java.io.FileNotFoundException;
import java.io.PrintWriter;



public class program {



    public static void main(String[] args) {
     
        
        
         // 1 
         System.out.println(palendromDetector("aaar"));
         
         //2
        printStr("test"+"\n", 100);

    }

 
// 1  Напишите метод, который принимает на вход строку (String) и определяет является ли 
// строка палиндромом (возвращает boolean значение).

    static boolean palendromDetector(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rts = sb.toString();
        if (str.equals(rts)){
            return true;
        }
        else{
            return false;
        }
    }

  // Написать метод, которому в качестве аргументов передается строка и число,
    //  метод должен отпечатать в консоль указанную строку, указанное количество раз;
    
    static void printStr(String strA, int a){
       
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<a;i++){
            sb.append(strA);
        }
        
        try(PrintWriter pw = new PrintWriter ("text/text.txt")){
            pw.print(sb.toString());
            
        }
        catch (FileNotFoundException e){
   
            System.out.println("File not found"); 
        }  
    
    }


}

