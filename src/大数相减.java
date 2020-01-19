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
        String[] s = line.split("-");
        char [] a = new StringBuilder(s[0]).reverse().toString().toCharArray();
        char [] b = new StringBuilder(s[1]).reverse().toString().toCharArray();
        int [] minus = new int[a.length];
        for(int i =0;i<a.length;i++){
            int A = a[i]-'0';
            int B;
            if(i<b.length){
                B=b[i]-'0';
            }else{
                B=0;
            }
            minus[i] = A-B;
        }
        StringBuilder re = new StringBuilder();
        for (int i =0;i<minus.length;i++){
            if (minus[i]<0){
                minus[i+1]--;
                minus[i]+=10;
            }
            re.append(minus[i]);
        }

      return re.reverse().toString().replaceAll("^(0+)","");

}
