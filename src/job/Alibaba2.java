package job;

import java.util.*;

/**
 * 问题：
 * 快递员小王每天早晨7点从快递网点收拾包裹出发前往各个小区派件，11点前需要回到网点做上午的盘点。已知每个小区之间快递员需要骑行的时间，以及每个小区需要派送的包裹量。我们约定1.小王每天上午只派件一次，2.快递车容量无限制，3.因为小区之间有河相隔，所以并不是所有小区互通。规划出能使小王一次派件量最大的派件路线 。
 * 输入:
 * 输入数据包含多行
 * 第一行: 一个整数N，表示有N各小区；
 * 接下来N行，每行一个整数m，表示每个小区的包裹数；
 * 接下来是一个P*Q的二维数组，表示小区之间的通路；其中：
 * 第N+2行：表示小区与小区之间的线路条数P，即二维数组的行数；
 * 第N+3行：表示二维数组的列数Q；
 * 接下来P行: 每一行是一条线路 包含3个整数，以空格分隔。意义是：
 * 整数x 整数y 整数z（第x个小区到第y个小区有通路，快递员骑行时间为z）
 * 输出:
 * 能够派送的最多的包裹量
 * 输入范例:
 * 6
 * 35
 * 20
 * 15
 * 20
 * 28
 * 18
 * 7
 * 3
 * 0 1 20
 * 0 2 25
 * 1 3 30
 * 2 3 35
 * 2 4 50
 * 3 5 100
 * 4 5 50
 * 输出范例:
 * 80
 */
public class Alibaba2 {
    static int main(int[] value, int[][] distance) {
        int placeNum = value.length;
        boolean[] mark = new boolean[placeNum];
        int maxWay = 0;
        for (int i = 0; i < placeNum; i++) {
            List<Integer> places = new ArrayList<>(placeNum);
            Queue<Integer> queue = new ArrayDeque<>(placeNum);
            queue.add(i);
            while (!queue.isEmpty()) {

            }
        }
        return maxWay;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _value_size = 0;
        _value_size = Integer.parseInt(in.nextLine().trim());
        int[] _value = new int[_value_size];
        int _value_item;
        for (int _value_i = 0; _value_i < _value_size; _value_i++) {
            _value_item = Integer.parseInt(in.nextLine().trim());
            _value[_value_i] = _value_item;
        }

        int _distance_rows = 0;
        int _distance_cols = 0;
        _distance_rows = Integer.parseInt(in.nextLine().trim());
        _distance_cols = Integer.parseInt(in.nextLine().trim());

        int[][] _distance = new int[_distance_rows][_distance_cols];
        for (int _distance_i = 0; _distance_i < _distance_rows; _distance_i++) {
            for (int _distance_j = 0; _distance_j < _distance_cols; _distance_j++) {
                _distance[_distance_i][_distance_j] = in.nextInt();

            }
        }

        if (in.hasNextLine()) {
            in.nextLine();
        }

        res = main(_value, _distance);
        System.out.println(String.valueOf(res));

    }


}
