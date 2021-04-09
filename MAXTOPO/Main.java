// https://discuss.codechef.com/t/maxtopo-editorial/86587
// https://codeforces.com/blog/entry/57593

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  static final int MODULUS = 1_000_000_007;
  static final int LIMIT = 500000;

  static int[] factorials;
  static int[] factorialInvs;

  public static void main(String[] args) {
    buildFactorialsAndInvs();

    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 1; tc <= T; ++tc) {
      int N = sc.nextInt();
      int K = sc.nextInt();
      int[] u = new int[N - 1];
      int[] v = new int[N - 1];
      for (int i = 0; i < N - 1; ++i) {
        u[i] = sc.nextInt() - 1;
        v[i] = sc.nextInt() - 1;
      }

      System.out.println(solve(u, v, K));
    }

    sc.close();
  }

  static void buildFactorialsAndInvs() {
    factorials = new int[LIMIT + 1];
    factorials[0] = 1;
    for (int i = 1; i < factorials.length; ++i) {
      factorials[i] = multiplyMod(factorials[i - 1], i);
    }

    factorialInvs =
        Arrays.stream(factorials)
            .map(x -> BigInteger.valueOf(x).modInverse(BigInteger.valueOf(MODULUS)).intValue())
            .toArray();
  }

  static int multiplyMod(int x, int y) {
    return (int) ((long) x * y % MODULUS);
  }

  static String solve(int[] u, int[] v, int K) {
    int N = u.length + 1;

    @SuppressWarnings("unchecked")
    List<Integer>[] adjLists = new List[N];
    for (int i = 0; i < adjLists.length; ++i) {
      adjLists[i] = new ArrayList<>();
    }
    for (int i = 0; i < u.length; ++i) {
      adjLists[u[i]].add(v[i]);
      adjLists[v[i]].add(u[i]);
    }

    List<Integer> centroids = findCentroids(adjLists);
    int largestNode = centroids.stream().mapToInt(x -> x).max().getAsInt();

    int node;
    if (K == 1) {
      node = largestNode;
    } else if (centroids.size() == 2) {
      node = centroids.stream().filter(centroid -> centroid != largestNode).findAny().get();
    } else {
      int[] subTreeSizes = new int[N];
      dfs2(new int[N], subTreeSizes, adjLists, largestNode, -1);

      node =
          IntStream.range(0, N)
              .filter(i -> i != largestNode)
              .boxed()
              .max(Comparator.comparing((Integer i) -> subTreeSizes[i]).thenComparing(i -> i))
              .get();
    }

    return String.format("%d %d", node + 1, computeTopoSortNum(adjLists, node));
  }

  static List<Integer> findCentroids(List<Integer>[] adjLists) {
    List<Integer> centroids = new ArrayList<>();
    dfs1(centroids, adjLists, new int[adjLists.length], 0, -1);

    return centroids;
  }

  static void dfs1(
      List<Integer> centroids, List<Integer>[] adjLists, int[] sizes, int node, int prev) {
    int N = adjLists.length;

    boolean isCentroid = true;
    sizes[node] = 1;
    for (int adj : adjLists[node]) {
      if (adj != prev) {
        dfs1(centroids, adjLists, sizes, adj, node);
        sizes[node] += sizes[adj];

        if (sizes[adj] > N / 2) {
          isCentroid = false;
        }
      }
    }
    if (N - sizes[node] > N / 2) {
      isCentroid = false;
    }

    if (isCentroid) {
      centroids.add(node);
    }
  }

  static int computeTopoSortNum(List<Integer>[] adjLists, int root) {
    int N = adjLists.length;

    int[] topoSortNums = new int[N];
    dfs2(topoSortNums, new int[N], adjLists, root, -1);

    return topoSortNums[root];
  }

  static void dfs2(
      int[] topoSortNums, int[] subTreeSizes, List<Integer>[] adjLists, int node, int prev) {
    subTreeSizes[node] = 1;
    for (int adj : adjLists[node]) {
      if (adj != prev) {
        dfs2(topoSortNums, subTreeSizes, adjLists, adj, node);
        subTreeSizes[node] += subTreeSizes[adj];
      }
    }

    topoSortNums[node] = factorials[subTreeSizes[node] - 1];
    for (int adj : adjLists[node]) {
      if (adj != prev) {
        topoSortNums[node] =
            multiplyMod(
                topoSortNums[node],
                multiplyMod(topoSortNums[adj], factorialInvs[subTreeSizes[adj]]));
      }
    }
  }
}
