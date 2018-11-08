import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			Coupon[] coupons = new Coupon[n];
			for (int i = 0; i < coupons.length; i++) {
				int city = sc.nextInt();
				int level = sc.nextInt();
				int discount = sc.nextInt();

				coupons[i] = new Coupon(city, level, discount);
			}

			Arrays.stream(solve(coupons)).forEach(coupon -> System.out.println(coupon.discount + " " + coupon.city));
		}

		sc.close();
	}

	static Coupon[] solve(Coupon[] coupons) {
		return new Coupon[] { findBestCoupon(coupons, 1), findBestCoupon(coupons, 2), findBestCoupon(coupons, 3) };
	}

	static Coupon findBestCoupon(Coupon[] coupons, int level) {
		return Arrays.stream(coupons).filter(coupon -> coupon.level == level)
				.sorted((coupon1, coupon2) -> (coupon1.discount != coupon2.discount)
						? Integer.compare(coupon2.discount, coupon1.discount)
						: Integer.compare(coupon1.city, coupon2.city))
				.collect(Collectors.toList()).get(0);
	}
}

class Coupon {
	int city;
	int level;
	int discount;

	Coupon(int city, int level, int discount) {
		this.city = city;
		this.level = level;
		this.discount = discount;
	}
}