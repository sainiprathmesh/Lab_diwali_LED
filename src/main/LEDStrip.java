package main;

public class LEDStrip {
    private LED[] LEDArray;
    private int lengthOfStrip;

    /*public void setLEDValues(int indexOfArray , String colourOFLED , boolean isLEDWorking) {
        LEDArray[indexOfArray].setColourName(colourOFLED);
        LEDArray[indexOfArray].setWorking(isLEDWorking);
    }*/

    public LEDStrip(int lengthOfStrip) {
        this.LEDArray = new LED[lengthOfStrip];
    }

    public LED[] getLEDArray() {
        return LEDArray;
    }

    public void setLEDArray(LED[] LEDArray) {
        this.LEDArray = LEDArray;
    }

    private int getLengthOfStrip() {
        return lengthOfStrip;
    }

    private int numberOfDefectiveLED() {
        int count = 0;
        for (LED led : LEDArray) {
            if (!led.isWorking()) {
                count++;
            }
        }
        return count;
    }

    private boolean isStripDefective() {
        return numberOfDefectiveLED() > (getLengthOfStrip() / 2);
    }

    public void showStripStatus() {
        System.out.println(isStripDefective()
                ? "This strip is defective!"
                : "This strip is not defective!");
    }
}
