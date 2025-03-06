import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
    System.out.println(sumOfDiag(matrix));
    System.out.println(productTable(6,5));
  }

  public static int sumOfDiag(int[][] matrix)
  {
    int sum = 0; 
    for (int r = 0; r < matrix.length; r++)
    {
      for (int c =0; c < matrix[r].length; c++)
      {
        if (r == c)
        {
          sum += matrix[r][c];
        }
      }
    }
    return sum;
  }

   public static int[][] productTable(final int numRows, final int numCols)
  {
    int [][] table = new int[numRows][numCols];
    for (int r = 0; r < numRows; r++)
    {
      for (int c = 0; c < numCols; c++)
      {
        table[r][c] = r*c;
      }
    }
    return table;
  }
}
