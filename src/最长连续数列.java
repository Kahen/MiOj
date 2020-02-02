/**
* 已引入：
* java.util.*
* 要使用其他 jar 包请使用完整路径，如：
* java.util.List<java.util.List<Integer>> list = new java.util.ArrayList<java.util.List<Integer>>(100);
* @param  line 为单行测试数据
* @return 处理后的结果
*/
private static String solution(String line) {
    // please write your code here
     String[] s = line.split(",");
        int [] a = new int[s.length];
        for (int i =0;i<s.length;i++){
            a[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(a);
        int count=1,max=1;
        for(int i=0;i<a.length-1;i++) {
            if (a[i + 1] - a[i] == 1) {
                count++;
            }else{
                count=1;
            }
           max=max>count?max:count;
        }
        return String.valueOf(max);

    // return ans;
}
