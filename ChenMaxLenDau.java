package tudylaptrinh01.baitapvenha6_9;

public class ChenMaxLenDau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int B[] = {112,	1,	47,	9,	56,	43,	50,	54,	51,	41,	97,	12,34,4,8,0,5,3,6,87};
		
		for(int solan = 0; solan < B.length-1;solan++) {
//			int max = timMax(B, solan, B.length-1);
			int vitrimax = timVitriMax(B, solan, B.length-1);
			chenMang(B, vitrimax, solan);
			inMang(B);
		}
		
	}
	
	static void inMang(int[] mang) {
		for (int i = 0; i < mang.length; i++) {
			System.out.print(mang[i] + "\t");
		}
		System.out.println();
	}
//	static int timMax(int[] mang, int vitribatdau, int vitriketthuc) {
//		int max = mang[vitribatdau];
//		for (int i = vitribatdau+1; i <= vitriketthuc; i++) {
//			if (mang[i] > max) {
//				max = mang[i];
//			}
//		}
//		return max;
//	}
	static int timVitriMax(int[] mang, int vitribatdau, int vitriketthuc) {
		int max = mang[vitribatdau];
		int vitrimax=vitribatdau;
		for (int i = vitribatdau+1; i <= vitriketthuc; i++) {
			if (mang[i] > max) {
				max = mang[i];
				vitrimax=i;
			}
		}
		return vitrimax;
	}
	static void chenMang(int[] mang, int vitriSocu,int vitriMoi) {
		int giatriSocu = mang[vitriSocu];
		for(int i = vitriSocu; i > vitriMoi; i--) {
			mang[i]=mang[i-1];
		}
		mang[vitriMoi] = giatriSocu;
	}
	
	
	static void d() {
		// TODO Auto-generated method stub
				int B[] = new int[12];
				int tam = 0, tam1 = 0;
				B[0] = 12;
				B[1] = 21;
				B[2] = 47;
				B[3] = 9;
				B[4] = 56;
				B[5] = 43;
				B[6] = 50;
				B[7] = 54;
				B[8] = 51;
				B[9] = 41;
				B[10] = 97;
				B[11] = 12;
				int max = B[0];
				for (int i = 1; i < B.length; i++) {
					if (B[i] > max) {
						max = B[i];
						tam = i;
					}
				}

				for (int i = tam; i > 0; i--) {
					B[i] = B[i - 1];
				}
				B[0] = max;

				inMang(B);

				max = B[1];
				tam = 0;
				for (int i = 2; i < B.length; i++) {
					if (B[i] > max) {
						max = B[i];
						tam = i;
					}
				}
				
				for (int i = tam; i > 1; i--) {
					B[i] = B[i - 1];
				}
				B[1] = max;
				inMang(B);

				max = B[2];
				tam = 0;
				for (int i = 3; i < B.length; i++) {
					if (B[i] > max) {
						max = B[i];
						tam = i;
					}
				}
				
				for (int i = tam; i > 2; i--) {
					B[i] = B[i - 1];
				}
				B[2] = max;
				inMang(B);
	}

}
