package leetecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @version 1.0.0
 * @ClassName CombinationSum
 * @description: 39. 组合总和
 * @author: zzh
 * @create: 2021年09月10日 22:36:00
 **/
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backTrace(candidates,target,res,0,new ArrayList<Integer>());
        return res;

    }

    private void backTrace(int[] candidates, int target, List<List<Integer>> res, int i, ArrayList<Integer> list) {
        if (target<0)
            return;
        if (target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int start = i; start < candidates.length; start++) {
            if (target<0)break;
            list.add(candidates[start]);
            backTrace(candidates,target-candidates[start],res,start,list);
            list.remove(list.size()-1);
        }

    }
}
