package sort;

import common.ArrUtil;

/**
 * Created by sooyoungon on 18/05/2019.
 */
public class InsertionSort implements Sorter {

    /**
     * Insertion Sort (assending)
     * @param sample array int
     * @return
     */
    @Override
    public int[] sort(int[] sample) {

        for(int round = 1; round < sample.length;round++){
            int key = sample[round];
            int j = round - 1;

            while ( j > 0 && sample[j] > key){
                sample[j+1] = sample[j];
                j = j -1;
            }
            sample[j+1] = key;
        }

        return sample;
    }
}
