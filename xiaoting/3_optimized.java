import java.util.HashMap;
import java.util.Map;

public class Longest_nonrepeated_substring_3 {

	
	public static void main(String[] args) {
		//int[] array = {1,7,5,9,2,12,3};
		
		System.out.println(lengthOfLongestSubstring("absolutely"));
		
	}

    /**One-pass sliding window approach [i, j)
	  *Since we only want the length, not the substring itself, we can simplify this approach*/
	public static int lengthOfLongestSubstring(String s) {
		int ans = 0;
		//int i, j = 0; //left of window, right of the window
		   /**Create a HashMap to store the characters in the strings, and the character's position
         *That i should be slides to*/
		Map<Character, Integer> map = new HashMap<>();
		for(int j = 0, i = 0; j < s.length(); j++) {
			
			//Continue sliding j while choosing when to slide i
			if(map.containsKey(s.charAt(j))) {
				//Repeated found at j, slide i to the position next to the repeated character 
				//find the repeated character's location
				//remember, i should be slide right but not left
				//so if the position is smaller than i, then i's position should be unchanged
				i = Math.max( i, map.get((s.charAt(j))) + 1);
			}
			//compute the length
			ans = Math.max(ans, j-i+1);
			map.put(s.charAt(j), j);
		}
		return ans;
	}
	
}
