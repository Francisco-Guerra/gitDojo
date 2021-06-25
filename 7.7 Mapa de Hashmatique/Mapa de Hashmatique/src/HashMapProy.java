import java.util.HashMap;
import java.util.Map;

public class HashMapProy {

	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();

		trackList.put("In My Sword I Trust", "Many men have crossed my way");
		trackList.put("Andromeda", "Woe to the one");
		trackList.put("LAI LAI HEI", "Hän katsoi maan reunalta tähteä putoavaa");
		trackList.put("Victory Song", "The plan of invasion");
		trackList.put("Windrider", "He appears from the mists of a dismal lake");
		trackList.put("Rum, Women, Victory", "What should one do when darkens the sky?");
		
	        for (Map.Entry<String, String> song : trackList.entrySet()){
	                System.out.println(song.getKey() + ": " + song.getValue()); 
	        }
	}
}
