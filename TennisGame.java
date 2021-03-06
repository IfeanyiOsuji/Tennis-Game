public class TennisGame {
    /* Calculating the  maximum numbber of tennis games that can be played at once given a number of playres
    and courts available
    * */
    static int noOfGamesToBePlayedAtOnce =0;
    public static int gameCount(int noOfPersons, int noOfCourts){

        if(noOfPersons < 2 || noOfCourts == 0){
            return noOfGamesToBePlayedAtOnce;
        }
        else {
            noOfGamesToBePlayedAtOnce++;
           return gameCount(noOfPersons - 2, noOfCourts - 1);
        }
    }

    public static void main(String[]args){
            System.out.print("Number of games to be played simultaneously =  " +gameCount(31,20));
    }
}
