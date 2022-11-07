package hospital;

public class Patient {
    private int healthLevel;
    private int bloodLevel;

    // default constructor
    public Patient(){
        healthLevel = 10; // default patient health level
        bloodLevel = 20;
    }
    public int getHealthLevel() {
        return healthLevel;
    }

    public void increaseHealthLevel(int healthIncreaseAmount) {
        healthLevel += healthIncreaseAmount;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    public void decreaseBloodLevel(int bloodDecreaseAmount) {
        bloodLevel -= bloodDecreaseAmount;
    }
}
