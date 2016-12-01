/**
 * Created by eishkinina on 25.07.16.
 */
public class Coworker {
    private String nameOfCoworker;
    private String surnameOfCoworker;
    protected int coworkerID;

    public String getNameOfCoworker() {
        return nameOfCoworker;
    }

    public String getSurnameOfCoworker() {
        return surnameOfCoworker;
    }

    public int getCoworkerID() {
        return coworkerID;
    }

    public void setNameOfCoworker(String nameOfCoworker) {
        this.nameOfCoworker = nameOfCoworker;
    }

    public void setSurnameOfCoworker(String surnameOfCoworker) {
        this.surnameOfCoworker = surnameOfCoworker;
    }

    public void setCoworkerID(int coworkerID) {
        this.coworkerID = coworkerID;
    }

    public Coworker(int coworkerID, String surnameOfCoworker, String nameOfCoworker) {
        this.coworkerID = coworkerID;
        this.surnameOfCoworker = surnameOfCoworker;
        this.nameOfCoworker = nameOfCoworker;
    }

    public Coworker(int coworkerID, String surnameOfCoworker) {
        this.coworkerID = coworkerID;
        this.surnameOfCoworker = surnameOfCoworker;
    }


}
