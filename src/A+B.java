/**
* 已引入：
* java.util.*
* 要使用其他 jar 包请使用完整路径，如：
* java.util.List<java.util.List<Integer>> list = new java.util.ArrayList<java.util.List<Integer>>(100);
* @param  line 为单行测试数据
* @return 处理后的结果
*/
private static String solution(String line) {
 String[] array = line.split(" ");
	    long count = 0;
	    for (int i = 0; i < array.length; i++) {
	        long a = Long.parseLong(array[i]);
	        count = count + a;
	    }
	    String result = Long.toString(count);
	    // return ans;
	    return result;
}
