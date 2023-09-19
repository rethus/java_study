package com.ecnu.demo;

/**
 * 这是一个数组工具类
 * @author ssquirrel
 * @version 1.0
 */
public class ArrayUtil {
    /**
     * 获取数组中最大值
     * @param arr 数组，表示要求这个数组的最大值
     * @return 返回数组中的最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; ++ i)
            if(arr[i] > max) max = arr[i];
        return max;
    }
}
