package com.monocept.test;

import com.monocept.model.Bike;
import com.monocept.model.Car;
import com.monocept.model.IMovable;
import com.monocept.model.Truck;

public class MainTest {
	public static void main(String[] args) {
		IMovable movable[] = new IMovable[3];
		Truck truck = new Truck();
		movable[0] = truck;
		Car car = new Car();
		movable[1] = car;
		Bike bike = new Bike();
		movable[2] = bike;

		startRace(movable);
	}

	private static void startRace(IMovable[] movable) {
		for (IMovable m : movable) {
			m.move();

		}
	}
}
