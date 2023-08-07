public class sub_2_cse_02 {
    public static void main(String[] args){
        Ranji R = new Ranji(80,2300,56);
        System.out.println("Run Rate: " + R.runRate());
    }
}
class Ranji{
    int matches, runs, overs;
    Ranji(int matches, int runs, int overs){
        this.matches = matches;
        this.runs = runs;
        this.overs = overs;
    }
    int runRate(){
        StateLevel S = new StateLevel(20,3400,12);
        int r = (runs + S.runs)/(overs + S.overs);
        return r;
    }
}
class StateLevel{
    int matches, runs, overs;
    StateLevel(int matches, int runs, int overs){
        this.matches = matches;
        this.runs = runs;
        this.overs = overs;
    }
}