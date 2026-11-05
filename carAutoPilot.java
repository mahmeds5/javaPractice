//Practice for Classes. 


public class carAutoPilot {
    public static class Car {

        int year;
        String make;
        String model;
        String trim;

        int topSpeed;
        int hp;
        int currentSpeed = 0;

        public static void fullSpeed(){
            System.out.println("Going Full Throttle.");
        }

        public void declareCar(int yearSet, String makeSet, String modelSet, String trimSet, int topSpeedSet, int hpSet){
            year = yearSet;
            make = makeSet;
            model = modelSet;
            trim = trimSet;
            topSpeed = topSpeedSet;
            hp = hpSet;

            System.out.println(year + make + model + trim + topSpeedSet + hp);

        }

        public void setSpeed(int n){
            if (speedRestriction(n,topSpeed)) {
                System.out.println("desired speed exceeds top speed");
            }
            else {
                System.out.println("Speed Set to " + n + "mph.");
                currentSpeed = n;
            }
        }

        public void turnRight(){
            if (speedRestriction(currentSpeed, 80)) {
                System.out.println("Speed to High! Decelerate First.");
            } else {
                System.out.println("Turning Right");
            }
        }

        public void turnLeft(){
            if (speedRestriction(currentSpeed, 80)) {
                System.out.println("Speed to High! Decelerate First.");
            } else {
                System.out.println("Turning Left!");
            }
        }

        public void decel(){
            if (currentSpeed != 0 ) {
                currentSpeed -= 10;
                System.out.println("Decelerating by 10, speed at " + currentSpeed);
            }
            if (currentSpeed == 0) System.out.println("Speed is 0.");
        }

        public void decel(int n){
            for (int i = 0; i < n; i++) decel();
        }



        public void accel(){
            if (currentSpeed == topSpeed) {
                System.out.println("At Top Speed of " + topSpeed);
            } else if (currentSpeed + 10 > topSpeed) {
                currentSpeed = topSpeed;
                System.out.println("Accelerated to Top Speed of " + topSpeed);
            } else {
                currentSpeed += 10;
                System.out.println("Accelerated to speed of " + currentSpeed);
            }

        }

        public void accel(int n){
            for (int i = 0; i < n; i++){
                accel();
            }
        }

        public boolean speedRestriction(int input, int threshold){
            return input > threshold;
        }

    }
    public static void main() {
        Car obj = new Car();
        obj.declareCar(2007,"Honda","CRV","1.4L VTEC", 110, 160);

        obj.accel(3);
        obj.accel(3);
        obj.turnRight();
        obj.decel(3);
        obj.turnRight();
        obj.turnRight();
        obj.turnLeft();

    }
}
