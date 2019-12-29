package ch01.exercises.ex02;

public class IntegerAngleNormalizer {
	public static void main(String[] args) {
		System.out.println(manualNormalize(45));
		System.out.println(manualNormalize(460));
		System.out.println(manualNormalize(-90));
		System.out.println(manualNormalize(-1270));
		System.out.println(Math.floorMod(-1270,  360));
	}
	
	private static int manualNormalize(int angle) {
		int normalizedAngle = (angle % 360 + 360) % 360;
		return normalizedAngle;
	}
	
	
}
