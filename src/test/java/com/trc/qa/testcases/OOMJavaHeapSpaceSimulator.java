package com.trc.qa.testcases;

import java.util.HashMap;
import java.util.Map;

public class OOMJavaHeapSpaceSimulator {

	

		private String fielData="";
				
		private static Map<String,OOMJavaHeapSpaceSimulator>leakContainer = new HashMap<String,OOMJavaHeapSpaceSimulator>();
				
	 private final static String dataPrefix ="DATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATA";
		
		private final static boolean slowExecution =false;
				
				/**
				 * @param args
				 * @throws Throwable 
				 */
				
		public static void main(String[] args) throws Throwable {
			
			System.out.println("Start...");
			
			try{
				for(int i=0;i<10000000;i++){
					String data = dataPrefix+i;
					System.out.println("loop"+i);
					leakContainer.put(data,new OOMJavaHeapSpaceSimulator());
					
					if(slowExecution)
						try{
							Thread.sleep(1);
						}
						catch(Exception ignore)
						{
							
						}
					
					
					
				
			

				}}
				
				
				
				
				
				
				

	
			catch(Throwable e){
				throw e;
			}
       System.out.println("End");
		}}
