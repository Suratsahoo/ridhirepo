package home.prac.coding;

public class UsingStringArray {
	
	public void print() {
		String c;
		String a[]= {"ahi","Surat","Red","Grtyu"};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j].compareTo(a[i])<0) {
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
					
			}
			System.out.println(a[i]);
		}
		
	}

}
