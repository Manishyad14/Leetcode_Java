//2108. Find First Palindromic String in the Array



class pallindrome_string {
public String firstPalindrome(String[] words) {

    String ans = "" ;//first we inatialize the ans with emoty string



    for(int  i = 0 ; i < words.length ; i++){ // now we travers the string with this loop

        //now we wil make two pointers which will start from start and end of the word
        //we will accesss particualr word of an arr usding charAt() function --->>

        int  j = 0 ;
        int k = words[i].length() -1 ;

        while(words[i].charAt(j)==words[i].charAt(k)){

            if(j>=k){
                ans = words[i];
                return ans ;

            }

            k--;
            j++;


        }








    }
    return ans ;
}
}