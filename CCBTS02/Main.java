import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int n = sc.nextInt();
      String[] commands = new String[n];
      for (int i = 0; i < commands.length; ++i) {
        commands[i] = sc.next();
      }

      System.out.println(solve(commands));
    }

    sc.close();
  }

  static String solve(String[] commands) {
    boolean started = false;
    for (String command : commands) {
      if (command.equals("stop")) {
        if (started) {
          started = false;
        } else {
          return "404";
        }
      } else {
        started = true;
      }
    }

    return "200";
  }
}
