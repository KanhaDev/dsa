//package practice;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//
//class Result{
//	
//	public static List<String> getResponses(List<String> valid_auth_tokens, List<List<String>> requests)
//	{
//		List<String>  ans  = new ArrayList<String>();
//		
//		return ans;
//	}
//}
//public class Solution {
//
//	public static void main(String[] args) throws IOException{
////		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
////		BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//		int valid_auth_tokensCount = 3;
//				//Integer.parseInt(bufferReader.readLine().trim());
//		List<String> valid_auth_tokens =IntStream.range(0, valid_auth_tokensCount).mapToObj(i -> {
//			try {
//				return bufferReader.readLine();
//			}catch(IOException ex){
//				throw new RuntimeException(ex);
//			}
//		}).collect(toList());
//		
//		int requestsRows = Integer.parseInt(bufferReader.readLine().trim());
//		int requestsColumns = Integer.parseInt(bufferReader.readLine().trim());
//		
//		List<List<String>> requests = new ArrayList<>();
//		
//		IntStream.range(0, requestsRows).forEach(i -> {
//			try {
//				requests.add(Stream.of(bufferReader.readLine().replaceAll("\\s+$", "").split(" ")).collect(toList()));
//			}
//			catch(IOException ex){
//				throw new RuntimeException(ex);
//			}
//		});
//		
//		List<String> result = Result.getResponses(valid_auth_tokens , requests);
//		bufferWriter.write(result.stream().collect(joining("\n"))+ "\n");
//		
//		bufferReader.close();
//		bufferWriter.close();
// 
//	}
//	
//
//}
