import java.util.*;
public class NumberGame {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Random random=new Random();
    int score=5;
    int count=1;
    System.out.println(" -->  Welcome to Number Game <--");
    System.out.print("Enter Your Name :");
    String name=sc.nextLine();
    System.out.println(name +" You will Be having 5 Chances to guess the number");
    int randomnum=random.nextInt(100)+1;
    int user=0;
    for (int i=0;i<5;i++){
        System.out.print("ENTER A NUMBER :");
        user=sc.nextInt();
        if(user==randomnum){
            System.out.println("Congratulations "+name+ " have matched the random number "+count+" attempts");
            System.out.println("Your score is "+score);
            break;
        }
        else if(user<randomnum){
            System.out.println(name+ " your number is less than random number !");
            score=score-1;
            count+=1;
        }
        else{
            System.out.println(name+ " your number is high than random number !");
            score=score-1;
            count+=1;
        }
    }
    if(user!=randomnum){
        System.out.println("Chances over for the Number Game ");
        System.out.println("Try Again  ");
    }

    } 
}
