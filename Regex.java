/**
*This is the pattern matching class
*@author Clayton Catanzarite
*@version 1.0
*Programming Project One
*CS322 - Compiler Contrusction
*Spring 2019
*/
import java.util.Scanner;
import java.util.regex.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
public class Regex{
	public static void hashMapCreator() throws FileNotFoundException {
		HashMap<String,Integer> hmIP= new HashMap<String, Integer>();
		HashMap<String,Integer> hmUser= new HashMap<String, Integer>();

	}//hashMapCreator
	public static void hashMapIpEntry(String str) throws FileNotFoundException{
		String IPADDRESS_PATTERN = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
		Pattern pattern=Pattern.compile(IPADDRESS_PATTERN);
		Matcher matcher=pattern.matcher(str);
		if(matcher.find()){
			String matchedIP=matcher.group();
			hmIP.put(matchedIP,1);
			
		}//if ip is found
	}//hashMapEntry
	public static void hashMapUserEntry(String strUser) throws FileNotFoundException{
		
	}//hashMapUserEntry
	public static int hashMapSize(){
		return hmIP.size();
	}//hashMapSize
	public static void hashMapcontents(){
		for(int i=0;i<=hmIP.size();i++)
			System.out.println(Arrays.asList(hmIP));
	}//hashmap contents

}//class
