#!/usr/bin/env python3


def solve(A, B):
    return A if B == 0 else solve(B, A % B)


def main():
    T = int(input())
    for _ in range(T):
        A, B = map(int, input().split())

        print(solve(A, B))


if __name__ == '__main__':
    main()
