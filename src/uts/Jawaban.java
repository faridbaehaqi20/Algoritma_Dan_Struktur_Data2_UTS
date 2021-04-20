package uts;
public class Jawaban {
    public static void InsertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) { 
            int key = A[i]; 
            int j = i - 1; 
            while((j >= 0) && (A[j] > key)) { 
                A[j + 1] = A[j];
                j--; 
            }
            A[j + 1] = key;
        }
    }
    public static void Tampil(int data[]){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    System.out.println();
    }
    public static void main(String[] args){
        int A[] = {3,10,4,2,8,13};
        int B[] = {2,3,4,8,10,13};
        int cari = 8;
        int N = 6;
        int IndeksAwal = 0;
        int IndeksAkhir = A.length-1;
        int ketemu = 0;
        int point = 0;
        
        System.out.println("Isi data adalah");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("");
        System.out.println("");
        while ((IndeksAwal <= IndeksAkhir) && (ketemu == 0)){
        point = (IndeksAwal + IndeksAkhir) / 2;
        System.out.println("Indeks Pointer :"+ point);
            if (cari == A[point]){
                ketemu = 1;
                System.out.println("Data " + cari + "Telah ditemukan pada index ke " + point);
            }
            else if(cari < A[point]){
                System.out.println("Cari di kiri");
                IndeksAkhir = point-1;
            }
            else{
                IndeksAwal = point+1;
                System.out.println("Cari di kanan");
            }
        }
        if (ketemu == 1)
            System.out.println("Kesimpulan: data ditemukan ");
        else
            System.out.println("Kesimpulan: data tidak ditemukan ");
    }
}
    

