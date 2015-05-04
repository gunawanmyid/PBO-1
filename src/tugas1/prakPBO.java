package tugas1;

public class prakPBO {
	public static void main(String[] args){
		
		
		System.out.println("laporan 1 prak. pbo");
		
		biodata(); // kasih penjelasan tiap baris yak..!!!
		aritmatika();
	}
	
	public static void aritmatika()
	{
		int x=2, y=4, z=8;
		double d=0;
		
		System.out.println(" \n Operasi Aritmatika \n");
		z=x+y;
		System.out.println("hasil dari	"+x+"+"+y+"="+z);
		z=y-x;
		System.out.println("hasil dari	"+y+"-"+x+"="+z);
		z=x*y;
		System.out.println("hasil dari	"+x+"*"+y+"="+z);
		d=(double)y/x;
		System.out.println("hasil dari	"+y+"/"+x+"="+d);
	}
	public static void biodata()
	{
		String name =" iqbal wahid";
		String adress ="jl. bumi karsa no.21";
		String ttl ="Makassar, 3 februari 1994";
		String pekerjaan="Mahasiswa";
		String hobi=" dan reptiler";
		
		System.out.println("Nama	:"+name+"\nAlamat	:"+adress+"\nTtl	:"+ttl+"\nPekerjaan	:"+pekerjaan+"\nMore	:"+hobi);
		
		}
				

}
