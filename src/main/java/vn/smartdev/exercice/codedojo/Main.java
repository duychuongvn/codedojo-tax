package vn.smartdev.exercice.codedojo;

import java.util.Scanner;

import vn.smartdev.exercice.codedojo.repository.VehicleFactory;
import vn.smartdev.exercice.codedojo.util.DateUtil;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean stop = false;
		String manufactuer;
		String model;
		String registrationDate;
		String command;
		do {

			try {
				System.out.print("Input manufactuer: ");
				manufactuer = sc.nextLine();
				System.out.print("Input Model: ");
				model = sc.nextLine();
				System.out.println("Input date of registraion yyyy-MM-dd: ");
				registrationDate = sc.nextLine();

				Vehicle vehicle = VehicleFactory.buildVehicle(manufactuer, model,
						DateUtil.parseYYYYMMDD(registrationDate));
				System.out.println("Tax: " + vehicle.getTax());

				System.out.print("Input 0 to exit: ");
				command = sc.nextLine();
				if ("0".equals(command)) {
					stop = true;
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		} while (!stop);
		
		sc.close();
		System.out.println("End");
	}
}
