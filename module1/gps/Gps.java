package module1.gps;

public class Gps {
    /*
    The car travels at 60mph continuously, so 1 mile per minute
    The car drives in each direction for 5 minutes at a time, or for 5 miles
    Each turn the car with drive 5 miles in whatever direction it is headed in

                NORTH (+5 y)
    WEST (-5 x)             EAST (+5 x)
                SOUTH (-5 y)
    
    1. NORTH
    2. WEST
    3. SOUTH
    4. EAST
    */
    int turns = 12; // Driving for 60 minutes (1 hour) and turning every 5 minutes.
    String direction;
    
    int startingX = 0;
    int startingY = 0;
    int endingX = 0;
    int endingY = 0;
    double distance;

    void getDirection() {
        int randInt = (int)Math.floor(Math.random() * (5-1) + 1);
        
        if (randInt == 1) {
            direction = "N";
        } else if (randInt == 2) {
            direction = "E";
        } else if (randInt == 3) {
            direction = "S";
        } else if (randInt == 4) {
            direction = "W";
        }
    }

    void calculateDistance() {
        distance = Math.sqrt(Math.pow((endingX - startingX), 2) + Math.pow((endingY - startingY), 2));
    }

    void driveCar() {
        while (turns > 0) {
            getDirection();

            if (direction == "N") {
                endingY = endingY + 5;
                turns = turns - 1;
            } else if (direction == "E") {
                endingX = endingX + 5;
                turns = turns - 1;
            } else if (direction == "S") {
                endingY = endingY - 5;
                turns = turns - 1;
            } else if (direction == "W") {
                endingX = endingX - 5;
                turns = turns - 1;
            }
        }

        calculateDistance();

        System.out.println(String.format("The car started at (0, 0) and ending at (%s, %s) and traveled %s miles", endingX, endingY, distance));
    }
}
