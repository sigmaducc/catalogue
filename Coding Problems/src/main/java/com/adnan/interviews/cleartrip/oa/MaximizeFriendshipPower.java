package com.adnan.interviews.cleartrip.oa;

import java.util.*;

// DSU concept used

public class MaximizeFriendshipPower {
    public int maximizeFriendshipPower(int N, int M, int[][] roads, int[] A) {
        int[] parent = new int[N+1];
        int[] size = new int[N+1];

        for(int i = 0; i <= N; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        for(int[] road: roads) union(road[0], road[1], parent, size);

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= N; i++) {
            if(size[i] != 1)
                list.add(size[i]);
        }

        int[] setArr = new int[list.size()];
        for(int i = 0; i <= list.size() - 1; i++) setArr[i] = list.get(i);

        Arrays.sort(setArr);
        Arrays.sort(A);

        int ans = 0; int k = 0;
        int setSum = 0;
        for(int i = 0; i <= setArr.length - 1; i++) {
            setSum += setArr[i];
            int sum = 0;
            while(k <= setSum-1) sum += A[k++];
            ans += (sum*(sum-1))/2;
        }

        return ans;
    }

    private int find(int x, int[] parent) {
        if(x == parent[x])
            return x;

        parent[x] = find(parent[x], parent);
        return parent[x];
    }

    private void union(int u, int v, int[] parent, int[] size) {
        int u_parent = find(u, parent);
        int v_parent = find(v, parent);

        if(u_parent == v_parent) return;

        if(size[u_parent] >= size[v_parent]) {
            parent[v_parent] = u_parent;
            size[u_parent] += size[v_parent];
        } else if(size[u_parent] < size[v_parent]) {
            parent[u_parent] = v_parent;
            size[v_parent] += size[u_parent];
        }
    }
}