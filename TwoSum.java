class TwoSum {
    public int[] twoSum(int[] nums, int target) {
   HashMap<Integer,Integer> map=new HashMap<>();
   for(int i=0;i<nums.length;i++){
     int more=target-nums[i];
      if(!map.containsKey(more)){
       map.put(nums[i], i);
        }
    if(map.containsKey(more)){
    return new int[]{map.get(more), i};
     }
    map.put(nums[i], i);
   }

    return new int[]{-1, -1}; 
        
    }
}
