package com.wakanda.process;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class QueryParse {

	public static void main(String[] args) {
		
		System.out.println("SqlBuilder sql = new SqlBuilder();");
		System.out.println("sql");
		
		File archivo;
        FileReader fr = null;
        BufferedReader br;
        
        try {
            archivo=new File("C:\\Users\\Master\\Desktop\\eclipse-projects\\QueryParseWKND\\src\\com\\wakanda\\process\\Query.txt");
            fr=new FileReader(archivo);
            br=new BufferedReader(fr);
            
            String linea;
            
            while ((linea=br.readLine())!=null) {               
                System.out.println(".apend(\" "+linea+"\")"); 
            }
            
            System.out.append(";");
            
            
        } catch (IOException e) {
            System.out.println(e);
        }
        
        finally{
            try {
                fr.close();
            } catch (Exception e) {
            }
        }

	}

}


