import java.util.Scanner;
public class pract{
    public static void main(String[] args) {
        int score;
        Scanner level = new Scanner(System.in);
        System.out.println("enter student score:");
        score = level.nextInt();
        if ( score>=80) {
         System.out.println("level_7_(distinction)");
          }
          else if (score>=70){
            System.out.println("level_6_(meritous achievement)");
  } 
  else if (score >=60) {
    System.out.println("level_5_(substantial achievement)");
  }
  else if (score >=50){
    System.out.println("level_4_(moderate achievement)");
  }
  else if (score >=40){
    System.out.println("level_3_(adequate achievement)");
        } 
        else if (score >=30) {
            System.out.println("level_2_(elementary achievement)");
        }  
        else {
            System.out.println("level_1_(fail)");
        } 
        level.close();
        }
    }
           