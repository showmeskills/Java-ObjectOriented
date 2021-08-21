package sixstar.red;

import java.util.ArrayList;

public interface OpenMode {

    /*
    * @param totalMoney the unit is cent
    * @param totalCount number of red packets
    * @return ArrayList<Integer>
    * */
    ArrayList<Integer> divide(int totalMoney, int totalCount);
}
