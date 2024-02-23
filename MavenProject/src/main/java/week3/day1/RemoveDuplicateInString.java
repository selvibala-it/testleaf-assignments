package week3.day1;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String duplicate="sample";
		String text="We learn Java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		
        for (int i = 0; i < split.length; i++) {
			for (int j = i+1; j < split.length-1; j++) {
				if (split[i].equals(split[j])) {
					count++;
                 duplicate=split[i];
                  
				}
				
			
		}
          
		}
        System.out.println("number of duplicates present :" +count);
        System.out.println("Sentence after removing the duplicates:");
		for (int i = 0; i < split.length; i++) {
			if (split[i].equals(duplicate)) {
				System.out.print(split[i].replaceAll(duplicate, ""));
			}else {
				System.out.print(" " +split[i]);
			}
		}
	}


	}


