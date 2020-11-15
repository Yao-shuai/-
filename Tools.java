package NoFour;

public class Tools {
    public static void main(String[] args) {
        Tool couple = new Tool();
        couple.Count(5);
        couple.getCount();
        couple.fb(6);
        couple.getFb();
    }
}
class Tool{
    private int n;
    private int x = 1;
    private int y = 1;
    private int z = 0;
    private int fb ;
    private int count = 1;
    public Tool(){
    }

    public void Count(double number){
        for( int i = 1;i <= number;i++){
    this.count =  this.count * i;
    }
    }
    public void fb(int n){
        this.n = n;
        for(int i = 3;i <= this.n;i++){
          this.z = this.x + this.y;
           this.y = this.x;
           this.x = this.z;
        }

    }
    public double getCount(){
        System.out.println("你记到了："+this.count);
        return this.count;
    }
    public double getFb(){
        if(this.n == 1){
            System.out.println("斐波那契数列第"+this.n+"项为："+1);
        }else if(this.n ==2){
            System.out.println("斐波那契数列第"+this.n+"项为："+1);
        }else if(this.n == 3){
            System.out.println("斐波那契数列第"+this.n+"项为："+2);
        }else{
            System.out.println("斐波那契数列第"+this.n+"项为："+this.z);
        }

        return this.fb;
    }
}