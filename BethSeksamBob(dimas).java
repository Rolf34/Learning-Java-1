import java.util.Scanner;

public class BethSeksamBob { 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("ВВЕДИ ПЕРШУУУУ ЦИФЄРКУ PEZHE:");
        double steve1 = scanner.nextDouble();

        System.out.print("vvedi druge chislo pezhe:");
        double steve2 = scanner.nextDouble();
        
        double sum = steve1 + steve2;
        double difference = steve1 - steve2;
        double product = steve1 * steve2;
        double quotient =  steve1 / steve2;
        
        System.out.println("Summa:" + sum);
        System.out.println("Minusa:" + difference);
        System.out.println("Umnazhankayem:" + product);
        System.out.println("DOlbim po polam:" + quotient);

        scanner.close();


       }
    } 