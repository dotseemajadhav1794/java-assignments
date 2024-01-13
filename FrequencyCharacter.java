//Java Program to Find the Frequency of Characters in a String
public class FrequencyCharacter     
{    
     public static void main(String[] args) 
	 {    
        String str = "SEEMA AVINASH JADHAV";    
        int[] freq = new int[str.length()];    
        int i, j;    
            
        //Converts given string into character array    
        char string[] = str.toCharArray();    
            
        for(i = 0; i <str.length(); i++) 
		{    
            freq[i] = 1;    
            for(j = i+1; j <str.length(); j++) 
			{    
                if(string[i] == string[j]) 
				{    
                    freq[i]++;    
                        
                    //Set string[j] to 0 to avoid printing visited character    
                    string[j] = '0';    
                }    
            }    
        }    
            
        //Displays the each character and their corresponding frequency    
        System.out.println("Characters and their corresponding frequencies");    
        for(i = 0; i <freq.length; i++) {    
            if(string[i] != ' ' && string[i] != '0')    
                System.out.println(string[i] + "-" + freq[i]);    
        }    
    }    
} 

/*   
Output:
Characters and their corresponding frequencies
p-2
i-1
c-2
t-2
u-1
r-2
e-3
f-1 
*/