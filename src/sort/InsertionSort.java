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

        for(int round = 1; round< sample.length;round++){

            int tmp = sample[round];//좌측0번째는 기준요소로 선정함(1번째부터 시작)

            int j = 0;
            for(j=round-1; j >= 0; j--){

                if(tmp < sample[j]){//정렬대상 요소가 작다면 각 라운드의 요소를 우측으로 밀어낸다
                    sample[j+1] = sample[j];
                }
            }
            sample[j+1] = tmp;//0번째 부터 정렬대상 요소를 넣는다 0,1,2,3,5 ...
        }

        return sample;
    }
}
