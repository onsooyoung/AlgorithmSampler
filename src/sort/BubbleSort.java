package sort;

import common.ArrUtil;

/**
 * Created by sooyoungon on 18/05/2019.
 */
public class BubbleSort implements Sorter{

    /**
     * Bubble Sort (assending)
     * @param sample array int
     */
    @Override
    public int[] sort(int[] sample){

        for(int round=0; round < sample.length; round++){

            for(int j=0; j < (sample.length-1) - round; j++){

                if(sample[j] > sample[j + 1]){
                    ArrUtil.swap(sample, j, j + 1);
                }
            }
        }

        return sample;
    }


}
