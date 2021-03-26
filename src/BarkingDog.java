public class BarkingDog {

    public static void main(String[] args) {
        shouldWakeUp(true, 22);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        boolean isBarking;

        if (barking) {
            if (hourOfDay < 8 && hourOfDay > 0) {
                barking = true;
            } else if ((hourOfDay > 22) && (hourOfDay <= 23)) {
                barking = true;
            } else if (hourOfDay < 0) {
                barking = false;
            } else if (hourOfDay > 23) {
                barking = false;
            }
            else if (hourOfDay==8){
                barking=false;
            }
            else if (hourOfDay==22){
                barking=false;
            }
        }
            else if (!barking) {
                barking = false;
            }
            System.out.println(barking);
            return barking;
        }
    }

