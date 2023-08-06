package sample;
import javax.sound.sampled.*;
import java.io.*;
import java.util.Arrays;

import javazoom.jl.converter.Converter;
import javazoom.jl.decoder.Bitstream;

public class lettcode {

    public static void main(String[] args) {
       
    	int rule1[]= {10,4,8,3};
    	int a[]=new int[rule1.length];
    	int b[]=new int[rule1.length];
    	a[0]=0;
    	b[a.length-1]=0;
    	for(int i=0;i<a.length-1;i++)
    	{
    		int k=i;
    		int l=i;
    		a[k+1]=rule1[i];
    		b[i]=rule1[l+1];
    		
    	}
    	int k = 0;
    	for(int i=0;i<a.length;i++)
    	{
    		
    		k=k+a[i];
    		a[i]=k;
    		
    		int f=0;
    		for(int j=i;j<a.length;j++)
    		{
    			f=f+b[j];
    		}
    		b[i]=f;
    		f=0;
    	}
    	
    	for(int i=0;i<a.length;i++)
    	{
    		a[i]=Math.abs(a[i]-b[i]);
    	
    	}
    
    }
}
