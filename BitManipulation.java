public class BitManipulation {
    public static void getBit(int n,int pos){
        int bitMask = 1<<pos;
        if((n & bitMask) == 0){
            System.out.println("bit was zero.");
        }else{
            System.out.println("bit was one.");
        }
    }

    public static int setBit(int n,int pos){
        int bitMask = 1<<pos;
        return bitMask | n;
    }

    public static int clearBit(int n,int pos){
        int bitMask = 1<<pos;
        return (~(bitMask)) & n;
    }

    public static int updateBit(int n,int pos,int bit){
        if(bit==1)
            return setBit(n, pos);
        if(bit==0)
            return clearBit(n, pos);
        else
            return -1;
    }

    public static void decimalToBinary(int n){
        int bi[]=new int[32];
        int i=0;
        while(n>0){
            bi[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(bi[j]);
        }
    }

    public static int binaryToDecimal(int n){
        int temp = n;
        int dec_val=0;
        int base=1;
        while(temp!=0){
            dec_val += base*(temp%10);
            temp=temp/10;
            base=base*2;
        }
        return dec_val;
    }



    public static void main(String[] args) {
        int n = 5;
        decimalToBinary(n);
        System.out.println("");
        System.out.println(binaryToDecimal(101));
    }
}
