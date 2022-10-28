package com.fun;
import java.util.*;

public class GetInstance {
    public static void main(String arg[])
    {
        Locale[]  allLocal= Locale.getAvailableLocales();
        //for (int i=0;i<10;i++)
         int i=0;
         for(Locale Lo:allLocal) {
             i++;
         System.out.println("Country: "+Lo.getDisplayCountry());
             System.out.println("Language: "+Lo.getDisplayLanguage());
             if(i>10) {
                 break;
             }

         }


         }

    }


