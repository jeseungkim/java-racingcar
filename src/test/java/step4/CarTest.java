package step4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    void addDistanceTest() {
        Car car = new Car("");
        car.addDistance();
        assertThat(car.getDistance()).isEqualTo(1);
    }

    @Test
    void moveTest() {
        Car car = new Car();
        car.move();
        assertThat(1).isEqualTo(car.getDistance());
    }

}
