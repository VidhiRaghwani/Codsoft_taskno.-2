import java.util.*;
public class gradecalculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int numberOfSubjects;
          
        System.out.println("Enter marks obtained in subject 1:");
        int subject1=sc.nextInt();
        System.out.println("Enter marks obtained in subject 2:");
        int subject2=sc.nextInt();
        System.out.println("Enter marks obtained in subject 3:");
        int subject3=sc.nextInt();        

        int totalMarks=subject1+subject2+subject3;

        double averagePercentage=totalMarks/3;

        String grade;
        if(averagePercentage >=90)
        {
            grade="A+";
        }
        else if(averagePercentage >=80)
        {
            grade="A";
        }
        else if(averagePercentage >=70)
        {
            grade="B";
        }
        else if(averagePercentage>=60)
        {
            grade="D";
        }
        else
        {
            grade="F";
        }

        System.out.println("Total Marks:"+totalMarks);
        System.out.println("Average Percentage:"+averagePercentage);
        System.out.println("Grade:"+grade);
        

    }

}
