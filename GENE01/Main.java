import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char color1 = sc.next().charAt(0);
    char color2 = sc.next().charAt(0);

    System.out.println(solve(color1, color2));

    sc.close();
  }

  static char solve(char color1, char color2) {
    if (color1 == 'R' || color2 == 'R') {
      return 'R';
    } else if (color1 == 'B' || color2 == 'B') {
      return 'B';
    }

    return 'G';
  }
}