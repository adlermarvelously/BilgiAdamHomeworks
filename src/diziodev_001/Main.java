package diziodev_001;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		// 1
		// Kaçları saymak istiyorsak kullanıcıdan alalım.
		
		int[] array = { 1, 3, 4, 4, 4, 4, 2, 2, 9, 8, 8 };
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hangi sayıyı saymak istiyorsunuz? ");
		
		int adet = 0;
		int sayi = scanner.nextInt();
		for (int i =0; i<array.length; i++) {
			
			if (array[i] == sayi) {
				adet++;
			
			}

		}
		
		System.out.println(adet + " adet bulunmaktadır.");
		
		System.out.println("**************************");
		
		
		// 2
		// Bir dizide en büyük ikinci sayıyı bulan programı yazalım.
		
		int nums[] = {1, 13, 13, 13, 2, 5, 13, 1};
		
		int enBuyuk = nums[0];
		int ikinci = nums[1];
		
		for (int i = 1; i < nums.length; i++) {

			if (nums[i] > enBuyuk) {
				ikinci = enBuyuk;
				enBuyuk = nums[i];

			} else if (nums[i] > ikinci) {
				ikinci = nums[i];
			}
		}
		System.out.println("İkinci sayı: " + ikinci);
		
		System.out.println("**************************");

		
		// 3
		// Bir dizide eğer 13 var ise hem 13 ü hem de bir sonraki indexi
			// toplama işlemine almayarak dizideki elemanların toplamını bulalım.
		
		int nums2[] = {1, 13, 5, 13, 2, 5, 7, 1};
		
		int toplam = 0;

		for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] == 13) {
                if (i != nums2.length - 1) {
                    i++;
                    if(nums2[i]==nums2[i-1]) {
                        i--;
                    }
                }
			} else {
				toplam += nums2[i];
				
			}
		}

		System.out.println("Toplam = " + toplam);

		
		

	}

}
