public class Soojebi_6_146_23 {
        public static void main(String[] args) {
            int x =1; // 초기값
            int tX=0, t_X=0; // 초기값  

            tX = (x>0)?x:-x; // 삼항식 ?조건이 참이면 x 아니면 -x
            if(x>0){
                t_X = x;
            }
            else {
                t_X = -x;
            }

            System.out.println(tX + "" + t_X);

    }
}
