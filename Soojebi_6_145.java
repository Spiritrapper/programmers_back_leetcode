public class Soojebi_6_145 {
    int a;
    public Soojebi_6_145(int A) {
        this.a = a;

    }
    int func() {
        int b =1;
        for (int i=1; i<a; i++){
            b =a* i +b;         
        }
        return a +b;
    }

    public static void main (String[] args){
        Soojebi_6_145 obj = new Soojebi_6_145(3);
        obj.a=5;
        int b = obj.func();
        System.out.println(obj.a +b);
    }
}


// 초기3에 큰 의미는 없다.
// obj.a 객체의 a 인스턴스값 초기화.