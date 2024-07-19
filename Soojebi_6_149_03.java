public class Soojebi_6_149_03 {
        public static void main(String[] args) {
            int a = 26;
            int b = 91;
            int i = 0, g=0;

            int min = a<b? a:b;
            
            for(i=2; i<min; i++) {
                if(a % i ==0 && b % i ==0) {  // for문 돌려서 두수의 어떤 i로 나눈 나머지가 0으로 같다면 초대공약수
                    g =i;
                }
            }

    }
}
