import java.util.Scanner;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    Scanner scanner = new Scanner(System.in);
    
    int counter = scanner.nextInt();
    int[] numbers = new int[counter];
    for (int i = 0; i < counter; i++) 
    {
      numbers[i] = scanner.nextInt();
    }

    int maxcount = 0;
    int mode = 0;

    for (int i = 0; i < numbers.length; i++) 
    {
      int count = 0;
      for (int j = 0; j < numbers.length; j++) 
      {
        if (numbers[j] == numbers[i]) 
        {
          count++;
        }
      }
      if (count > maxcount) 
      {
        maxcount = count;
        mode = numbers[i];
      }
    }
    System.out.println(mode);
  }
}

