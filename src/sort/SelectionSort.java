package sort;

import common.ArrUtil;

/**
 * Created by sooyoungon on 18/05/2019.
 */
public class SelectionSort implements Sorter{

    /**
     * Selection Sort (assending)
     * @param sample array int
     * @return
     */
    @Override
    public int[] sort(int[] sample){

        for(int round=0; round < (sample.length-1); round++){
            int minIdx = round;
            for(int j=round+1; j < sample.length; j++){

                //전체배열중 첫번째 요소와 그 다음 요소를 비교(단, 전체배열은 Round를 돌때마다 1씩 줄어들게 됨)
                if(sample[minIdx] > sample[j]){
                    ArrUtil.swap(sample, minIdx, j);
                }
            }
        }

        return sample;
    }

}
