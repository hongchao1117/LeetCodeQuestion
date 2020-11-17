package Graphic;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * dfs：原理是通过dfs判断图中是否存在环
 *
 * 借助一个标志列表 flags，用于判断每个节点 i （课程）的状态：
 * 未被 DFS 访问：i == 0；
 * 已被其他节点启动的 DFS 访问：i == -1；
 * 已被当前节点启动的 DFS 访问：i == 1。
 * 对 numCourses 个节点依次执行 DFS，判断每个节点起步 DFS 是否存在环，若存在环直接返回 FalseFalse。DFS 流程；
 * 终止条件：
 * 当 flag[i] == -1，说明当前访问节点已被其他节点启动的 DFS 访问，无需再重复搜索，直接返回 TrueTrue。
 * 当 flag[i] == 1，说明在本轮 DFS 搜索中节点 i 被第 22 次访问，即 课程安排图有环 ，直接返回 FalseFalse。
 * 将当前访问节点 i 对应 flag[i] 置 11，即标记其被本轮 DFS 访问过；
 * 递归访问当前节点 i 的所有邻接节点 j，当发现环直接返回 FalseFalse；
 * 当前节点所有邻接节点已被遍历，并没有发现环，则将当前节点 flag 置为 -1−1 并返回 TrueTrue。
 * 若整个图 DFS 结束并未发现环，返回 TrueTrue。
 *
 */
public class canFinish {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            lists.add(new ArrayList<>());
        }
        int[] flags = new int[numCourses];
        for(int[] cp:prerequisites){
            lists.get(cp[1]).add(cp[0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (dfs(lists,flags,i)){
                return false;
            }
        }
        return true;
    }

    private boolean dfs(List<List<Integer>> lists, int[] flags, int i) {
        if (flags[i]==1) return false;
        if (flags[i]==-1) return true;
        flags[i] = 1;
        for(Integer j:lists.get(i)){
            if (dfs(lists,flags,j))
                return false;
        }
        flags[i] = -1;
        return false;
    }
}
