package leetcode.difficulty.easy.problem_705;

public class Solution_705 {
    boolean[] keys;

    public Solution_705() {

        keys = new boolean[1000001];
    }

    public void add(int key) {

        keys[key] = true;
    }

    public void remove(int key) {

        keys[key] = false;
    }

    public boolean contains(int key) {

        return keys[key];
    }
}
