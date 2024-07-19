public class Soojebi_6_149_04 {
        public static void main(String[] args) {
            int []a = new int[8];
            int i =0;
            int n = 11;
            while(n>0) {        // 2진법변환하는 공식 배열순이 첫자리부터이기에 정렬할때 거꾸로 정렬해야한다.
                a[i++] = n%2;
                n/=2;
            }

            for(i=7; i>=0; i--) { // 8자리 정렬 거꾸로 하기
                System.out.println(a[i]);
            }

    }
}
