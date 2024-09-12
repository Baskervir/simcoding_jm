package com.simcoding.tdd;

import java.util.Arrays;
import java.util.List;

public class Sort {

    public static void main(String[] args) {
         //3 123 23 43 545 6929
        List<Integer> list = Arrays.asList(3, 123, 23, 43, 545, 6929);
        System.out.println(Sort.search(list, 5423));

    }

    /**
     * @return 배열에 값이 존재할 경우, true를 반환한다.
     * **/
    static public boolean search(List<Integer> list, int target){

        list.sort(null);

        int left = 0;
        int right = list.size()-1;

        while(left < right){

            int middleIdx = (left + right)/2;
            if(list.get(middleIdx) == target) return true;
            if(middleIdx < target){
                left = middleIdx;
            }else{
                right = middleIdx;
            }

        }

        return false;
    }
}
