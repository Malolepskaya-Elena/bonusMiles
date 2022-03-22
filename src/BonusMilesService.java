public class BonusMilesService {
    public int calculate(int cost) {
        int oneBonusMile = 20;
        int miles = cost / oneBonusMile;
        return miles;
    }

}
