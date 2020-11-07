import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws Throwable {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder output = new StringBuilder();
    int t = Integer.parseInt(br.readLine());
    for (int tc = 0; tc < t; ++tc) {
      String K = br.readLine();

      output.append(solve(K)).append("\n");
    }

    System.out.print(output);
  }

  static String solve(String K) {
    if (K.chars().allMatch(ch -> ch == '9')) {
      char[] result = new char[K.length() + 1];
      Arrays.fill(result, '0');
      result[0] = '1';
      result[result.length - 1] = '1';

      return new String(result);
    }

    char[] result = K.toCharArray();
    int middleIndex = (K.length() - 1) / 2;
    while (true) {
      for (int i = middleIndex + 1; i < result.length; ++i) {
        result[i] = result[result.length - 1 - i];
      }

      if (new String(result).compareTo(K) > 0) {
        return new String(result);
      }

      int carry = 1;
      for (int index = middleIndex; carry != 0; --index) {
        if (result[index] == '9') {
          result[index] = '0';
          carry = 1;
        } else {
          ++result[index];
          carry = 0;
        }
      }
    }
  }
}
