public class ShortVersInt {
	int convertion(short s1, short s2) {
		int res=0;
		res = s1;
		res <<= 16;
		res += s2;
		return res;
	}
	public static void main(String[] args) {
	}
}
