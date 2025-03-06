import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[][] matrix = { {1,2,3}, {4,5,6}, {7,8,9} };
    sumofDiag(matrix);
  }


  public static int sumOfDiag(int[][] matrix)
  {
    int sum = 0; 
    for (int r = 0; r < matrix.length; r++)
    {
      sum += matrix[r][r];
    }
    return sum;
  }

  public static int[][] productTable(final int numRows, final int numCols)
  {
    
  }
}
