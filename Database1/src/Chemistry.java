public class Chemistry implements Courses{

    private String NAME;
    private int PRICE;

    public Chemistry(String NAME, int PRICE) {
        this.NAME = NAME;
        this.PRICE = PRICE;
    }

    @Override
    public void printInfo() {
        System.out.println("- Course Info -");
        System.out.println("Name: " + getNAME());
        System.out.println("Price: " + getPRICE());
        System.out.println();
    }


    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getPRICE() {
        return PRICE;
    }

    public void setPRICE(int PRICE) {
        this.PRICE = PRICE;
    }
}
