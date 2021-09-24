package Mathmatics;

/**
 * 已有方法 rand7 可生成 1 到 7 范围内的均匀随机整数，
 * 试写一个方法 rand10 生成 1 到 10 范围内的均匀随机整数。
 * <p>
 * 不要使用系统的 Math.random() 方法。
 */
public class rand10 {
    public int rand10() {
        int col = rand7();
        int row = rand7();
        int index = col + (row - 1) * 7;
        if (index > 40) {
            return rand10();
        } else {
            return (index + 3) / 4;
        }
    }

    private int rand7() {
        return 0;
    }
}
