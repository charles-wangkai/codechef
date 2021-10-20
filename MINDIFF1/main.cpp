#include <stdio.h>
#include <algorithm>
#include <set>
#include <unordered_map>
#include <vector>

void solve(int N, std::vector<int> &X, std::vector<int> &Y)
{
  std::vector<std::unordered_map<int, int>> adjMaps;
  for (int i = 0; i < N; ++i)
  {
    std::unordered_map<int, int> adjMap;
    adjMaps.push_back(adjMap);
  }
  std::vector<int> degrees(N);
  for (int i = 0; i < X.size(); ++i)
  {
    if (adjMaps[X[i]].find(Y[i]) == adjMaps[X[i]].end())
    {
      adjMaps[X[i]][Y[i]] = 1;
    }
    else
    {
      ++adjMaps[X[i]][Y[i]];
    }

    if (adjMaps[Y[i]].find(X[i]) == adjMaps[Y[i]].end())
    {
      adjMaps[Y[i]][X[i]] = 1;
    }
    else
    {
      ++adjMaps[Y[i]][X[i]];
    }

    ++degrees[X[i]];
    ++degrees[Y[i]];
  }

  auto cmp = [&](int a, int b)
  { return (degrees[a] != degrees[b]) ? (degrees[a] < degrees[b]) : (a < b); };
  std::set<int, decltype(cmp)> vertices(cmp);
  for (int i = 0; i < N; ++i)
  {
    vertices.insert(i);
  }

  int maxD = 0;
  std::vector<int> C(N);
  for (int i = N; i >= 1; --i)
  {
    int vertex = *vertices.begin();
    int minDegree = degrees[vertex];
    maxD = std::max(maxD, minDegree);
    C[vertex] = i;

    for (auto &p : adjMaps[vertex])
    {
      int adj = p.first;

      vertices.erase(vertices.find(adj));
      degrees[adj] -= p.second;
      vertices.insert(adj);

      adjMaps[adj].erase(adjMaps[adj].find(vertex));
    }

    vertices.erase(vertices.find(vertex));
  }

  printf("%d\n", maxD);
  for (int i = 0; i < C.size(); ++i)
  {
    if (i != 0)
    {
      printf(" ");
    }
    printf("%d", C[i]);
  }
  printf("\n");
}

int main()
{
  int T;
  scanf("%d", &T);
  for (int tc = 0; tc < T; ++tc)
  {
    int N;
    int M;
    scanf("%d%d", &N, &M);
    std::vector<int> X;
    std::vector<int> Y;
    for (int i = 0; i < M; ++i)
    {
      int Xi;
      int Yi;
      scanf("%d%d", &Xi, &Yi);
      X.push_back(Xi - 1);
      Y.push_back(Yi - 1);
    }

    solve(N, X, Y);
  }

  return 0;
}