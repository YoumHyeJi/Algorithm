package com.yeomazing.algorithm.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Network {


    public int solution(int n, int[][] computers) {
        int answer = 0;

        int[] check = new int[n];

        Queue<Integer> queue = new LinkedList<Integer>();

        for (int node = 0; node < n; node++) {
            if (check[node] == 0) {
                answer += 1;
                queue.add(node);
                check[node] = 1;

                while (!queue.isEmpty()) {
                    int current = queue.remove();

                    for (int i = 0; i < n; i++) {
                        if (computers[current][i] == 1 && check[i] == 0) {
                            queue.add(i);
                            check[i] = 1;
                        }
                    }

                }
            }

        }
        return answer;
    }
}
