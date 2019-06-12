package tudylaptrinh01.baitapvenha6_9;

public class ChenXVaoDauMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int [7]; 
		 int length = 6 ;
//			 A[] =  {12,27,36,44,52, };
		 A[0]= 12;A[1]= 27;A[2]= 36;A[3]= 44;A[4]= 52;A[5]	=67; 
		 for(int i = length- 1; i>=0 ; i--) {
			 A[i +1] = A[i];
		 }
		 A[0] = 99;
		 for(int i = 0 ; i<A.length ;i++) {
			 System.out.print(A[i]+"\t");
		 }
	}

}
