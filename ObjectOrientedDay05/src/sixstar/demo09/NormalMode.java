package sixstar.demo09;

import sixstar.red.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode {

    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        int avg = totalMoney / totalCount;//平均值
        int mod = totalMoney % totalCount;//余数

        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }

        list.add(avg + mod);


        return list;
    }
}
