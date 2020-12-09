public class SieveOfErastothenes1 {
    // Determining prime numbers in a given consecutive list
    public static boolean [] primeNumbers;

    // create a boolean array and initialize all entries to it as true;
    public static boolean [] fillArray(int n){
        primeNumbers = new boolean[n+1];
        for(int a=0; a<n; a++){
            primeNumbers[a] = true;
        }
        return primeNumbers;

    }
    // a valie in the array will eventually be false if it not a prime, else true;
    public static boolean [] checkForNonPrimes(boolean[]n){
        for(int i=2; i*i<n.length;i++ ){
            if(primeNumbers[i]==true) // if primeNumbers[i] is not changed, then it is prime

            for(int j=i*i; j <n.length; j+=i){// update all multiples of i;

                    primeNumbers[j] = false;
            }
        }
        return primeNumbers;
    }
    // if an index is true then it is a prime number, print it out.
    public static void printPrime(){
        for (int i=2; i<primeNumbers.length; i++){
            if(primeNumbers[i] == true)
                System.out.println(i);
        }
    }
    public static void main(String [] args){
            checkForNonPrimes(fillArray(40));
            printPrime();

    }
}
