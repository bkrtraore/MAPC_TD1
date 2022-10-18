package td1.original.api.general;

public enum MeatType {
    BEEF, WHITEFISH;

    public double price() {
        double rtr;
        switch (this) {
            case WHITEFISH:
                rtr = 6;
                break;
            case BEEF:
            default:
                rtr = 4;
        }
        return rtr;
    }

    public double calories_per_100g(){
        if (this.equals(BEEF))
            return 200;
        else if (this.equals(WHITEFISH)) {
            return 170;
        }
        return 0;
    }
}
