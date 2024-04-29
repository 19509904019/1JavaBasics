/**
 * ClassName:PrintPrimeNumber
 * Description:打印100以内的质数:2 3 5 7 11 13 17...  只能被 1 和自身整除
 *
 * @Author ZY
 * @Create 2023/3/30 13:19
 * @Version 1.0
 */
public class PrintPrimeNumber {

    public static void main(String[] args) {
        //第一种方法
        long start = System.currentTimeMillis();
        for(int i  = 2; i <= 100; i++){  //遍历100以内的自然数
            boolean flag = true;
            for(int j = i - 1; j >= 2; j--){
                if (i % j == 0) {  //条件判断
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(i + "\t");
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        //第二种方法
        long start1 = System.currentTimeMillis();
        flag:for(int i  = 2; i <= 100; i++){  //遍历100以内的自然数
                for(int j = 2; j < i; j++){
                    if(i % j == 0) continue flag;
                }
                System.out.print(i + "\t");
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);

        //第三种方法
        long start2 = System.currentTimeMillis();
        flag:for(int i  = 2; i <= 100; i++){  //遍历100以内的自然数
            for(int j = 2; j <= Math.sqrt(i); j++){  // 开根号时注意等号
                if(i % j == 0) continue flag;
            }
            System.out.print(i + "\t");
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
    }
}

