public class Fatorial {

    public int fatorial(int num){
        if(num == 0){
            return 1;
        }
        if (num<0){
            return -1;
        }
        for (int i = num-1; i > 0; i--) {
            num *= i;
        }
        return num;
    }

    public int fatorialRecursiva(int num){
        if (num<0){
            return -1;
        }
        if(num == 0){
            return 1;
        }
        return num * fatorialRecursiva(num-1);
    }
}
