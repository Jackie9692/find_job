package hard;

public class WildCard_44 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildCard_44 wildCard = new WildCard_44();
		String s = "mississippi";
		String p = "m*issi*iss*";
		boolean result = wildCard.isMatch(s, p);
		System.out.println(result);
	}
	
	
	public boolean isMatch(String s, String p) {
    	int sindex = 0, pindex = 0;
    	int smatch = -1, pstart = -1;
    	while(sindex < s.length()){
    		//"?"和s与p相同情况下，指针右移
    		if(pindex < p.length() && (p.charAt(pindex) == '?' || p.charAt(pindex) == s.charAt(sindex))){
    			pindex++;
    			sindex++;
    		}else if(pindex < p.length() && p.charAt(pindex) == '*'){
    			pstart = pindex;
    			smatch = sindex;
    			pindex++;
    		}else{
    			if(pstart != -1){
    				smatch++;
        			sindex = smatch;
        			pindex = pstart + 1;
        		}else{
        			return false;
        		}
    		}
    	}
    	
    	while(pindex < p.length() && p.charAt(pindex) == '*'){
    		pindex ++;
    	}
    	
		return pindex == p.length();
        
    }
        

	
	

}
