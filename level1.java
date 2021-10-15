public class level1 {
    public static void main(String[] args) {
        /* a代表平时成绩 b代表期中成绩 c代表期末成绩 */
        int a = 95;
        int b = 90;
        int c = 89;
        double d = a * 0.2 + b * 0.3 + c * 0.5;
        System.out.println("最终成绩" + d);
        if (d > 60) ;
        {
            System.out.println("就这？还没我卷");
        }
        if (d < 60) {
            System.out.println("勇敢俊枭，不怕困难！");
        }
    }

}