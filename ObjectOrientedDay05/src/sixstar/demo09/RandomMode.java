package sixstar.demo09;

import sixstar.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    /*
    随机分配 有可能多 有可能少 10
    最少1分钱 最多不超过 剩下金额的2倍
    第一次发红包，随机范围0.01元——6.66
    第一次发文之后，剩下至少3.34
    此时还有两个红包
    范围是0.01-3.34 取不到右边剩下0.01

    //总结 公式 1 + random.nextInt(totalMoney / totalCount * 2)
     */
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();

        int leftMoney = totalMoney;
        int leftCount = totalCount;

        for (int i = 0; i < totalCount - 1; i++) {
            int money = r.nextInt(totalMoney / totalCount * 2) + 1;
            list.add(money);//将一个随机数放入到集合里面
            leftMoney -= money;//剩下的金额越发越少
            leftCount--;
        }

        list.add(leftMoney);

        return list;
    }
}
