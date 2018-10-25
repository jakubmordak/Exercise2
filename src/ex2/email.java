package ex2;

// name and surname should be like this : Xxxx Yyyyy
//if file already exists this program overwrite it
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class email {

    public static void main(String[] args) throws FileNotFoundException  {
        int N;
        int modifier=0;
        Scanner input = new Scanner(System.in);
        System.out.printf("Insert number of employes You want to add:\t");
        N=input.nextInt();
        Employe[] employes = new Employe[N];
        String[] emails = new String[N];
        PrintWriter print = new PrintWriter("Emails.txt");

        for(int i=0;i<N;i++) {
            employes[i] = new Employe();
            System.out.printf("Insert name of %d employe:\t", i + 1);
            employes[i].getName(input);
            System.out.printf("Insert surname of %d employe:\t", i + 1);
            employes[i].getSurname(input);
            for (int j = i - 1; j >= 0; j--)
                if (employes[i].name.equals(employes[j].name) && employes[i].surname.equals(employes[j].surname))
                    modifier++;

                emails[i] = employes[i].getEmail(modifier);
                print.println(emails[i]);
                modifier=0;
        }
        print.close();
        System.out.println("Text file with Emails created!");
    }
}
