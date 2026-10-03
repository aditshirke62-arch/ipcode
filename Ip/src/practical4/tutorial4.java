package practical4;
//S1: Abstract class (What to do, Not How)
abstract class CloudStorage{ 
	public abstract void StoredFile(String Filename);
	
}
//s2: Local storage Implementation

class Localextends CloudStorage{
	public void storeFile(String FileName) {
		System.out.println("Storing "+FileName + " in Local Disk");
	}
		
		class AWSstorage CloudStorage{
			public void storeFile(String FileName) {
				System.out.println("Storing "+FileName + " in AWS S3 Bucket");
			}
		}
		
		
				public class Assignment{
					public static void main{String[] args) {
						// using local Storage
						
					}
				}
	}
}
public class tutorial4 {

 }
 