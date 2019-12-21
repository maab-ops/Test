import java.util.Scanner;

public class JavaExample
{//peginning of the class
    public static void main(String args[])
    {//peginning of the main
    	/* This program assumes that the student has 6 subjects,
    	 * thats why I have created the array of size 6. You can
    	 * change this as per the requirement.
    	 */
        int marks[] = new int[6];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
        //to enter from user

        for(i=0; i<6; i++) {
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/6;
        System.out.println("The student Grade is: ");
        if(avg>=80)
        {
            System.out.println("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.println("B");
        }
        else if(avg>=40 && avg<60)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("D");
        }
    }//end of the main
}//end of the class